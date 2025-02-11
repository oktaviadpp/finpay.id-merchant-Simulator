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

WebUI.callTestCase(findTestCase('Tools Ops/QRIS Monitoring Teman Bus/01_Klik menu dan sub menu Tools Ops_Qris Monitoring Teman Bus'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/input_StartDate'), '01-07-2024')

WebUI.click(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/activeDay'))

not_run: WebUI.setText(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/input_EndDate'), '10-06-2024')

not_run: WebUI.click(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/activeDay'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/button_SendData'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/title_PopUpMsg'), 5)

WebUI.verifyElementText(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/title_PopUpMsg'), succes)

WebUI.click(findTestObject('Tools Ops/QRIS Monitoring Teman Bus/button_OKPopUpMsg'))

WebUI.refresh()

