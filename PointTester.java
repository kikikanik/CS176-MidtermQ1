
public class PointTester {

	public static void main(String[] args) {
		//part 1 
		Point p1=new Point();
		Point p2=new Point(3.0,4.0);
		
		//part2
		System.out.println(p1);
		System.out.println(p2);
		
		//part3
		Point answer;
		answer=p1.computeDistance(p2);
		System.out.println("Euclidean distance between p1 and p2 "+answer);
		
		// part4 
		p1.setX(1.0);
		p2.setY(5.0);
		
		// part5
		System.out.println("P1's x- "+p1.getX()+" y- "+p1.getY()+ " coordinates");
		System.out.println("P2's x- "+p2.getX()+" y- "+p2.getY()+ " coordinates");
	}
}
