package fr.iutvalence.bat.motus;

/* TODO JAVADOC. */
/* player class containing everything that concerns the player in itself */
public class Player {
    /* TODO JAVADOC. */
    /* The player's nickname, that he will have to chose before launching a game*/
    private final String nickname;

    /* TODO JAVADOC. */
    /* constructor for the player stances */
    public Player(String nickname) {
        this.nickname = nickname;
    }

    /* TODO JAVADOC. */
    /* Getter to obtain the name the player have chosen before having launched the game */
    public String getNickname() {
        return nickname;
    }
}
