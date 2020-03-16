package Thread;

public class Demo {
    public static void main(String[] args) {
/*        Person pl=new Person("小强",10);
        pl.run();
        Person p2=new Person("小红",12);
        p2.run();*/
        Demo_therad mytherad=new Demo_therad();
        mytherad.start();
        Thread thread = Thread.currentThread();
        System.out.println(thread.toString());
        for (int i = 0; i <2000 ; i++) {
            System.out.println("main--->"+i);
        }
    }
}
