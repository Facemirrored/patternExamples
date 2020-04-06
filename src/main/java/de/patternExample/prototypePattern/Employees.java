package de.patternExample.prototypePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementiert Clonable-Interface, um leicht ähnliche Objekte zu erstellen
 */
public class Employees implements Cloneable {

  private List<String> emplNames;

  public Employees() {
    emplNames = new ArrayList<>(Arrays.asList("Arian", "Barney", "Clara", "Darius", "Emma"));
  }

  public List<String> getEmplNames() {
    return emplNames;
  }

  public void setEmplNames(List<String> emplNames) {
    this.emplNames = emplNames;
  }

  @Override
  public String toString() {
    return "Employees{" +
        "emplNames=" + emplNames +
        '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Employees empClone = (Employees) super.clone();
    empClone.emplNames = new ArrayList<>(this.emplNames);
    return empClone;
  }
}
