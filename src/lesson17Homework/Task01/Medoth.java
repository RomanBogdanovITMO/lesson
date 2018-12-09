package lesson17Homework.Task01;

import java.lang.reflect.Field;

public class Medoth {
    public static String toStr(Object object) throws IllegalAccessException {
        /*String name = null;
        int age = 0;
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        try {
            for (int i = 0; i<fields.length; i++){
                fields[i].setAccessible(true);
                if(fields[i].getName().equals("name")){
                    name = (String)fields[i].get(object);
                }else if (fields[i].getName().equals("age")){
                    age = (int)fields[i].get(object);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        String str =" Name object " + name + ", "+ "Age object " + age;
        return str;*/
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        StringBuilder sb = new StringBuilder();
        for(Field field: fields){
            field.setAccessible(true);
            Object failValue = field.get(object);
            sb.append(field.getName()).append("=").append(failValue).append(" ");
        }
        return sb.toString();
    }
}
