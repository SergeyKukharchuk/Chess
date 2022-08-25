package domain.use_cases;

import domain.enteties.Position;
import domain.enteties.pieces.Rook;
import domain.repository.ChessRepository;

public class MakeCastlingUseCase {
    private ChessRepository repository;


    public MakeCastlingUseCase(ChessRepository repository) {
        this.repository = repository;
    }

    public void makeCastling(Rook rook, Position position) {
        repository.makeCastling(rook, position);
    }
}
