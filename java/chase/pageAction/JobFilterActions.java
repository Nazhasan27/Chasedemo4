package chase.pageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import chase.pageElements.JobFilterLocators;
import chase.utilities.SetupDrivers;

public class JobFilterActions {

	JobFilterLocators JobFilterLocatorsObj;

	public JobFilterActions() {

		this.JobFilterLocatorsObj = new JobFilterLocators();
		PageFactory.initElements(SetupDrivers.driver, JobFilterLocatorsObj);
		SetupDrivers.driver.get("https://www.chase.com/");

	}

	public void ChaseHomepage() {
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();

	}

	public void careersLink() throws Throwable {
		JobFilterLocatorsObj.careersLink.click();
		Thread.sleep(2000);
	}
	
	public void exploreOpp() throws Throwable {
		JobFilterLocatorsObj.exploreOpp.click();
		Thread.sleep(2000);
	}
	
	public void viewAllJobs() throws Throwable {
		JobFilterLocatorsObj.viewAllJobs.click();
		Thread.sleep(2000);
	}
	
	public void jobSearchBar (String Role)throws Exception{
		if (Role.equals("Software Engineering ")){
			JobFilterLocatorsObj.jobSearchBar.sendKeys("Software Engineering");
			JobFilterLocatorsObj.jobSearchBtn.click();
		}else if (Role.equals("Spiderman")){
			JobFilterLocatorsObj.jobSearchBar.sendKeys("Spiderman");
			JobFilterLocatorsObj.jobSearchBtn.click();
		}else if (Role.equals("&%%&%$")){
			JobFilterLocatorsObj.jobSearchBar.sendKeys("&%%&%$");
			JobFilterLocatorsObj.jobSearchBtn.click();}
	}
	
		public void VerifyZipcode(String Role)throws Exception{
			if (Role.equals("Software Engineering")){
				JobFilterLocatorsObj.posJobSearch.isDisplayed();

		}else if (Role.equals("11")){
			JobFilterLocatorsObj.negJobSearch.isDisplayed();
	
		}else if (Role.equals("&%%&%$")){
			JobFilterLocatorsObj.negJobSearch.isDisplayed();}

		}
}
