package de.patternExample;

public enum PatternTypeEnum {

  MVC("Mode-View-Controller-Pattern"),
  PROTOTYPE("Prototype-Pattern"),
  SINGLETON("Singleton-Pattern"),
  BUILDER("Builder-Pattern");

  private String pattern;

  PatternTypeEnum(final String p) {
    pattern = p;
  }

  public String getPattern() {
    return pattern;
  }
}
