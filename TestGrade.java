public class TestGrade {

    private int score;
    public TestGrade(int s)
    {
        score =s;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int s)
    {
        this.score=s;
    }

    public char getLetterGrade()
    {
        char grade;
        if(score < 60)
        {
            grade ='F';
        }
        else{
            if(score < 70)
            {
                grade='D';
            }
            else{
                if(score < 80)
                {
                    grade ='C';
                }
                else{
                    if(score < 90)
                    {
                        grade='B';
                    }
                    else{
                        grade ='A';
                    }
                }
            }
        }
        return grade;
    }
}
