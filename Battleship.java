
import java.util.Scanner;
import java.util.Arrays;
// to play this game, create a Battleship() object and click on the main() method
public class Battleship
{
    int[][] player1Board;
    int[][] computerBoard;
    int[][] hitBoard;
    boolean playerCarrierDestroyed = false;
    boolean playerBattleshipDestroyed = false;
    boolean playerCruiserDestroyed = false;
    boolean playerSubmarineDestroyed = false;
    boolean playerDestroyerDestroyed = false;
    boolean computerCarrierDestroyed = false;
    boolean computerBattleshipDestroyed = false;
    boolean computerCruiserDestroyed = false;
    boolean computerSubmarineDestroyed = false;
    boolean computerDestroyerDestroyed = false;
    
    public void start()
    {
        hitBoard = new int[10][10];
        player1Board = new int[10][10];
        int carrier = 5;
        int battleship = 4;
        int cruiser = 3;
        int submarine = 3;
        int destroyer = 2;   
        int numShips = 5;
        System.out.println("Welcome to Battleship!");
        wait(2000);
        System.out.println("");
        System.out.println("There are a few rules to this game:");
        wait(1500);
        System.out.println("");
        System.out.println("  1. In this game, you have 5 ships; the carrier, the battleship, the cruiser, the submarine, and the destroyer. \n     Your opponent also has these ships.");
        System.out.println("");
        System.out.println("  2. You will start by placing the ships on the player board. Remember: The spaces are 0-9, not 1-10.");
        System.out.println("");
        System.out.println("  3. You are playing against a computer, please treat it nicely!");
        System.out.println("");
        System.out.println("  4. Each component of the game is represented by a number: \n     Carrier = 5, Battleship = 4, Cruiser = 3, Submarine = 2, Destroyer = 1, blank space = 0, hit = 6, miss = 7");
        System.out.println("");
        wait(15000);
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65) + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        System.out.println("");
        wait(2000);
        System.out.println("^ This is your board!");
        System.out.println("");
        wait(2000);
        System.out.println("A '0' represents an empty space and a '6' represents a space which you hit!");
        System.out.println("");
        wait(2000);
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < hitBoard.length; i++)
        {
            System.out.print((char) (i + 65) + " ");
            for(int j = 0; j < hitBoard[0].length; j++)
            {
                System.out.print("  " + hitBoard[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        System.out.println("");
        wait(2000);
        System.out.println("^ This is your hit board!");
        wait(1500);
        System.out.println("");
        System.out.println("It shows you where you hit your opponent's ship!");
        wait(4000);
        System.out.println("");
        System.out.println("A '6' represents a hit and a '7' represents a miss!");
        wait(4000);
        System.out.println("");
        System.out.println("Where do you want to place your first ship, the Carrier?");
        System.out.println("(note: this ship requires five spaces)");
        wait(1500);
        System.out.println("");
        System.out.println("Please answer with a letter of the row where you want the ship.");
        System.out.println("Make sure you type a capital letter!");
        System.out.println("");
        Scanner firstScanner = new Scanner(System.in);
        String firstNumber = firstScanner.nextLine();
        System.out.println("");
        System.out.println("Now, answer with an index of the column where you want the ship.");
        System.out.println("");
        Scanner secondScanner = new Scanner(System.in);
        String secondNumber = secondScanner.nextLine();
        System.out.println("");
        System.out.println("Great! Now, which direction do you want the ship to face?");
        System.out.println("(make sure that the ship can fit there!)");
        System.out.println("Please answer with the direction in all lowercase!");
        System.out.println("Also, only type; up, down, left, or right");
        System.out.println("");
        Scanner thirdScanner = new Scanner(System.in);
        String face = thirdScanner.nextLine();
        int rowCoor = (int) (firstNumber.charAt(0)) - 65;
        int colCoor = Integer.parseInt(secondNumber);
        System.out.println("");
        wait(1500);
        if(face.equals("right") || face.equals("Right"))
        {
            for(int i = 0; i < 5; i++)
            {
                player1Board[rowCoor][colCoor + i] = 5;
            }
        }
        else if(face.equals("left") || face.equals("Left"))
        {
            for(int i = 0; i < 5; i++)
            {
                 player1Board[rowCoor][colCoor - i] = 5;
            }
        }
        else if(face.equals("up") || face.equals("Up"))
        {
            for(int i = 0; i < carrier; i++)
            {
                 player1Board[rowCoor - i][colCoor] = 5;
            }
        }
        else
        {
            for(int i = 0; i < carrier; i++)
            {
                 player1Board[rowCoor + i][colCoor] = 5;
            }
        }
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65) + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        System.out.println("");
        wait(2000);
        System.out.println("Where do you want to place your second ship, the Battleship?");
        System.out.println("(note: this ship requires four spaces)");
        wait(1500);
        System.out.println("");
        System.out.println("Please answer with a letter of the row where you want the ship.");
        System.out.println("Make sure the ships don't overlap!");
        System.out.println("");
        Scanner fourthScanner = new Scanner(System.in);
        String fourthNumber = firstScanner.nextLine();
        System.out.println("");
        System.out.println("Now, answer with an index of the column where you want the ship.");
        System.out.println("");
        Scanner fifthScanner = new Scanner(System.in);
        String fifthNumber = secondScanner.nextLine();
        System.out.println("");
        System.out.println("Great! Now, which direction do you want the ship to face?");
        System.out.println("(make sure that the ship can fit there!)");
        System.out.println("");
        Scanner sixthScanner = new Scanner(System.in);
        String face2 = sixthScanner.nextLine();
        int rowCoor2 = (int) (fourthNumber.charAt(0)) - 65;
        int colCoor2 = Integer.parseInt(fifthNumber);
        System.out.println("");
        wait(1500);
        if(face2.equals("right") || face2.equals("Right"))
        {
            for(int i = 0; i < battleship; i++)
            {
                player1Board[rowCoor2][colCoor2 + i] = 4;
            }
        }
        else if(face2.equals("left") || face2.equals("Left"))
        {
            for(int i = 0; i < battleship; i++)
            {
                player1Board[rowCoor2][colCoor2 - i] = 4;
            }
        }
        else if(face2.equals("up") || face2.equals("Up"))
        {
            for(int i = 0; i < battleship; i++)
            {
                player1Board[rowCoor2 - i][colCoor2] = 4;
            }
        }
        else
        {
            for(int i = 0; i < battleship; i++)
            {
                player1Board[rowCoor2 + i][colCoor2] = 4;
            }
        }
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65)  + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        wait(2000);
        System.out.println("Where do you want to place your third ship, the Cruiser?");
        System.out.println("(note: this ship requires three spaces)");
        wait(1500);
        System.out.println("");
        System.out.println("Please answer with a letter of the row where you want the ship.");
        System.out.println("Make sure the ships don't overlap!");
        System.out.println("");
        Scanner seventhScanner = new Scanner(System.in);
        String seventhNumber = firstScanner.nextLine();
        System.out.println("");
        System.out.println("Now, answer with an index of the column where you want the ship.");
        System.out.println("");
        Scanner eighthScanner = new Scanner(System.in);
        String eighthNumber = secondScanner.nextLine();
        System.out.println("");
        System.out.println("Great! Now, which direction do you want the ship to face?");
        System.out.println("(make sure that the ship can fit there!)");
        System.out.println("");
        Scanner ninthScanner = new Scanner(System.in);
        String face3 = ninthScanner.nextLine();
        int rowCoor3 = (int) (seventhNumber.charAt(0)) - 65;
        int colCoor3 = Integer.parseInt(eighthNumber);
        System.out.println("");
        wait(1500);
        if(face3.equals("right") || face3.equals("Right"))
        {
            for(int i = 0; i < cruiser; i++)
            {
                player1Board[rowCoor3][colCoor3 + i] = 3;
            }
        }
        else if(face3.equals("left") || face3.equals("Left"))
        {
            for(int i = 0; i < cruiser; i++)
            {
                player1Board[rowCoor3][colCoor3 - i] = 3;
            }
        }
        else if(face3.equals("up") || face3.equals("Up"))
        {
            for(int i = 0; i < cruiser; i++)
            {
                player1Board[rowCoor3 - i][colCoor3] = 3;
            }
        }
        else
        {
            for(int i = 0; i < cruiser; i++)
            {
                player1Board[rowCoor3 + i][colCoor3] = 3;
            }
        }
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65)  + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        wait(2000);
        System.out.println("");
        System.out.println("Where do you want to place your fourth ship, the Submarine?");
        System.out.println("(note: this ship requires three spaces)");
        wait(1500);
        System.out.println("");
        System.out.println("Please answer with a letter of the row where you want the ship.");
        System.out.println("Make sure the ships don't overlap!");
        System.out.println("");
        Scanner tenthScanner = new Scanner(System.in);
        String tenthNumber = firstScanner.nextLine();
        System.out.println("");
        System.out.println("Now, answer with an index of the column where you want the ship.");
        System.out.println("");
        Scanner eleventhScanner = new Scanner(System.in);
        String eleventhNumber = secondScanner.nextLine();
        System.out.println("");
        System.out.println("Great! Now, which direction do you want the ship to face?");
        System.out.println("(make sure that the ship can fit there!)");
        System.out.println("");
        Scanner twelveScanner = new Scanner(System.in);
        String face4 = twelveScanner.nextLine();
        int rowCoor4 = (int) (tenthNumber.charAt(0)) - 65;;
        int colCoor4 = Integer.parseInt(eleventhNumber);
        System.out.println("");
        wait(1500);
        if(face4.equals("right") || face4.equals("Right"))
        {
            for(int i = 0; i < submarine; i++)
            {
                player1Board[rowCoor4][colCoor4 + i] = 2;
            }
        }
        else if(face4.equals("left") || face4.equals("Left"))
        {
            for(int i = 0; i < submarine; i++)
            {
                player1Board[rowCoor4][colCoor4 - i] = 2;
            }
        }
        else if(face4.equals("up") || face4.equals("Up"))
        {
            for(int i = 0; i < submarine; i++)
            {
                player1Board[rowCoor4 - i][colCoor4] = 2;
            }
        }
        else
        {
            for(int i = 0; i < submarine; i++)
            {
                player1Board[rowCoor4 + i][colCoor4] = 2;
            }
        }
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65)  + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        System.out.println("");
        wait(2000);
        System.out.println("Where do you want to place your fifth ship, the Destroyer?");
        System.out.println("(note: this ship requires two spaces)");
        wait(1500);
        System.out.println("");
        System.out.println("Please answer with a letter of the row where you want the ship.");
        System.out.println("Make sure the ships don't overlap!");
        System.out.println("");
        Scanner thirteenthScanner = new Scanner(System.in);
        String thirteenthNumber = firstScanner.nextLine();
        System.out.println("");
        System.out.println("Now, answer with an index of the column where you want the ship.");
        System.out.println("");
        Scanner fourteenthScanner = new Scanner(System.in);
        String fourteenthNumber = secondScanner.nextLine();
        System.out.println("");
        System.out.println("Great! Now, which direction do you want the ship to face?");
        System.out.println("(make sure that the ship can fit there!)");
        System.out.println("");
        Scanner fifteenthScanner = new Scanner(System.in);
        String face5 = thirdScanner.nextLine();
        int rowCoor5 =(int) (thirteenthNumber.charAt(0)) - 65;
        int colCoor5 = Integer.parseInt(fourteenthNumber);
        System.out.println("");
        if(face5.equals("right") || face5.equals("Right"))
        {
            for(int i = 0; i < destroyer; i++)
            {
                player1Board[rowCoor5][colCoor5 + i] = 1;
            }
        }
        else if(face5.equals("left") || face5.equals("Left"))
        {
            for(int i = 0; i < destroyer; i++)
            {
                player1Board[rowCoor5][colCoor5 - i] = 1;
            }
        }
        else if(face5.equals("up") || face5.equals("Up"))
        {
            for(int i = 0; i < destroyer; i++)
            {
               player1Board[rowCoor5 - i][colCoor5] = 1;
            }
        }
        else
        {
            for(int i = 0; i < destroyer; i++)
            {
                player1Board[rowCoor5 + i][colCoor5] = 1;
            }
        }
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65)  + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
    }
    public void computerStart()
    {
        computerBoard = new int[10][10];
        int carrier = 5;
        int battleship = 4;
        int cruiser = 3;
        int submarine = 3;
        int destroyer = 2;   
        int row = (int) (Math.random() * 5) + 5;
        int col = (int) (Math.random() * 5);
        int isUp = (int) Math.random();
        if(isUp == 0) // 0 = facing up
        {
            for(int i = 0; i < carrier; i++)
            {
                computerBoard[row - i][col] = 5;
            }
        }
        else if(isUp == 1) // 1 = facing right
        {
            for(int i = 0; i < carrier; i++)
            {
                computerBoard[row][col + i] = 5;
            }
        }
        int row2 = (int) (Math.random() * 5) + 3;
        int col2 = (int) (Math.random() * 5);
        int isUp2 = (int) (Math.random() * 2);
        if(isUp2 == 0)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(computerBoard[row2][col2] == 0 && computerBoard[row2 - 1][col2] == 0 && computerBoard[row2 - 2][col2] == 0 && computerBoard[row2 - 3][col2] == 0)
                {
                    for(int j = 0; j < battleship; j++)
                    {
                        computerBoard[row2 - j][col2] = 4;
                    }
                    break;
                }
                else
                {
                    if(row2 + 4 < 9)
                    {
                        col2++;
                    }
                    else
                    {
                        row2++;
                    }
                }
            }
        }
        else if(isUp2 == 1)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(hasEmptySpace(row2, col2) && hasEmptySpace(row2, col2 + 1) && hasEmptySpace(row2, col2 + 2) && hasEmptySpace(row2, col2 + 3))
                {
                    for(int j = 0; j < battleship; j++)
                    computerBoard[row2][col2 + j] = 4;
                    break;
                }
                else
                {
                    if(col2 + 4 < 9)
                    {
                        row2++;
                    }
                    else
                    {
                        col2++;
                    }
                }
            }
        }
        int row3 = (int) (Math.random() * 5) + 3;
        int col3 = (int) (Math.random() * 5);
        int isUp3 = (int) Math.random();
        if(isUp3 == 0)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(computerBoard[row3][col3] == 0 && computerBoard[row3 - 1][col3] == 0 && computerBoard[row3 - 2][col3] == 0)
                {
                    for(int j = 0; j < cruiser; j++)
                    {
                        computerBoard[row3 - j][col3] = 3;
                    }
                    break;
                }
                else
                {
                    if(row3 + 4 < 9)
                    {
                        col3++;
                    }
                    else
                    {
                        row3++;
                    }
                }
            }
        }
        else if(isUp3 == 1)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(hasEmptySpace(row3, col3) && hasEmptySpace(row3, col3 + 1) && hasEmptySpace(row3, col3 + 2))
                {
                    for(int j = 0; j < cruiser; j++)
                    computerBoard[row3][col3 + j] = 3;
                    break;
                }
                else
                {
                    if(col3 + 4 < 9)
                    {
                        row3++;
                    }
                    else
                    {
                        col3++;
                    }
                }
            }
        }
        int row4 = (int) (Math.random() * 5) + 4;
        int col4 = (int) (Math.random() * 5);
        int isUp4 = (int) Math.random();
        if(isUp4 == 0)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(computerBoard[row4][col4] == 0 && computerBoard[row4 - 1][col4] == 0 && computerBoard[row4 - 2][col4] == 0)
                {
                    for(int j = 0; j < submarine; j++)
                    {
                        computerBoard[row4 - j][col4] = 2;
                    }
                    break;
                }
                else
                {
                    if(row4 + 4 < 9)
                    {
                        col4++;
                    }
                    else
                    {
                        row4++;
                    }
                }
            }
        }
        else if(isUp4 == 1)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(hasEmptySpace(row4, col4) && hasEmptySpace(row4, col4 + 1) && hasEmptySpace(row4, col4 + 2))
                {
                    for(int j = 0; j < battleship; j++)
                    computerBoard[row4][col4 + j] = 2;
                    break;
                }
                else
                {
                    if(col4 + 4 < 9)
                    {
                        row4++;
                    }
                    else
                    {
                        col4++;
                    }
                }
            }
        }
        int row5 = (int) (Math.random() * 5) + 4;
        int col5 = (int) (Math.random() * 5);
        int isUp5 = (int) Math.random();
        if(isUp5 == 0)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(computerBoard[row5][col5] == 0 && computerBoard[row5 - 1][col5] == 0)
                {
                    for(int j = 0; j < destroyer; j++)
                    {
                        computerBoard[row5 - j][col5] = 1;
                    }
                    break;
                }
                else
                {
                    if(row5 + 4 < 9)
                    {
                        col5++;
                    }
                    else
                    {
                        row5++;
                    }
                }
            }
        }
        else if(isUp5 == 1)
        {
            for(int i = 0; i < Integer.MAX_VALUE; i++)
            {
                if(computerBoard[row5][col5] == 0 && computerBoard[row5][col5 + 1] == 0)
                {
                    for(int j = 0; j < destroyer; j++)
                    computerBoard[row5][col5 + j] = 1;
                    break;
                }
                else
                {
                    if(col5 + 4 < 9)
                    {
                        row5++;
                    }
                    else
                    {
                        col5++;
                    }
                }
            }
        }
        // for(int i = 0; i < computerBoard.length; i++)
        // {
            // for(int j = 0; j < computerBoard[0].length; j++)
            // {
                // System.out.print(computerBoard[i][j] + " ");
            // }
            // System.out.println("");
        // }  
    }
        public boolean hasEmptySpace(int row, int col)
    {
        if(computerBoard[row][col] == 0)
        {
            return true;
        }
        return false;
    }
    private void wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void turn()
    { 
        System.out.println("Now, it is your turn!");
        System.out.println("");
        wait(2500);
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < hitBoard.length; i++)
        {
            System.out.print((char) (i + 65) + " ");
            for(int j = 0; j < hitBoard[0].length; j++)
            {
                System.out.print("  " + hitBoard[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        System.out.println("Hit Board");
        System.out.println("");
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("");
        for(int i = 0; i < player1Board.length; i++)
        {
            System.out.print((char) (i + 65)  + " ");
            for(int j = 0; j < player1Board[0].length; j++)
            {
                System.out.print("  " + player1Board[i][j] + " ");
                
            }
            System.out.println("");
            System.out.println("");
        }   
        System.out.println("Player Board");
        System.out.println("");
        wait(1500);
        System.out.println("Choose any row");
        System.out.println("");
        Scanner aScanner = new Scanner(System.in);
        String anInput = aScanner.nextLine();
        int anInteger = (int) (anInput.charAt(0)) - 65;
        System.out.println("");
        System.out.println("Now, choose any column");
        System.out.println("");
        Scanner aScanner2 = new Scanner(System.in);
        String anInput2 = aScanner.nextLine();
        int anInteger2 = Integer.parseInt(anInput2);
        System.out.println("");
        wait(1500);
        if(computerBoard[anInteger][anInteger2] != 0)
        {
            System.out.println("Hit!");
            hitBoard[anInteger][anInteger2] = 6;
            System.out.println("");
        }
        else
        {
            System.out.println("Miss!");
            hitBoard[anInteger][anInteger2] = 7;
            System.out.println("");
        }
        computerBoard[anInteger][anInteger2] = 6;
    }
    public void computerTurn()
    {
        int randomRow = (int) (Math.random() * 9);
        int randomColumn = (int) (Math.random() * 9);
        if(player1Board[randomRow][randomColumn] != 0 && player1Board[randomRow][randomColumn] != 6 && player1Board[randomRow][randomColumn] != 7)
        {
            wait(3000);
            System.out.println("The computer hit your ship!");
            System.out.println("");
            player1Board[randomRow][randomColumn] = 6;
        }
        else
        {
            wait(3000);
            System.out.println("The computer missed your ship!");
            System.out.println("");
            player1Board[randomRow][randomColumn] = 7;  
        }
        
    }
    public void sunkPlayerBattleship()
    {
        int countCarrier = 0;
        int countBattleship = 0;
        int countCruiser = 0;
        int countSubmarine = 0;
        int countDestroyer = 0;
        for(int i = 0; i < player1Board.length; i++)
        {
            for(int j = 0;  j < player1Board[0].length; j++)
            {
                if(player1Board[i][j] == 5)
                {
                    countCarrier++;
                }
                if(player1Board[i][j] == 4)
                {
                    countBattleship++;
                }
                if(player1Board[i][j] == 3)
                {
                    countCruiser++; 
                }
                if(player1Board[i][j] == 2)
                {
                    countSubmarine++;
                }
                if(player1Board[i][j] == 1)
                {
                    countDestroyer++;
                }
            }
        }
        if(countCarrier == 0 && !playerCarrierDestroyed)
        {
            wait(1500);
            System.out.println("The computer has sunk your carrier!");
            System.out.println("");
            wait(1500);
            playerCarrierDestroyed = true;
            
        }
        else if(countBattleship == 0 && !playerBattleshipDestroyed)
        {
            wait(1500);
            System.out.println("The computer has sunk your battleship!");
            System.out.println("");
            wait(1500);
            playerBattleshipDestroyed = true;
            
        }   
        else if(countCruiser == 0 && !playerCarrierDestroyed)
        {
            wait(1500);
            System.out.println("The computer has sunk your cruiser!");
            System.out.println("");
            wait(1500);
            playerCruiserDestroyed = true;
            
        }   
        else if(countSubmarine == 0 && !playerSubmarineDestroyed)
        {
            wait(1500);
            System.out.println("The computer has sunk your submarine!");
            System.out.println("");
            wait(1500);
            playerSubmarineDestroyed = true;
        }
        else if(countDestroyer == 0 && !playerDestroyerDestroyed)
        {
            wait(1500);
            System.out.println("The computer has sunk your destroyer!");
            System.out.println("");
            wait(1500);
            playerDestroyerDestroyed = true;
        }
    }
    public void sunkComputerBattleship()
    {
        int countCarrier = 0;
        int countBattleship = 0;
        int countCruiser = 0;
        int countSubmarine = 0;
        int countDestroyer = 0;
        for(int i = 0; i < computerBoard.length; i++)
        {
            for(int j = 0;  j < computerBoard[0].length; j++)
            {
                if(computerBoard[i][j] == 5)
                {
                    countCarrier++;
                }
                if(computerBoard[i][j] == 4)
                {
                    countBattleship++;
                }
                if(computerBoard[i][j] == 3)
                {
                    countCruiser++;
                }
                if(computerBoard[i][j] == 2)
                {
                    countSubmarine++;
                }
                if(computerBoard[i][j] == 1)
                {
                    countDestroyer++;
                }
            }
        }
        if(countCarrier == 0 && !computerCarrierDestroyed)
        {
            wait(1500);
            System.out.println("You have sunk the computer's carrier!");
            System.out.println("");
            wait(1500);
            computerCarrierDestroyed = true;
        }
        else if(countBattleship == 0 && !computerBattleshipDestroyed)
        {
            wait(1500);
            System.out.println("You have sunk the computer's battleship!");
            System.out.println("");
            wait(1500);
            computerBattleshipDestroyed = true;
        }   
        else if(countCruiser == 0 && !computerCruiserDestroyed)
        {
            wait(1500);
            System.out.println("You have sunk the computer's cruiser!");
            System.out.println("");
            wait(1500);
            computerCruiserDestroyed = true;
        }   
        else if(countSubmarine == 0 && !computerSubmarineDestroyed)
        {
            wait(1500);
            System.out.println("You have sunk the computer's submarine!");
            System.out.println("");
            wait(1500);
            computerSubmarineDestroyed = true;
        }
        else if(countDestroyer == 0 && !computerDestroyerDestroyed)
        {
            wait(1500);
            System.out.println("You have sunk the computer's destroyer!");
            System.out.println("");
            wait(1500);
            computerDestroyerDestroyed = true;
        }
    }
    public boolean endPlayer()
    {
        int total = 0;
        for(int i = 0; i < player1Board.length; i++)
        {
            for(int j = 0; j < player1Board[0].length; j++)
            {
                if(player1Board[i][j] != 0 && player1Board[i][j] != 6 && player1Board[i][j] != 7)
                {
                    total++;
                }
            }
        }
        if(total == 0)
        {
            wait(1500);
            System.out.println("The computer has bested you!");
            System.out.println("");
            return true;
        }
        return false;
    }
    public boolean endComputer()
    {
        int total = 0;
        for(int i = 0; i < computerBoard.length; i++)
        {
            for(int j = 0; j < computerBoard[0].length; j++)
            {
                if(computerBoard[i][j] != 0 && computerBoard[i][j] != 6 && computerBoard[i][j] != 7)
                {
                    total++;
                }
            }
        }
        if(total == 0)
        {
            wait(1500);
            System.out.println("You have defeated the computer! Congratulations!");
            System.out.println("");
            return true;
        }
        return false;
    }
    public void main()
    {
        start();
        computerStart();
        while(!endPlayer() && !endComputer())
        {
            turn();
            sunkComputerBattleship();
            computerTurn();
            sunkPlayerBattleship();
        }
        wait(1500);
        System.out.println("Thank you for playing!");
        System.out.println("");
        wait(1500);
        System.out.println("");
    }
}
