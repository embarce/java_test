package Thread;

public class Demo_therad extends Thread{
    @Override
    public void run() {
        Thread thread = currentThread();
        System.out.println( thread.getName());
        for (int i = 0; i <200 ; i++) {
            System.out.println("run--->"+i);
        }
    }
}
