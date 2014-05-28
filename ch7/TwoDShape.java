class TwoDShape {
	private double width; //these are now private
	private double height;
	private String name;

//A default constructor.
TwoDShape() {
	width = height = 0.0;
	name = "none";
}
//parameterized constructor
TwoDShape(double w, double h, String n) {
	width = w;
	height = h;
	name = n;
}
//constructor object with equal width and height
TwoDShape(double x, String n) {
	width = height = x;
	name = n;
}
//construct an object from an object.
TwoDShape(TwoDShape ob) {
	width = ob.width;
	height = ob.height;
	name = ob.name;
}

//Accessor methods
double getWidth() {return width;}
double getHeight() {return height;}
void setWidth(double w) {width = w;}
void setHeight(double h) {height = h;}
String getName() { return name; }

void showDim() {
	System.out.println("Width and height are " + 
			   width + " and " + height);

	}
double area() { //The area() method defined by TwoDShape
	System.out.println("area() must be overridden");
	return 0.0;
	}
}
//A subclass of TwoDShape for triangles
class Triangle extends TwoDShape { //Triangle inherits TwoDShape 
	private String style;

	//A default constructor.
	Triangle() {
	 super(); //use super() to call the various forms of the TwoDShape constructor
	 style = "none";
	}

	//Constructor for Triangle
	Triangle(String s, double w, double h) {
	 super(w, h, "triangle"); //call superclass constructor. Use super() to call the various forms of the TwoDShape constructor
	 //setWidth(w);
	 //setHeight(h);
	
	style = s;
	}
	//One argument constructor.
	Triangle(double x) {
	 super(x, "triangle"); //call superclass constructor

	 style = "filled";	
	}
//construct an object from an object
	Triangle(Triangle ob) {
	 super(ob); //pass object to TwoDShape constructor
	 style = ob.style;
	}

	double area() {
	 return getWidth() * getHeight() / 2; //Triangle can refer to the members of TwoDShape
	}	
	void showStyle() {
	 System.out.println("Triangle is " + style);
	}		
}

//A subclaa of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
	//A default constructor
	Rectangle() {
	 super();
	}
	//constructor for Rectangle.
	Rectangle(double w, double h) {
	 super(w, h, "rectangle"); //call superclass constructor
	}

	//construct a square
	Rectangle(double x) {
	 super(x, "rectangle"); //call superclass constructor
	}

	//construct an object from an object
	Rectangle(Rectangle ob) {
	 super(ob); //pass object to TwoDShape constructor
	}

 	boolean isSquare() {
	 if(getWidth() == getHeight()) return true;
	 return false;
	}
	
	//override area() for Triangle
	double are() {
	 return getWidth() * getHeight();
	}

}

//Extend Triangle.
class ColorTriangle extends Triangle { //inherits Triangle which descended from TwoDShape
	private String color;

	ColorTriangle(String c, String s, double w, double h){
		super(s, w, h);

		color = c;
	}
	String getColor() { return color; }

	void showColor() {
		System.out.println("Color is " + color);
	}
    }
