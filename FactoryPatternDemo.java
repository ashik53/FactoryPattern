/*
    Main class , from here object creation method of factory class will be called

*/


public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape circleShape = shapeFactory.getShape("circle");
        circleShape.draw();

        //get an object of Rectangle and call its draw method
        Shape rectangleShape = shapeFactory.getShape("rectangle");
        rectangleShape.draw();

        //get an object of Square and call its draw method
        Shape squareShape = shapeFactory.getShape("square");
        squareShape.draw();

    }
}