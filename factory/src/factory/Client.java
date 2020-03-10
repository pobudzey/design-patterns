package factory;

public class Client {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.produceShape("Circle");
        circle.draw();

        Shape square = shapeFactory.produceShape("Square");
        square.draw();

        Shape rectangle = shapeFactory.produceShape("Rectangle");
        rectangle.draw();
        
    }

}
