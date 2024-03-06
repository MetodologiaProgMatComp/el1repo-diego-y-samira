public class Time {
    private int hour;
    private int minute;
    private int  second;
    public  Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        String hours;
        String minutes;
        String seconds;
        if (hour < 10) {
            hours = "0" + String.valueOf(hour);
        } else {
            hours = String.valueOf(hour);
        }
        if (minute < 10) {
            minutes = "0" + String.valueOf(minute);
        } else {
            minutes = String.valueOf(minute);
        }
        if (second < 10) {
            seconds = "0" + String.valueOf(second);
        } else {
            seconds = String.valueOf(second);
        }

        return hours+"//"+ minutes+"//"+ seconds;
    }
    public Time nextSecond(){
        second ++;
        if (second>=59);
            second=0;
            minute++;
            if (minute>=59){
                minute=0;
                hour++;
                if (hour >=24){
                    hour=0;
                }
            }
        return this;
    }
    public Time previousSecond() {
        second--;
        if (second <0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour <0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
