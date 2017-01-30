public class Point{
	public int x;
	public int y;
	public String name;
	
	public Point(){
		x=0;
		y=0;
		name = "no name given";
	}
	public Point(int a, int b){
		x=a;
		y=b;
		name = "no name given";
	}
	public Point(int a, int b, String n){
		x=a;
		y=b;
		name = n;
	}
	
	public double distanceFromOrigin(){
		return Math.hypot((double)x, (double)y);
	}
	
	public void setX(int a){
		if(a>=0){
			x=a;
		}
	}
	public static double distance(Point a, Point b){
		return Math.hypot((double)(a.x-b.x), (double)(a.y-b.y));
	}
	
	public double distance(Point a){
		return Math.hypot((double)(x-a.x), (double)(y-a.y));
	}
	
	public String toString(){
		return name + ": (" + this.x + ", " + this.y + ")";
	}
}