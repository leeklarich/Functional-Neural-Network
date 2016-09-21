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

    public Vector(double[][] a) {
        this.array = a;
        this.T = this.transpose();
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

    public double[][] transpose(Vector v) {
        double[][] newVec = new double[v.getRows()][v.getCols()];
        for(int i = 0; i < newVec.length; i++) {
            for(int j = 0; j < newVec[i].length; i++)
                newVec[i][j] = v.getArray()[j][i];
        }
        return newVec;
    }

    public double[][] transpose(double[][] v) {
        double[][] newVec = new double[v[0].length][v.length];
        for(int i = 0; i < newVec.length; i++) {
            for(int j = 0; j < newVec[i].length; i++)
                newVec[i][j] = v[j][i];
        }
        return newVec;
    }

    public double[][] transpose() {
        double[][] newVec = new double[this.getRows()][this.getCols()];
        for(int i = 0; i < newVec.length; i++) {
            for(int j = 0; j < newVec[i].length; i++)
                newVec[i][j] = this.array[j][i];
        }
        return newVec;
    }

    public void setArray(double[][] array) {
        if(this.n == array.length && this.m == array[0].length) {
            this.array = array;
            this.T = this.transpose();
        }
        else
            this.array = null;
    }

    public double[] getCol(int index) {
        double[] subVec = new double[this.m];
        for(int i = 0; i < this.m; i++) {
            subVec[i] = this.array[i][index];
            System.out.println(subVec[i]);
        }
        return subVec;
    }

    public double[] getRow(int index) {return this.array[index];}
    public int getRows() {return m;}
    public void setRows(int m) {this.m = m;}
    public int getCols() {return n;}
    public void setCols(int n) {this.n = n;}
    public double[][] getArray() {return array;}
}
