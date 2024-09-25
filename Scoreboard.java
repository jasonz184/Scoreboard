public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    teamOne = one;
    teamTwo = two;
    activeTeam = teamOne;

    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

}
