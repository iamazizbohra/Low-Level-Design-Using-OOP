package stackOverflow;

public class Tag {
    private String name;
    private String description;
    private long dailyAskedFrequency;
    private long weeklyAskedFrequency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDailyAskedFrequency() {
        return dailyAskedFrequency;
    }

    public void setDailyAskedFrequency(long dailyAskedFrequency) {
        this.dailyAskedFrequency = dailyAskedFrequency;
    }

    public long getWeeklyAskedFrequency() {
        return weeklyAskedFrequency;
    }

    public void setWeeklyAskedFrequency(long weeklyAskedFrequency) {
        this.weeklyAskedFrequency = weeklyAskedFrequency;
    }
}
