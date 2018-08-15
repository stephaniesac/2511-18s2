
public class Square extends Shape {

  private String colour;
  private int side;

  public static void main(String[] args) {
    System.out.println("Testing Shape class");

    Shape s = new Square("Red", 5);
    System.out.println("Testing Square colour: " + s.getColour());

    System.out.println("Testing Shape area: " + s.getArea());
    System.out.println("Testing Shape type: " + s.getType());
  }

  public Square(String colour, int side) {
    super(colour);
    this.side = side;
  }

  @Override
  public int getArea() {
    return side*side;
  }

  @Override
  public String getType() {
    return "Square";
  }

}
