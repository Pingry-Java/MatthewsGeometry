public class Segment{

	private Point start;
	private Point end;
	private static int numSegments = 0;

	public Segment(){
		this(new Point(), new Point());
	}

	public Segment(Point a, Point b){
		this.start = a;
		this.end = b;
		
		numSegments++;
	}

	public double length(){
		return Point.distance(start, end);
	}
	
	public double slope(){
		return ((double)(start.y-end.y))/(start.x-end.x);
	}
	
	public String name(){
		return start.name + end.name;
	}
	
	public String toString(){
		return "Segment " + this.name();
	}
	
	public static int getNumSegments(){
		return numSegments;
	}
}