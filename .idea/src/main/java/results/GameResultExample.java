package results;


import java.time.Duration;

public class GameResultExample {
    public static void main(String[] args) {
        GameResultDao gameResultDao = GameResultDao.getInstance();
        GameResultZVHU97 gameResult = GameResultZVHU97.builder()
                .player("playerWon")
                .solved(true)
                .steps(36)
                .duration(Duration.ofMinutes(3))
                .build();
        gameResultDao.persist(gameResult);
        System.out.println(gameResult);
        System.out.println(gameResultDao.findBest(5));
    }
}
