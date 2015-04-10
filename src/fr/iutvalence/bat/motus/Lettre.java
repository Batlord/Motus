package fr.iutvalence.bat.motus;

/* TODO Javadoc. */
//class permettant de construire une lettre avec un etat
public class Lettre {
    /* TODO Javadoc. */
    private final char lettre;
    /* TODO Attention à la visibilité. */
    /* TODO Javadoc. */
    private Etat etat;

    /* TODO Javadoc. */
    public Lettre(char lettre, Etat etat) {
        this.lettre = lettre;
        this.etat = etat;
    }
}
