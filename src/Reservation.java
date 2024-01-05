public class Reservation {
  // private BusTrip busTrip;
  private int busNumber;
  private int seatNumber;
  private String passengerName;

  public Reservation() {

  }

  public Reservation(int busNumber, int seatNumber, String passengerName) {

    this.busNumber = busNumber;
    this.seatNumber = seatNumber;
    this.passengerName = passengerName;
  }

  public void listSeat() {

  }

  public int getBusNumber() {
    return busNumber;
  }

  public void setBusNumber(int busNumber) {
    this.busNumber = busNumber;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public String getPassengerName() {
    return passengerName;
  }

  public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
  }

}
