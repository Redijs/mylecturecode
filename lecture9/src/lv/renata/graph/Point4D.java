package lv.renata.graph;

public class Point4D extends Point2D {
	private int z;
	private int t;
	
	public Point4D (int x, int y, int z, int t){
		super (x,y); // sho mantojam
		this.z = z; // shos defineejam
		this.t = t;// shos defineejam
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
		
	public String toString() {  //jaaveido toString, uz ko atsauksimies testInherence
		return "(" +super.getX() + " , " +super.getY() + " ," + this.z + "," + this.z + ")";
	}
	
}