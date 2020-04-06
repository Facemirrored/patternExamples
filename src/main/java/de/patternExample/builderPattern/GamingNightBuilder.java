package de.patternExample.builderPattern;

public class GamingNightBuilder {

  private GamingNightBuilder() {

  }

  private static final GamingNightBuilder INSTANCE = new GamingNightBuilder();

  public static GamingNightBuilder getInstance() {
    return INSTANCE;
  }

  public void buildMeAndMyBoyzGamingNight() {
    System.out.println("Build Me-And-My-Boyz Gaming-Night:");

    GamingNight meAndMyBoyzGamingNight = new GamingNight();
    meAndMyBoyzGamingNight.addGame(new EgoShooter("Halo", 3));
    meAndMyBoyzGamingNight.addGame(new PartyGame("Mario Kart", 1));
    meAndMyBoyzGamingNight.addGame(new EgoShooter("CoD MW", 4));

    meAndMyBoyzGamingNight.showGames();
    meAndMyBoyzGamingNight.getGameList().get(0).startGame();

    System.out.println("\n");
  }

  public void buildGirlzzzGamingNight() {
    System.out.println("Build Girlzzz Gaming-Night:");

    GamingNight girlzzzGamingNight = new GamingNight();
    girlzzzGamingNight.addGame(new PartyGame("Hello Kitty World", 8));

    girlzzzGamingNight.showGames();
    girlzzzGamingNight.getGameList().get(0).startGame();

    System.out.println("\n");
  }
}
