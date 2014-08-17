package org.redbasin.bitalgebra;

public class BitFloat {
   public static void main(String[] args) throws NumberFormatException {
       if (args.length == 0) {
          System.out.println("Usage: java BitFloat <float>");
          System.exit(1);
       }
       System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(new Float(args[0]))));
   }
}
