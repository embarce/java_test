package Digital_factory;

/**
 * 3.	计算Hello World! 中出现了几次l。
 */
public class String_Test03 {
    public static void main(String[] args) {
        String str = "Hello World!";
        int count=0;
        //统计字符出现次数
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='l'){
                count++;
            }
        }
        System.out.println(count);
    }
}