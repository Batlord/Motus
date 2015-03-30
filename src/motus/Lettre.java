package motus;

//class permettant de construire une lettre avec un etat
public class Lettre 
{
	public char lettre;
	public Etat etat;
	
	public Lettre(char lettre, Etat etat) {
		this.lettre = lettre;
		this.etat = etat;
	}
	
}
