package factory;

public class CircleCreator extends Creator {

    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}
