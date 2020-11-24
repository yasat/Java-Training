package assingment_2;

public class Main {
	
	public static void main(String args[])
	{
		Abstract_factory Shapefacotry_imple=Factory_producer.getFactory("Shape");
		Shape shape1=Shapefacotry_imple.getshape("Rectangle");
		shape1.draw();
		Shape shape2 =Shapefacotry_imple.getshape("Circle");
		shape2.draw();
		Shape shape3 = Shapefacotry_imple.getshape("Square");
		shape3.draw();
		
	}

}
