
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Type int number
		int number = 123987431;    //start number
		int res;                   //auxiliary variable  
	    int length = 0;            //number length = digit number
		int digit[] = new int[10]; //partition of Integer number by digit array(max int type length is 10 digits ) 
		
		//print int number
		System.out.println("Start number: " + number);
		
		//Partition by digit. Write all digit to array
		res = number;
		for (int i = 0; i < 10; i++)
		{
			digit[i] = (int)(res /((int)Math.pow(10,9 - i)));
			res = res %((int)Math.pow(10,9 - i));
		}
		
		//Define how many no "0" elements 
		for (int i = 0; i < 10; i++)
		{
			if (digit[i] != 0) length = length+1;
		}
		
		//Create array without "0"
		int Partition[] = new int [length];  //partition of start number array
		int l = 0;                           //auxiliary variable  
		for (int i = 0; i < 10; i++)
		{
			if (digit[i] != 0)
			{
				Partition[l] = digit[i];
				l = l + 1;
			}
		}
		//print result of partition
		System.out.print("Partition by Digit: ");
		for (int i = 0; i < length; i++)
			System.out.print( Partition[i] + " ");
		System.out.println();
		
		//Task04
		
		int left_sum = 0;          //left half sum of start number
		int right_sum = 0;         //right half sum of start number
		
		//Calculate left half of number total
		for (int i = 0; i < (int)(length / 2); i++)
			left_sum = left_sum + Partition[i];
		
		//Calculate right half of number total
		if (length % 2 == 0)
		{
		for (int i = (int)(length / 2); i < length ; i++)
			right_sum = right_sum + Partition[i];
		}
		else
		{
		for (int i = (int)(length / 2)+1; i < length ; i++)
			right_sum = right_sum + Partition[i];
		}
		
		//Compare left and right totals of number and print 
		if (left_sum == right_sum)
	    {
			System.out.println(number + " - Number is lucky");
			System.out.println("Left sum = Right sum = " + left_sum);
		} 
		else
		{
			System.out.println(number + " - Number isn't lucky");
			System.out.println("Left sum = " + left_sum + "\nRight sum = " + right_sum);
		}
	}

}
