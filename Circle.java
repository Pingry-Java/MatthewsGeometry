public class Circle{
	
	private Point center;
	private double radius;
	
	public Circle(){
		center = new Point();
		radius = 1;
	}
	
	public Circle(Point newCenter){
		this.center = newCenter;
		radius = 1;
	}
	
	public Circle(double newRadius){
		this.radius = newRadius;
		this.center = new Point();
	}
	
	public Circle(Point newCenter, double newRadius){
		this.radius = newRadius;
		this.center = newCenter;
	}
	
	public double diameter(){
		return 2*radius;
	}
	
	public double circumference(){
		return Math.PI*radius*2;
	}
	
	public double area(){
		return Math.PI*radius*radius;
	}
	
	public String toString(){
		return "Circle "+ center.name;
	}
}