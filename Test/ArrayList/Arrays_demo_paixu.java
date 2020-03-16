package Test.ArrayList;

import java.util.Arrays;

public class Arrays_demo_paixu {
    public static void main(String[] args) {
        String str="asdfgxcvbwertasbgdvqwemasd21346";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
    }
}
