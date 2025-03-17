import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject 
import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.TestData





ExcelData data = TestDataFactory.findTestData("DataFile")
	
//-- Open Browser and Login

	WebUI.openBrowser('https://www.saucedemo.com/')
	LoginPage.login(GlobalVariable.Username, GlobalVariable.Password)
	WebUI.takeScreenshot()
	
//-- Select Item
	
	if (Bagpack == "Y") {
	    SelectItems.Bagpack()
	}
	if (BikeLight == "Y") {
	    SelectItems.BikeLight()
	}
	if (Tshirt == "Y") {
	    SelectItems.Tshirt()
	}
	if (Jacket == "Y") {
	    SelectItems.Jacket()
	}
	if (Onesie == "Y") {
	    SelectItems.Onesie()
	}
	if (TshirtRed == "Y") {
	    SelectItems.TshirtRed()
	    WebUI.takeScreenshot()
	}

//-- Add and Checkout Items
	
	CheckoutItem.AddAndCheckout()
	
	
	
 	WebUI.closeBrowser()
	 
 


