import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();

        // Add elements to the stack
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        // Check if the stack is empty
        boolean isEmpty = myStack.isEmpty(); // false

        // Get the top element of the stack without removing it
        String topElement = myStack.peek(); // "C"

        // Get and remove the top element of the stack
        String poppedElement = myStack.pop(); // "C"

        // Get the size of the stack
        int size = myStack.size(); // 2
    }
}


/*
 * En este caso tenemos una nota muy importante lo cual consiste en linkendlist son eficiente en cuanto a memoria 
 * pero Arraylist son mas eficientes en cuanto a rapidez. 
 * 
 * In Java, a linked list is a data structure that consists of a sequence of nodes, where each node contains a reference to the next node in the sequence. The first node in the sequence is called the head of the list, and the last node is called the tail.

LinkedList is a class in Java that implements the linked list data structure. It provides a set of methods for adding, removing, and manipulating nodes in the list. Here are some of the key features and methods of the LinkedList class:

The LinkedList class is a generic class, which means that it can be used to create linked lists of any type of object.
The LinkedList class implements the List interface, which means that it provides a set of methods for working with lists, such as add, remove, get, and set.
The LinkedList class also provides additional methods specific to linked lists, such as addFirst, addLast, removeFirst, removeLast, getFirst, and getLast.
The LinkedList class allows for efficient insertion and removal of nodes, as each node only needs to update its reference to the next node.
However, accessing an element in the middle of the list requires traversing the list from the head, which can be slower than accessing an element in an array.
Here is an example of how to use the LinkedList class to create and manipulate a linked list of strings:
 * 
 */

 