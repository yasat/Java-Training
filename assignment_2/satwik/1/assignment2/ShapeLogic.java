package assignment2;

public class ShapeLogic{ 
	static Shape getshape(String name) { //using static to be able to accessible without initializing an object
		if(name.equalsIgnoreCase("Rectangle")) {
			Shape ob = new Rectangle(); //create
			ob.draw(); //draw
			return(ob); //return
		}
		else if(name.equalsIgnoreCase("Square")) {
			Shape ob = new Square();
			ob.draw();
			return(ob);
		}
		if(name.equalsIgnoreCase("Circle")) {
			Shape ob = new Circle();
			ob.draw();
			return(ob);
		}
		else {
			Shape ob = new Defaultsh(); //if passed unknown string, this will be initiated as default
			ob.draw();
			return(ob);
		}
	}
	
}
class maincls1{
	public static void main(String[] args) {
		ShapeLogic.getshape("Rectangle"); //can save the returned object, if needed
		ShapeLogic.getshape("Circle");
		ShapeLogic.getshape("square");
		ShapeLogic.getshape("random");
	}
}
