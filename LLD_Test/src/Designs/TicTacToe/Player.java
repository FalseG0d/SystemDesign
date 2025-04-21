package Designs.TicTacToe;

public class Player {
    PieceType pieceType;
    String name;

    Player(String name, PieceType pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }
}
