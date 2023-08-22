package com.webmath_package;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import dev.failsafe.internal.util.Assert;

public class Components_Methods extends Browser_page {
	
	public void Loginfo(String message) {
		System.out.println("Info :" +message);
	}
  public void clickonmathforeveryone () {
	  Loginfo("clickonmathforeveryone " + "ExecuationStarted");
	  try { driver.findElement(Object_Respository.mathForEveryone);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  
  public void verifymatheveryonepageisdisplayed() {
	  Loginfo("verifymatheveryonepageisdisplayed" + " execuationStarted");
	  try {
		String matheveryonepageisdisplayed = driver.findElement(Object_Respository.textFromAboutWebMathPage).getText();
		
	  } catch (Exception e) {
		// TODO: handle exception
	}}
	  public void clickOnChooseMathHelpItemDropdown() {
		  Loginfo("clickOnChooseMathHelpItemDropdown" + " execuationStarted");
		  try {
			 
					driver.findElement(Object_Respository.chooseMathHelpItemDropdown).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
  }
  
	  public void clickOnGoButton() {
		  Loginfo("clickOnChooseMathHelpItemDropdown" + " execuationStarted");
		  try {
			  driver.findElement(Object_Respository.goButton).click();
			} catch (Exception e) {
		} 
			// TODO: handle exception
		}
		 	public void homepageisdisplayed() {
		 		  Loginfo("homepageisdisplayed" + " execuationStarted");	
		 		  try {
					String homepageisdisplayed = 
							driver.findElement(Object_Respository.textFromHomePage).getText();
				
		 		  } catch (Exception e) {
					// TODO: handle exception
				}
	  }
  
  public void clickonfiguringatip() {
	  Loginfo("clickonfiguringatip" + " execuationStarted");
	  try {
		  driver.findElement(Object_Respository.figuringATip).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  public void verifytipcalculatorisdisplayed() {
	  Loginfo("verifytipcalculatorisdisplayed" + " execuationStarted");
	  try {
		String verifytipcalculatorisdisplayed = 
				driver.findElement(Object_Respository.textFromTipCalculator).getText();	
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  
  public void clickonsalesonprice() {
	  Loginfo("clickonsalesonprice" + " execuationStarted");
	  try {
			driver.findElement(Object_Respository.salePrice).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  
  public void salepricecalculatorisdisplayed() {
	  Loginfo("salepricecalculatorisdisplayed" + " execuationStarted");
	  try {
	String salepricecalculatorisdisplayed =
			driver.findElement(Object_Respository.textFromSalePriceCalculator).getText();	
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  public void clickonwindchill() {
	  Loginfo("clickonwindchill" + " execuationStarted");
	  try {
		driver.findElement(Object_Respository.windChill).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
	  
  }
  public void windchillpageisdisplayed() {
	  Loginfo("windchillpageisdisplayed()" + " execuationStarted");
	  try {
		String windchillpageisdisplayed=
	driver.findElement(Object_Respository.textFromWindChillTemperature)	.getText();		
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  public void clickoncountcoins() {
	  Loginfo("clickoncountcoins" + " execuationStarted");
	  try {
		  driver.findElement(Object_Respository.countCoins).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  
  public void countcoinsisdisplaced() {
	  Loginfo("countcoinsisdisplaced" + " execuationStarted");
	  try {
		String countcoinsisdisplaced = 
				 driver.findElement(Object_Respository.textFromCountCoinsPage).getText();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  public void clickOnLotteryOdds() {
	  Loginfo("clickOnLotteryOdds" + " execuationStarted");
	  try {
		  driver.findElement(Object_Respository.lotteryOdds).click();
	} catch (Exception e) {
		// TODO: handle exception
	} 
  }
  public void LotteryOddsisdisplayed() {
	  Loginfo("LotteryOddsisdisplayed" + " execuationStarted");
	  try {
		  String clickoncountcoinsisdisplaced = 
					 driver.findElement(Object_Respository.textFromLotteryOddsPage).getText();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
  
  
  public void clickOnSimpleInterest() {
	  Loginfo("clickOnSimpleInterest" + " execuationStarted");
	  try {
		  driver.findElement(Object_Respository.simpleInterest).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
  
  public void SimpleInterestisdisplayed() {
	  Loginfo("SimpleInterestisdisplayed" + " execuationStarted");
	  try {
		  String clickonSimpleInterestisdisplayed = 
					 driver.findElement(Object_Respository.textFromSimpleInterestCalculator).getText();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }

  public void clickOnCompoundInterest() {
	  Loginfo("clickOnSimpleInterest" + " execuationStarted");
	  try {
		 
					 driver.findElement(Object_Respository.compoundInterest).click();;
	} catch (Exception e) {
		// TODO: handle exception
	}}
	  
	  public void CompoundInterestisdisplayed() {
		  Loginfo("CompoundInterestisdisplayed" + " execuationStarted");
		  try {
			  String clickOnCompoundInterestisdisplayed = 
						 driver.findElement(Object_Respository.textFromCompoundInterestCalculator).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}}
	  
		  public void clickOnRetirement() {
			  Loginfo("clickOnRetirement" + " execuationStarted");
			  try {
				 
							 driver.findElement(Object_Respository.retirement).click();;
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  public void Retirementpageisdisplayed() {
			  Loginfo("Retirementpageisdisplayed" + " execuationStarted");
			  try {
				  String Retirementpageisdisplayed = 
							 driver.findElement(Object_Respository.textFromRetirementPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  public void clickOnALoan() {
				Loginfo("clickOnALoan" + " execuation started");
				try {
					driver.findElement(Object_Respository.aLoan).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		  public void ALoanpageisdisplayed() {
			  Loginfo("ALoanpageisdisplayed" + " execuationStarted");
			  try {
				  String ALoanpageisdisplayed = 
							 driver.findElement(Object_Respository.textFromALoanPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		  public void clickOnLength() {
				Loginfo("clickOnLength" + " execuation started");
				try {
					driver.findElement(Object_Respository.length).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		  
		  
		  public void Lengthpageisdisplayed() {
			  Loginfo("Lengthpageisdisplayed" + " execuationStarted");
			  try {
				  String Lengthpageisdisplayed = 
							 driver.findElement(Object_Respository.textFromLengthPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		  public  void clickOnMass() {
				Loginfo("clickOnMass " + " execuation started");
				try {
					driver.findElement(Object_Respository.mass).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		  
		  public void Masspageisdisplayed() {
			  Loginfo("Masspageisdisplayed" + " execuationStarted");
			  try {
				  String Masspageisdisplayed = 
							 driver.findElement(Object_Respository.textFromMassPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		  public  void clickOnArea() {
				Loginfo("clickOnArea " + " execuation started");
				try {
					driver.findElement(Object_Respository.area).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		  public void areapageisdisplayed() {
			  Loginfo("areapageisdisplayed" + " execuationStarted");
			  try {
				  String areapageisdisplayed = 
							 driver.findElement(Object_Respository.textFromAreaPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		  public  void clickOnVolume() {
				Loginfo("clickOnVolume " + " execuation started");
				try {
					driver.findElement(Object_Respository.volume).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		  
		  public void Volumepageisdisplayed() {
			  Loginfo("Volumepageisdisplayed" + " execuationStarted");
			  try {
				  String Volumepageisdisplayed = 
							 driver.findElement(Object_Respository.textFromVolumePage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		  public  void clickOnSpeed() {
				Loginfo("clickOnSpeed " + " execuation started");
				try {
					driver.findElement(Object_Respository.speed).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		  public void Speedpageisdisplayed() {
			  Loginfo("Speedpageisdisplayed" + " execuationStarted");
			  try {
				  String Speedpageisdisplayed = 
							 driver.findElement(Object_Respository.textFromSpeedPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		  public  void clickOnPower() {
				Loginfo("clickOnPower " + " execuation started");
				try {
					driver.findElement(Object_Respository.power).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		  public void Powerpageisdisplayed() {
			  Loginfo("Powerpageisdisplayed" + " execuationStarted");
			  try {
				  String Powerpageisdisplayed = 
							 driver.findElement(Object_Respository.textFromPowerPage).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		  
		   public  void clickOnTemps() {
				Loginfo("clickOnTemps " + " execuation started");
				try {
					driver.findElement(Object_Respository.temps).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		   public void Tempspageisdisplayed() {
				  Loginfo("Tempspageisdisplayed" + " execuationStarted");
				  try {
					  String Tempspageisdisplayed = 
								 driver.findElement(Object_Respository.textFromTempsPage).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   public  void clickOnElectricity() {
				Loginfo("clickOnElectricity " + " execuation started");
				try {
					driver.findElement(Object_Respository.costOfElectricity).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		   public void Electricitypageisdisplayed() {
				  Loginfo("Electricitypageisdisplayed" + " execuationStarted");
				  try {
					  String Electricitypageisdisplayed = 
								 driver.findElement(Object_Respository.textFromCostOfElectricityPage).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   public  void clickOnWeightOnAnotherPlanet() {
				Loginfo("clickOnWeightOnAnotherPlanet " + " execuation started");
				try {
					driver.findElement(Object_Respository.weightOnAnotherPlanet).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void WeightOnAnotherPlanetpageisdisplayed() {
				  Loginfo("WeightOnAnotherPlanetpageisdisplayed" + " execuationStarted");
				  try {
					  String Electricitypageisdisplayed = 
								 driver.findElement(Object_Respository.textFromWeightOnAnotherPLanetCalculator).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   public  void clickonHomeInFooter() {
				Loginfo("clickOnHomeInFooter " + " execuation started");
				try {
					driver.findElement(Object_Respository.homeInFooter).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void Footerpageisdisplayed() {
				  Loginfo("Footerpageisdisplayed" + " execuationStarted");
				  try {
					  String Footerpageisdisplayed = 
								 driver.findElement(Object_Respository.textFromHomePage).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   public  void clickonContactUs() {
				Loginfo("clickOnContactUs " + " execuation started");
				try {
					driver.findElement(Object_Respository.contactUs).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void ContactUspageisdisplayed() {
				  Loginfo("ContactUspageisdisplayed" + " execuationStarted");
				  try {
					  String ContactUspageisdisplayed = 
								 driver.findElement(Object_Respository.textFromContactPage).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   
		   public  void clickonAboutWebmath() {
				Loginfo("clickOnAboutWebmath " + " execuation started");
				try {
					driver.findElement(Object_Respository.aboutWebMath).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void AboutWebmathpageisdisplayed() {
				  Loginfo("AboutWebmathpageisdisplayed" + " execuationStarted");
				  try {
					  String AboutWebmathpageisdisplayed = 
								 driver.findElement(Object_Respository.textFromAboutWebMathPage).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   
		   public  void clickonWhyWebmath() {
				Loginfo("clickOnWhyWebmath" + " execuation started");
				try {
					driver.findElement(Object_Respository.whyWebMath).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void WhyWebmathpageisdisplayed() {
				  Loginfo("WhyWebmathpageisdisplayed" + " execuationStarted");
				  try {
					  String AboutWebmathpageisdisplayed = 
								 driver.findElement(Object_Respository.textFromAboutWebMathPage).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   
		   
		   public  void clickonWebsiteMap() {
				Loginfo("clickOnWebsiteMap" + " execuation started");
				try {
					driver.findElement(Object_Respository.websiteMap).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void WebsiteMappageisdisplayed() {
				  Loginfo("WebsiteMappageisdisplayed" + " execuationStarted");
				  try {
					  String AboutWebmathpageisdisplayed = 
								 driver.findElement(Object_Respository.textFromWebsiteMap).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   
		   public  void clickonPrivacyPolicy() {
				Loginfo("clickOnPrivacyPolicy" + " execuation started");
				try {
					driver.findElement(Object_Respository.privacyPolicy).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		   public void PrivacyPolicypageisdisplayed() {
				  Loginfo("PrivacyPolicypageisdisplayed" + " execuationStarted");
				  try {
					  String AboutWebmathpageisdisplayed = 
								 driver.findElement(Object_Respository.textFromPrivacyPolicy).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		   
}