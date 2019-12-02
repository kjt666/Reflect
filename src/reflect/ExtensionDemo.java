package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ExtensionDemo {
    public static void main(String args[]) throws Exception {

        //有一个字符串列表
        ArrayList<String> strList = new ArrayList<>();
        strList.add("动物庄园");
        strList.add("美丽新世界");
        //绕过泛型检查，向字符串列表添加数值
        Class<? extends ArrayList> listClass = strList.getClass();
        Method add = listClass.getMethod("add", Object.class);
        add.invoke(strList, 1984);
        //便利字符串列表打印
        for (Object o : strList) {
            System.out.println(o.getClass() + "：" + o);
        }
    }
}


