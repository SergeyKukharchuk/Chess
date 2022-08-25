package domain.use_cases;

import domain.repository.ChessRepository;

public class UndoLastMoveUseCase {
    private ChessRepository repository;

    public UndoLastMoveUseCase(ChessRepository repository) {
        this.repository = repository;
    }

    public void undoLastMove(){
        repository.undoLastMove();
    }
}
