package results;

import util.jpa.GenericJpaDao;

import javax.persistence.Persistence;
import java.util.List;

/**
 * DAO class for the {@link GameResultZVHU97} entity.
 */
public class GameResultDao extends GenericJpaDao<GameResultZVHU97> {

    private static GameResultDao instance;

    private GameResultDao() {
        super(GameResultZVHU97.class);
    }

    public static GameResultDao getInstance() {
        if (instance == null) {
            instance = new GameResultDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("coin-jpa").createEntityManager());
        }
        return instance;
    }

    /**
     * Returns the list of {@code n} best results with respect to the time
     * spent for solving the puzzle.
     *
     * @param n the maximum number of results to be returned
     * @return the list of {@code n} best results with respect to the time
     * spent for solving the puzzle
     */
    public List<GameResultZVHU97> findBest(int n) {
        return entityManager.createQuery("SELECT r FROM GameResultZVHU97 r WHERE r.solved = true ORDER BY r.duration ASC", GameResultZVHU97.class)
                .setMaxResults(n)
                .getResultList();
    }
}
