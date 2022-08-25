package domain.use_cases;

import domain.enteties.ChessPiece;
import domain.enteties.Position;
import domain.repository.ChessRepository;

public class KickPieceUseCase {
    private ChessRepository repository;

    public KickPieceUseCase(ChessRepository repository) {
        this.repository = repository;
    }

    public void kickPiece(ChessPiece chessPiece, Position position) {
        repository.kickPiece(chessPiece, position);
    }
}
