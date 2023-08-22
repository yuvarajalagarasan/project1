import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.webmath_package.Browser_page;
import com.webmath_package.Components_Methods;

import pompage.Test;

public class Webmath_Testcases extends Components_Methods {
	
	Browser_page lp;
	@BeforeMethod
	public void browsersetup() {
		lp = new Browser_page();
		lp.intialization("chrome");
	}
	@org.testng.annotations.Test
	
	public void logintest() {
		clickonmathforeveryone();
		verifymatheveryonepageisdisplayed();
		clickOnChooseMathHelpItemDropdown();
		clickOnGoButton();
		homepageisdisplayed();
		clickonmathforeveryone();
		clickonfiguringatip();
		verifytipcalculatorisdisplayed();
		clickonmathforeveryone();
		clickonsalesonprice();
		salepricecalculatorisdisplayed ();
		clickonmathforeveryone();
		clickonwindchill();
		windchillpageisdisplayed();
		clickonmathforeveryone();
		clickoncountcoins();
		countcoinsisdisplaced();
		clickonmathforeveryone();
		clickOnLotteryOdds();
		LotteryOddsisdisplayed();
		clickonmathforeveryone();
		clickOnSimpleInterest();
		SimpleInterestisdisplayed();
		clickonmathforeveryone();
		clickOnCompoundInterest();
		CompoundInterestisdisplayed();
		clickonmathforeveryone();
		clickOnRetirement();
		Retirementpageisdisplayed();
		clickonmathforeveryone();
		clickOnALoan();
		ALoanpageisdisplayed();
		clickonmathforeveryone();
		clickOnLength();
		Lengthpageisdisplayed();
		clickonmathforeveryone();
		clickOnMass();
		Masspageisdisplayed();
		clickonmathforeveryone();
		clickOnArea();
		areapageisdisplayed();
		clickonmathforeveryone();
		clickOnVolume();
		Volumepageisdisplayed();
		clickonmathforeveryone();
		clickOnSpeed();
		Speedpageisdisplayed();
		clickonmathforeveryone();
		clickOnPower();
		Powerpageisdisplayed();
		clickonmathforeveryone();
		clickOnTemps();
		Tempspageisdisplayed();
		clickonmathforeveryone();
		clickOnElectricity();
		Electricitypageisdisplayed();
		clickonmathforeveryone();
		clickOnWeightOnAnotherPlanet();
		WeightOnAnotherPlanetpageisdisplayed();
		clickonmathforeveryone();
		clickonHomeInFooter();
		Footerpageisdisplayed();
		clickonmathforeveryone();
		clickonContactUs();
		ContactUspageisdisplayed();
		clickonmathforeveryone();
		clickonAboutWebmath();
		AboutWebmathpageisdisplayed();
		clickonmathforeveryone();
		clickonWhyWebmath();
		WhyWebmathpageisdisplayed();
		clickonmathforeveryone();
		clickonWebsiteMap();
		WebsiteMappageisdisplayed();
		clickonmathforeveryone();
		clickonPrivacyPolicy();
		PrivacyPolicypageisdisplayed();

	}
	@AfterTest
void closebrowser() {
	driver.close();
}
}
