package reflect;

import java.lang.reflect.Method;

public class MethodReflect {

    public static void main(String args[]) throws Exception {

        //获取Person类的Class对象
        Class clazz = Class.forName("reflect.Person");

        //获取Person类的所有公共成员方法
        System.out.println("===============获取Person所有公共成员方法===============");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //获取Person类的包含公共、默认、受保护、私有的所有方法
        System.out.println("===============获取Person声明的所有成员方法===============");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        //获取Person公共带参的setAge方法
        System.out.println("===============获取Person公共带参的setAge方法===============");
        Method method = clazz.getMethod("setAge", int.class);
        System.out.println(method);
        //使用默认构造方法实例化一个Person对象
        Object obj = clazz.getDeclaredConstructor(String.class).newInstance("小白");
        //通过invoke执行setAge方法
        method.invoke(obj,18);

        //获取Person受保护的无参方法fun2
        System.out.println("===============获取Person受保护的无参方法fun2===============");
        method = clazz.getDeclaredMethod("fun2");
        System.out.println(method);
        //通过invoke执行fun2方法
        method.invoke(obj);

        //获取Person有返回值的默认无参方法getName
        System.out.println("===============获取Person有返回值的默认无参方法getName===============");
        method = clazz.getDeclaredMethod("getName");
        System.out.println(method);
        //通过invoke执行getName方法并获取返回值
        Object returnVal = method.invoke(obj);
        System.out.println(returnVal);
    }
}
