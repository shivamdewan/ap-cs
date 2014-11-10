package org.redbasin.classwork7;

public final class Rectangle1 {
   public Coordinate nw, ne, sw, se;
   boolean isValid;

   public Rectangle1(Coordinate nw, Coordinate ne, Coordinate sw, Coordinate se) {
      this.nw = nw;
      this.ne = ne;
      this.sw = sw;
      this.se = se;
      isValid = this.validate();
   }

   public boolean validate() {
       System.out.println("dnwsw = " + distance(nw, sw));
       System.out.println("dnese = " + distance(ne, se));
       System.out.println("dnwne = " + distance(nw, ne));
       System.out.println("dswse = " + distance(sw, se));
       if (distance(nw, sw) == distance(ne, se) &&
           distance(nw, ne) == distance(sw, se)) {
           /*double nwsw = slope(nw, sw);
           System.out.println("nwsw = " + nwsw);
           double nese = slope(ne, se);
           System.out.println("nese = " + nese);
           double nwne = slope(nw, ne);
           System.out.println("nwne = " + nwne);
           double swse = slope(sw, se);
           System.out.println("swse = " + swse);
           if (nwsw == nese && nwne == swse) {
               System.out.println("nwsw = " + nwsw + ", -1/nwne = " + -1/nwne);
               System.out.println("nese = " + nese + ", -1/swse = " + -1/swse);
               if (nwsw == -1/nwne && nese == -1/swse)
              */    return true;
           //}
       }
       return false;
   }

   public double distance(Coordinate d1, Coordinate d2) {
      return Math.sqrt(Math.pow(d1.x-d2.x, 2) + Math.pow(d1.y-d2.y, 2));
   }

   public double perimeter() {
       if (!isValid)
         throw new RuntimeException("Invalid rectangle");
       return distance(nw, ne)*2 + distance(sw, se)*2;
   }

   public double area() {
       if (!isValid)
         throw new RuntimeException("Invalid rectangle");
       return distance(nw, ne) * distance(sw, se);
   }

   public double slope(Coordinate c1, Coordinate c2) {
       return c2.y-c1.y/c2.x-c1.x;
   }
}