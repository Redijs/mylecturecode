package lv.renata;

import lv.renata.graph.Point2D;
import lv.renata.graph.Point3D;
import lv.renata.graph.Point4D;

public class testInheritance {

	public static void main(String[] args) {
		Point2D point = new Point2D(); //veidojam/deklareejam objektu jeb instanci + imports
		System.out.println(point.toString());//mainiigais x atgrieziis toString, kuru noformeejaam citaa failaa
		
		Point2D pointXY = new Point2D (10, -2); //izmantojam otro konstruktoru un pieshkiram veertiibas
		System.out.println(pointXY.toString());
		
		pointXY.setX(8);//mainaam, setojam jaunu veertiibu x'am
		pointXY.setY(-6);
		
		System.out.println(pointXY); // paarbaudaam, vai nomainiijaas
		
		System.out.println("x is: "+pointXY.getX());//paarbaudaam pointXY X veertiibu
		
		
		
		Point3D pointXYZ = new Point3D (3, 1,10);
		System.out.println(pointXYZ);
		
		pointXYZ.setY (-99); //aizvietojam tresho ciparu
		System.out.println(pointXYZ);
		
		
		Point4D pointXYZT = new Point4D (3,4,2,2);
		System.out.println(pointXYZT); 
		
		System.out.println(pointXYZT.getX());//izveelne peec .get - jaaizveelas no kuras klases njemt X - jaatsaucaas uz 2D
		System.out.println(pointXYZT.getY());
		
	}

}
