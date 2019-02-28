public class Demo {
    private String name;
    private int age;
    private String nameClass;
    public Demo() {
        this.name="long";
        this.age=18;
        this.nameClass ="4D";
    }
    public Demo(String name,int age, String nameClass) {
        this.name=name;
        this.nameClass = nameClass;
        this.age=age;
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo();
        System.out.println(demo1.toString());
        Demo demo2 = new Demo("CodeGym",5,"DaNang");
        System.out.println(demo2.toString());
        System.out.println(Demo.schoolName());
    }
    public static String schoolName() {
        return "CodeGym";
    }
    public void heigth(double height) {
        System.out.println(" height: "+height);
    }
    public String toString() {
        return "name: "+this.name+" age: "+this.age+" className: "+this.nameClass;
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

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
