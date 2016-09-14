package InterLinkTask;


public class FigureRectangle extends Figure implements Square {
    // a,b --сторони квадрата
    private  int a;
    private  int b;

    public FigureRectangle ()
    {
        this.a=1;
        this.b=2;
    }

    public FigureRectangle(int a, int b ) {
        if ((a > 0) && (b > 0))
        {
            this.a = a;
            this.b = b;
        }
    }

    // реалізація методу площа для прямокутника унаслідований від інтерфейсу площа
    public double getSquare(){
        return a*b ;

    }

    // реалізація методу знаходження периметру унаслідований від калсу фігура
    public int perimeter(){
        return 2*(a+b);
    }

}
