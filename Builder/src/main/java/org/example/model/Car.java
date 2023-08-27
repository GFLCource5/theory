package org.example.model;

public class Car {

  private Integer places;
  private Boolean rightHandDrive;

  public int getPlaces() {
    return places;
  }

  public void setPlaces(Integer places) {
    this.places = places;
  }

  public boolean isRightHandDrive() {
    return rightHandDrive;
  }

  public void setIsRightHandDrive(Boolean rightHandDrive) {
    this.rightHandDrive = rightHandDrive;
  }

  @Override
  public String toString() {
    return "Car{" +
        "places=" + places +
        ", rightHandDrive=" + rightHandDrive +
        '}';
  }

}
