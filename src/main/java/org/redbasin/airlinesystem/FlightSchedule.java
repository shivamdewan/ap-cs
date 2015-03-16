
public class FlightSchedule {

   private Airport sourceAirport;
   private Airport destAirport;
   private String flightTime;
   private Flight flight;

   /**
    * This is constructor for flight schedule.
    */
   public FlightSchedule(Flight flight, Airport sourceAirport, Airport destAirport, String flightTime) {
     this.flight = flight;
     this.sourceAirport = sourceAirport;
     this.destAirport = destAirport;
     this.flightTime = flightTime;
   }

}
