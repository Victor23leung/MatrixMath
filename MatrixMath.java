
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
        this.data = new int[data.length][data[0].length]; 
    }
    

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */

    public int[] rowSum()
    {
        int [] sumRow = new int [data.length];
        for (int i=0; i<data.length; i++)
        {
            sumRow=0;
            for (int j=0; j<data[0].length; j++)
            {
                sumRow += data[0][i];
            }
        }
        return sumRow;  
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        return null;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        return null;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        return null;
    }
    
    public String toString()
    {
        return null;
    }
}
