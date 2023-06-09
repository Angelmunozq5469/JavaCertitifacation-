/*Una clase nos permite hacer una plantilla en donde se pondra la disposicion de todo lo que nuestro programa quiere hacer
por otro lado estas clases nos facilitan la programacion orientada a Objetos 
 * 
 * En este caso estamos programando orientado a objetos estamos programando
 * orientado a un carro el cual tiene puertas, motor y conductor
 * esas variables son privada de esta clase pero las podremos llamar
 * con getters and setters por su lado getter se utiliza para extraer
 * de una clase con variables privadas el valor y setter es para asignarle 
 * ese valor a una variable privada 
 */

/*Por otro lado pordemos hacer mas corto el camino utilzando metodo constructor 
 * package Java_orientado_a_objetos;

public class Clases {
    private String doors;
    private String Engine;
    private String driver;
    private  int speed;

    public Clases(){       #VALOR DEFAULT
        doors = "opened"
        Engine = "off"
        driver = "absent"
        speed = "0"
    }
    
    public Clases (String doors, String Engine, String drivers, int speed){
        this.doors = doors
        this.Engine = Engine
        this.driver =driver
        this.speed = speed
    }

    public void setSpeed(int speed){
        this.speed = speed;
        
    }

    public void setDoor(String doors){
        this.doors = doors;
    }


    public void setEngine(String Engine){
        this.Engine = Engine;
    }

    public void setdriver(String driver){
        this.driver = driver;
    }
    public String run() {
        if (doors.equals("closed") && Engine.equals("on") &&
                driver.equals("seated") && speed>0){
                    return "running";

        }else
            return "not running";

    }
}
 * 
 */

package Java_orientado_a_objetos;

public class Clases {
    private String doors;
    private String Engine;
    private String driver;
    private  int speed;
    
    public void setSpeed(int speed){
        this.speed = speed;
        
    }
    public int getSpeed(){
        return speed;
    }

    public String getDoor(){
        return doors;
    }

    public void setDoor(String doors){
        this.doors = doors;
    }

    public String getEngine(){
        return Engine;
    }
    public void setEngine(String Engine){
        this.Engine = Engine;
    }
    public String getdriver(){
        return driver;
    }
    public void setdriver(String driver){
        this.driver = driver;
    }
    public String run() {
        if (doors.equals("closed") && Engine.equals("on") &&
                driver.equals("seated") && speed>0){
                    return "running";

        }else
            return "not running";

    }
}
