package lesson17Homework.Task01;

/**1. Написать рефлексивный toString():

public static String toString(Object o)
 Метод принимает любой объект
        и формирует строку на основании его полей без необходимости переопределять метод toString() объекта.

 Добавить аннотацию @Exclude для полей, которые не должны быть включены в результирующую строку.

Методы, которые могут понадобиться:
Object.getClass()

Class.getDeclaredFields()
Class.getSimpleName()
Class.isPrimitive()
Class.isArray()

Field.getName()
Field.getType()
Field.setAccessible()
Field.get()*/

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Dog dog = new Dog();
        dog.setName("dad");
        dog.setAge(45);
        System.out.println(Medoth.toStr(dog));
    }
}
