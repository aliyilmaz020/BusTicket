import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BusTrip> busLists = new ArrayList<BusTrip>();
        ArrayList<Reservation> resLists = new ArrayList<Reservation>();
        Reservation reservation = new Reservation();
        BusTrip busTrip = new BusTrip();
        boolean isLoop = true;
        int select;
        while (isLoop) {
            System.out.println("1. Yeni Sefer");
            System.out.println("2. Rezervasyon Oluştur");
            System.out.println("3. Otobüs Durumu");
            System.out.println("4. Seferleri Görüntüle");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapınız: ");
            select = scanner.nextInt();
            if (select == 1) {
                System.out.print("Otobüs Numarası: ");
                int busNumber = scanner.nextInt();
                System.out.print("Sürücü Adı: ");
                String driverName = scanner.next();
                System.out.print("Kalkış Zamanı: ");
                String departureTime = scanner.next();
                System.out.print("Varış Zamanı: ");
                String arrivalTime = scanner.next();
                System.out.print("Nereden: ");
                String departurePoint = scanner.next();
                System.out.print("Nereye:  ");
                String destinationPoint = scanner.next();
                System.out.print("Koltuk Sayısı: ");
                int numberOfSeats = scanner.nextInt();
                busLists.add(new BusTrip(busNumber, driverName, departureTime, arrivalTime, departurePoint,
                        destinationPoint, numberOfSeats));

            } else if (select == 2) {
                System.out.print("Otobüs Numarası: ");
                int busNumber = scanner.nextInt();
                for (BusTrip trip : busLists) {
                    if (busNumber == trip.getBusNumber()) {
                        System.out.print("Koltuk Numarası:");
                        int seatNumber = scanner.nextInt();
                        boolean seatReserved = false;
                        if (seatNumber <= trip.getNumberOfSeats()) {
                            for (Reservation reservation2 : resLists) {
                                if (seatNumber == reservation2.getSeatNumber()) {
                                    System.out.println("Bu koltuk önceden rezerve edildi.");
                                    seatReserved = true;
                                    break;
                                }
                            }
                            if (!seatReserved) {
                                System.out.print("Yolcunun adı: ");
                                String passengerName = scanner.next();
                                resLists.add(new Reservation(busNumber, seatNumber, passengerName));
                            }
                        } else {
                            System.out.println("Koltuk kapasitesinin dışında bir numara girdiniz.");
                        }

                    }
                }
            } else if (select == 3) {
                for (BusTrip trip : busLists) {
                    System.out.println("***********************************************************");
                    System.out.println("Otobüs Numarası: " + trip.getBusNumber());
                    System.out.printf("Sürücü : %s\tKalkış Zamanı : %s\tVarış Zamanı : %s", trip.getDriverName(),
                            trip.getDepartureTime(), trip.getArrivalTime());
                    System.out.println();
                    System.out.printf("Nereden: %s\tNereye: %s\tKoltuk Sayısı: %d", trip.getDeparturePoint(),
                            trip.getDestinationPoint(), trip.getNumberOfSeats());
                    System.out.println();
                    System.out.println("***********************************************************");

                    int availableSeats = trip.getNumberOfSeats();
                    for (Reservation reservation2 : resLists) {
                        if (reservation2.getBusNumber() == trip.getBusNumber()) {
                            System.out.println(reservation2.getSeatNumber() + ". " + reservation2.getPassengerName()
                                    + " adına rezerveli.");
                            availableSeats--;
                        }
                    }
                    System.out.println("Otobüste " + availableSeats + " adet müsait koltuk vardır.");
                }
            } else if (select == 4) {
                System.out.println("***********************************************************");
                for (BusTrip trip : busLists) {
                    System.out.println("Otobüs Numarası: " + trip.getBusNumber());
                    System.out.printf("Sürücü : %s\tKalkış Zamanı : %s\tVarış Zamanı : %s", trip.getDriverName(),
                            trip.getDepartureTime(), trip.getArrivalTime());
                    System.out.println();
                    System.out.printf("Nereden: %s\tNereye: %s\tKoltuk Sayısı: %d", trip.getDeparturePoint(),
                            trip.getDestinationPoint(), trip.getNumberOfSeats());
                    System.out.println();
                    System.out.println("***********************************************************");

                    int availableSeats = trip.getNumberOfSeats();
                    for (Reservation reservation2 : resLists) {
                        if (reservation2.getBusNumber() == trip.getBusNumber()) {
                            System.out.println(reservation2.getSeatNumber() + ". " + reservation2.getPassengerName()
                                    + " adına rezerveli.");
                            availableSeats--;
                        }
                    }
                    System.out.println("Otobüste " + availableSeats + " adet müsait koltuk vardır.");
                }
                System.out.println("***********************************************************");
            } else if (select == 5) {
                break;
            } else {
                System.out.println("Hatalı seçim yaptınız.");
            }

        }

    }
}
