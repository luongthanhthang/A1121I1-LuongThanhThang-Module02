package com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String result = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    result = "Love-All";
                    break;
                case 1:
                    result = "Fifteen-All";
                    break;
                case 2:
                    result = "Thirty-All";
                    break;
                case 3:
                    result = "Forty-All";
                    break;
                default:
                    result = "Deuce";
                    break;

            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) result = "Advantage player1";
            else if (minusResult == -1) result = "Advantage player2";
            else if (minusResult >= 2) result = "Win for player1";
            else result = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    result += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        result += "Love";
                        break;
                    case 1:
                        result += "Fifteen";
                        break;
                    case 2:
                        result += "Thirty";
                        break;
                    case 3:
                        result += "Forty";
                        break;
                }
            }
        }
        return result;
    }
}