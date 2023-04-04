package output;

import java.util.Scanner;

public class app {
     public static void main(String[] args) {
        System.out.println("Cual es tu nombre ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Tu nombre es " + "" + name);
     }
}
