package com.somelier.web;


/**
 * Utility Class utilitzada per tenir centralitzat les "dades" de la "base de dades" de la webApp.
 */
public final class VinsUtils {

  public static final String BLANC = "blanc";
  public static final String NEGRE = "negre";
  public static final String ROSAT = "rosat";
  static final String[] VINS_BLANCS = {
      "Château de Climens",
      "Pazo de Señoráns",
      "Albamar"
  };
  static final String[] VINS_BLANCS_PATH_IMG = {
      "img/vinos/vinoBlanco/semillon.webp",
      "img/vinos/vinoBlanco/PazoSenora.webp",
      "img/vinos/vinoBlanco/albamar.png"
  };
  static final String[] VINS_NEGRES = {
      "Casa Ermita",
      "Finca Antigua",
      "Pesquera Reserva"
  };
  static final String[] VINS_NEGRES_PATH_IMG = {
      "img/vinos/vinoNegro/casasErmita.webp",
      "img/vinos/vinoNegro/fincaAntigua.webp",
      "img/vinos/vinoNegro/pesqueraReserva.webp",
  };
  static final String[] VINS_ROSATS = {
      "Pícaro del Águila Clarete",
      "Le Rosé de Antídoto",
      "Viña Tondonia Rosado Gran Reserva"
  };
  static final String[] VINS_ROSATS_PATH_IMG = {
      "img/vinos/vinoRosados/picaroAguila.png",
      "img/vinos/vinoRosados/roseAntidoto.png",
      "img/vinos/vinoRosados/vinaTodonia.png"
  };

  private VinsUtils() {
    throw new IllegalStateException("Utility class");
  }
}
