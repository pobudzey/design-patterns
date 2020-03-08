public class Client {

    public static void main(String[] args) {

        // Compile time error: constructor Singleton() is not visible
        //Singleton uniqueInstance = new Singleton();

        Singleton uniqueInstance = Singleton.getInstance();

        uniqueInstance.showMessage();

    }
}
