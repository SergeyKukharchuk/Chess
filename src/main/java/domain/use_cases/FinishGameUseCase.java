package domain.use_cases;

import domain.repository.ChessRepository;

public class FinishGameUseCase {
    private ChessRepository repository;

    public FinishGameUseCase(ChessRepository repository) {
        this.repository = repository;
    }

   public void finishGame(){
        repository.finishGame();
   }
}
