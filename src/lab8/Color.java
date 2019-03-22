package lab8;

public enum Color
{
	RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA;
	
	int r;
	int g; 
	int b;
	
	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public int getR()
	{
		return r;
	}
	public int getG()
	{
		return g;
	}
	public int getB()
	{
		return b;
	}
}
