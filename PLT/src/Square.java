

public class Square extends Shape {

public Square(int dimension, double side) {
	super(dimension);
	this.side = side;
}

public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}

private double side;
public double area() {
	return side*side;
}
}