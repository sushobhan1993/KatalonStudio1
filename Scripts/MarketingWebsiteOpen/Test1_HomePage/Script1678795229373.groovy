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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://earthwp.magicmindtechnologies.com/dominion-latest-wp/')

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/img_Benefits_semester-icon'))

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/span_DOMINION PREP'))

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Dominion Prep/input_Please fill out this field_email-13'), 'sen@yopmail.com')

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/a_FAQ'))

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/input_ANYTHING_wpcf7-form-control has-spinn_06dc37'))

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/label_This field is required'))

WebUI.setText(findTestObject('Object Repository/Page_Dominion Prep/input_ANYTHING_your-name'), 'Sushobhan')

WebUI.setText(findTestObject('Object Repository/Page_Dominion Prep/input_ANYTHING_your-email'), 'sen@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Dominion Prep/input_ANYTHING_your-question'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/input_ANYTHING_wpcf7-form-control has-spinn_06dc37'))

WebUI.click(findTestObject('Object Repository/Page_Dominion Prep/a_Terms  Conditions'))

