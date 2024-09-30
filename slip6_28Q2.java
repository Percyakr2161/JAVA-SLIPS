import java.util.Scanner;

class Matrix
{
	public static void add(int [][]m1,int [][]m2,int rows, int cols)
		{
			int i,j;
			int [][] result = new int[rows][cols];
			for( i=0;i<rows;i++)
				{
					for( j=0;j<cols;j++)
						result[i][j] = m1[i][j] + m2[i][j];
				}
		}
	System.out.println("Sum of the matrices:");
	display(result,rows,cols);
}

public static void multi(int[][] m1, int[][] m2, int rows1,
int cols1, int cols2)
{
	int i,j,k;
 int[][] result = new int[rows1][cols2];
 for ( i = 0; i < rows1; i++) 
 {
  for ( j = 0; j < cols2; j++)
   {
     for (k = 0; k < cols1; k++)
     {
       result[i][j] += m1[i][k] * m2[k][j];
     }
   }
 }
  System.out.println("Product of the matrices:");
  display(result, rows1, cols2);
}

public static void tMatrix(int[][] m, int rows, int cols)
{
	int i,j;
  int[][] result = new int[cols][rows];
  for ( i = 0; i < rows; i++)
   {
    for ( j = 0; j < cols; j++)
     {
      result[j][i] = m[i][j];
     }
   }
    System.out.println("Transpose of the matrix:");
    display(result, cols, rows);
}

public static void display(int[][] m, int rows, int cols) 
{
	int i,j;
  for (i = 0; i < rows; i++) 
   {
    for (j = 0; j < cols; j++)
     {
      System.out.print(m[i][j] + " ");
     }
      System.out.println();
    }
}

public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns of Matrix 1");
		int rows1 = sc.nextInt(),cols1 = sc.nextInt();
		int [][]m1 = readMatrix(sc,rows1,cols1);

		System.out.println("Enter matrix 2");
		int rows2 = sc.nextInt(),cols2 = sc.nextInt();
		int [][]m2 = readMatrix(sc,rows2,cols2);

		while(true)
			{
				System.out.println("1.Add\n 2.Multiply\n 3.Tranpose\n 4.Exit\nEnter your choice:");
				

				switch(sc.nextInt())
					{
						case 1->{

							if(rows1 == rows2 && cols1 == cols2)
								add(m1,m2,rows1,rows2);
							}
						case 2->
							{


						        if(cols1 == rows2)
						            multi(m1,m2,rows1,cols1,cols2);
							}

						case 3->
							{

					                 tmatrix(selectMatrix(sc,m1,m2,rows1,rows2),row1,cols1);
							}

						case 4:->
						       {

			                        	sc.close();
			                                return;
						       }

						default->
		                                        System.ou.println("Invalid choice");	

					}

			}

	}
private static int [][] readMatrix(Scanner sc,int rows,int cols)
    {
	    int i,j;
	    int [][] matrix = new int[rows][cols];
	    System.out.println("Enter Elements:");
	    for(i=0;i<rows;i++)
		    for(j=0;j<cols;j++)

		     matrix[i][j] = sc.nextInt();
	    return matrix;


    }
private static int [][] selectMatrix(Scanner sc,int [][]m1,int [][]m2,int rows1,int row2)
	 {
		 System.out.println("Select matrix (1 or 2) to tranpose:");
		 return sc.nextInt() == 1 ? m1 : m2;
	 }
}

