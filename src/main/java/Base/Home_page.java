package Base;

	import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
	

import Utilities.Reusable;


	public class Home_page  {
		
		private By Search_availability = By.id("gh-btn");
		private By Search_Textbox_availability = By.id("gh-ac-box");
		private By Search_Text = By.id("gh-ac");		


     		
		public void Search_Avaialble() {
		
		   try {
			   
			   Reusable.driver.findElement(Search_availability).isDisplayed();
		   
		   }
		   
		   catch(NoSuchElementException  e)
		   {
			   
			   e.printStackTrace();
		   }
	   }
	 public void Search_Textbox_availability() {
		 
		 Reusable.driver.findElement(Search_Textbox_availability).isDisplayed();
	 }

	 public void Searchtext() {
		 
			
		 Reusable.driver.findElement(Search_Text).sendKeys(Reusable.prop.getProperty("text"));
		 Reusable.driver.findElement(Search_availability).click();
		
			 
			 
		 
		 
			
	
	
	}}


