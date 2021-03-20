package chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageCalcLocators {

	@FindBy(xpath = "//*[@id=\"slick-slide04\"]/a/div[1]")
	public WebElement homeLoan;

	@FindBy(xpath = "//*[@id=\"Module3\"]/div/div/div[2]/div[1]/div/div/div/div[3]/a[1]")
	public WebElement getStartedBtn;

	@FindBy(xpath = "//*[@id=\"SubHeaderOriginal\"]/ul/li[3]/a")
	public WebElement calculatorLink;

	@FindBy(xpath = "//body/div[1]/div[5]/main[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
	public WebElement mortCalcImg;

}
