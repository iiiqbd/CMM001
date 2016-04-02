package javaLab06.Solns06;

public class CinemaBooking {

    // instance variable declarations
  private int numSeatsFree ;
  private final int NUMSEATS;

  // constructor
  public CinemaBooking(int seats) {
    numSeatsFree = seats;
    NUMSEATS = seats;
  }

  // transformer: reduces number of available seats when nseats are booked
  public void book(int nseats) {
      numSeatsFree -= nseats;
  }

    // transformer: increases number of available seats when nseats are cancelled
  public void cancel(int nseats) {
      numSeatsFree += nseats;
  }

  // accessor: returns number of available seats
  public int enquire() {
    return numSeatsFree ;
  }
  
    // accessor: returns actual number of seats in this Cinema
  public int getNUMSEATS() {
    return NUMSEATS ;
  }
}


