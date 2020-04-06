package de.patternExample.mvc;


/**
 * <p>Controller fungierend als MVC-Pattern</p>
 * <lu>
 * <li>Dient als Schnittstelle zwischen Eingabe- / Ausgabe-Klassen</li>
 * <li>Verwaltet Deligierung an weiteren Controller-Klassen, die wiederum eigene Patterns sein
 * können</li>
 * </lu>
 */
public class MvcController {

  /**
   * Haupteinstiegspunkt des Programms
   *
   * @param args Aufrufparameter
   */
  public static void main(String[] args) {

    Eingabe eingabe = new Eingabe();
    Ausgabe ausgabe = new Ausgabe();

    System.out.println("Available patterns:");
    ausgabe.showPatternTypes();
  }
}
