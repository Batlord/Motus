package fr.iutvalence.bat.motus;

/**
 * A letter: a character and its state.
 *
 * @author Antonin Metzler, Numa Crozier
 * @version 1.0
 */
public class Letter {
    /* TODO JAVADOC. */
    /* Attribute that defines a letter as being a character*/
    private final char  letter;
    /* TODO JAVADOC. */
    /* Attribute that links to each letter a state, to know if it's well placed,
     * bad placed or if it's not in the word the player is looking for */
    private       State state;

    /* TODO Javadoc. */
    public Letter(char letter, State state) {
        this.letter = letter;
        this.state = state;
    }
}
