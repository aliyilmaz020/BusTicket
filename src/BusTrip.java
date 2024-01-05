import java.util.ArrayList;

public class BusTrip {
  private int busNumber;
  private String driverName;
  private String departureTime;
  private String arrivalTime;
  private String departurePoint;
  private String destinationPoint;
  private int numberOfSeats;

  public BusTrip() {

  }

  public BusTrip(int busNumber, String driverName, String departureTime, String arrivalTime, String departurePoint,
      String destinationPoint, int numberOfSeats) {
    this.busNumber = busNumber;
    this.driverName = driverName;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.departurePoint = departurePoint;
    this.destinationPoint = destinationPoint;
    this.numberOfSeats = numberOfSeats;

  }

  public void listele(ArrayList<BusTrip> busLists) {
    for (BusTrip busTrip : busLists) {
      System.out.println(busTrip.getDestinationPoint());
    }
  }

  public int getBusNumber() {
    return busNumber;
  }

  public void setBusNumber(int busNumber) {
    this.busNumber = busNumber;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public String getDeparturePoint() {
    return departurePoint;
  }

  public void setDeparturePoint(String departurePoint) {
    this.departurePoint = departurePoint;
  }

  public String getDestinationPoint() {
    return destinationPoint;
  }

  public void setDestinationPoint(String destinationPoint) {
    this.destinationPoint = destinationPoint;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

}
