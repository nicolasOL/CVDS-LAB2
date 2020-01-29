package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeMain {
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }
        try {
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = ShapeFactory.create(type);
            System.out.println("Successfully created a "+type +"with "+ shape.getNumberOfEdges()+" sides.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        } 
    }
}