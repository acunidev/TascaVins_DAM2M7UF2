package com.somelier.model;

import java.util.ArrayList;
import java.util.List;

public class ViExpert {

  private final List<Vins> vinsList = new ArrayList<>();

  /**
   * Afegeix un vi a la llista de vins.
   *
   * @param vi a afegir a llista de vins
   */
  public void addVins(Vins vi) {
    vinsList.add(vi);
  }

  /**
   * @param tipusVi El tipus de vi pel cual filtrarem la llista total de vins.
   * @return Una llista de vins filtrats
   */
  public List<Vins> getVinsByType(String tipusVi) {
    List<Vins> auxVinsList = new ArrayList<>();
    for (Vins vi : vinsList) {
      if (vi.getTipus().equals(tipusVi)) {
        auxVinsList.add(vi);
      }
    }
    return auxVinsList;
  }
}
