import java.math.BigDecimal;



public class Primer_programa {

    public static void main(String[] args) {
        int edad=12; 
        String nombre = "angel";
        System.out.println(nombre + " " + edad);

        float numero =10;
        float numero2 =6;
        double numero3 = 10;
        double numero4 = 6;
        float resultado = numero/numero2;
        double resultado2 = numero3/numero4;

        double ojo = 1.05;
        double diente = 2.55;
        double resultado22 = ojo + diente;


        System.out.print("El resultado es = " + resultado + "en comparacion con el resultado numero2 es =" + resultado2 + " " + " ACA ESTA =" + resultado22 + "     ");
        
        BigDecimal d1 = new BigDecimal("1.05");
        BigDecimal d2 = new BigDecimal("2.55");
        System.out.println(d1.add(d2));



        int a = 45;
        float b = 52;
        int resultado45 = (int) ((a*a) + 2*(a*b) + (b*b));

        System.out.println (resultado45);
        


    }
}

/* ESTOS SERIAN LOS TIPOS DE DATOS PRIMITIVOS PERO ENTEROS 

 * En Java hay tipos de datos primitivos entre estos se encuentran los 
 * Int Max (Maximo que puede acomular) : (7234567893) -- Maximo el numero mas grande que puede tener un int
 * Int Min (Minimo que puede acomular) : (-7234567893) -- Minimo numero que puede tener int 
 * short max (32456) 
 * short min (-32456)
 * long max (1234567891011121314516573849) -- El long permite numero muy grandes pero tambien 
 * long min (-1234567891011121314516573849) -- Numeros muy pequeños
 * byte max (123)
 * byte min (-123)
 * En teoria esto se refiere al numero mas grande que puede acomular y al menor que puede acomular
 */

/* LOS TIPOS DE DATOS PRIMITIVOS EN DECIMALES ESTAN DADOS POR:
 * int AUNQUE NO ES UN DECIMAL TAMBIEN OCUPA 32 BITS EN MEMORIA
 * float (Ocupa 32 Bits en memoria) 
 * double (Ocupa 64 Bits en memoria)
 * Otro objeto a resaltar es que como vemos en el ejemplo si utilizamos un metodo de float es mas corto el resultado es decir si buscamos
 * presicion podemos utilizar el metodo de double pues nos demuestra con mas decimales pero por si lo contrario buscamos que ocupe 
 * menos espacio entonces podemos utilizar float 
 * 
 * 
 */

 /*POR OTRO LADO ESTAN LOS BOOLEAN AND CHAR 
  * Recordemos que el elemento CHAR is for caracteres esto es importante conocerlo porque java tiene un sistema de unicode grandisimo
  * es decir tiene mucho caracteres para utilizar todos estos caracteres podemos buscar el codigo en internet y darle un print de esta manera
  * '\u00A7'
  *
  *
  *
  *
  * Pero el elemento boolean nos devuelve un trus or false entonces tener mucho cuidado con eso 
  *
  */

  /*Por otro lado hicimos un ejercicio en donde habia un bug con Java porque se ingresaban dos variable una de ellas podia ser
   * x = 1.05 ; y = 2.55 pero el RESULTADO ERA 3.599999999996 para solucionar esta problematica nos toca que pedir ayuda
   * de un modulo llamado "BigDecimal" que nos ayuda con este bug se ejecuta de la manera mostrada arriba;
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */

/*Strings 
 * Recordemos que los Strings seran siempre texto nunca seran numeros u otros valores
 * cuando utilizamos cualquier operacion de multiplicacion, suma, resta o demas 
 * se hara operaciones diferentes por ejemplo si yo hago un 
 * 
 * public class Hello {
 *     public static void main (Strings[] args) {
 *          String var = "10"
 *          String va1 = "20"
 *          System.out.println()
 * }
 * 
 * 
 * }
 * 
 */

 /*En esta parte vimos un tema muy importante llamo "Type Casting" que en profundidad es el cambio de datos
 de uno a otro, por ejemplo tengo un double pero lo quiero cambiar a un INT, la pregunta es como lo hago ?
 * pues para esto existe el "Type Casting" este proceso se da de manera manual por el programador o por especificaciones o extenciones del editor de codigo
 * 
 * Ejemplo:
 * 
 * double r = 2.4;
 * int u = (int) r;
 * 
 * Asi es como podrias pasar los tipos de datos apesar de eso hay datos que no son compatibles, para hcer el cambio por ejemplo no puedes cambiar un
 * String a un int. 
 * 
 * El ejemplo mas Util y facil para poder ejecutar y entender mejor como nos serviria este "Casting Type" seria
 * 
 * Ejercicio : Haga un programa que ejecute esta ecuacion
 * 
 * ((a*a) + 2ab + (b*b))
 * 
 * 
 * Public class Ecuacion {
 *  public static void main (Strings [] args) {
 *      int a = 45;
 *      float b = 52;
 *      double resultado = (a*a) + 2*(a*b) + (b*b)
 *      System.out.printnl (resultado) # supongamos que lo quiero pasa a int, que hago?
 *      double resultado =  (a*a) + 2*(a*b) + (b*b) - 9409.0
 * 
 * pero si utilizamos int sera un cambio de typo de dato entonces tendremos el numero entero
 * 
 * int resultado = (int) ((a*a) + 2*(a*b) + (b*b))
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
  * 
  */


  /*Debe de ser claro que cada tipo de dato tiene su proposito como tambien su desproposito para hacer mejor uso de el describire cuando es bueno utilizar que tipo de dato
   * 
   * Double (En cualquier escenario donde sea necesario ver los floating points)
   * Double (Cualquier operacion donde el resultado sea un floating point)
   * Double (donde sea requerida una gran exactitud)
   * Float (Solo si es requerido)
   * Int(en cualquier lugar donde sea entero el numero)
   * Long (Cuando el int no sea lo suficientemente grande)
   */


   