package fr.iutvalence.bat.motus;

/* TODO JAVADOC. */

/**
 * Class that will contain the "dictionnary" system, which means everything 
 * about the words the player will have to find.
 * @author metzlera
 *
 */
public class Dictionnary {

	/**
     * The table that will contain the word the player will be looking for.
     */
    public String[] wordList;

    /**
     * The constructor that will instance our word to find.
     * @param wordList
     */
    public Dictionnary(String[] wordList) {
        this.wordList = wordList;
    }
}
