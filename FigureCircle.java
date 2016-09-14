package InterLinkTask;


// клас який наслідує інтерфейс овал і інтрефейс площа
public class FigureCircle implements Square {
    private int radius;//радиус

    public FigureCircle(){
        this.radius=5;
    }

    public FigureCircle(int radius){
        if (radius>0){
            this.radius=radius;
        }
        else throw new IllegalArgumentException("Такой круг нельзя построить");
    }

    // реалізація методу площа для кола  унаслідований від інтерфейсу площа
    public double getSquare() {
        return radius*radius*Math.PI;
    }
}
