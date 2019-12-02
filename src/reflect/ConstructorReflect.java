package reflect;

import java.lang.reflect.Constructor;

public class ConstructorReflect {

    public static void main(String args[]) throws Exception {

        //获取Person的Class类对象
        Class clazz = Class.forName("reflect.Person");

        //获取Person类的所有公共构造方法
        System.out.println("===============获取Person所有公共构造方法===============");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //获取Person类声明的所有构造方法（包括默认、私有、受保护的、公共的）
        System.out.println("===============获取Person声明的所有构造方法===============");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }

        //获取Person类公共无参的构造方法
        System.out.println("===============获取Person公共无参的构造方法===============");
        Constructor constructor = clazz.getConstructor(null);
        //或者
        //constructor = clazz.getDeclaredConstructor(null);
        System.out.println(constructor);
        Person instance = (Person) constructor.newInstance(null);
        System.out.println(instance.toString());

        //获取Person类默认带参的构造方法
        System.out.println("===============获取Person默认带参的构造方法===============");
        constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
        instance = (Person) constructor.newInstance("孙悟空");
        System.out.println(instance.toString());

        //获取Person类私有带参的构造方法
        System.out.println("===============获取Person私有带参的构造方法===============");
        constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        System.out.println(constructor);
        //忽略访问修饰符的限制
        constructor.setAccessible(true);
        instance = (Person) constructor.newInstance("孙悟空", "长安街", 500);
        System.out.println(instance.toString());
    }
}
