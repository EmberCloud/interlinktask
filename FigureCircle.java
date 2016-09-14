package InterLinkTask;


// клас який наслідує інтерфейс овал і інтрефейс площа
public class FigureCircle extends Oval implements Square {
    private int r;//радиус

    public FigureCircle(){
        this.r=5;
    }

    public FigureCircle(int r){
        if (r>0){
            this.r=r;
        }
    }
    // реалізація методу площа для кола  унаслідований від інтерфейсу площа
    public double getSquare() {
        return r*r*Math.PI;
    }
}
