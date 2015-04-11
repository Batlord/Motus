package fr.iutvalence.bat.motus;

/* Class that will contain the "dictionnary" system, which means everything 
 * about the words the player will have to find */
public class Dictionnary {
    /* The table that will contain the word the player will be looking for*/
    public String[] wordList;

    /* The constructor that will instance our word to find*/
    public Dictionnary(String[] wordList) {
        this.wordList = wordList;
    }
}
