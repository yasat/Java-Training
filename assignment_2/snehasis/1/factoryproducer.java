package assingment_2;

public class Factory_producer {
	public static Abstract_factory getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("Shape"))
			return new Shapefactory_imple();
		return null;
	}

}
