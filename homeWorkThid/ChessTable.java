package yarchuk;

import java.util.Arrays;

public class ChessTable {

    public void chessTable() {
        String[][] cells = new String[8][8];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                    cells[i][j] = "W";
                } else {
                    cells[i][j] = "B";
                }
            }
        }

        for (String[] cell : cells) {
            System.out.println(Arrays.toString(cell)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }
    }
}
