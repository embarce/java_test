package Test.demo;
/*
 Math数学方法：
 public static double abs(double NUM);绝对值
 public static double ceil(double NUM);向上取整
 public static double floor(double NUM);向下取整
 public static double round(double NUM);四舍五入
 计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
 */
public class Math_demo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-121));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.0));
        Math_demo.find(-10.9,5.1);
    }
    public static void find(double num1,double num2){
        int a=(int)num1;
        int b=(int)num2;
        int cont=0;
        for (int i = a; i <num2 ; i++) {
            int abs=Math.abs(i);
            if(abs>6||abs<2.1){
                System.out.print(abs+" ");
                cont++;
            }
        }
        System.out.println(" ");
        System.out.println(cont);
    }
}
