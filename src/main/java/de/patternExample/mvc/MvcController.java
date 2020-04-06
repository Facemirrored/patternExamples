package de.patternExample.mvc;


import de.patternExample.prototypePattern.PrototypePatternTest;
import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    do {
      try {
        System.out.println("Select Pattern:\n");
        ausgabe.showPatternTypes();
        System.out.println("EXIT --> -1\n");

        switch (Integer.parseInt(scanner.next())) {
          case 0:
            System.out.println(
                "Die Gesamtanwendung ist als MVC-Pattern implementiert. Der Controller, welcher das Menü beinhaltet,\n"
                    +
                    "dient als Verarbeitungsschnittstelle für die Eingabe, Ausgabe und den Pattern-Controller.\n"
                    +
                    "(Eingabe / Ausgabe wird nicht richtig verwendet - lohnt sich nicht aber theoretischer Nutzen ist logisch nachvollziehbar)");
            break;
          case 1:
            PrototypePatternTest.getINSTANCE().doPrototyping();
            break;
          case 2:
            System.out.println(
                "Jedes Pattern, besitzt eine Pattern-Test-Klasse (Pattern-Controller), welche jeweils\n"
                    +
                    "als Singleton-Pattern implementiert wurde.");
            break;
          case -1:
            exit = true;
            break;
          default:
            throw new IllegalArgumentException(
                "\nEingabe war keine gültige Ziffer, bitte erneut versuchen.\n");
        }

        if (exit) {
          System.out.println("Programm wird beendet...");
          break;
        }

      } catch (NumberFormatException nfe) {
        System.out.println("\nEingabe war keine Ziffer, bitte erneut versuchen.\n");
      } catch (IllegalArgumentException iae) {
        System.out.println(iae.getMessage());
      }
    } while (!exit);
  }
}
