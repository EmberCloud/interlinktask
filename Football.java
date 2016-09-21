package Task;


public class Football extends Sportsmen{
    private int shotsOverall;
    private int shotsInTarget;

    public Football() {
        setLastName("Henry");
        setFirstName("Thierry");
        setShotsOverall(100);
        setShotsInTarget(95);
    }

    public Football(String firstname, String lastname, int shotsInTarget, int shotsOverall) {
        setLastName(lastname);
        setFirstName(firstname);
        if (shotOveral>=shotInTarget){
            setShotsOverall(shotsOverall);
            setShotsInTarget(shotsInTarget);
        }
        else
            throw new IllegalArgumentException(" overall shot can't be bigger than shot in target ");
    }

    @Override
    protected double Result(){
        if (shotsOverall == 0)
            return 0;
        else
            return (shotsInTarget*100)/shotsOverall;
    }


    public int getShotsOverall() {
        return shotsOverall;
    }

    public void setShotsOverall(int shotsOverall) {
        if (shotsOverall>=0) {
            this.shotsOverall = shotsOverall;
        }
        else{
            throw new IllegalArgumentException(" overall shots can't negative ");
        }
    }

    public int getShotsInTarget() {
        return shotsInTarget;
    }

    public void setShotsInTarget(int shotsInTarget) {
        if (shotsInTarget>=0) {
            this.shotsInTarget = shotsInTarget;
        }
        else{
            throw new IllegalArgumentException(" shots in target can't be negative");
        }
    }

    @Override
    public String toString() {
        return "Football player "+getLastName()+" "+getFirstName()+" has result : "+Result()+"%";
    }
}
