package com.helpmeproductions.willus08.clockwisematrix;

/**
 * Created by Willus08 on 1/30/2018.
 */

public class clockwiseMatrix {
   public static int [][] evenMatrix =
                    {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
    public static int [][] oddMatrix =
                    {{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20}};
    public static int [][] odderMatrix =
                            {{1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20},
                            {21,22,23,24,25}};

    public static void main(String args[]){
        readClockwise(evenMatrix);
        System.out.println("");
        readClockwise(oddMatrix);
        System.out.println("");
        readClockwise(odderMatrix);
    }

    public static void readClockwise(int[][] mat){
        int numRow = mat.length;
        int numCol = mat[0].length;
        int cr = 0; // current row
        int cc = 0; // current col
        int endRow = numRow;
        int endCol = numCol;
        int i;
        while (cr < endRow && cc < endCol){
            // goes down the topmost row to the last colum
            for (i = cc; i < endCol; i++){
                printMatrix(mat[cr][i]);
            }
            endCol --;

            // goes down he rightmost col
            for (i = cr+1; i < endRow; i++){
                printMatrix(mat[i][endCol]);
            }
            cr++;

            //goes down the botommost row to the first colum
            for(i = endCol-1; i >= cc; i--){
                printMatrix(mat[endRow-1][i]);
            }
            endRow--;

            // goes up the leftmost colm to the top row
            for (i = endRow -1; i >= cr; i--){
                printMatrix(mat[i][cc]);
            }
            cc++;
        }
    }

    public static void printMatrix(int m){
        System.out.print(""+m+" ");
    }
}
