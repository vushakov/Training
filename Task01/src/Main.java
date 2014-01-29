
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type triangle height
		int n = 7;
		
		int[][] matrix = new int[n][];
		
		//Determine the first and the second top layers 
		matrix[0] = new int[]{1};
		matrix[1] = new int[]{1,1};
		
		//Define all elements of array
		for (int i = 2; i < n ; i++)
		{
			matrix[i] = new int[i + 1];
	        matrix[i][0] = 1;
		    matrix[i][i] = 1;
		    for (int l = 1; l < i ; l++)
		    {
			    matrix [i][l] = matrix[i-1][l-1] + matrix[i-1][l];
		    }
	    }
		
		//Print array
		for (int i = 0; i < n ; i++)
		{
			for (int l = 0; l < i+1; l++)
				System.out.print(matrix[i][l] + " ");
		    System.out.println();
		}
		
	}
	}
