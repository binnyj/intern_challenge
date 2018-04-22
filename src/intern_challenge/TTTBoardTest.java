package intern_challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of TTTBoard
 *
 */
public class TTTBoardTest {

    /**
     * Test scenario where Player wins when first row is filled
     */
    @Test
    public void testWon1 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 0, "x" );
        board.placeSymbol( 1, "x" );
        board.placeSymbol( 2, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 0, "o" );
        board2.placeSymbol( 1, "o" );
        board2.placeSymbol( 2, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when second row is filled
     */
    @Test
    public void testWon2 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 3, "x" );
        board.placeSymbol( 4, "x" );
        board.placeSymbol( 5, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 3, "o" );
        board2.placeSymbol( 4, "o" );
        board2.placeSymbol( 5, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when third row is filled
     */
    @Test
    public void testWon3 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 6, "x" );
        board.placeSymbol( 7, "x" );
        board.placeSymbol( 8, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 6, "o" );
        board2.placeSymbol( 7, "o" );
        board2.placeSymbol( 8, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when first column is filled
     */
    @Test
    public void testWon4 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 0, "x" );
        board.placeSymbol( 3, "x" );
        board.placeSymbol( 6, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 0, "o" );
        board2.placeSymbol( 3, "o" );
        board2.placeSymbol( 6, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when second column is filled
     */
    @Test
    public void testWon5 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 1, "x" );
        board.placeSymbol( 4, "x" );
        board.placeSymbol( 7, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 1, "o" );
        board2.placeSymbol( 4, "o" );
        board2.placeSymbol( 7, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when third column is filled
     */
    @Test
    public void testWon6 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 2, "x" );
        board.placeSymbol( 5, "x" );
        board.placeSymbol( 8, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 2, "o" );
        board2.placeSymbol( 5, "o" );
        board2.placeSymbol( 8, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when diagonal starting from upper left is
     * filled
     */
    @Test
    public void testWon7 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 0, "x" );
        board.placeSymbol( 4, "x" );
        board.placeSymbol( 8, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 0, "o" );
        board2.placeSymbol( 4, "o" );
        board2.placeSymbol( 8, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    /**
     * Test scenario where Player wins when diagonal starting from upper right
     * is filled
     */
    @Test
    public void testWon8 () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 2, "x" );
        board.placeSymbol( 4, "x" );
        board.placeSymbol( 6, "x" );
        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 1, i );

        final TTTBoard board2 = new TTTBoard();
        board2.placeSymbol( 2, "o" );
        board2.placeSymbol( 4, "o" );
        board2.placeSymbol( 6, "o" );
        final int j = board2.checkIfPlayerWon( "o", 2 );
        assertEquals( 2, j );
    }

    @Test
    public void testTie () {
        final TTTBoard board = new TTTBoard();
        board.placeSymbol( 0, "x" );
        board.placeSymbol( 2, "o" );
        board.placeSymbol( 1, "x" );
        board.placeSymbol( 3, "o" );
        board.placeSymbol( 5, "x" );
        board.placeSymbol( 4, "o" );
        board.placeSymbol( 6, "x" );
        board.placeSymbol( 8, "o" );
        board.placeSymbol( 7, "x" );

        final int i = board.checkIfPlayerWon( "x", 1 );
        assertEquals( 0, i );

        final int j = board.checkIfPlayerWon( "o", 2 );
        assertEquals( 0, j );
    }

}
