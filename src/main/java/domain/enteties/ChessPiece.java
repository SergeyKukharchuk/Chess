package domain.enteties;

public abstract class ChessPiece {
    protected String pieceName;
    protected Colour colour;
    protected Position position;
    protected boolean hasMoved = false;
    protected boolean wasKicked = false;

    public ChessPiece(Colour colour, Position position) {
        this.colour = colour;
        this.position = position;
    }

    public String getName() {
        return pieceName;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Colour getColour() {
        return this.colour;
    }

    public void markAsHavingMoved() {
        hasMoved = true;
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    public String getPieceName() {
        return pieceName;
    }

    public boolean isWasKicked() {
        return wasKicked;
    }

    public void setWasKicked(boolean wasKicked) {
        this.wasKicked = wasKicked;
    }

    public enum Colour {
        WHITE("White"), BLACK("Black");

        private final String name;

        Colour(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
