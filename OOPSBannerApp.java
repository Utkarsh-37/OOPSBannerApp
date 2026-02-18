/*
	* OOPSBannerApp UC3 - Banner Display Application (use case 3)
	* 
	* This class extends the functionality of UC2. It focuses on enhancing code readability and efficiency by utilizing the String.join() method 
	* to create each line of banner. 
	*
	* This approach overcomes the drawbacks of using the + operator for concatenation, which can lead to code ineffeciency due to creation of 
	* multiple immediate String objects in memory.
	*
	* @author Developer
	* @version 3.0
*/

class OOPSBannerApp
{
	public static void main(String[] args)
	{
		System.out.println(String.join(" ", "   ***   " , "   ***   " , "******   " , "    *****"));
		System.out.println(String.join(" ", " **   ** " , " **   ** " , "**    ** " , " **      "));
		System.out.println(String.join(" ", "**     **" , "**     **" , "**     **" , "**       "));
		System.out.println(String.join(" ", "**     **" , "**     **" , "**    ** " , " **      "));
		System.out.println(String.join(" ", "**     **" , "**     **" , "******   " , "   ***   "));
		System.out.println(String.join(" ", "**     **" , "**     **" , "**       " , "      ** "));
		System.out.println(String.join(" ", "**     **" , "**     **" , "**       " , "       **"));
		System.out.println(String.join(" ", "   ***   " , "   ***   " , "**       " , "*****    "));
		System.out.println(String.join(" ", " **   ** " , " **   ** " , "**       " , "      ** "));
	}
}
