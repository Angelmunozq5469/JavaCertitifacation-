package Array;

public class array {
    public static void main(String[] args) {
        int [] intvatiable = {1,2,3,4,5,6,7,8,9,10};
        System.out.print(intvatiable[1]);
        System.out.println(new arraywithloop());
        System.out.println(new nuevoloop());
    }

    public static class arraywithloop {

        public arraywithloop (){

            String [] name = {"Angel","Kelly","Felipe","Luz Dary","Miguel"};

            for(int i = 0; i<=4;i++){
                System.out.println(name[i]);
            }



        }
        
    }

    public static class nuevoloop {

        public nuevoloop(){
            String[] nombres = {"Laura","Juliana","Federico","Marcela"};
            for(String nombress: nombres){
                System.out.println(nombress);
            }
        }
    }
        
}


