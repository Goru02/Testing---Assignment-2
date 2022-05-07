public class Watch {

    private String state = "normal";
    private String innerState = "Time";
    private int minute = 0, hour = 0, Day = 1, Month = 1 , Year = 2000;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInnerState() {
        return innerState;
    }

    public void setInnerState(String innerState) {
        this.innerState = innerState;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int M) {
        this.Month = M;
    }

    public int getMinute() {
        return minute;
    }

    public void getMinute(int m) {
        this.minute = m;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }
}
