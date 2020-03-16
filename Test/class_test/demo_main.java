package Test.class_test;

public class demo_main {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("盖伦");
        hero.setAge(10);
        Weapon weapon=new Weapon("多兰剑");
        hero.setWeapon(weapon);
        SkillImpl skill=new SkillImpl();
        hero.setSkill(skill);
        hero.show();
    }
}
