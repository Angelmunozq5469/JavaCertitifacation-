/*
 * Hay varias opciones para utilizar los loops en JAVA tenemos for, while y do while cada uno tiene su uso
 * especifico por ejemplo: el for se suele utilizar cuando sabemos el numero especifico de veces que se va a utilizar un 
 * ciclo quisas queramos imprimir de 1 a 1000 entonces se compone de esta manera
 * for(int i = 10; i>=1; i--){
 *      System.out.printnl("valor de i" + i)
 *  Tenemos en la primera linea el ciclo de for, en la segunda tenemos la inicializacion de esa variable osea
 * en que valor iniciamos, en la siguiente tenemos la condicion que se debe cumplir para que termine el ciclo for
 * por otro lado la linea tiene en su ultima fila otra condicion que el dira si debe mermar el numero inicial o debe de sumarle a el numero
 * inicial eso dependera de lo que necesitemos 
 * }
 * 
 * 
 * La implementacion del loop while es muy similar a la de for para esto veremos como se escribe:
 * 
 * int i = 10;
 * while(i=>20){
 * System.out.printnl("este es el valor de i " + i)
 * i++;
 * }
 * 
 * While por otra parte es mas recomendado utilizarlo para con bloques de True or false es decir que la condicion
 * varia nos sabemos cuando una condicion es True o es False, es de suma importancia tener muy claras las condiciones
 * dentro de un ciclo.
 * 
 * 
 * En ultimo tenemos el ciclo do While que tiene una caracteristica muy especial que como su nombre lo dice 
 * lo que hace es hacer y despues validar el while nos daremos cuenta por su estructura 
 *  
 * int i = 10;
 * 
 *      do{
 * 
 *      System.out.printl("tu valor es" + i);
 *      i --;
 *      } while (i<=10)
 * 
 */

 /**
  * Loops_en_java
  */
 public class Loops_en_java {
 
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println("El valor de i es "  + " "  + i);
        }

        System.out.println("\n" + """
            
        
        """);
        

        new Loops_en_do_while();

        System.out.println("\n" + """
            
        
        """);
        new Loops_while();
        

    }
        

    public static class Loops_while{
        int i = 1;

        public Loops_while(){

            while (i<=10) {
                System.out.println("El valor de i tera " + " " + i);
                i ++;
                
            }
        

        }


        
    }

    public static class Loops_en_do_while {
        double i = 1.0;
        public Loops_en_do_while(){

            do {
                System.out.println("El valor de i pero " + " " + i);
                i++;
                
            } while (i<=10.0);
        }
    
        
    }
 }