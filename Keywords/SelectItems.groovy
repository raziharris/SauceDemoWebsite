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

public class SelectItems {


	private static final TestObject Bagpack = ObjectRepository.findTestObject('Object Repository/Items/Button_bagpack')
	private static final TestObject BikeLight = ObjectRepository.findTestObject('Object Repository/Items/Button_BikeLight')
	private static final TestObject Tshirt = ObjectRepository.findTestObject('Object Repository/Items/Button_T-shirt')
	private static final TestObject Jacket = ObjectRepository.findTestObject('Object Repository/Items/Button_Jacket')
	private static final TestObject Onesie = ObjectRepository.findTestObject('Object Repository/Items/Button_Onesie')
	private static final TestObject TshirtRed = ObjectRepository.findTestObject('Object Repository/Items/Button_ShirtRed')


	static void Bagpack() {
		WebUI.scrollToElement(Bagpack,0)
		WebUI.click(Bagpack)
	}
	static void BikeLight() {
		WebUI.scrollToElement(BikeLight,0)
		WebUI.click(BikeLight)
	}
	static void Tshirt() {
		WebUI.scrollToElement(Tshirt,0)
		WebUI.click(Tshirt)
	}
	static void Jacket() {
		WebUI.scrollToElement(Jacket,0)
		WebUI.click(Jacket)
	}
	static void Onesie() {
		WebUI.scrollToElement(Onesie,0)
		WebUI.click(Onesie)
	}
	static void TshirtRed() {
		WebUI.scrollToElement(TshirtRed,0)
		WebUI.click(TshirtRed)
	}
}
