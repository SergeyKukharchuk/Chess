package domain.enteties.pieces;

import domain.enteties.ChessPiece;
import domain.enteties.Position;

public class Knight extends ChessPiece {
    public Knight(Colour colour, Position position) {
        super(colour, position);
        pieceName = colour.getName() + "Knight";
    }
}
