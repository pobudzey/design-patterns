package factory;

public class Client {

    public static void main(String[] args) {

        SquareCreator sc = new SquareCreator();
        CircleCreator cc = new CircleCreator();

        Shape square = sc.factoryMethod();
        square.draw();
        Shape circle = cc.factoryMethod();
        circle.draw();
    }

}
