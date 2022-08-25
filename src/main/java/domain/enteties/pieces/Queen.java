package domain.enteties.pieces;


import domain.enteties.ChessPiece;
import domain.enteties.Position;

public class Queen extends ChessPiece {
    public Queen(Colour colour, Position position) {
        super(colour, position);
        pieceName = colour.getName() + "Queen";
    }
}
