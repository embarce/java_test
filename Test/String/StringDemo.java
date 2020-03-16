package Test.String;
/*
字符串的比较不是用==而是用
public boolean equals(object obj);严格区分大小写。
参数是个任意对象但是只有是字符串且内容相同才可以返回布尔值
public boolean equalsIgnoreCase(String str);
不区分大小写比较。
字符串获取的方法有
public int length();获取个数，长度。
public String concat(String str)将当前字符串和参数字符串拼接成一个字符串。
public char charAt(int index)获取指定字符串的指定位置的单个字符，从0开始；
public int indexOf(String str)查找参数字符串当中首次出现的位置，如果没有返回-1；
字符串截取方法
public String substring(int index);
public String substring(int begin ,int end);[)包含左边不包含右边。
字符串中的转换方法：
public char[] toCharArray();将当前字符串拆分成数组作为返回值。
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString);
将所有出现的老字符串替换为新的字符串，返回替换之后的新字符串。
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1="hello";
        String str2="Hello";
        String str4="hello this is Embrace pc java Test ";
        String str5="Sussex";
        char[] charArray={'h','e','l','l','o'};
        String str3=new String(charArray);/*
        通常常量在前，不是变量在前。
        比如
        "abc".equals(str1);不推荐。
        */
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str5);
        System.out.println(str4.concat(str5));
        System.out.println(str1.charAt(1));
        System.out.println(str4.indexOf("Embrace"));
/*      public String substring(int index);
        public String substring(int begin ,int end);[)包含左边不包含右边。*/
        String str6=str4.substring(14);
        System.out.println(str6);
        System.out.println(str4.substring(14,21));
        byte[] bytes="abc".getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }
        String lang1="会不会玩？你大爷的！";
       String lang2= lang1.replace("大爷","**");
        System.out.println(lang2);
    }
}
