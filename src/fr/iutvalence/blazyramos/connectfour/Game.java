package fr.iutvalence.blazyramos.connectfour;

import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Game 
{
	/** TODO. */
	private Player player1;
	/** TODO. */
	private Player player2;
	/** TODO. */
	private Board board;
	
	// TODO Joueur courant.
	// TODO Tour de jeu (nombre).
	
	/** TODO. */
	public Game() {
		player1 = new Player("Momo", Piece.PIECE1);
		player2 = new Player("Toto", Piece.PIECE2);
		board = new Board();
		
	}

	public void start() {
		System.out.printf("New game: %s vs. %s\n",player1.name(), player2.name()) ;
		Player player = player1;
		for (int i = 0; i < 999; i++) {
	//while (!victory()) 
			// Algo :
				/* 1 = Afficher la board*/
				   board.print();
				 /* 2= Joueur courant identifié par sa piece*/
				   Scanner column = new Scanner(System.in);
				   System.out.println("Veuillez saisir le numéros de colonne :");
				   int str = column.nextInt();
				   System.out.println("Vous avez saisi la colonne : " + str);
				   
				   
		 		   // Vérifier que colonne c'est bien dans la grille.
				  	board.putPiece(str, player.getPiece());
				   if (player == player1) {
				   player = player2;   
			   }
			   else {
				   player=player1;
			   }}
				   
	}

	private boolean victory() {
		for()
		// TODO Auto-generated method stub
		return false;
	}
	
	
}






