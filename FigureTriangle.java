package InterLinkTask;

public class FigureTriangle extends Figure {
    // a,b-- катети ,c- гіпотенуза
    private int a;
    private int b;
    private int c;

    public FigureTriangle()
    {
        this.a=3;
        this.b=4;
        this.c=5;
    }
    public FigureTriangle(int a, int b, int c)
    // перевірка існування трикутника
    {
        if  ( (a>0)&&(b>0)&&(c>0))
        {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            else throw new IllegalArgumentException("Такой треугольник нельзя построить, введите другие данные");
        }
        else throw new IllegalArgumentException("Стороны треуголинка не могут быть меньше нуля");
    }

    /** метод знаходження периметра реалізований в класі і унаслідуваний від
     * абстрактного класу Figure*/
     public   int perimeter(){
         return a+b+c ;
     }


}
