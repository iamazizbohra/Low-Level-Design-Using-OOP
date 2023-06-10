package parkingLot;

public class ParkingRate {
    private double[] hourlyRate;

    public ParkingRate() {
        this.hourlyRate = new double[]{4.0, 3.5, 3.5, 2.5};
    }

    private double[] getHourlyRate() {
        return hourlyRate;
    }

    public double calculateAmount(ParkingTicket parkingTicket) {
        return 0.0;
    }
}
