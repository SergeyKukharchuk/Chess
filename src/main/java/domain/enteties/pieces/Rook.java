package domain.enteties.pieces;


import domain.enteties.ChessPiece;
import domain.enteties.Position;
public class Rook extends ChessPiece {
    public Rook(Colour colour, Position position) {
        super(colour, position);
        pieceName = colour.getName() + "Rook";
    }
}
