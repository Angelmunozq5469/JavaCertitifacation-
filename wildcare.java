public class wildcare {
    /*
     * n Java, wildcards in generics allow you to define a generic type or method that can work with any type or a specific subset of types. Wildcards are denoted by the "?" symbol and can be used in place of a type parameter.

There are two types of wildcards in Java: the "extends" wildcard and the "super" wildcard.

The "extends" wildcard is used to restrict the types that a generic can accept. 
For example, if you have a method that takes a list of numbers and you want to restrict it to only accept 
lists of integers or subclasses of integers, you can use the following syntax:
     */
}

public void myMethod(List<? extends Integer> myList) {
    // method implementation
}
