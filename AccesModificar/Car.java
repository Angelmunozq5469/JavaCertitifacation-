package AccesModificar;

    public class Car {
        public String make;       // Public variable accessible from any class
        private String model;     // Private variable only accessible within the Car class
        protected int year;       // Protected variable accessible within Car and any subclasses
        String color;             // Default access variable only accessible within the same package
    
        public Car(String make, String model, int year, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }
    
        public void startEngine() {    // Public method accessible from any class
            System.out.println("The engine is starting.");
        }
    
        private void stopEngine() {    // Private method only accessible within the Car class
            System.out.println("The engine is stopping.");
        }
    
        protected void accelerate() {  // Protected method accessible within Car and any subclasses
            System.out.println("The car is accelerating.");
        }
    
        void brake() {                 // Default access method only accessible within the same package
            System.out.println("The car is braking.");
        }
    }
    
    

