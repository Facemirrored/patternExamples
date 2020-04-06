package de.patternExample;

public enum PatternTypeEnum {

  MVC("Mode-View-Controller-Pattern"),
  SINGLETON("Singleton-Pattern");

  private String pattern;

  PatternTypeEnum(final String p) {
    pattern = p;
  }

  public String getPattern() {
    return pattern;
  }
}
