package multithreading;

public class multithreading {
    /*
     * Hay varios tipos de metodos de sincronizacion con la finalidad de prevenir que solo
     * un proceso ingrese a las variables de una clase, en caso tal de un Banco por ejemplo.
     * 
     * In Java, synchronized methods are used to provide thread safety
     *  in a multi-threaded environment. When a method is declared as synchronized, 
     * it means that only one thread can access that method at a time. This prevents 
     * multiple threads from 
     * accessing the same shared resource simultaneously and avoids race conditions and other concurrency issues.

There are two types of synchronized methods in Java: instance synchronized 
methods and static synchronized methods.

Instance Synchronized Method:
Instance synchronized methods are synchronized on 
the instance of the class. This means that when a thread calls an instance
 synchronized method, it acquires a lock on the instance of the object and prevents 
 any other thread from accessing any other synchronized instance method of that object 
 
 until the lock is released.
Static Synchronized Method:
Static synchronized methods are synchronized on the class itself, not on the instance of 
the class. This means that when a thread calls a static synchronized method, it acquires a 
lock on the class and prevents any other thread from accessing any other static synchronized 
method of that class until the lock is released.

NOTA IMPORTANTE: ES DE ALTA IMPORTANCIA CONOCER EL TEMA DE LOS METODOS EN CUANTOS A LOS HILOS
PUESTO QUE EN TEMA DE OPTIMIZACION Y COMO UTILIZAN LOS PROGRAMAS ESTOS HILOS PARA EJECUTAR LOS 
PROGRAMAS MAS RAPIDO ES IMPORTANTE.
     */
}
