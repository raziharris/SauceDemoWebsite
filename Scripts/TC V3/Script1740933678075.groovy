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

import LoginPage
import SelectItems


import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Load test data from Excel
TestData data = TestDataFactory.findTestData("DataFile")

// Retrieve values manually from the first row (Change row index if needed)
String username = data.getValue(1, 1)  // Column 1, Row 1
String password = data.getValue(2, 1)  // Column 2, Row 1
String bagpack = data.getValue(3, 1)   // Column 3, Row 1
String bikeLight = data.getValue(4, 1) // Column 4, Row 1
String tshirt = data.getValue(5, 1)    // Column 5, Row 1
String jacket = data.getValue(6, 1)    // Column 6, Row 1
String onesie = data.getValue(7, 1)    // Column 7, Row 1
String tshirtRed = data.getValue(8, 1) // Column 8, Row 1

// Open browser and login using test data
WebUI.openBrowser('https://www.saucedemo.com/')
LoginPage.login(username, password)

WebUI.takeScreenshot()

// Select items based on the values retrieved from Excel
if (bagpack == "Y") {
    SelectItems.Bagpack()
}
if (bikeLight == "Y") {
    SelectItems.BikeLight()
}
if (tshirt == "Y") {
    SelectItems.Tshirt()
}
if (jacket == "Y") {
    SelectItems.Jacket()
}
if (onesie == "Y") {
    SelectItems.Onesie()
}
if (tshirtRed == "Y") {
    SelectItems.TshirtRed()
}

// Take screenshot and close browser
WebUI.takeScreenshot()
WebUI.closeBrowser()
