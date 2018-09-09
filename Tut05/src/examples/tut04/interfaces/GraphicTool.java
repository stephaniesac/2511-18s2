package examples.tut04.interfaces;

import examples.tut04.Circle;
import examples.tut04.Rectangle;
import examples.tut04.Shape;

public class GraphicTool implements Painter {
	public static void main(String[] args) {
		Painter tool = new GraphicTool();
		someOtherFunc();
		System.out.println(tool.getPainterType());

		Shape s = new Circle("red");
		tool.printShapeInfo(s);

		Rectangle r = new Square("brown");
		r.setHeight(10);
		r.setWidth(2);
		tool.printShapeInfo(r);
	}

	public void someOtherFunc() {
		System.out.println("You can also create other methods outside the interface!");
	}

	@Override
	public void paint(Object o) {
		System.out.println(s.toString());
	}

	@Override
	public String getPainterType() {
		return "GraphicTool";

	}
}
