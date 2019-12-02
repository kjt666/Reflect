package reflect;

public class ClassReflect {

    public static void main(String args[]) {

        //通过实例获取Class对象方法
        Person person = new Person();
        Class personClass = person.getClass();
        System.out.println(personClass.getName());

        //通过类获取Class对象方法
        Class personClass2 = Person.class;
        System.out.println(personClass2.getName());

        //反射获取Class对象方法
        Class personClass3 = null;
        try {
            personClass3 = Class.forName("reflect.Person");
            System.out.println(personClass3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(personClass == personClass2);
        System.out.println(personClass2 == personClass3);

    }
}
