/*
	* OOPSBannerApp UC4 - Banner Display Application (use case 4)
	* 
	* This class extends the functionality of UC3. It focuses on enhancing code readability and efficiency by utilizing the String array and  
	* for each loop to print each line of banner. 
	*
	* This approach improves code reusability and modularity.
	*
	* @author Developer
	* @version 4.0
*/

class OOPSBannerApp
{
	public static void main(String[] args)
	{
		String[] arr = new String[9];
		arr[0] = String.join(" ", "   ***   " , "   ***   " , "******   " , "    *****");
		arr[1] = String.join(" ", " **   ** " , " **   ** " , "**    ** " , " **      ");
		arr[2] = String.join(" ", "**     **" , "**     **" , "**     **" , "**       ");
		arr[3] = String.join(" ", "**     **" , "**     **" , "**    ** " , " **      ");
		arr[4] = String.join(" ", "**     **" , "**     **" , "******   " , "   ***   ");
		arr[5] = String.join(" ", "**     **" , "**     **" , "**       " , "      ** ");
		arr[6] = String.join(" ", "**     **" , "**     **" , "**       " , "       **");
		arr[7] = String.join(" ", " **   ** " , " **   ** " , "**       " , "      ** ");
		arr[8] = String.join(" ", "   ***   " , "   ***   " , "**       " , "*****    ");
		
		
		for(String s: arr)
			System.out.println(s);
	}
}