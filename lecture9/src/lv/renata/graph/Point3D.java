package lv.renata.graph;

//the inheritance class we use extends keyword //ar extend atsaucaamies, ka 3d izmantos 2d sastavdaljas
public class Point3D extends Point2D{
	private int z;
	
	public Point3D (){ //defoltais konstruktors
		super(); // paarmanto konstruktoru no 2D klases
		this.z = 0;
		
	}
	public Point3D (int x, int y, int z){
		super(x, y); //paarmanto x un y no clases 2D
		this.z = z; //defineejam instances z veertiibu
		
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
		
	public String toString() {
		return "(" +super.getX() + " , " +super.getY() + " ," + this.z + ")";
	}
	

}
