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


