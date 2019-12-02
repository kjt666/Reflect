package reflect;

import java.lang.reflect.Field;

public class FieldReflect {
    public static void main(String args[]) throws Exception{

        //获取Person类的Class对象
        Class clazz = Class.forName("reflect.Person");

        //获取Person类的所有公共成员属性
        System.out.println("============获取Person类的所有公共成员属性============");
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //获取Person类声明的所有成员属性
        System.out.println("============获取Person类声明的所有成员属性============");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        //获取Person类的公共成员属性phoneNum
        System.out.println("============获取Person类的公共成员属性phoneNum============");
        Field field = clazz.getField("phoneNum");
        System.out.println(field);
        //使用默认构造方法实例化一个Person对象
        Object obj = clazz.getConstructor().newInstance();
        //为phoneNum赋值
        field.set(obj,"13838383838");
        System.out.println(obj.toString());

        //获取Person类的私有成员属性name
        System.out.println("============获取Person类的私有成员属性name============");
        field = clazz.getDeclaredField("name");
        System.out.println(field);
        //忽略访问修饰符的限制
        field.setAccessible(true);
        //为name赋值
        field.set(obj,"张三");
        System.out.println(obj.toString());
    }
}
