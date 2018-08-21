

public class Circle extends Shape {
private int radius;

public Circle(int dimension, int radius) {
	super(dimension);
	this.radius = radius;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double area()
{
	return Math.PI*radius*radius;}
}
