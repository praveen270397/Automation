package Ebay;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Home_page;
import Base.Search_page;
import Utilities.Reusable;

public class test {
	Home_page home = new Home_page();
	Search_page search = new Search_page();

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
	public void Search_text() 
	{
		
		search.Searchtext();
	}


