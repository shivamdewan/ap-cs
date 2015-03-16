
public class Flight {

   private String flightNo;
   private String airlineName;
   private Plane plane;

   /**
    * This is constructor for a flight.
    */
   public Flight(Plane plane, String flightNo, String airlineName) {
     this.airlineName = airlineName;
     this.flightNo = flightNo;
     this.plane = plane;
   }

}
