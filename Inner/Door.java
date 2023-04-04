package Inner;

public class Door {
    private Lock lock;
    public Door(){
        lock = new Lock(true);
    }
    public Lock getLock() {
        return lock;

    }
    public void shopStatus(){
        if(lock.isLock()){
            System.out.println("esta cerrada");
        }else{
            System.out.print("Esta abierto");


        }
        }
    }

    class Lock {
        private boolean lock;

        public Lock (boolean lock){
            this.lock = lock;
        }
        public boolean isLock(){
            return lock;
        }
        public void setlock(boolean lock){
            this.lock = lock;
        }
    }

