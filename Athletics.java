package Task;


public class Athletics extends Sportsmen{
    private int distance;
    private double timeInSeconds;

    public Athletics() {
        setLastName("Usain");
        setFirstName("Bolt");
        setDistance(100);
        setTimeInSeconds(9.58);

    }

    public Athletics(String firstname, String lastname,int distance, double timeInSeconds) {
        setLastName(firstname);
        setFirstName(lastname);
        setDistance(distance);
        setTimeInSeconds(timeInSeconds);
    }

    protected double Result() {
        if (timeInSeconds == 0)
            return 0;
        else
            return distance/timeInSeconds;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if (distance>=0)
            this.distance = distance;
        else
            throw new IllegalArgumentException("distance can't equals negative number");
    }

    public double getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(double timeInSeconds) {
        if (timeInSeconds>=0)
            this.timeInSeconds = timeInSeconds;
        else
            throw new IllegalArgumentException("time can't be negative ");
    }
    
    @Override
    public String toString() {
        return "Athlete "+getLastName()+" "+getFirstName()+" average speed  : "+Result()+"m/s at "+getDistance()+" m distance";
    }

}
