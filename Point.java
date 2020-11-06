
public class Point {
	private double x = 0;
	private double y = 0;
	
	double computeDistance = 0; 
	double distance = 0;
	
	public Point (double xCoordinate, double yCoordinate) {
		x = xCoordinate; 
		y = yCoordinate;
	}
	public Point () {
		x = 0;
		y = 0;
	}
	public double getX() {
		return x; 
	}
	public void setX (double xCoordinate) {
		x = xCoordinate;
	}
	public double getY() {
		return y;
	}
	public void setY (double yCoordinate) {
		y = yCoordinate;
	}
	
	public Point computeDistance(Point p) {
		Point distance = new Point();
		distance.y = Math.abs(y-p.y);
		distance.x = Math.abs(x - p.x);
		distance.computeDistance = Math.sqrt((distance.y)*(distance.y) + (distance.x)*(distance.x));
		return distance;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}