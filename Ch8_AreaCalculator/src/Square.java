
public class Square extends Shape {
	
	private double width;

	public Square(double width) {
		super();
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		
		return (getWidth()*getWidth());
	}
	
	

}