
public class ClassArea {

	double heightSize;
	double baseSize;
	double area;
	String formula;
	
	ClassArea (double fheightSize,double fbaseSize)
	{
		heightSize=fheightSize;
		baseSize=fbaseSize;
	}
	void Display() 
	{
		System.out.println("Calculate Area with Given Data:");
		System.out.println("Height: "+heightSize);
		System.out.println("Base: "+baseSize);
	}
}
