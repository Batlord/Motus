package fr.iutvalence.bat.motus;

/**
 * Enumeration used to store states that will be linked to each cases in the grid.
 * @author crozienu
 *
 */
public enum State 
{
	/**
	 *The letter is not in the word we are looking for. 
	 */
	BLUE,
	/**
	 * The letter is in the word and at the good place.
	 */
	RED,
	/**
	 * The letter is in the word but not at the good place.
	 */
	YELLOW,
	/**
	 * The letter is hidden from the player.
	 */
	HIDDEN,
}