package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 100, 4, 100);
        int position = calculateHighScorePosition(highScore);
        displayHighScorePosition("kishore", position);

        highScore = calculateScore(true, -100, 0, 100);
        position = calculateHighScorePosition(highScore);
        displayHighScorePosition("Madhuri", position);

        highScore = calculateScore(true, -600, 0, 100);
        position = calculateHighScorePosition(highScore);
        displayHighScorePosition("Sunny", position);

        highScore = calculateScore(true, -950, 0, 100);
        position = calculateHighScorePosition(highScore);
        displayHighScorePosition("Aandal Amma", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int highScore) {
        int position = 4;

        if (highScore >= 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
}
