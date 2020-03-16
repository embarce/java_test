package Test.String;

import java.util.Scanner;

/*
 题目：
 键盘输入一个字符，并且统计其中各种字符出现的次数。
 种类包括：大写字母，小写字母，数字，其他。
 */
public class String_demo04 {
    public static void main(String[] args) {
        System.out.println("请输入需要统计的字符串");
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String_demo04.contString(str1);
    }
    public static void contString(String str1){
        char[] charArrays=str1.toCharArray();
        int cap=0;
        int small=0;
        int num=0;
        int other=0;
        for (int i = 0; i <charArrays.length ; i++) {
            char ch=charArrays[i];
            if('A'<=ch&&ch<='Z'){
                cap++;
            }else if('a'<=ch&&ch<'z'){
                small++;
            }else if('0'<=ch&&ch<='9'){
                num++;
            }else {
                other++;
            }
        }
        System.out.println("大写字符有"+cap+"个 "+"小写字符有"+small+"个 "+
                "数字字符有"+num+"个 "+"其他字符有"+other+"个");
    }
}
