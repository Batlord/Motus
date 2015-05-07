package fr.iutvalence.bat.motus;

import java.util.*;

public class Grid {
	
	/**
	 * Size of the grid.
	 */
	private int gridSize;
	/**
	 * Grid.
	 */
	private char[] grid;
	/**
	 * Random number for the size of the grid.
	 */
	Random randomGridSize = new Random();
	
	/**
	 * Constructor of an empty Grid.
	 */
	public Grid() 
	{
		this.gridSize = randomGridSize.nextInt(8)+1;
		this.grid = new char[gridSize];
	}
	
	public char[] fillGridWithRandomCharacters(int gridSize,char[] grid)
	{
		int compteurForGridCharacters;
		for(compteurForGridCharacters = 0; compteurForGridCharacters <= this.gridSize; compteurForGridCharacters++)
		{
			char randomCharacter = getNewCharacter();
			this.grid[compteurForGridCharacters] = randomCharacter;
			return this.grid;
		}
	}
	

}
