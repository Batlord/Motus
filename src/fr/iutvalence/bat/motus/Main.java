package fr.iutvalence.bat.motus;


/**
 * Main class that will contain instructions to allow someone to play, using all the other classes to make it possible
 * 
 * @author Numa Crozier
 *
 */
public class Main {
    /**
     * Main method in which the program skeleton will be written 
     * 
     * @param args
     */
    public static void main(String[] args) {
        Grid grid = new Grid();
        //probleme avec l'affichage de la grille remplie 
        Grid.fillGridWithRandomCharacters(grid.getCharGrid());
        System.out.println(grid);
        
    }
}
