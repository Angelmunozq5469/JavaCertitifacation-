package multithreading;

public class Interrupt {
    /*Investigar mas tematicas sobre interrupt
     * 
     * In Java, an interrupt is a mechanism that allows one thread to interrupt the execution of 
     * another thread by sending a signal to the thread. When a thread is interrupted, it is usually 
     * asked to stop what it is doing and perform some other task or clean up resources before terminating.

Java provides several methods for interrupting a thread, including the interrupt() method, 
which is used to send an interrupt signal to the thread, and the isInterrupted() method, which is used 
to check whether a thread has been interrupted.

When a thread is interrupted, it may throw an InterruptedException to signal that it has been 
interrupted. This exception can be caught by the thread and used to perform cleanup tasks or to terminate
 the thread gracefully.

Interrupts are often used in Java to implement cooperative thread termination, where a thread
 is asked to terminate gracefully rather than being forcefully terminated. For example, a long-running 
 computation that is running in a separate 
thread could be interrupted if the user cancels the computation or closes the application.

In summary, an interrupt in Java is a mechanism that allows one thread to signal another thread to 
interrupt its execution and perform some other task or cleanup before terminating. This can be useful for
 implementing cooperative thread termination and for responding to user actions or other external events.
    */
}
