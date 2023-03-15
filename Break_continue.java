/**
 * Break_continue para esto tenemos dos anotaciones que son muy comunes en los programas JAVA se encuentra 
 * break y continue como su nombre lo indica break es para quebrar el ciclo para esto aremos un ejemplo en la siguien
 *linea 
 */

 
public class Break_continue {

    public static void main(String[] args) {
    
        for(int i =1 ; i<=10; i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
        new continue_java();
    }

/**
 * continue hace referencia a que se salte esa condicion y siga con el ciclo sin importa que
 * 
 *  */    
    public static class continue_java {

        public  continue_java(){

            for(int i =1; i<10; i++){
                System.out.println(i);
                if(i==5){
                    continue;   
                }
            }


        }



    }
}

