package Digital_factory;

public class Student {
    /**
     * 学生名字
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;
    /**
     * 学生成绩
     */
    private int socre;
    /**
     * 学生班级
     */
    private int grade;

    public Student(String name, int age, int socre, int grade) {
        this.name = name;
        this.age = age;
        this.socre = socre;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSocre() {
        return socre;
    }

    public void setSocre(int socre) {
        this.socre = socre;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", socre='" + socre + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }


    public int compareTo(Student value) {
        return value.getSocre() - this.getSocre();
    }
}
