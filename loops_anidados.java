/**
 * loops_anidados
 */
public class loops_anidados {

    public static void main(String[] args) {
        
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=10; j++){
                System.out.println("el valor es" + "  " + i +  " " + "el valor es" + " "  + j);


            }
            System.out.println("#################################################");
        }
        new ejercicio_anidadosloops();
    }

    public static class ejercicio_anidadosloops{

        public ejercicio_anidadosloops(){
            for (int i =1; i<=5; i++){
                for(int j = 1; j<=i; j++){
                    System.out.println(j);
                }
                System.out.println();
            }
        }//Revisar esto
    }

}