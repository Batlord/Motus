/* TODO Utiliser un nom de package coherent (i.e. fr.iutvalence.NOM_DU_BINOME.motus). */
package motus;

/* TODO Javadoc. */
//class permettant de construire une lettre avec un etat
public class Lettre {
    /* TODO Attention au final. */
    /* TODO Attention à la visibilité. */
    /* TODO Javadoc. */
    public char lettre;
    /* TODO Attention à la visibilité. */
    /* TODO Javadoc. */
    public Etat etat;

    /* TODO Est-ce que l'état initial est un choix ? */
    /* TODO Javadoc. */
    public Lettre(char lettre, Etat etat) {
        this.lettre = lettre;
        this.etat = etat;
    }
}
