package vectors;

/**
 * Created by Lee on 9/21/2016.
 */
public class Vector {
    private int m, n;
    private double[][] array;
    private double[][] T;

    public Vector(int rows, int cols) {
        this.m = rows;
        this.n = cols;
        this.array = new double[n][m];
        this.T = new double[m][n];
    }

    public double[][] dot(Vector v) {
        double[][] vec;
        if(this.getCols() == v.getRows())
            vec = new double[this.getRows()][v.getCols()];
        else
            return null;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec[i].length; j++) {

            }
        }
        return vec;
    }

    public double[] getRow(int index) {
        double[] subVec = new double[this.n];
        for(int i = 0; i < this.n; i++) {
            subVec[i] = this.array[i][index];
        }
        return subVec;
    }

    public double[] getCol(int index) {return this.array[index];}
    public int getRows() {return m;}
    public void setRows(int m) {this.m = m;}
    public int getCols() {return n;}
    public void setCols(int n) {this.n = n;}
    public double[][] getArray() {return array;}
    public void setArray(double[][] array) {this.array = array;}
}
