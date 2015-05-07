package fr.iutvalence.bat.motus;

/**
 * Class that will figure a running game
 * @author Numa Crozier - Antonin Metzler
 *
 */
public class Game {
    /** Current player. */
    private Player player;
    /** Current round. */
    private int round;
    
    Grid gameGrid = new Grid();
    /* TODO Where are the letters (real question)? */
	public Game() 
	{
		this.round = 0;
	}
	 
	public Grid GetGameGrid()
	{
		return this.gameGrid;
	}
	public static void start(Grid gameGrid)
	{
		Grid.fillGridWithRandomCharacters(gameGrid.getCharGrid());
	}
}
