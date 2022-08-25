package data;

import domain.enteties.ChessPiece;
import domain.enteties.Position;

public class ChessPieceDbEntity {
    private String pieceName;
    private ChessPiece.Colour colour;
    private Position position;
    private boolean hasMoved = false;
    private boolean wasKicked;

    public ChessPieceDbEntity(String pieceName,
                              ChessPiece.Colour colour,
                              Position position,
                              boolean hasMoved,
                              boolean wasKicked) {
        this.pieceName = pieceName;
        this.colour = colour;
        this.position = position;
        this.hasMoved = hasMoved;
        this.wasKicked = wasKicked;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public ChessPiece.Colour getColour() {
        return colour;
    }

    public void setColour(ChessPiece.Colour colour) {
        this.colour = colour;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isHasMoved() {
        return hasMoved;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public boolean isWasKicked() {
        return wasKicked;
    }

    public void setWasKicked(boolean wasKicked) {
        this.wasKicked = wasKicked;
    }
}
