package Test.demo;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        System.out.println("info you NUM  ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arrays=new int[n];
        int log=arrays.length;
        /*
        int [] arrays =new int[]{5,15,25};
        int [] arrays {5,15,25};
        */
        for(int i=0;i<n;i++){
            arrays[i]=i+1;
        }
        int[] a=arrays;
        a[5]=7;
        for(int i=0;i<n;i++){
            System.out.print(arrays[i]+" ");
            if(i==n-1){
                System.out.print("\n");
            }
        }
        System.out.print(log+" this is you arrays length ");
    }
}
