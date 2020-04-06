package de.patternExample.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class GamingNight {

  private List<Game> gameList;

  public GamingNight() {
    gameList = new ArrayList<>();
  }

  public void addGame(final Game game) {
    gameList.add(game);
  }

  public List<Game> getGameList() {
    return gameList;
  }

  public void removeGame(final Game game) {
    for (int i = 0; i < gameList.size(); ++i) {
      if (gameList.get(i).toString().equals(game.toString())) {
        gameList.remove(i);
        break;
      }
    }
  }

  public void showGames() {
    for (Game g : gameList) {
      System.out.println("Game:\t" + g.getName());
      System.out.println("Durchschn. Spieldauer:\t" + g.getDurchschnittGamingtime() + "\n");
    }
  }
}
