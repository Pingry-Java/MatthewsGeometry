public class PointRunner2{
	public static void main(String[] args){
		Point a = new Point(3,4, "P");
		Point b = new Point(6,8, "Q");
		System.out.println(Point.distance(a,b));
		System.out.println(a.distance(b));
		
		Segment seg = new Segment(a, b);
		System.out.println(seg.slope());
		System.out.println(seg.length());
		System.out.println(seg);
		
		Circle c = new Circle(a, 3);
		System.out.println(c.diameter());
		System.out.println(c.circumference());
		System.out.println(c.area());
		System.out.println(c);
	}
}