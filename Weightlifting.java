package Task;


public class Weightlifting extends Sportsmen {
    private int weightOfSnatch;
    private int weightOfCleanAndJerk;

    public Weightlifting() {
        setLastName("Vasil");
        setFirstName("Virastiul");
        setWeightOfCleanAndJerk(320);
        setWeightOfSnatch(380);
    }

    public Weightlifting(String firstname, String lastname,int weightOfSnatch, int weightOfCleanAndJerk) {
        setLastName(lastname);
        setFirstName(firstname);
        setWeightOfCleanAndJerk(weightOfCleanAndJerk);
        setWeightOfSnatch(weightOfSnatch);
    }

    protected double Result() {
        return weightOfCleanAndJerk + weightOfSnatch;
    }

    public int getWeightOfSnatch() {
        return weightOfSnatch;
    }

    public void setWeightOfSnatch(int weightOfSnatch) {
        if ( weightOfSnatch >= 0 )
            this.weightOfSnatch = weightOfSnatch;
        else
            throw new IllegalArgumentException("weight of snatch can't be negative");
    }

    public int getWeightOfCleanAndJerk() {
        return weightOfCleanAndJerk;
    }

    public void setWeightOfCleanAndJerk(int weightOfCleanAndJerk) {
        if ( weightOfCleanAndJerk >= 0 )
            this.weightOfCleanAndJerk = weightOfCleanAndJerk;
        else
            throw new IllegalArgumentException("Weight in this discipline can't be negative");
    }

    @Override
    public String toString() {
        return "PowerLifter " + getLastName() + " " + getFirstName() + " finished with result : " + Result() + "kg in 2 competitions";
    }
}
