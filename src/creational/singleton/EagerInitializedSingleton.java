package creational.singleton;

public class EagerInitializedSingleton {

    private final static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
