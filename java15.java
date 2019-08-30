class Object
{
	public int Add(int a, int b)
	{
		return (a + b);
	}
	public int Add(int a, int b, int c)
	{
		return (a + b + c);
	}
	public int Add(int a, int b, int c, int d)
	{
		return (a + b + c + d);
	}
}

public class java15
{
	public static void main(String[] args)
	{
		Object o = new Object();

		System.out.println("Add 1 => " + o.Add(4, 5)); 
		System.out.println("Add 1 => " + o.Add(4, 5, 6));
		System.out.println("Add 1 => " + o.Add(4, 5, 6, 7));
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
}
