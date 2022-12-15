package com.somelier.model;

public class Vins {

  private String imgPath;
  private String nom;
  private String tipus;

  /**
   * @param nom     del vi
   * @param tipus   de vi
   * @param imgPath Path de la image dins del projecte per ser utilitzada en l'html. Exemple:
   *                "img/vinos/vinoBlanco/albamar.png
   */
  public Vins(String nom, String tipus, String imgPath) {
    this.nom = nom;
    this.tipus = tipus;
    this.imgPath = imgPath;
  }

  //<editor-fold desc="Getters/Setters">
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getTipus() {
    return tipus;
  }

  public void setTipus(String tipus) {
    this.tipus = tipus;
  }

  public String getImgPath() {
    return imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }
  //</editor-fold>

}
