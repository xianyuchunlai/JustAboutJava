import java.math.BigInteger;

public class 数据类型 {
    public static void main(String[] args) {
        int num01 = 1;
/**        数据的基本类型为8种,
 整型:int byte short long
 浮点型 double float,
 布尔型 boolean
 字符型,char
 String不是基本数据类型

 * 基本数据类都有包装类
 * Java中基本数据类型与包装类型有：
 基本类型  	  包装器类型
 boolean	Boolean
 char	Character
 int	Integer
 byte	Byte
 short	Short
 long	Long
 float	Float
 double	Double
 */
        int num02 = 0;
        Integer num03 = new Integer(1);
        double num04 = num02 + num03;
        System.out.println("基本数据类型与它的包装类存在自动拆装箱" + num04);

/**
 * 大数相加:
 */
        BigInteger num05 = new BigInteger("5555555555555555555555555");
        BigInteger num06 = new BigInteger("6666666666666666666666666");
        System.out.println(num05.add(num06));

/**
 * 强制类型转换:
 */
        int num07 = 10;
        double sum = (double) (num07 + 0.5f);
        System.out.println(sum);
    }
}
