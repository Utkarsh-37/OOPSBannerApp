/*
	* OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
	* 
	* This class extends the functionality of UC4 by defining and populating the String array in a more concise way at the time of declaration
	* using String.join() method to create each line of banner.
	*
	*
	* @author Developer
	* @version 5.0
*/

class OOPSBannerApp
{
	public static void main(String[] args)
	{
		String[] arr = 
		{
			String.join(" ", "   ***   " , "   ***   " , "******   " , "    *****"),
			String.join(" ", " **   ** " , " **   ** " , "**    ** " , " **      "),
			String.join(" ", "**     **" , "**     **" , "**     **" , "**       "),
			String.join(" ", "**     **" , "**     **" , "**    ** " , " **      "),
			String.join(" ", "**     **" , "**     **" , "******   " , "   ***   "),
			String.join(" ", "**     **" , "**     **" , "**       " , "      ** "),
			String.join(" ", "**     **" , "**     **" , "**       " , "       **"),
			String.join(" ", " **   ** " , " **   ** " , "**       " , "      ** "),
			String.join(" ", "   ***   " , "   ***   " , "**       " , "*****    ")
		};
		
		
		for(String s: arr)
			System.out.println(s);
	}
}
