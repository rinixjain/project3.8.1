
public class code {
    /*
 * Activity 3.8.1
 */
  public static void main(String[] args)
  {
    // STEPS 7-9
    String[][] board = {{"close", "quarter"},
                        {"moon", "rock"}, 
                        {"band", "stand"},
                        {"out", "shine"} };

    int numRows = 4;
    int numCols = 2;
    
    System.out.println("Row-major order:");
    for (int i = 0; i < numRows; i++)
    {
      for (int j = 0; j < numCols; j++)
      {
        System.out.println(board[i][j]);
      }
    }
   
    System.out.println("Column-major order:");
    for (int i = 0; i < numCols; i++)
    {
      for (int j = 0; j < numRows; j++)
      {
        System.out.println(board[j][i]);
      }
    }
}
