package Task;


public class Main {

    public static void main(String[]  args )
    {
        Sportsmen [] Team = new Sportsmen[]{new Football("Vasil","Leleka",10,25),new Football(),
        new Basketball("Ruslan","Babko",100,2500),new Basketball(),new Athletics("Yuriy","Boyko",100,14.3),
        new Athletics(),new Weightlifting("Maksim","Drozdov",160,100),new Weightlifting()};

        for (int i=0;i<Team.length;i++){
            System.out.println(Team[i]);
        }
    }
    }


