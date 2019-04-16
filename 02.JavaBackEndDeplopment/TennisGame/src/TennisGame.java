public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int LOVESCORE = 0;
    public static final int FIFTENSCORE = 1;
    public static final int THIRTYSCORE = 2;
    public static final int FORTYSCORE = 3;
    public static final int LOVEALLSCORE = 0;
    public static final int FIFTEENSCORE = 1;
    public static final int THIRTYALLSCORE = 2;
    public static final int FORTYALLSCORE = 3;

    public static String compareScore(int firstScore, int secondScore) {
        String score = "";
        int tempScore = 0;
        if (firstScore == secondScore) {
            score = getAllScore(firstScore);
        } else {
            if ( firstScore >= 4 || secondScore >= 4){
                getAdvantagePlayerorWinner(firstScore, secondScore);
            }else {
                countScore(firstScore,secondScore);
            }
        }
        return score;
    }
    public static void countScore(int firstScore,int secondScore) {
        for (int i = 1; i < 3; i++) {
            String score = "";
            int tempScore = 0;
            if (i == 1) {
                tempScore = firstScore;
            } else {
                score += "-";
                tempScore = secondScore;
            }
            score = getScore(score, tempScore);
        }
    }

    private static String getScore(String score, int tempScore) {
        switch (tempScore) {
            case LOVESCORE:
                score += LOVE;
                break;
            case FIFTENSCORE:
                score += FIFTEEN;
                break;
            case THIRTYSCORE:
                score += THIRTY;
                break;
            case FORTYSCORE:
                score += FORTY;
                break;
        }
        return score;
    }

    private static String getAllScore(int firstScore) {
        String score;
        switch (firstScore) {
            case LOVEALLSCORE:
                score = LOVE_ALL;
                break;
            case FIFTEENSCORE:
                score = FIFTEEN_ALL;
                break;
            case THIRTYALLSCORE:
                score = THIRTY_ALL;
                break;
            case FORTYALLSCORE:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;

        }
        return score;
    }

    public static void getAdvantagePlayerorWinner(int firstScore, int secondScore) {
        String score = " ";
            int minusResult = firstScore - secondScore;
            if (minusResult == 1) {
                score = ADVANTAGE_PLAYER_1;
            } else if (minusResult == -1) {
                score = ADVANTAGE_PLAYER_2;
            } else if (minusResult >= 2) {
                score = WIN_FOR_PLAYER_1;
            } else {
                score = WIN_FOR_PLAYER_2;
            }
    }
    }
