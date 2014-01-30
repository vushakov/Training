
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = "Hello world";
	char[] symbol = new char [str.length()];
	
	//String -> Char array
	for (int i = 0; i < str.length();i++)
		symbol[i] = str.charAt(i);
	
	//Print Char array by symbols
	for (int i = 0; i < str.length();i++)
	System.out.print(symbol[i] + " ");
	System.out.println();
	
	//Reverse Char array
	char[] reverse = new char [str.length()];
	int middle = (int)(str.length() / 2);
	for (int i = 0; i <= middle;i++)
	{   
		reverse [i] = symbol[str.length() - 1 - i];
		reverse [str.length() - 1 - i] = symbol [i];
	}
	
	//Print Reverse Char array
	System.out.print("Reverse: ");
	for (int i = 0; i < str.length();i++)
		System.out.print(reverse[i] + " ");
	}
}
	
