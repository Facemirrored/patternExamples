package de.patternExample.builderPattern;

public class Fantasy extends Game {

  public Fantasy(String name, double durchschnittGamingtime) {
    super(name, durchschnittGamingtime);
  }

  @Override
  public void startGame() {
    System.out.println("Start Fantasy-Game");
  }

  @Override
  public void closeGame() {
    System.out.println("Close Fantasy-Game");
  }

  @Override
  public void pauseGame() {
    System.out.println("Paused Fantasy-Game");
  }
}
