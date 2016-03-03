import java.util.Scanner;

public class Game {
	private static char[][] theBoard;

    public Game()
    {
        this.theBoard = new char[6][7];
        this.clearBoard();
    }
public static char[][] gettheBoard() {
    return theBoard;
}

public boolean makeMove(char moveChar, char[][] theBoard, int col)
{
    if (theBoard[0][col] != '_')
        return false;


    for (int row = 0; row < 6; ++row) {

        if (theBoard[row][col] != '_') {

            theBoard[row-1][col] = moveChar;
            return true;
        }
    }
    theBoard[5][col] = moveChar;
    return true;
}

private void clearBoard()
{
    for(int i = 0; i < this.theBoard.length; i++)
    {
        for(int j = 0; j < this.theBoard[i].length; j++)
        {
            this.theBoard[i][j] = '_';
        }
    }
}

public boolean hasWinner()
{
    //row winners

    boolean col1WinnerA = (this.theBoard[0][0] == 'X' &&
            this.theBoard[0][1] == 'X' &&
            this.theBoard[0][2] == 'X' &&
            this.theBoard[0][3]=='X') ||
            (this.theBoard[0][1] == 'X' &&
                    this.theBoard[0][2] == 'X' &&
                    this.theBoard[0][3] == 'X' &&
                    this.theBoard[0][4]=='X') ||
            (this.theBoard[0][2] == 'X' &&
                    this.theBoard[0][3] == 'X' &&
                    this.theBoard[0][4] == 'X' &&
                    this.theBoard[0][5]=='X') ||
            (this.theBoard[0][3] == 'X' &&
                    this.theBoard[0][4] == 'X' &&
                    this.theBoard[0][5] == 'X' &&
                    this.theBoard[0][6]=='X');
    boolean col1WinnerB = (this.theBoard[0][0] == 'O' &&
            this.theBoard[0][1] == 'O' &&
            this.theBoard[0][2] == 'O'&&
            this.theBoard[0][3]=='O') ||
            (this.theBoard[0][1] == 'O' &&
                    this.theBoard[0][2] == 'O' &&
                    this.theBoard[0][3] == 'O'&&
                    this.theBoard[0][4]=='O') ||
            (this.theBoard[0][2] == 'O' &&
                    this.theBoard[0][3] == 'O' &&
                    this.theBoard[0][4] == 'O'&&
                    this.theBoard[0][5]=='O')||
            (this.theBoard[0][3] == 'O' &&
                    this.theBoard[0][4] == 'O' &&
                    this.theBoard[0][5] == 'O'&&
                    this.theBoard[0][6]=='O');
    boolean col2WinnerA = (this.theBoard[1][0] == 'X' &&
            this.theBoard[1][1] == 'X' &&
            this.theBoard[1][2] == 'X' &&
            this.theBoard[1][3]=='X') ||
            (this.theBoard[1][1] == 'X' &&
                    this.theBoard[1][2] == 'X' &&
                    this.theBoard[1][3] == 'X' &&
                    this.theBoard[1][4]=='X') ||
            (this.theBoard[1][2] == 'X' &&
            this.theBoard[1][3] == 'X' &&
            this.theBoard[1][4] == 'X' &&
            this.theBoard[1][5]=='X') ||
    (this.theBoard[1][3] == 'X' &&
            this.theBoard[1][4] == 'X' &&
            this.theBoard[1][5] == 'X'&&
            this.theBoard[1][6]=='X');                ;
    boolean col2WinnerB = (this.theBoard[1][0] == 'O' &&
            this.theBoard[1][1] == 'O' &&
            this.theBoard[1][2] == 'O'&&
            this.theBoard[1][3]=='O') ||
            (this.theBoard[1][1] == 'O' &&
            this.theBoard[1][2] == 'O' &&
            this.theBoard[1][3] == 'O'&&
            this.theBoard[1][4]=='O') ||
            (this.theBoard[1][2] == 'O' &&
                    this.theBoard[1][3] == 'O' &&
                    this.theBoard[1][4] == 'O'&&
                    this.theBoard[1][5]=='O') ||
            (this.theBoard[1][3] == 'O' &&
            this.theBoard[1][4] == 'O' &&
            this.theBoard[1][5] == 'O'&&
            this.theBoard[1][6]=='O');
    boolean col3WinnerA = (this.theBoard[2][0] == 'X' &&
            this.theBoard[2][1] == 'X' &&
            this.theBoard[2][2] == 'X' &&
            this.theBoard[2][3]=='X') ||
            (this.theBoard[2][1] == 'X' &&
            this.theBoard[2][2] == 'X' &&
            this.theBoard[2][3] == 'X' &&
            this.theBoard[2][4]=='X') ||
            (this.theBoard[2][2] == 'X' &&
            this.theBoard[2][3] == 'X' &&
            this.theBoard[2][4] == 'X' &&
            this.theBoard[2][5]=='X') ||
            (this.theBoard[2][3] == 'X' &&
            this.theBoard[2][4] == 'X' &&
            this.theBoard[2][5] == 'X' &&
            this.theBoard[2][6]=='X')
            ;
    boolean col3WinnerB = (this.theBoard[2][0] == 'O' &&
            this.theBoard[2][1] == 'O' &&
            this.theBoard[2][2] == 'O' &&
            this.theBoard[2][3]=='O') ||
            (this.theBoard[2][1] == 'O' &&
            this.theBoard[2][2] == 'O' &&
            this.theBoard[2][3] == 'O' &&
            this.theBoard[2][4]=='O')||
            (this.theBoard[2][2] == 'O' &&
            this.theBoard[2][3] == 'O' &&
            this.theBoard[2][4] == 'O' &&
            this.theBoard[2][5]=='O') ||
            (this.theBoard[2][3] == 'O' &&
            this.theBoard[2][4] == 'O' &&
            this.theBoard[2][5] == 'O' &&
            this.theBoard[2][6]=='O')
            ;
    boolean col4WinnerA = (this.theBoard[3][0] == 'X' &&
            this.theBoard[3][1] == 'X' &&
            this.theBoard[3][2] == 'X' &&
            this.theBoard[3][3]=='X')||
            (this.theBoard[3][1] == 'X' &&
            this.theBoard[3][2] == 'X' &&
            this.theBoard[3][3] == 'X' &&
            this.theBoard[3][4]=='X')||
            (this.theBoard[3][2] == 'X' &&
            this.theBoard[3][3] == 'X' &&
            this.theBoard[3][4] == 'X' &&
            this.theBoard[3][5]=='X')||
            (this.theBoard[3][3] == 'X' &&
            this.theBoard[3][4] == 'X' &&
            this.theBoard[3][5] == 'X' &&
            this.theBoard[3][6]=='X');
    boolean col4WinnerB = (this.theBoard[3][0] == 'O' &&
            this.theBoard[3][1] == 'O' &&
            this.theBoard[3][2] == 'O'&&
            this.theBoard[3][3]=='O')||
            (this.theBoard[3][1] == 'O' &&
            this.theBoard[3][2] == 'O' &&
            this.theBoard[3][3] == 'O'&&
            this.theBoard[3][4]=='O')||
            (this.theBoard[3][2] == 'O' &&
            this.theBoard[3][3] == 'O' &&
            this.theBoard[3][4] == 'O'&&
            this.theBoard[3][5]=='O') ||
            (this.theBoard[3][3] == 'O' &&
            this.theBoard[3][4] == 'O' &&
            this.theBoard[3][5] == 'O'&&
            this.theBoard[3][6]=='O') ;
    boolean col5WinnerA = (this.theBoard[4][0] == 'X' &&
            this.theBoard[4][1] == 'X' &&
            this.theBoard[4][2] == 'X' &&
            this.theBoard[4][3]=='X')||
            (this.theBoard[4][1] == 'X' &&
            this.theBoard[4][2] == 'X' &&
            this.theBoard[4][3] == 'X' &&
            this.theBoard[4][4]=='X')||
            (this.theBoard[4][2] == 'X' &&
            this.theBoard[4][3] == 'X' &&
            this.theBoard[4][4] == 'X' &&
            this.theBoard[4][5]=='X')||
            (this.theBoard[4][3] == 'X' &&
            this.theBoard[4][4] == 'X' &&
            this.theBoard[4][5] == 'X' &&
            this.theBoard[4][6]=='X')
            ;
    boolean col5WinnerB = (this.theBoard[4][0] == 'O' &&
            this.theBoard[4][1] == 'O' &&
            this.theBoard[4][2] == 'O' &&
            this.theBoard[4][3]=='O') ||
            (this.theBoard[4][1] == 'O' &&
            this.theBoard[4][2] == 'O' &&
            this.theBoard[4][3] == 'O' &&
            this.theBoard[4][4]=='O') ||
            (this.theBoard[4][2] == 'O' &&
            this.theBoard[4][3] == 'O' &&
            this.theBoard[4][4] == 'O' &&
            this.theBoard[4][5]=='O')||(this.theBoard[4][3] == 'O' &&
            this.theBoard[4][4] == 'O' &&
            this.theBoard[4][5] == 'O' &&
            this.theBoard[4][6]=='O') ;
    boolean col6WinnerA = (this.theBoard[5][0] == 'X' &&
            this.theBoard[5][1] == 'X' &&
            this.theBoard[5][2] == 'X' &&
            this.theBoard[5][3]=='X') ||(this.theBoard[5][1] == 'X' &&
            this.theBoard[5][2] == 'X' &&
            this.theBoard[5][3] == 'X' &&
            this.theBoard[5][4]=='X') ||(this.theBoard[5][2] == 'X' &&
            this.theBoard[5][3] == 'X' &&
            this.theBoard[5][4] == 'X' &&
            this.theBoard[5][5]=='X')||(this.theBoard[5][3] == 'X' &&
            this.theBoard[5][4] == 'X' &&
            this.theBoard[5][5] == 'X' &&
            this.theBoard[5][6]=='X') ;
    boolean col6WinnerB = (this.theBoard[5][0] == 'O' &&
            this.theBoard[5][1] == 'O' &&
            this.theBoard[5][2] == 'O'&&
            this.theBoard[5][3]=='O') ||(this.theBoard[5][1] == 'O' &&
            this.theBoard[5][2] == 'O' &&
            this.theBoard[5][3] == 'O'&&
            this.theBoard[5][4]=='O') ||(this.theBoard[5][2] == 'O' &&
            this.theBoard[5][3] == 'O' &&
            this.theBoard[5][4] == 'O'&&
            this.theBoard[5][5]=='O')||(this.theBoard[5][3] == 'O' &&
            this.theBoard[5][4] == 'O' &&
            this.theBoard[5][5] == 'O'&&
            this.theBoard[5][6]=='O');



    return  col1WinnerA || col1WinnerB ||
            col2WinnerA || col2WinnerB ||
            col3WinnerA || col3WinnerB ||
            col4WinnerA || col4WinnerB ||
            col5WinnerA || col5WinnerB ||
            col6WinnerA || col6WinnerB
            ;
}

public void display()
{
    System.out.println("*****************");
    for(int i = 0; i < this.theBoard.length; i++)
    {
        for(int j = 0; j < this.theBoard[i].length; j++)
        {
            System.out.print(this.theBoard[i][j] + "\t");
        }
        System.out.println("");
    }
} private GameBoard board;
private Player player1;
private Player player2;
private Scanner input;
public Game()
{
    input = new Scanner(System.in);
    this.board = new GameBoard();
    this.player1 = new Player("Player 1", 'X');
    this.player2 = new Player("Player 2", 'O');
}

public void play()
{
    Player currPlayer = this.player1;
    do
    {
        this.board.display();
        this.getMove(currPlayer);
        if(currPlayer == this.player1)
        {
            currPlayer = this.player2;
        }
        else
        {
            currPlayer = this.player1;
        }
    }
    while(this.board.hasWinner() == false);
    if(currPlayer == this.player1)
    {
        System.out.println("The Winner is: " + this.player2.getName());
    }
    else
    {
        System.out.println("The Winner is: " + this.player1.getName());
    }
}

private void getMove(Player player)
{
    int column = -1;
    do
    {
        System.out.print("Please enter a column: ");
        column = this.input.nextInt();
    }
    while(this.board.makeMove(player.getMoveChar(),GameBoard.gettheBoard(), column) == false);
}
}
