package com.lockedme.com;

import java.io.File;

public class Lockedme {
		static String DIRECTORY;
static File folder_name;

		public static void LockedMe() {
		DIRECTORY = System.getProperty("user.dir");
			folder_name = new File(DIRECTORY + "/bujji");
			if (!folder_name.exists())
				folder_name.mkdirs();
			System.out.println("DIRECTORY : " + folder_name.getAbsolutePath());
		}

		public  void WelcomeScreen() {
			System.out.println();
			System.err.println("                             ***WELCOME LOKEDME.COM***");
			System.out.println();
			System.out.println("Developer--> Poddaturi Swathi");
			System.out.println("Email-->poddaturiarunaswathi@gmail.com");

		}

		public static void Mainmenu() {
			System.out.println("Hello user!!!");
			System.out.println("Select any of the following options");
			System.out.println("1 option -> List files in directory");
			System.out.println("2 option -> Business-level operations");
			System.out.println("3 option  -> Exit Program");
		}

		public static  void Secondarymainmenu() {
			System.out.println("Select any of the following");
			System.out.println("   a ->Want to  Add a file");
			System.out.println("   b ->Want to Delete a file");
			System.out.println("   c ->Want to Search a file");
			System.out.println("   d ->Want Back to main menu");
		}
	public static void main ( String[] args)	{
		Lockedme l=new Lockedme();
		l.LockedMe();
		l.WelcomeScreen();
		//l.Mainmenu();
		//l.Secondarymainmenu();
		Firstoptions f=new Firstoptions();
		f.showPrimaryMenu();
	}
		
}




