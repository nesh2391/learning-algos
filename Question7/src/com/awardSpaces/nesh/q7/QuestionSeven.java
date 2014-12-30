package com.awardSpaces.nesh.q7;

//Find the traspose of the matrix 
/**
 * 
 * 1) original matrix
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 2) transpose
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 3-a) change rows to rotate left
 * 3 6 9
 * 2 5 8
 * 1 4 7
 * 3-b) or change columns to rotate right
 * 7 4 1
 * 8 5 2
 * 9 6 3
 *
 */
public class QuestionSeven
{
	int row =3;
	int column =3;
	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] transposeMatrix = new int[column][row];
	void trasposeMatrix()
	{
		for(int j=0;j<column;j++)
			for(int i=0;i<row;i++)
				transposeMatrix[j][i] = matrix[i][j];
	}
	void showMatrix(int row, int column, int[][] matrix)
	{
		for(int j=0;j<row;j++)
		{
			for(int i=0;i<column;i++)
				System.out.print(matrix[j][i]);
			System.out.println();
		}
	}
	void rotateLeft(int row, int column, int matrix[][])
	{
		for(int i = 0;i<row/2;i++)
			for(int j =0;j<column;j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[row-i-1][j];
				matrix[row-i-1][j]=temp;
			}
			
	}
	public static void main(String[] args)
	{
		QuestionSeven obj = new QuestionSeven();
		obj.showMatrix(obj.row, obj.column, obj.matrix);
		obj.trasposeMatrix();
		System.out.println("-----------");
		obj.showMatrix(obj.row, obj.column, obj.transposeMatrix);
		System.out.println("-----------");
		obj.rotateLeft(obj.row, obj.column, obj.transposeMatrix);
		obj.showMatrix(obj.row, obj.column, obj.transposeMatrix);
	}
}
