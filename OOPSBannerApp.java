/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */

// Extend the User Story 7 to utilize advanced Object-Oriented Programming concepts
// such as the Collections Framework to manage character patterns in a more flexible
// and efficient manner. The application retrieves and displays the "OOPS" banner
// using these mappings.

// Key Requirements:
// 1. Use HashMap to store ASCII art patterns for characters
// 2. Create methods to generate and retrieve character patterns
// 3. Retrieve and display patterns for the message "OOPS"
// 4. Utilize Collections Framework for pattern management
import java.util.*;

class OOPSBannerApp
{
	public static HashMap<Character, String[]> createCharecterMap()
	{
		HashMap<Character, String[]> charMap = new HashMap<>();
		charMap.put('O', new String[]{
				"   ***   " ,
				" **   ** " ,
				"**     **" ,
				"**     **" ,
				"**     **" ,
				"**     **" ,
				"**     **" ,
				" **   ** " ,
				"   ***   "
			} );
		charMap.put('P', new String[] {
				"******   ",
				"**    ** ",
				"**     **",
				"**    ** ",
				"******   ",
				"**       ",
				"**       ",
				"**       ",
				"**       "
			} );
		charMap.put('S', new String[] {
				"    *****",
				" **      ",
				"**       ",
				" **      ",
				"   ***   ",
				"      ** ",
				"       **",
				"      ** ",
				"*****    "
			} );
		return charMap;
	}
	
	public static void displayBanner(HashMap<Character, String[]> charMap)
	{	
		String[] O1 = charMap.get('O');
		String[] O2 = charMap.get('O');
		String[] P = charMap.get('P');
		String[] S = charMap.get('S');
		
		int height = O1.length;
		
		for(int i=0; i<height; i++)
		{
			StringBuilder line = new StringBuilder();
			line.append(O1[i]).append(" ");
			line.append(O2[i]).append(" ");
			line.append(P[i]).append(" ");
			line.append(S[i]);
			
			System.out.println(line.toString());
		}
	}
		
	
	public static void main(String[] args)
	{
		HashMap<Character, String[]> charMap = createCharecterMap();
		displayBanner(charMap);
	}
}
