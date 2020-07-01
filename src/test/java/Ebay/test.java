packag Ebay;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Home_page;
import Utilities.Reusable;

public class test extends Reusable {
	Home_page home = new Home_page();

	public test() throws IOException {
		super();
	}

	@BeforeMethod
	public void initialize() throws IOException {
		Reusable s = new Reusable();
		s.init();

	}

	@Test(priority = 1)

	public void search_available()

	{
		home.Search_Avaialble();
		home.Search_Textbox_availability();
	}

	@Test(priority = 2)
	public void Search_text() {

		home.Searchtext();
	}

	@AfterMethod
	public void Teardown() {

		Reusable.driver.quit();

	}
}
