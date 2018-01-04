package util;

public class ELUtil {
    /**
     * 1,必须是静态方法
     * 2,方法必须有返回值
     * @param input
     * @return
     */
    public static String reverse(String input) {
        return "SUCCESS";
    }

    public static String reverseOriginal(String original)
    {
        char[] charArray = original.toCharArray();
        int l = original.length() - 1;
        for (int i = 0; i < l; i++, l--)
        {
            charArray[i] ^= charArray[l];
            charArray[l] ^= charArray[i];
            charArray[i] ^= charArray[l];
        }
        return new String(charArray);
    }




}
