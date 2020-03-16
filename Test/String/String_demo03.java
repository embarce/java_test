package Test.String;
/*
 题目：
 定义一个方法，把数组{1，2，3}按着指定格式平成一个字符串
 [word1#word2#word3]
 */
public class String_demo03 {
    public static void main(String[] args) {
        int [] arrays={1,2,3};
        String_demo03.changerString(arrays);

    }
    public static void changerString(int[] arrays){

        String str1="[";
        for (int i = 0; i <arrays.length ; i++) {
            if(i==arrays.length-1){
                str1+="word"+arrays[i]+"]";
            }
            else {
                str1+="word"+arrays[i]+"#";
            }
        }
        System.out.println(str1);
    }
}
