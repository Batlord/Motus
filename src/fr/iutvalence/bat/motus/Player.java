package fr.iutvalence.bat.motus;

/* player class containing everything that concerns the player in itself */
public class Player {
    /* The player's nickname, that he will have to chose before launching a game*/
    private final String nickname;

    /* constructor for the player stances */
    public Player(String nickname) {
        this.nickname = nickname;
    }

    /* Getter to obtain the name the player have chosen before having launched the game */
    public String getNickname() {
        return nickname;
    }

    /* TODO Trop tôt ! */
    /*
     * Method that asks for the player's nickname before the game starts.
     *
    public Joueur askForNickname() {
        System.out.println("Entrez votre pseudonyme");
        Scanner entree = new Scanner(System.in);
        Joueur newPlayer = new Joueur(entree.next());
        return newPlayer;
    }*/
}
