package results;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;

/**
 * Class representing the result of a game played by a specific player.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GameResultZVHU97{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the player.
     */
    @Column(nullable = false)
    private String player;

    /**
     * Indicates whether the player has solved the puzzle.
     */
    private boolean solved;

    /**
     * The number of steps made by the player.
     */
    private int steps;

    /**
     * The duration of the game.
     */
    @Column(nullable = false)
    private Duration duration;
}
