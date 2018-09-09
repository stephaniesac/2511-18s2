package examples.tut04;

/**
 * Is this really an IS-A relationship?
 */
public class Square extends Rectangle {
	public Square(String color) {
		super(color);
	}

	@Override
	public void setWidth(int aWidth) {
		super.setWidth(aWidth);
		super.setHeight(aWidth);
	}

	@Override
	public void setHeight(int aHeight) {
		super.setWidth(aHeight);
		super.setHeight(aHeight);
	}
}
