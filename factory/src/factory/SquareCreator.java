package factory;

public class SquareCreator extends Creator {

    @Override
    public Shape factoryMethod() {
        return new Square();
    }
}
