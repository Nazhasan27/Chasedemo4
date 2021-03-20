package chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobFilterLocators {

	@FindBy(xpath = "//body/div[1]/div[6]/main[1]/div[1]/div[2]/div[8]/section[1]/div[1]/div[1]/div[1]/p[1]/span[1]/a[5]")
	public WebElement careersLink;

	@FindBy(xpath = "//*[@id='main']/div/div[2]/div/div[1]/div[2]/div/p/a")
	public WebElement exploreOpp;
	
	@FindBy(xpath = "//button[contains(text(),'View all jobs')]")
	public WebElement viewAllJobs;
	
	@FindBy(xpath = "//input[@id='keyword']")
	public WebElement jobSearchBar;
	
	@FindBy(xpath = "//body/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/search-box-input-form[1]/form[1]/button[2]/span[1]")
	public WebElement jobSearchBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Open Jobs')]")
	public WebElement posJobSearch;

	@FindBy(xpath = "//a[contains(text(),'Join the Network')]")
	public WebElement negJobSearch;
	
	
	}
