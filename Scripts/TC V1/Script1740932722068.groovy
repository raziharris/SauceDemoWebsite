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


TestData data = TestDataFactory.findTestData("DataFile")

int rowCount = data.getRowNumbers()

for (int row = 1; row <= rowCount; row++) {
    WebUI.openBrowser('https://www.saucedemo.com/')
    String username = data.getValue("Username", row)
    String password = data.getValue("Password", row)
    String bagpack = data.getValue("Bagpack", row)
    String bikeLight = data.getValue("BikeLight", row)
    String tshirt = data.getValue("Tshirt", row)
    String jacket = data.getValue("Jacket", row)
    String onesie = data.getValue("Onesie", row)
    String tshirtRed = data.getValue("TshirtRed", row)

WebUI.openBrowser('https://www.saucedemo.com/')
LoginPage.login(GlobalVariable.Username, GlobalVariable.Password)
WebUI.takeScreenshot()

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
    
    WebUI.takeScreenshot()
    WebUI.closeBrowser()
}}


