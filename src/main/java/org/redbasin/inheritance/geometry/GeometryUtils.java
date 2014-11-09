package org.redbasin.inheritance.geometry;

public class GeometryUtils {
   public static double distance(Coordinate d1, Coordinate d2) {
      return Math.sqrt(Math.pow(d1.x-d2.x, 2) + Math.pow(d1.y-d2.y, 2));
   }
   private GeometryUtils() {}
}
