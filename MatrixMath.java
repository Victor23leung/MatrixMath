
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
        this.data = data; 
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
            int sum=0;
            for (int j=0; j<data[0].length; j++)
            {
                sum += data[i][j];
            }
            sumRow[i]=sum;
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
        double [] aveRow = new double[data.length];
        int [] sums = rowSum();
        for (int i=0; i<data.length; i++)
        {
           aveRow[i] = (sums[i]*1.0)/data[i].length; 
        }
        return aveRow; 
    }
    
    /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int [] colSum = new int [data[0].length];
        for (int i=0; i<data[0].length; i++)
        {
            int cSum=0;
            for (int j=0; j<data.length; j++)
            {
                cSum += data[j][i];
            }
            colSum[i]=cSum;
        }
        return colSum;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        double [] aveCol = new double[data[0].length];
        int [] sums = colSum();
        for (int i=0; i<data.length; i++)
            {
               aveCol[i] = (sums[i]*1.0)/data.length; 
            }
        return aveCol; 
    }

}
