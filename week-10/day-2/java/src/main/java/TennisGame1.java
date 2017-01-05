
public class TennisGame1 implements TennisGame {
    
    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equalsIgnoreCase(player1Name)) {
            player1Score++;
        }
        else {
            player2Score++;
        }
    }

    public String getScore() {
        if (isDeuce()) {
            return "Deuce";
        }
        if (isAnyScoreGreaterThanThree()) {
            return getScoreIfGreaterThanThree();
        } else {
            return getScoreIfLessThanThree();
        }
    }

    private boolean isDeuce() {
        return player1Score == player2Score && player1Score >= 3;
    }

    private String getScoreIfLessThanThree() {
        String temp = getPlayerScore(player1Score) + "-";
        if(player1Score == player2Score) {
            temp += "All";
        } else {
            temp += getPlayerScore(player2Score);
        }
        return temp;
    }

    private String getPlayerScore(int playerScore) {
        switch(playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return null;
    }

    private boolean isAnyScoreGreaterThanThree() {
        return player1Score > 3 || player2Score > 3;
    }

    private String getScoreIfGreaterThanThree() {
        int minusResult = player1Score - player2Score;

        if(Math.abs(minusResult) >= 2) {
            return "Win for " + getLeader();
        } else {
            return "Advantage " + getLeader();
        }
    }

    private String getLeader() {
        if(player1Score > player2Score) {
            return player1Name;
        } else {
            return player2Name;
        }
    }
}
