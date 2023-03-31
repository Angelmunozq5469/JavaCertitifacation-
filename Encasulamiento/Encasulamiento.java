package Encasulamiento;

public class Encasulamiento {

    public class BankAccount {

        private double balance;
    
        public void deposit(double amount) {
            balance += amount;
        }
    
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }
    
        public double getBalance() {
            return balance;
        }
    }
    
}


/*By making the balance variable private, we have encapsulated it and prevented other parts of 
the program from modifying it directly. This ensures that the balance can only
 be modified in a controlled manner through the deposit and withdraw methods. */