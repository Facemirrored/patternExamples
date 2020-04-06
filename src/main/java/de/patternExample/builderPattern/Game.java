package de.patternExample.builderPattern;

public abstract class Game implements Playable {

  private String name;
  private double durchschnittGamingtime;

  public Game(final String name, final double durchschnittGamingtime) {
    this.name = name;
    this.durchschnittGamingtime = durchschnittGamingtime;
  }

  public String getName() {
    return name;
  }

  public double getDurchschnittGamingtime() {
    return durchschnittGamingtime;
  }

  @Override
  public String toString() {
    return "Game{" +
        "name='" + name + '\'' +
        ", durchschnittGamingtime=" + durchschnittGamingtime +
        '}';
  }
}
