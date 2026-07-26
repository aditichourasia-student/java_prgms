package java_prgms;
import java.util.*;

public class Anagram {

	public Anagram() {
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the first String");
		Scanner in=new Scanner(System.in);
		String input_str1=in.next();
		System.out.println("Enter the second string");
		String input_str2=in.next();
		
			input_str1=input_str1.toLowerCase();
			input_str2=input_str2.toLowerCase();
			
			if(input_str1.length()==input_str2.length())
			{
				char [] charArray1=input_str1.toCharArray();
				char[] charArray2=input_str2.toCharArray();
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
				
				if(Arrays.equals(charArray1,charArray2)) {
					System.out.println("The given strings are Anagrams");
				}else {
					System.out.println("The given Strings are NOT Anagrams");
				}
				
			}else {
				System.out.println("The given strings are Not Anagrams");
			}
			in.close();
	}
			
		
		

	}


