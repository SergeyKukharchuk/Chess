package domain.repository;

import domain.enteties.ChessPiece;
import domain.enteties.Position;
import domain.enteties.pieces.Rook;

public interface ChessRepository {
void newGame();
void finishGame();
void undoLastMove();
void makeMove(ChessPiece chessPiece, Position position);
void kickPiece(ChessPiece chessPiece, Position position);
void makeCastling(Rook rook, Position position);
}
