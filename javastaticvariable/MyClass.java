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

/*In Java, a static variable is a variable that is shared across all instances of a class, 
rather than being specific to each instance. It belongs to the class itself, rather than any 
individual object that is created from the class.

For example, let's say you have a class called "Person". Each instance of Person might have attributes 
like "name", "age", and "height". If you make the "height" attribute a static variable, then every Person
 object you create will share the same "height" value.
 This means that if you change the "height"
  value for one object, it will change for all
   other objects as well.

Static variables are often used to 
represent values that are constant across all 
instances of a class, or to share data between
 different instances of the same class. They 
 can be accessed using the class name followed
  by the variable name, without needing to 
  create an instance of the class.
*/