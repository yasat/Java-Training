package assingment_2;

public class Shapefactory_imple extends Abstract_factory{

	@Override
	Shape getshape(String shapetype) {
		// TODO Auto-generated method stub
		if(shapetype==null)
		{
		return null;
		}
	if(shapetype.equalsIgnoreCase("Rectangle"))
		return new Rectangle();
	else if(shapetype.equalsIgnoreCase("Circle"))
		return new Circle();
	else if(shapetype.equalsIgnoreCase("Square"))
		return new Square();

return null;
}
}


