package airlineManagementSystem;

import airlineManagementSystem.schedule.CustomSchedule;
import airlineManagementSystem.schedule.WeeklySchedule;
import airlineManagementSystem.user.Crew;
import airlineManagementSystem.user.Pilot;

import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;
    private Pilot pilot;
    private List<Crew> crews;

    private List<WeeklySchedule> weeklySchedules;
    private List<CustomSchedule> customSchedules;
    private List<FlightInstance> flightInstances;
}
