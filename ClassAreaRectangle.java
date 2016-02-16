public class ClassAreaRectangle extends ClassArea
{
	public ClassAreaRectangle(double fbaseSize, double fheightSize) 
	{
		super(fbaseSize, fheightSize);
		formula="Formula: Base x Height";
	}
	
	void Display()
	{
		super.Display();
		System.out.println("For Given Rectangle :"+super.formula);
		super.area=super.baseSize*super.heightSize;
		System.out.print("Area:"+super.area);
	}
}