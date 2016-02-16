
public class InheritanceDemo 
{
	public static void main (String[] arg)
	{
		ClassArea caObj = new ClassArea(10,12);
		ClassAreaTraingle catObj = new ClassAreaTraingle(10,12);
		ClassAreaRectangle carObj = new ClassAreaRectangle(10, 12);
		System.out.println("Area:");
		caObj.Display();
		System.out.println("");
		System.out.println("Trangle Area:");
		catObj.Display();
		System.out.println("");
		System.out.println("Rectangle Area:");
		carObj.Display();
	}
}