package com.wizeek.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1275 {
    private final List<WinCondition> winConditions = new ArrayList<>(8);

    {
        winConditions.add(new WinCondition(0, 0, 1, 1, 2, 2)); // A
        winConditions.add(new WinCondition(0, 2, 1, 1, 2, 0)); // B
        winConditions.add(new WinCondition(0, 0, 0, 1, 0, 2)); // A
        winConditions.add(new WinCondition(1, 0, 1, 1, 1, 2)); // B
        winConditions.add(new WinCondition(2, 0, 2, 1, 2, 2)); //
        winConditions.add(new WinCondition(0, 0, 1, 0, 2, 0)); // A
        winConditions.add(new WinCondition(0, 1, 1, 1, 2, 1)); // B
        winConditions.add(new WinCondition(0, 2, 1, 2, 2, 2)); // B
    }

    public String tictactoe(int[][] moves) {
        for (int i = 0; i < moves.length; i++) {
            String mark = i % 2 == 0 ? "A" : "B";
            for (WinCondition winCondition : winConditions) {
                String winner = winCondition.check(mark, moves[i][0], moves[i][1]);
                if (winner != null) {
                    return winner;
                }
            }
        }
        if (moves.length < 9) {
            return "Pending";
        }
        return "Draw";
    }

    private static class WinCondition {
        private String mark;
        private List<int[]> squares = new LinkedList<>();

        WinCondition(int i1, int j1, int i2, int j2, int i3, int j3) {
            squares.add(new int[]{i1, j1});
            squares.add(new int[]{i2, j2});
            squares.add(new int[]{i3, j3});
        }

        String check(String mark, int i, int j) {
            if (this.mark != null && this.mark != mark) {
                return null;
            }
            for (int[] square : squares) {
                if (square[0] == i && square[1] == j) {
                    this.mark = mark;
                    squares.remove(square);
                    break;
                }
            }
            if (squares.size() == 0) {
                return mark;
            }
            return null;
        }
    }
}
