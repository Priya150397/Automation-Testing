package org.stepdefinition;

import org.sample.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundClass extends BaseClass{
	
@Before
private void precondition() {
	launchBrowser();
	windowMaximize();
}

@After
private void postcondition() {
	closeEntireBrowser();

}

}
