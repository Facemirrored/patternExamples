package de.patternExample.factoryPattern;

public class ShapeFactory {

  private static final ShapeFactory INSTANCE = new ShapeFactory();

  private ShapeFactory() {
  }

  public static ShapeFactory getInstance() {
    return INSTANCE;
  }

  public Shape createShape(final String shapeType) {
    if (shapeType.toLowerCase().equals("circle")) {
      return new Circle();
    } else if (shapeType.toLowerCase().equals("rectangle")) {
      return new Rectangle();
    } else if (shapeType.toLowerCase().equals("square")) {
      return new Square();
    }

    throw new IllegalArgumentException("Shape nicht vorhanden.");
  }
}