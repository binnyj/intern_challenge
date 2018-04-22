package intern_challenge;

/**
 *
 * Class that represents Tic Tac Toe Board
 *
 */
public class TTTBoard {

    private static final int SQUARES     = 9;
    private static final int NUM_OF_ROWS = 3;
    // An integer that will indicate if a player hasn't won yet or if there is a
    // tie
    private static final int CONTFLAG    = 3;
    private final String[]   board       = new String[SQUARES];

    /**
     * Initialize the Tic Tac Toe Board
     */
    public TTTBoard () {
        for ( int i = 0; i < SQUARES; i++ ) {
            board[i] = i + "";
        }
    }

    /**
     * Prints out the board
     */
    public void printCurrentBoard () {

        System.out.println( "---------------" );
        int iterator = 0;

        for ( int i = 0; i < NUM_OF_ROWS; i++ ) {
            System.out.print( "| " + board[iterator++] + " |" );
            System.out.print( "| " + board[iterator++] + " |" );
            System.out.print( "| " + board[iterator++] + " |\n" );
            System.out.println( "---------------" );
        }

    }

    /**
     * Checks if a move is valid
     * 
     * @param selected
     *            - square that player has selected
     * @return true if the move is valid
     */
    public boolean checkIfValid ( final int selected ) {
        if ( board[selected].equals( selected + "" ) ) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Places the symbol on a square
     * 
     * @param selected
     *            - selected square where player will place the symbol
     * @param string
     *            - symbol which will be placed on the square
     */
    public void placeSymbol ( final int selected, final String string ) {
        board[selected] = string;
    }

    public int checkIfPlayerWon ( final String string, final int i ) {
        // check first row
        if ( board[0].equals( string ) && board[1].equals( string ) && board[2].equals( string ) ) {
            return i;
        }
        // check second row
        else if ( board[3].equals( string ) && board[4].equals( string ) && board[5].equals( string ) ) {
            return i;
        }
        // check third row
        else if ( board[6].equals( string ) && board[7].equals( string ) && board[8].equals( string ) ) {
            return i;
        }
        // check first column
        else if ( board[0].equals( string ) && board[3].equals( string ) && board[6].equals( string ) ) {
            return i;
        }
        // check second column
        else if ( board[1].equals( string ) && board[4].equals( string ) && board[7].equals( string ) ) {
            return i;
        }
        // check third column
        else if ( board[2].equals( string ) && board[5].equals( string ) && board[8].equals( string ) ) {
            return i;
        }
        // check diagonal starting from upper left
        else if ( board[0].equals( string ) && board[4].equals( string ) && board[8].equals( string ) ) {
            return i;
        }
        // check diagonal starting from upper right
        else if ( board[2].equals( string ) && board[4].equals( string ) && board[6].equals( string ) ) {
            return i;
        }

        // Checks if there are any free spaces
        int numOfFreeSpaces = 0;
        for ( int j = 0; j < SQUARES; j++ ) {
            if ( !board[j].equals( "x" ) && !board[j].equals( "o" ) ) {
                numOfFreeSpaces++;
            }
        }

        if ( numOfFreeSpaces == 0 ) {
            return 0;
        }

        // Returns 3 if it isn't a tie or a player has won
        return CONTFLAG;
    }
}
