package singleton;

public class Client {

    public static void main(String[] args) {

        // Compile time error: constructor singleton.Singleton() is not visible
        //singleton.Singleton uniqueInstance = new singleton.Singleton();

        Singleton uniqueInstance = Singleton.getInstance();

        uniqueInstance.showMessage();

    }
}
