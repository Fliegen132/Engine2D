package Im2d;

public class Transform {
	public float x, y;
	private float height, width;
	public Transform()
	{
		x = 0;
		y = 0;
	}
	public void setTransform(Vector2 vec)
	{
		x = vec.x;
		y = vec.y;
	}
	
	public void setHeight(float height)
	{
		this.height = height;
	}

	public void setWidth(float width)
	{
		this.width = width;
	}
	public float getHeight()
	{
		return height;
	}
	public float getWidth()
	{
		return width;
	}
}
