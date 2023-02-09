package Shape;

public class Area {
	
	//Declare variable
	int length;
	int breath;
	int side;
	int radius;
	static double PI=3.14; //pi value is constant
	
	//Default Constructor
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterize constructor
	public Area(int length, int breath, int side, int radius) {
		super();
		this.length = length;
		this.breath = breath;
		this.side = side;
		this.radius = radius;
	}
	
	//create getter method for every variable
	public int getLength() {
		return length;
	}
	
	//create setter method for every variable
	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//display/print area of rectangle
	public void rectangleArea() {
		System.out.println("Area of Rectangle :"+(length*breath));
		
	}
	
	//display area of circle
	public void circleArea() {
		System.out.println("Area of Circle :"+(PI*radius*radius));
		
	}
	
	//display area of square
	public void squareArea() {
		System.out.println("Area of Square :"+(side*side));
		
	}
	
	

}
