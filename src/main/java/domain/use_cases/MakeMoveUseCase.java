package domain.use_cases;

import domain.enteties.ChessPiece;
import domain.enteties.Position;
import domain.repository.ChessRepository;

public class MakeMoveUseCase {
    private ChessRepository repository;

    public MakeMoveUseCase(ChessRepository repository) {
        this.repository = repository;
    }

    public void makeMove(ChessPiece chessPiece, Position position) {
        repository.makeMove(chessPiece, position);
    }
}
