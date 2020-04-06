package de.patternExample.mvc;

import de.patternExample.PatternTypeEnum;

public class Ausgabe {

  public void showPatternTypes() {
    for (int i = 0; i < PatternTypeEnum.values().length; ++i) {
      System.out.println(i + "]\t" + PatternTypeEnum.values()[i].toString());
    }
  }

}
