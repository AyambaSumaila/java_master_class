import java.util.Random;

public class Player {

    private String name, guess;
    private int points;

    public Player(String playerName)
    {
        name=playerName;
        guess="";
        points=0;
    }
    

    public void makeGuess(){
        Random random = new Random();
        int guessNumber=random.nextInt(2);

        if(guessNumber==0){
            guess="Cho (even)";
    }
    else
    guess="Ha (odd)";
    }

    public void addPoints(int newPoints)
    {
        points +=newPoints;
    }

    public String getName(){
        return name;
    }

    public String getGuess()
    {
        return guess;
    }
    public int getPoints(){
        return points;
    }
}
