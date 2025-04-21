package Designs.TicTacToe;

public class Board {
    PieceType board[][];
    int size;

    Board(int size) {
        this.size = size;
        this.board = new PieceType[size][size];
    }
}
