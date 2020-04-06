package de.patternExample.mvc;

import de.patternExample.PatternTypeEnum;
import java.util.stream.Stream;

public class Ausgabe {

  public void showPatternTypes() {
    Stream<PatternTypeEnum> patternStream = Stream.of(PatternTypeEnum.values());
    patternStream.forEach(System.out::println);
  }

}
