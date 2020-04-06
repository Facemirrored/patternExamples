package de.patternExample.builderPattern;

public class PartyGame extends Game implements RoundBased {

  public PartyGame(String name, double durchschnittGamingtime) {
    super(name, durchschnittGamingtime);
  }

  @Override
  public void changeActivePalyer() {
    System.out.println("Active player has changed.");
  }

  @Override
  public void validateRound() {
    System.out.println("Round is validated.");
  }

  @Override
  public void startGame() {
    System.out.println("Started Party-Game.");
  }

  @Override
  public void closeGame() {
    System.out.println("Closed Party-Game.");
  }

  @Override
  public void pauseGame() {
    System.out.println("Paused Party-Game.");
  }
}
