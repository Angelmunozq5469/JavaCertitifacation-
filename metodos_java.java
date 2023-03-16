/* Aca tenemos que un metodo es un tipo de funcion que podemos crear 
y utilizarlos para varias clases e incluso las veces que queramos podemos reutilizarlo
dentro de otras clases de hecho es similar a lo que veniamos haciendo en clases anteriores
cuando queriamos ejecutar dentro de un mismo main varias sub-clases.

 
 * 
 */

public class metodos_java {
    public static void main(String[] args) {
        loop();
        System.out.println("###################################");
        name();
        System.out.println("########################");
        loop();
        System.out.println("########################");
        System.out.println(areacalcular(2, 4));
        System.out.println("########################");
        System.out.println(lados(3, 20));
        System.out.println(lados(3));

    }
    public static void loop() {
        int a = 1;
        while (a<=5) {
            System.out.println(a);
            a++;
            
        }

        
    }
    public static void name() {
        int a = 6;
        while (a<=10) {
            System.out.println(a);
            a++;
            
        }
        
    
    }
    public static int areacalcular(int a, int b) {
        return a*b;
        
        
    }

    public static int lados(int a, int b) {
        return a -b;

        


        
    }
    public static int lados(int u) {
        return u;
        
    }
    
}

/*
 * Cuando hablamos de metodo estos viene a compañados de algo sumamente importante
 * a la hora de elaborar un programa se llama "Return" que nos retorna
 * ese valor que estamos buscando con la finalidad de ilustrar de la mejor manera
 * haremos un metodo llamado area rectangulo para hacer un return recordemos
 * que debemos remplazar "void" porque este nos dice no retornada nada pero
 * si lo vamos a hacer entonces reeemplazamos el void por el tipo de datos
 * que se va a retornar en este caso sera un INT
 */

/*
 * Ahora hablaremos sobre el Metodo Overloading es un metodo util que consiste
 * en tener dos metodos con mismos nombre pero con diferentes actividades
 * definidas, quien decide que metodo utilizar ? el copilador el decide de acuerdo
 * a lo que se tenga que hacer cual metodo se utiliza, para esto utilizaremos un ejemplo que puede
 * generar error que tenga el mismo nombre y las mismas variables o mismo nombre y mismo tipo
 * de datos, para tener en cuenta. 
 * 
 * 
 *
 */
