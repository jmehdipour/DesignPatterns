package creational.singleton;

public class EnhancedThreadSafeSingleton {
    private static EnhancedThreadSafeSingleton instance;

    private EnhancedThreadSafeSingleton(){

    }

    public static synchronized EnhancedThreadSafeSingleton getInstance() {

        if (instance ==  null){
            synchronized (EnhancedThreadSafeSingleton.class){
                if (instance == null){
                    instance = new EnhancedThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
