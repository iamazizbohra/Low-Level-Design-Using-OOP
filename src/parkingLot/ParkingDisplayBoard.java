package parkingLot;

public class ParkingDisplayBoard {
    public void update(
            int bikeParkingSpotCount,
            int electricParkingSpotCount,
            int compactParkingSpotCount,
            int largeParkingSpotCount,
            int handicappedParkingSpotCount
    ) {
        System.out.println(
                "Available Bike spot:" + bikeParkingSpotCount +
                        "Available Electric spot:" + electricParkingSpotCount +
                        "Available Compact spot:" + compactParkingSpotCount +
                        "Available Large spot:" + largeParkingSpotCount +
                        "Available Handicapped spot:" + handicappedParkingSpotCount
        );
    }
}
