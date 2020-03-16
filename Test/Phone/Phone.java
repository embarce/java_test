package Test.Phone;

public class Phone {
    String brand;
    double price;
    String color;
    public void myPhone(){
        System.out.println("my phone is "+brand+" "+price+" "+color+" ");
    }
    public void call(String who){
        System.out.println("calling to the "+who);
    }
    public void playMusic(){
        System.out.println("playing music");
    }

}
