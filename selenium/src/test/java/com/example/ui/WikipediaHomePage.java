package com.example.ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WikipediaHomePage extends BasePage<AndroidDriver<AndroidElement>> {
	
	@AndroidFindBy(id = "org.wikipedia:id/search_container")
	private AndroidElement layoutSearch;
	
	public WikipediaHomePage(AppiumDriver<?> driver) {
		super(driver);
	}
	
	public SearchPage openSearch() {
		
		click(layoutSearch);
		return new SearchPage(getDriver());
	}

	private AppiumDriver<?> getDriver() {
		return null;
	}

	private void click(AndroidElement layoutSearch2) {
		
	}
}
