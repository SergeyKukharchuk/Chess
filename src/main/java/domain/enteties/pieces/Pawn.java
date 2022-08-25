package domain.enteties.pieces;

import domain.enteties.ChessPiece;
import domain.enteties.Position;

public class Pawn extends ChessPiece {
    public Pawn(Colour colour, Position position) {
        super(colour, position);
        pieceName = colour.getName() + "Pawn";
    }
}
