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

WebUI.navigateToUrl('https://talent.nexta.id/')

WebUI.click(findTestObject('Object Repository/View Category/Page_Smarthub App/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/View Category/Page_Smarthub App/input_Login with EmailPassword_email'), 
    'tallen@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/View Category/Page_Smarthub App/input_Login with EmailPassword_password'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.sendKeys(findTestObject('Object Repository/View Category/Page_Smarthub App/input_Login with EmailPassword_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/View Category/Page_Dashboard  Insights/button_Toggle Sidebar'))

WebUI.click(findTestObject('Object Repository/View Category/Page_Dashboard  Insights/div_Masterdata'))

WebUI.click(findTestObject('Object Repository/View Category/Page_Dashboard  Insights/a_Category'))

WebUI.click(findTestObject('Object Repository/View Category/Page_Masterdata  Category/html_katalonfont-familymonospacefont-size13_0fa88e'))

WebUI.click(findTestObject('Object Repository/View Category/Page_Masterdata  Category/div_Get Info'))

WebUI.closeBrowser()

