package Homework5;

public class Shape {
	private double area;
	private boolean isPolygon;

	
	//Getters
	public double getArea(){
		return area;
	}
	public boolean isPolygon(){
		return isPolygon;
	}

	//Setters
	public void setPolygon(boolean isPolygon) {
		this.isPolygon = isPolygon;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
