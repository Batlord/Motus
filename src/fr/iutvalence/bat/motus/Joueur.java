/* TODO Utiliser un nom de package coherent (i.e. fr.iutvalence.NOM_DU_BINOME.motus). */
package fr.iutvalence.bat.motus;

import java.util.Scanner;

/* TODO Javadoc. */
public class Joueur {
    /* TODO Javadoc. */
    private final String nickname;

    /* TODO Javadoc. */
    public Joueur(String nickname) {
        this.nickname = nickname;
    }

	public String getNickname() 
	{
		return nickname;
	}  
	/*
	 * Method that asks for the player's nickname before the game starts.
	 */
	public Joueur askForNickname()
	{
		System.out.println("Entrez votre pseudonyme");
		Scanner entree =   new Scanner(System.in);
		Joueur newPlayer = new Joueur(entree.next())  ;
		return newPlayer;
	}
}
