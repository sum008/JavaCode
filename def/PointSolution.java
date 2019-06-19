package def;

public class PointSolution {
	
	static double floorSqrt(double x) 
	{ 
		if (x == 0 || x == 1) 
			return x; 
 
		double i = 1, result = 1; 
		
		while (result <= x) { 
			i++; 
			result = i * i; 
		} 
		return i - 1; 
	} 
	
	public static double findSequentialDIstance(Point[] p){
		double count=0;
		for(int i=0; i<p.length; i++){
			for(int j=i+1; j<p.length;){
				count=count+floorSqrt((p[i].getX()-p[j].getX())*(p[i].getX()-p[j].getX())+((p[i].getY()-p[j].getY())*(p[i].getY()-p[j].getY())));
			    break;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		Point p1 = new Point(-3,-4);
		Point p2 = new Point(0,0);
		Point p3 = new Point(4,3);
		Point p4 = new Point(16,-2);
		
		Point[] a = {p1,p2,p3,p4};
		
		System.out.println(findSequentialDIstance(a));
		

	}

}
