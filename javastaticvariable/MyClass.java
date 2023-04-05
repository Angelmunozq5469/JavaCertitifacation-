package javastaticvariable;

public class MyClass {
    static int count = 0;
    int id;

    public MyClass() {
        count++;
        id = count;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        System.out.println(obj1.id); // prints 1
        System.out.println(obj2.id); // prints 2
        System.out.println(obj2.id + obj1.id);
        System.out.println(MyClass.count); // prints 2
    }
}
