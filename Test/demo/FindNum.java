package Test.demo;
import java.util.Scanner;

/**
 * 找质数
 */
public class FindNum {
    public static void main(String[] args){
        System.out.println("info you NUM");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int x=s.nextInt();
        FindNum.find(i,x);

    }
    public static void find(int i,int x){
        boolean flag=true;
        int j;
        int cont=0;
        for(;i<=x;i++){
            if(i==1||i==0){
                flag=false;
            }
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(i+"\t");
                cont++;
                if(cont%8==0){
                    System.out.print("\n");
                }
            }
            flag=true;

        }
        System.out.println("在你的范围的质数有"+cont+"个");
    }
}
