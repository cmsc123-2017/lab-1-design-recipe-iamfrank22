//double, int, int -> double (Signature)
/* Commputes for the change of the given fare, depending on the number of regular passengers,
 * discounted passengers, and the distance. (Purpose)
 */
/* double fareChange(double payment) {
 *   return 0;
 * }
 * (Stub)
 */
/* double fareChange(double payment) { // template
 *   ...payment...
 *   ...distance...
 *   ...totalPassengers...
 *   ...discountPassengers...
 *   ...BASE_KM....
 *   ...FARE_DISCOUNT....
 *   ...FARE_BASE...
 *   ...EXCESS_FARE...
 * }
 */




class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  static final double BASE_KM = 5.0;
  static final double FARE_BASE = 7.0;
  static final double FARE_DISCOUNT = 6.0;
  static final double EXCESS_FARE = 0.5;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  double excessDistance() {
    if(distance > BASE_KM) {
      return distance - BASE_KM;
    }
    else {
      return 0;
    }
  }
  
  double computeFare() {
    return (excessDistance() * EXCESS_FARE) + 
      ((totalPassengers - discountPassengers) * FARE_BASE) +
      (discountPassengers * FARE_DISCOUNT);
  }
  
  double totalFare() {
    return computeFare();
  }
  
  double fareChange(double payment) {
    return payment - this.totalFare();
    
  }
  
  
}