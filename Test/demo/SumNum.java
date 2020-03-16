package Test.demo;
import java.util.Scanner;
public class SumNum {
    public static int Sum(int a ,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args){
        System.out.println("info you two NUM");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=SumNum.Sum(a,b);
        System.out.println("you two NUM sum is "+c);
    }
}
