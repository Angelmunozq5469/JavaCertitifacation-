/*
 * tambien podemos utilizar \\\\
 * 
 * 
 * package Java_orientado_a_objetos;

public class car {
    public static void main (String[] args) {
        Clases clase = new Clases ("closed","on","seated",10); # con este le diremos no cojas los default coge estos
        #es decir inicializa en un lado por default pero cuando se encuentra acan estos sacara estas caracteristicas.
        System.out.println(clase.run());
    }
    
}
 */



package Java_orientado_a_objetos;

public class car {

    public static void main(String[] args) {
        Clases clase = new Clases();
        clase.setDoor("closed");
        clase.setEngine("on");
        clase.setSpeed(10);
        clase.setdriver("seated");
        System.out.println(clase.run());

    }
    
}

