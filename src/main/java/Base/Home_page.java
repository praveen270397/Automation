package Base;

	import org.openqa.selenium.NoSuchElementException;
	

import Utilities.Reusable;


	public class Home_page extends Reusable {
     		
		public void Search_Avaialble() {
		
		   try {
			   
			   driver.findElement(Search_availability).isDisplayed();
		   
		   }
		   
		   catch(NoSuchElementException  e)
		   {
			   
			   e.printStackTrace();
		   }
	   }
	 public void Search_Textbox_availability() {
		 
		   driver.findElement(Search_Textbox_availability).isDisplayed();
	 }

	}


