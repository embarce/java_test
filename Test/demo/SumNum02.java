package Test.demo;
import java.util.Scanner;
public class SumNum02 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int jiecheng(int n){
        if(n==1){
            return 1;
        }
        return n*jiecheng(n-1);
    }
    public static void main(String []args){
        System.out.println("info you NUM thi is sum 1 to n and jie cheng ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=sum(n);
        System.out.println("1 to n "+n+" sum is "+sum+" jie cheng is "+jiecheng(n));
    }
}
