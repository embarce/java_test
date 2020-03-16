package Regis;

import java.util.HashMap;
import java.util.Scanner;

public class Register_demo {
    static String[] usename={"Embarce","QAQ","poq","TOT","QWQ"};
    public static void main(String[] args) throws RegisterException {
/*        HashMap<String,String> user=new HashMap<>();
        user.put("Embarce","123456789");
        user.put("QAQ","123456789");
        user.put("POP","987456123");
        user.put("TOT","123789456");
        user.put("QWQ","123456789");
        System.out.println("请输入你的用户名和密码");
        Scanner s=new Scanner(System.in);
        String userName=s.next();
        String password=s.next();
        if(user.get(userName)==null){
            user.put(userName,password);
            System.out.println("注册成功");
        }else {
            System.out.println("用户名被占用");
        }*/

       System.out.println("请输入你的用户名和密码");
       Scanner s=new Scanner(System.in);
        String userName=s.next();
        Register_demo.check(userName);
    }
    public static void check(String userName) throws RegisterException {
        for (String s : usename) {
            if(userName.equals(s)==true){
                throw new RegisterException("用户名重复，不可以使用");
            }
        }
        System.out.println("用户名不重复，可以使用");
    }
}
