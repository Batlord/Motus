package fr.iutvalence.bat.motus;

import java.util.*;

/**
 * A letter: a character and its state.
 *
 * @author Antonin Metzler, Numa Crozier
 * @version 1.0
 */
public class Letter {
    
	/** Attribute that defines a letter as being a character.*/
    private final char  letter;
    
    /** Attribute that links to each letter a state, to know id it's well placed,
     *  bad placed or if it's not in the word the player is looking for.
     */
    private State state;
  
    /**
     * Constructor for Letter class.
     * @param letter
     * @param state
     */
    public Letter(char letter, State state) {
        this.letter = letter;
        this.state = state;
    }
    /**
     * Method that creates a new random character, in our case a letter.
     * @return char
     */
    public char getNewCharacter()
    {
    	Random randomCharacter = new Random();
    	char newCharacter = (char)(randomCharacter.nextInt(25)+'a');
    	return newCharacter;
    }

}
