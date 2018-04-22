package intern_challenge;

import java.util.Scanner;

/**
 * Represents a Tic Tac Toe Game
 *
 */
public class TTTGame {

    /**
     * Main method
     *
     * @param args
     */
    public static void main ( final String args[] ) {
        final boolean gameRunning = true;
        boolean validMove = false;
        int won;
        final TTTBoard board = new TTTBoard();
        int selected;
        final Scanner input = new Scanner( System.in );

        System.out.println( "Welcome to 2 Player Tic Tac Toe" );
        System.out.println( "The goal is to get three of your symbols in a row or diagonal" );
        System.out.println( "Player 1 will use x, Player 2 will use o" );

        while ( gameRunning ) {
            board.printCurrentBoard();
            while ( validMove == false ) {
                System.out.println( "Player 1: Select a free square by entering it's number" );
                selected = input.nextInt();
                if ( board.checkIfValid( selected ) ) {
                    board.placeSymbol( selected, "x" );
                    validMove = true;
                }
            }
            won = board.checkIfPlayerWon( "x", 1 );
            if ( won == 1 ) {
                System.out.println( "Player 1 won" );
                break;
            }
            else if ( won == 0 ) {
                System.out.println( "It's a Tie" );
                break;
            }
            board.printCurrentBoard();
            validMove = false;
            while ( validMove == false ) {
                System.out.println( "Player 2: Select a free square by entering it's number" );
                selected = input.nextInt();
                if ( board.checkIfValid( selected ) ) {
                    board.placeSymbol( selected, "o" );
                    validMove = true;
                }
            }

            won = board.checkIfPlayerWon( "o", 2 );
            if ( won == 2 ) {

                System.out.println( "Player 2 won" );
                break;
            }
            else if ( won == 0 ) {

                System.out.println( "It's a Tie" );
                break;
            }

            validMove = false;
        }

        input.close();
        System.exit( 0 );
    }
}
