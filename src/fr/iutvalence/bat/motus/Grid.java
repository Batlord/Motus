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
	
	public char[] getCharGrid()
	{
		return this.grid;
	}
	
	/**
	 * Method that takes a grid and fill in it with random characters
	 * @param gridsize
	 * @param grid
	 * @return char[]
	 */
	public static char[] fillGridWithRandomCharacters(char[] grid)
	{
		int compteurForGridCharacters;
		
		for(compteurForGridCharacters = 0; compteurForGridCharacters <= grid.length; compteurForGridCharacters++)
		{
			char randomCharacter = Letter.getNewCharacter();
			grid[compteurForGridCharacters] = randomCharacter;
		
		}
		return grid;
	}

	@Override
	public String toString() {
		return "Grid [grid=" + Arrays.toString(grid) + "]";
	}
	
	

}
