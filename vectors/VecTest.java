package vectors;

/**
 * Created by Lee on 9/21/2016.
 */
public class VecTest {
    public static void main(String[] args) {
        double[][] x = {{1, 2, 3}, {4 , 5, 6}, {7, 8, 9}};
        Vector xVec = new Vector(x);
        double[] z = xVec.getCol(0);
        for(int i = 0; i < z.length; i++)
            System.out.println(z[i]);
    }
}
