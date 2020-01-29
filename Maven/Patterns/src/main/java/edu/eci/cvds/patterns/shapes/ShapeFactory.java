package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{
	
	public static Shape create(RegularShapeType type) {
		Shape temp = null;
		switch (type) {
		case Hexagon:
			temp = new Hexagon();
			break;
		case Pentagon:
			temp = new Pentagon();
			break;
		case Quadrilateral:
			temp = new Quadrilateral();
			break;
		case Triangle:
			temp = new Triangle();
			break;
		}
		return temp;
	}
}