package Inner;

public class Shop {
    
    public static void main(String[] args) {
        Door door = new Door();
        door.shopStatus();
        door.getLock().setlock(false);
        door.shopStatus();
    }
}
