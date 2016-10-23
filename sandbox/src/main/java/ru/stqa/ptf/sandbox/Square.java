package ru.stqa.ptf.sandbox;

/**
 * Created by Стас on 23.10.2016.
 */
public class Square {

  public double l;

  public Square(double l){
    this.l = l;
  }

  public double area () {
    return this.l * this.l;
  }

}
