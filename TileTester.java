public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */
    int count = 0;
    Tile[][] gameboard = new Tile[3][4];
    for (int row = 0; row < gameboard.length; row++) { 
      for (int col = 0; col < gameboard[row].length; col++) { 
        gameboard[row][col] = new Tile(tileValues[count]);
        count++;
      }
    }
    System.out.println(java.util.Arrays.toString(gameboard[0]));
    System.out.println(java.util.Arrays.toString(gameboard[1]));
    System.out.println(java.util.Arrays.toString(gameboard[2]));
  }
}
