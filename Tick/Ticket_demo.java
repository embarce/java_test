package Tick;

public class Ticket_demo {
    /**
     * 调用买票主方法
     * @param args
     */
    public static void main(String[] args) {
        Runnable r1=new RunnableImpl();
        Thread t1=new Thread(r1,"售票员一号");
        t1.start();
        Thread t2=new Thread(r1,"售票员二号");
        t2.start();
        Thread t3=new Thread(r1,"售票员三号");
        t3.start();
    }
}
