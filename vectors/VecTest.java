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
            System.out.print(z[i] + " ");
        System.out.println();
        double[][] y = {{2, 4}, {1, 9}, {5, 3}};
        Vector yVec = new Vector(y);
        double[][] zVec = xVec.dot(yVec);

        System.out.println(xVec.getRows() + " " + xVec.getCols());
        System.out.println(yVec.getRows() + " " + yVec.getCols());

        for(int i = 0; i < zVec.length; i++) {
            for(int j = 0; j < zVec[i].length; j++) {
                System.out.print(zVec[i][j] + " ");
            }
            System.out.println();
        }
    }
}
