package time;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSecondsAmount){
        this.hours=(int)(totalSecondsAmount/3600.0);
        this.minutes=(int)((totalSecondsAmount-hours*3600)/60.0);
        this.seconds=(int)(totalSecondsAmount-hours*3600-minutes*60);
    }

    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


}
