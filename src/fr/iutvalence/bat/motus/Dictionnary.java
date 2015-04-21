package fr.iutvalence.bat.motus;

/* TODO JAVADOC. */
/* Class that will contain the "dictionnary" system, which means everything 
 * about the words the player will have to find */
public class Dictionnary {
    /* TODO JAVADOC. */
    /* The table that will contain the word the player will be looking for*/
    public String[] wordList;

    /* TODO JAVADOC. */
    /* The constructor that will instance our word to find*/
    public Dictionnary(String[] wordList) {
        this.wordList = wordList;
    }
}
