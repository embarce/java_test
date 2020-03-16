package Test.hongbao;
/*
用户名
余额
 */
public class User {
    public String userName;
    private double money;
    public User(){

    }
    public User(String userName,double money){
        this.userName=userName;
        this.money=money;

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void show(){
        System.out.println("我叫"+userName+" 我有多少钱"+money);
    }
}
