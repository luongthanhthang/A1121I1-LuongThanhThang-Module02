package com.codegym;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String result = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            result = getScore1EqualScore2(scorePlayer1);
        } else {
            boolean score1 = scorePlayer1 >= 4;
            boolean score2 = scorePlayer2 >= 4;
            if (score1 || score2) {
                result = getScoreGreaterThanFour(scorePlayer1, scorePlayer2);
            } else {
                result = getScoreRemainingCase(scorePlayer1, scorePlayer2, result);
            }
        }
        return result;
    }

    private static String getScoreRemainingCase(int scorePlayer1, int scorePlayer2, String result) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                result += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    result += LOVE;
                    break;
                case 1:
                    result += FIFTEEN;
                    break;
                case 2:
                    result += THIRTY;
                    break;
                case 3:
                    result += FORTY;
                    break;
            }
        }
        return result;
    }

    private static String getScoreGreaterThanFour(int scorePlayer1, int scorePlayer2) {
        String result;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) {
            result = "Advantage player1";
        } else if (minusResult == -1) {
            result = "Advantage player2";
        } else if (minusResult >= 2) {
            result = "Win for player1";
        } else {
            result = "Win for player2";
        }
        return result;
    }

    private static String getScore1EqualScore2(int scorePlayer1) {
        String result;
        switch (scorePlayer1) {
            case 0:
                result = LOVE_ALL;
                break;
            case 1:
                result = FIFTEEN_ALL;
                break;
            case 2:
                result = THIRTY_ALL;
                break;
            case 3:
                result = FORTY_ALL;
                break;
            default:
                result = DEUCE;
                break;
        }
        return result;
    }
}