public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public void recordPlay(int score)
    {
        if (score == 0)
        {
            if (activeTeam.equals(teamOne))
            {
                activeTeam = teamTwo;
            }
            else
            {
                activeTeam = teamOne;
            }
        } 
        else 
        {
            if (activeTeam.equals(teamOne))
            {
                teamOneScore += score;
            }
            else
            {
                teamTwoScore += score;
            }
        }
    }
}
