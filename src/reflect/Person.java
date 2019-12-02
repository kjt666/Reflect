package reflect;

public class Person {

    public static String ID = "001";

    private String name;
    protected String address;
    private int age;
    public String phoneNum;

    public Person() {

    }

    Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    protected Person(String name, String address, int age, String phoneNum) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    private void fun1(){
        System.out.println("调用了私有的无参方法fun1()");
    }

    protected void fun2(){
        System.out.println("调用了受保护的无参方法fun2()");
    }

    public static void fun3(){
        System.out.println("调用了公共的无参静态方法fun3()");
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("调用了公共的int参数类型方法setAge()");
    }

    String getName(){
        System.out.println("调用了默认的无参，返回类型为String的方法getName()");
        return name;
    }

}
