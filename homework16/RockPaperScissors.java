package yarchuk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScissors {

    //1 - user win
    //-1 - user lose
    //0 - draft
    private final int[][] winOptions = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}};

    private String getChose(int key) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rock");
        map.put(2, "Paper");
        map.put(3, "Scissors");

        return map.get(key);
    }

    public void letsPlay(int numberOfGames) throws IOException {
        File resultFile = new File("src\\yarchuk\\results.txt");

        int userChose;
        int machineChose;
        int userScore = 0;
        int machineScore = 0;

        System.out.println("\nLet's see who'll win! Ha-ha-ha-ha, such a simple mind.");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile, true)); Scanner scanner = new Scanner(System.in)) {
            bufferedWriter.append("\n\t\tNew game!\n");

            for (int i = 0; i < numberOfGames; i++) {
                System.out.println("Game #" + (i + 1));
                bufferedWriter.append("Round #").append(Integer.toString(i + 1)).append("\n\n");

                System.out.println("Choose:\n1. Rock\n2. Paper\n3. Scissors \n0. To abandon the game\n");

                userChose = scanner.nextInt();

                if (userChose > 3 || userChose < 0) {
                    throw new IllegalArgumentException("Choose only given options, human!");
                }

                if (userChose == 0) {
                    machineScore++;
                    System.out.println("Game over, human! Current game is my victory!");
                    System.out.println("Score is " + userScore + ":" + machineScore);

                    bufferedWriter.append("Game was abandon. Score is ").append(Integer.toString(userScore)).append(":")
                            .append(Integer.toString(machineScore)).append("\n");

                    break;
                }

                System.out.println("Okay, you chose " + getChose(userChose));
                bufferedWriter.append("User chose ").append(getChose(userChose)).append("\n");

                machineChose = (int) (Math.random() * 3 + 1);
                System.out.println("Machine chose " + getChose(machineChose) + "\n");
                bufferedWriter.append("Machine chose ").append(getChose(machineChose)).append("\n");

                int gameResult = winOptions[userChose - 1][machineChose - 1];

                if (gameResult == 1) {
                    System.out.println("You win!\n");
                    bufferedWriter.append("This round User won!").append("\n");
                    userScore++;
                } else if (gameResult == -1) {
                    System.out.println("You lost!\n");
                    bufferedWriter.append("This round User lost!").append("\n");
                    machineScore++;
                }

                System.out.println("-       Score       -");
                System.out.println("User " + userScore + ":" + machineScore + " Machine\n");

                bufferedWriter.append("Score is User ").append(Integer.toString(userScore)).append(":").append(Integer
                        .toString(machineScore)).append(" Machine").append("\n");

            }
            bufferedWriter.append("Final score is ").append(Integer.toString(userScore)).append(":")
                    .append(Integer.toString(machineScore)).append("\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
