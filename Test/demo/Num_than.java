package Test.demo;
import java.util.*;
public class Num_than {
    public static void main(String[] args){
        int gameNum=69;
        int cont=0;
        boolean flage=true;
        while(flage){
            System.out.println("info you gussNum");
            Scanner s=new Scanner(System.in);
            int myGuessNum=s.nextInt();
            cont++;
            if(myGuessNum>gameNum){
                System.out.println("this NUM bigger than gamNum");
            }else if(myGuessNum<gameNum){
                System.out.println("this NUM smaller than gamNum");
            }else {
                System.out.println("yes the NUM is "+gameNum +"you guess cont is "+cont);
                flage=false;
            }
        }


    }
}
