package entities;

import enums.Color;

// essa e uma class e abstract pq ela tem o metodo area que e um metodo abstract
public abstract class Shape {

  private Color color;

  public Shape(Color color) {
    this.color = color;
  }

  public Shape() {}

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public abstract double area();
}
