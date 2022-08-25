package domain.use_cases;

import domain.repository.ChessRepository;

public class StartGameUseCase {
    private ChessRepository repository;

    public StartGameUseCase(ChessRepository repository) {
        this.repository = repository;
    }

    public void startGame() {
        repository.newGame();
    }
}
