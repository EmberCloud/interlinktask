package InterLinkTask;

public class Main {

    public static void main (String args[] ){

        int perimeterSum=0;// змінна в якій буде рахуватись сума периметрів
        int squareSum=0;// змінна в якій буде рахуватись сума площ

        //масив з фігурами для реалізації поліморфізму і підрахунку суми перимитрів фігур
        Figure [] figureArray = new Figure[]{new FigureTriangle(5,6,8),new FigureTriangle(),new FigureTriangle(7,8,9),
                new FigureRectangle(5,6),new FigureRectangle(3,4),new FigureRectangle()};

        for (int i=0;i<figureArray.length;i++){
            if (figureArray[i] instanceof Figure){
                System.out.println(figureArray[i].perimeter());
                perimeterSum+=figureArray[i].perimeter();
            }
        }
        // масив в якому наслідується двома фігурами інтрефейс і знаходиться  сума площ фігур
        Square [] squareArray = new Square[]{new FigureRectangle(),new FigureRectangle(5,6),
                new FigureRectangle(3,4),new FigureCircle(3),new FigureCircle(5),new FigureCircle()};

        for (int i=0;i <squareArray.length;i++){
            if (squareArray[i] instanceof Square){
                System.out.println(squareArray[i].getSquare());
                squareSum+=squareArray[i].getSquare();
            }
        }

        System.out.println("Сумма периметров фигур = "+perimeterSum);
        System.out.println("Сумма площ прямоугольников = "+squareSum);

    }
}
