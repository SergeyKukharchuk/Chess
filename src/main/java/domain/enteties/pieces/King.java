package domain.enteties.pieces;


import domain.enteties.ChessPiece;
import domain.enteties.Position;

public class King extends ChessPiece {
    public King(Colour colour, Position position) {
        super(colour, position);
        pieceName = colour.getName() + "King";
    }
}
