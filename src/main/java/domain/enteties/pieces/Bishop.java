package domain.enteties.pieces;

import domain.enteties.ChessPiece;
import domain.enteties.Position;

public class Bishop extends ChessPiece {
    public Bishop(Colour colour, Position position) {
        super(colour, position);
        pieceName = colour.getName() + "Bishop";
    }
}
