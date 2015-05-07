package fr.iutvalence.bat.motus;

/* TODO JAVADOC. */
/* player class containing everything that concerns the player in itself */
/**
 * Player class containing everything that concerns the player in itself.
 * @author Numa Crozier - Antonin Metzler
 *
 */
public class Player {
	
    /**
     * The player's nickname, that he will have to chose before launching a new game.
     */
    private final String nickname;

    /**
     * Constructor for the player stances
     * @param nickname
     */
    public Player(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Getter to obtain the name the player have chosen before having launched the game.
     * @return
     */
    public String getNickname() {
        return nickname;
    }
}
