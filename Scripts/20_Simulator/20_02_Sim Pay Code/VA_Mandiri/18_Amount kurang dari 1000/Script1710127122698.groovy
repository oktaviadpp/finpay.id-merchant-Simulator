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

not_run: WebUI.callTestCase(findTestCase('Login/01_successfullyLoginInternalAccount'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('20_Simulator/20_02_Sim Pay Code/02_klik menu dan sub menu Simulator Payment Code'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('20_Simulator/20_02_Sim Pay Code/inputPayCode'), '880270000081260')

WebUI.takeScreenshot()

WebUI.click(findTestObject('20_Simulator/20_02_Sim Pay Code/buttonInquiry'))

WebUI.waitForElementPresent(findTestObject('20_Simulator/20_02_Sim Pay Code/textTitleCardSimFinpay'), 5)

WebUI.verifyElementPresent(findTestObject('20_Simulator/20_02_Sim Pay Code/textTitleCardSimFinpay'), 5)

WebUI.verifyElementPresent(findTestObject('20_Simulator/20_02_Sim Pay Code/textPayCode'), 5)

WebUI.verifyElementPresent(findTestObject('20_Simulator/20_02_Sim Pay Code/textCustName'), 5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('20_Simulator/20_02_Sim Pay Code/inputAmount'), '999')

WebUI.takeScreenshot()

WebUI.click(findTestObject('20_Simulator/20_02_Sim Pay Code/buttonPayment'))

WebUI.waitForElementPresent(findTestObject('20_Simulator/20_02_Sim Pay Code/titlePopUpMessages'), 5)

WebUI.verifyElementPresent(findTestObject('20_Simulator/20_02_Sim Pay Code/titlePopUpMessages'), 5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('20_Simulator/20_02_Sim Pay Code/buttonOKpopUp'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('20_Simulator/20_02_Sim Pay Code/buttonBacktoInq'))

WebUI.takeScreenshot()

WebUI.refresh()

