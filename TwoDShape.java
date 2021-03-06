class TwoDShape {
	private double width;
	private double height;
	double getwidth() {return width;}
	double getheight() {return height;}
	void setwidth(double w) {width=w;}
	void setheight(double h) {height=h;}

	void showDim() {
	System.out.println("width and height is :" + width + "and" + height);
	}
}
class Triangle extends TwoDShape {
	String style;
	double area() {
	return getwidth() * getheight() / 2 ;
	}
	void showStyle() {
    System.out.println("Style is : " + style);
	}
}
class TwoDShape2 {
	public static void main(String args[]) {
	Triangle t1 = new Triangle() ;
	Triangle t2 = new Triangle() ;

	t1.setwidth(4.0) ;
	t1.setheight(4.0) ;
	t1.style = "filled" ;

	t2.setwidth(8.0) ;
	t2.setheight(12.0) ;
	t2.style = "outlined" ;

	System.out.println("Information for t1 : ") ;
	t1.showStyle();
	t1.showDim() ;
	System.out.println("Area is : " + t1.area());

	System.out.println();

	System.out.println("Inforamtion for t2 : ") ;
	t2.showStyle();
	t2.showDim();
	System.out.println("Area is : " + t2.area()) ;
	}
}