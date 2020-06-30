package Base;

import Utilities.Reusable;

public class Search_page extends Reusable {
	
	public void Searchtext() {
		
		driver.findElement(Search_Text).sendKeys(prop.getProperty("text"));
		driver.findElement(Search_availability).click();
	}
			
}
