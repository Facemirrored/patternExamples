package de.patternExample.builderPattern;

public class EgoShooter extends Game {


  public EgoShooter(String name, double durchschnittGamingtime) {
    super(name, durchschnittGamingtime);
  }

  @Override
  public void startGame() {
    System.out.println("Start Ego-Shooter-Game");
  }

  @Override
  public void closeGame() {
    System.out.println("Closed Ego-Shooter-Game");
  }

  @Override
  public void pauseGame() {
    System.out.println("Paused Ego-Shooter-Game");
  }
}
