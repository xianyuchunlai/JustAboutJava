import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 11:20 2018/1/12
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class PageBean {
    private List<Book> books;
    //    private int totalPages;
    private int pageCode;
    private int totalDate;
    private int pageSize = 10;

    //多条件组合查询时的参数
    private String params;

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setTotalDate(int totalDate) {
        this.totalDate = totalDate;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "books=" + books +
//                ", totalPage=" + totalPages +

                ", pageCode=" + pageCode +
                '}';
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getTotalPages() {


        int ps = totalDate / 10;

        if (totalDate % 10 > 0) {
            ps++;
        }
        return ps;
    }


    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }

    public PageBean(List<Book> books, int pageCode) {
        this.books = books;

        this.pageCode = pageCode;
    }

    public PageBean() {
    }
}
