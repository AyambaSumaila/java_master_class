public class Dealer {
    


    private int dieValue;
    private int die2Value;

    public Dealer(int sIDES){
        dieValue = 0;
        die2Value = 0;

    }


    public void rollDice(){

        final int SIDES=6;
        Dealer die=new Dealer(SIDES);
        Dealer die2=new Dealer(SIDES);

        dieValue = die.getValue();
        die2Value = die2.getValue();


    }

    public String getChoOrHan()
    {
        String result;
        int sum=dieValue + die2Value;

    
    if(sum % 2 == 0)
    {
        result="Cho even";
    }
    else {
        result = "Han (odd)";
    }
    return result;
}



    public int getValue()
    {
      return die2Value;   
    }
}

