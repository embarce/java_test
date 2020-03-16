package Test.demo;
        import java.util.Scanner;
public class SwitchCase {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String ch=s.nextLine();
        switch(ch){
            case "hello":
                System.out.println("fi NUM hello");
                break;
            case "word":
                System.out.println("se NUM word");
                break;
            default:
                System.out.println("bye bye");
        }

    }
}
