package lv.renata.interfaces;

public class Rectangle implements Shape{ //
	private int length;
	private int width;
	private String color;
	
	public Rectangle (int length, int width){ //konstruktors, tam jaapiekabina parametri, taapeec { // iekavaa length var but x, width var buut y
		this.length = length;
		this.width = width;
		
	}
	
	public Rectangle(){
		this.color = "red";
	
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override //
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override // automatiski sagenerts
	public double getArea() { 
		return length * width; // ko atgriezt formula, atgrieziis double
	}
	
	
	
}
