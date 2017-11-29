package com.lccj.tdd.dto;

/**
 * Data Transfer Objects.
 */

public class PlantDTO {

  private int guId;
  private String genus;
  private String species;
  private String cultivar;
  private String commonName;

  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getCultivar() {
    return cultivar;
  }

  public void setCultivar(String cultivar) {
    this.cultivar = cultivar;
  }

  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  @Override
  public String toString() {
    return genus + " " + species + " " + cultivar + " " + commonName;
  }
}
