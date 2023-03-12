public class Operacion_Aritmeticas {
    public static void main(String[] args) {

        int t = 1;
        int u = 3 ;
        int value = t + u;
        System.out.println(value++); // pero si aplico System.out.println(++value)  se aplicara y ejecutara en una sola linea
        System.out.println(value);


        int x = 6;

        if (x == 5) {
            System.out.println ("value es 5");

        }else{
            System.out.println ("value es 6") ;
        }

        new matrimonio(); // para ver el output tengo que hacer una instancia dentro del main
        // IMPORTANTE 
        new prueba();

        new Ternary_operatorint();
        new Ternary_operatorstring();
        new Assignment_operators();
    }
    public static class matrimonio{ // asi puedo crear otra clase dentro de otra clase IMPORTANTE
        // ACA PUEDO PONER LAS VARIABLE GLOBALES 
            
        public matrimonio(){ // IMPORTANTE SIEMPRE EN JAVA LOS EXECUTABLES DEBEN DE ESTAR DENTRO DE UN METODO
            //
            int b=21;
            int g=22;

            if((b >=21) && (g>=18)){ // Ambos tiene que ser verdaderos para que sea la condicion posible
                System.out.println("se pueden casar");
            } else { 
                System.out.println("no se pueden casar");

            }

        }

    }
    public static class prueba{
        int b = 21;
        int g =11;
        public prueba(){
        
            if((b >=21) || (g>=18)){ // uno de ellos tiene que ser verdadero para que sea true la condicion
                System.out.println("se pueden casar");
            }else{
                System.out.println("No se pueden casar");
            }


        }


    }
    public static class Ternary_operatorint{
        public Ternary_operatorint(){
            int x =10;
            x=(10 == x) ? 1 : 0;
            System.out.println(x);
        }
    }
    public static class Ternary_operatorstring{
        public Ternary_operatorstring(){
            boolean x=true;

            x=(false==x) ? true : false;
            System.out.println(x);
        }
    }
    public static class Assignment_operators{
        int b=12;
        int t=154;
        int u =134;
        public Assignment_operators(){
            b  += 12;
            t -= 154;
            u /=132;
            System.out.println(b + "     " + t + "    " + u);
        }
    }
    public static class bollean{
        boolean a=true;
    }
}




    
        


/*En esta seccion vamos a aprender acerca de los operadores aritmeticos y como operan
 * Suma, resta, multiplicacion y division. 
 * Incremento, modulo y desincremento 
 * Para suma podemos sumar numeros enteros, dobles y float al igual que sus operaciones basicas lo que es importantes saber
 * son dos cosas PRIMERO LOS MODULOS RECORDEMOS QUE CUANDO UN MODULO ME DA 0 significa que es un numero par por el contrario
 * si este me da 1 simboliza que es IMPAR
 * 
 * Otro tema de alta importancia tiene que ver las adicciones u extracciones cuando yo tengo un programa y quiero adicionar 
 * 1 adicional puedo hacerlo de dos modos 
 * 
 * 1. Que se ejecute de una dentro de la misma linea (haciendo la suma valida de una)
 * 2. Que se ejecute en la siguiente linea 
 * 
 * Esto dependera mucho de para donde lo tiremos izquierda o derecha por ejemplo:
 * 
 * Si hacemos un System.out.println(--x); a la izquierda nos simbololiza que se va a ejecutar de una
 * 
 * System.out.println(x--); a la derecha veremos reflejado que necesitamos dos lineas de codigo
 * UNA EN DONDE SE HACE EL CAMBIO 
 * OTRA DONDE SE EJECUTA EL CAMBIO
 * 
 * PARA TENER MAYOR CLARIDAD EN LA PARTE DE ARRIBA QUEDA EL EJEMPLO EN CODGIO
 * 
 */

 /* IF AND ELSE
  * 

  POR EJEMPLO SI YO NECESITO HACER UN PROGRAMA QUE DE ACUERDO A UN NUMERO ME DIGA ES 5 O NO ES 5

public class Hello {
    public static void main (String [] args ) {
        int x = 5;

        if (x == 5) {
            System.out.println ("value es 5")

        }else{
            System.out.println ("value es 4")
        }



    }
}


  */

  /*
   * Tambien hay operadores logicos que diferentes de if or else que nos puede ayudar a tomar decisiones
   * 
* Entre estos estan Mayor y Menor (<>)

public class Ejercicio {
    public static void main (String[] args) {
        int x = 5, y =5;

        if (x>y){
            system.out.println ("true");
        }else{
            system.out.println ("false");
        }
    }
}

por otro parte tambien podemos utilizar mayor igual o menor igual 

>= esto simbiliza mayor que

public class Ejercicio{
    public static void main (String [] args) {
        int p = 5;
        int o = 5;

        if (5>=5){
            System.out.println ("True")
        }
        }else{
            System.out.println ("False")
    
    }
}

   */

   /*
    * Tambien utilizamos los boolean para clasificar false and true 
    pero aca lo mas importante es lo los operadores 
    || (Si uno de ellos es TRUE TODO SERA TRUE)
    && ( AMBAS TIENE QUE SER TRUE PARA QUE SEA TRUE)
    ! (Este simbolo nos ayudara a negar por ejemplo !FALSE osea que es True)
    Entonces podemos jugar con estos simbolos para poder hacer diferentes cosas
    */

/*
 * Por otro lado tenemos una expresion bastante util que se llama "Ternary operator" este es importante puesto que
 * lo que hace es hacer un if and else en una sola linea de codigo
 * funciona de esta manera 
 * condition ? value1 : value2 para esto se hara un ejemplo en la parte SUPERIOR ESTE puede ser tanto
 * numero como string en donde responda con True or False o 1 (true) o 0 (false)
 */


 /*
  * Assignment operators 
  Estos operadores sirven como formula, dependiendo de su signo haran esto
  int x = 5;
  x +=5; x= x+5
  x -=5; x= x-5
  x *=5; x= x*5
  x /=5; x= x/5
  x %=5; x= x%5
  PARA EJEMPLIFICAR VEA LOS EJEMPLOS DE ARRIBA
  */
    
  /*
   * Tenemos tambien el operador logico if else
   * su funcion es para hacer varios bloques de condiciones con la finalidad de hacer mas exacta
   * por ejemplo 
   * int x = 6;
   * if (x==4){
   *    System.out.println (X es igual a 4)
   * } else if (x > 5){
   *    System.out.println("X es mayor que 5")
   * }else {
   *    System.out.println ("X es menor que 4")
   * }
*/

