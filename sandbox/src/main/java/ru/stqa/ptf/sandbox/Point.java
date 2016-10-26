package ru.stqa.ptf.sandbox;

/**
 * Created by Стас on 26.10.2016.
 */
public class Point {

  double x;
  double y;

  Point(double i  , double l){

    this.x = i;
    this.y = l;

  }

  public static double distance(Point a, Point b) {
    double distance = Math.sqrt(Math.pow((a.x - b.x),2) + Math.pow((a.y - b.y),2));
    return distance;
  }

}
