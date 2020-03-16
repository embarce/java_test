package Test.Animal;
/*
抽象即为：
动物-》狗-》猫   都会吃东西，猫吃鱼，狗吃骨头
加上abstract 关键字 去掉大括号，直接分号结束
抽象类：抽象方法所在的类必须是抽象类 在class 前加abstract

抽象类创建注意：
1.不能直接new对象。
2.必须用一个子类来继承。
3.子类必须覆盖父类所有的抽象方法 。
 */
public abstract class Animal {
    /*
    抽象方法，具体的实现得到子类实现。
     */
    public abstract void eat();
}
