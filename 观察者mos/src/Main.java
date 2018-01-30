import Observer.Reader;
import Subject.Book;

/**
 * @Author:chunLai
 * @Date: Created in 14:17 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class Main {
    public static void main(String[] args) {

        //创建被观察者
        Book book = new Book ( "bookName" );


        //创建观察者
        Reader reader01 = new Reader ( "readerName01" );
        Reader reader02 = new Reader ( "readerName02" );
        Reader reader03 = new Reader ( "readerName03" );

        book.add ( reader01 );
        book.add ( reader02 );

        book.notify ( "Book_Changing" );


        book.delete ( reader02 );
        book.notify ( "change again" );


    }
}
