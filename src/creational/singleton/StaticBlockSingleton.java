package creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){

    }

    // Static block initialization with Exception handling
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occurred in creation of Singleton instance.");
        }
    }

    public StaticBlockSingleton getInstance() {
        return instance;
    }
}
