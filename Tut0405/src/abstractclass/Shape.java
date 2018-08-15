
public abstract class Shape {

  private String colour;

  public Shape(String colour) {
    this.colour = colour;
  }

  public String getColour() {
    return this.colour;
  }

  public abstract int getArea();
  public abstract String getType();
}
