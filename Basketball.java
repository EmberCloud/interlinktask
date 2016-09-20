package Task;


public class Basketball extends Sportsmen{
    private int gamesPlayed;
    private int overallPointsEarned;

    public Basketball() {
        setLastName("Allen");
        setFirstName("Iverson");
        setGamesPlayed(914);
        setOverallPointsEarned(24368);

    }

    public Basketball(String firstname, String lastname,int gamesPlayed, int overallPointsEarned) {
        setLastName(firstname);
        setFirstName(lastname);
        setGamesPlayed(gamesPlayed);
        setOverallPointsEarned(overallPointsEarned);
    }

    protected double Result(){
        if ((overallPointsEarned == 0)&&(gamesPlayed == 0))
            return 0;
        else
            return overallPointsEarned/gamesPlayed;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        if (gamesPlayed>=0)
            this.gamesPlayed = gamesPlayed;
        else
            throw new IllegalArgumentException("amount of played games can't be negative");
    }

    public int getOverallPointsEarned() {
        return overallPointsEarned;
    }

    public void setOverallPointsEarned(int overallPointsEarned) {
        if (overallPointsEarned>=0)
            this.overallPointsEarned = overallPointsEarned;
        else
            throw new IllegalArgumentException("overall earned points can't be negative");
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }
    @Override
    public String toString() {
        return "Basketball player "+getLastName()+" "+getFirstName()+" average statisticks is : "+Result()+" points per game";
    }
}
