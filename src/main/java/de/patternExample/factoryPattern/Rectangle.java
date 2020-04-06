package de.patternExample.factoryPattern;

public class Rectangle implements Shape {

  private String name = "Rectangle";

  @Override
  public void draw() {
    System.out.println("Draw Rectangle.");
  }
}
