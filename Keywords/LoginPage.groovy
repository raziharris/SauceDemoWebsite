import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ObjectRepository

import internal.GlobalVariable


public class LoginPage {

	private static final TestObject usernameField = ObjectRepository.findTestObject('Object Repository/LoginPage/Input_username')
	private static final TestObject passwordField = ObjectRepository.findTestObject('Object Repository/LoginPage/Input_password')
	private static final TestObject loginButton = ObjectRepository.findTestObject('Object Repository/LoginPage/Button_Login')

	private static final TestObject Bagpack = ObjectRepository.findTestObject('Object Repository/Items/Button_bagpack')
	private static final TestObject BikeLight = ObjectRepository.findTestObject('Object Repository/Items/Button_BikeLight')
	private static final TestObject RedShirt = ObjectRepository.findTestObject('Object Repository/Items/Button_ShirtRed')

	static void login(String username, String password) {
		WebUI.setText(usernameField, username)
		WebUI.setText(passwordField, password)
		WebUI.click(loginButton)
	}

	static void selectItemList() {
		WebUI.click(Bagpack)
		WebUI.scrollToElement(BikeLight, 0)
		WebUI.click(BikeLight)
		WebUI.scrollToElement(RedShirt, 0)
		WebUI.scrollToElement(RedShirt, 0)
	}
}

