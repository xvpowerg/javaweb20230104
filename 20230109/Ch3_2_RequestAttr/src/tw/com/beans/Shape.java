package tw.com.beans;

public class Shape {
	private float heigth;
	private float width;
	public Shape(float heigth, float width) {
		super();
		this.heigth = heigth;
		this.width = width;
	}
	public float getHeigth() {
		return heigth;
	}
	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getArea() {
		return this.getHeigth() * this.getWidth();
	}
	@Override
	public String toString() {
		return "Shape [heigth=" + heigth + ", width=" + width + "]";
	}
	
}
