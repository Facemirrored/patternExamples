package de.patternExample.prototypePattern;

/**
 * Controller-Klasse für Prototype-Pattern implementiert als Singleton-Pattern
 */
public class PrototypePatternTest {

  private String prototypeInfo =
      "Prototype-Pattern wird verwendet, um leicht Objekte mittels Clone zu Duplizieren.\n"
          +
          "In diesem Fall wird das java.lang.Cloneable-Interface in der zu Klonenden Klasse implementiert. Alternativ kann\n"
          +
          "auch ein Interface als Attribut genutzt werden, welches implementierende Klassen besitzt. Die clone-Methode befindet\n"
          +
          "sich dann innerhalb des Interfaces.";
  private static final PrototypePatternTest INSTANCE = new PrototypePatternTest();

  public static PrototypePatternTest getINSTANCE() {
    return INSTANCE;
  }

  private PrototypePatternTest() {
  }

  /**
   * Zeige Beispiel für Prototype-Pattern
   */
  public void doPrototyping() {
    Employees myEmployees = new Employees();

    try {
      Employees prototypeEmployees = (Employees) myEmployees.clone();
      prototypeEmployees.getEmplNames().add("Florian");
      prototypeEmployees.getEmplNames().remove(0);

      System.out.println("Two different objects with clone-method:\nmyEmployees:\t" + myEmployees
          + "\nprototypeEmployees:\t" + prototypeEmployees);

    } catch (CloneNotSupportedException e) {
      System.out.println("Cannot clone object. Object-class has to implement Cloneable-interface.");
      e.printStackTrace();
    }
  }
}