
public class Pascal_triangle {
	protected int[][] matrix;
	int h;
	
	/*public int Set_Height(int num)
	{
		return num;
	}*/
public Pascal_triangle(int num)
{    
	h=num;
	for (int i = 0; i < h ; i++)
     for (int l = 0; l < i+1; l++)
	            matrix[i][l] = 0;
	}
	
	public void getTriangle(int k){
		matrix[0] = new int[]{1};
		matrix[1] = new int[]{1,1};
		for (int i = 2; i < k ; i++)
		{
			matrix[i] = new int[i + 1];
	        matrix[i][0] = 1;
		    matrix[i][i] = 1;
		    for (int l = 1; l < i ; l++)
		    {
			    matrix [i][l] = matrix[i-1][l-1] + matrix[i-1][l];
		    }
	    }
	}
		
		public void printTriangle(int k)	{
			for (int i = 0; i < k ; i++)
			{
			for (int l = 0; l < i+1; l++)
				System.out.print(matrix[i][l] + " ");
		    System.out.println();
		    }
		}
	}
	
	
	

