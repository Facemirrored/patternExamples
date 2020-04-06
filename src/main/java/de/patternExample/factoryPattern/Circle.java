package de.patternExample.factoryPattern;

public class Circle implements Shape {

  private String name = "Circle";

  @Override
  public void draw() {
    System.out.println("Draw Circle.");
  }
}
