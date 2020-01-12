/*
    Factory class to get the Shape objects
    Concrete classe's object will be created & return from here 
*/

public class ShapeFactory{
    
    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
        
        if(shapeType == null){
            return null;
        }
        
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;

    }
}