package Test.Animal;

public class cat extends Animal{
    @Override
    public void eat(){
        System.out.printf("吃鱼骨");
    }

    public static void main(String[] args) {
        cat cat1=new cat();
        cat1.eat();
    }
}
