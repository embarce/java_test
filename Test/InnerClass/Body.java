package Test.InnerClass;

public class Body {
    int num=10;
    public void methodBody(){
        System.out.println("外部类的方法，body");
        Heart heart=new Heart();//使用内部类
        heart.beat();
    }
    public class Heart{//内部类
        int num=20;
        public void beat(){
            System.out.println("内部类方法，心脏跳"+name);
        }
        public void beat(String name){
            System.out.println("内部类方法，心脏跳"+name);
        }
        public void showNum(){
            int num=30;
            System.out.println(num+"内部类方法变量变量");
            System.out.println(this.num+"内部类变量");
            System.out.println(Body.this.num+"外部部类变量");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
