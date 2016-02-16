public class ClassAreaTraingle extends ClassArea
{
	ClassAreaTraingle(double fbaseSize,double fheightsize)
	{
		super(fbaseSize, fheightsize);
		formula="Formula: 1/2 Base x Height";
	}
	void Display()
	{
		super.Display();
		System.out.println("For The Given Triange :"+super.formula);
		super.area = super.baseSize*super.heightSize/2;
		System.out.println("Area:"+super.area);
	}
}
