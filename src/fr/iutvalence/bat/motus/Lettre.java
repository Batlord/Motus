package fr.iutvalence.bat.motus;

/**
 * A letter: a character and its state.
 *
 * @author TODO
 * @version TODO
 */
public class Lettre {
    /* TODO Javadoc. */
    private final char lettre;
    /* TODO Attention à la visibilité. */
    /* TODO Javadoc. */
    private       Etat etat;

    /* TODO Javadoc. */
    public Lettre(char lettre, Etat etat) {
        this.lettre = lettre;
        this.etat = etat;
    }
}
