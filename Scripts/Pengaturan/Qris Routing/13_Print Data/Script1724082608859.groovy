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
//take screenshot pop up dialog print
import java.awt.Rectangle as Rectangle
import java.awt.Toolkit as Toolkit
import java.awt.Robot as Robot
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO
import java.io.File as File

not_run: WebUI.callTestCase(findTestCase('Pengaturan/Qris Routing/00_Klik menu dan sub menu Pengaturan_Qris Routing'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pengaturan/Qris Routing/button_Print'))

// Screenshot dialog pop up print
Robot robot = new Robot()

Thread.sleep(10000)

Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())

BufferedImage screenCapture = robot.createScreenCapture(screenSize)

File outputFile = new File('print data Qris Routing.png')

ImageIO.write(screenCapture, 'png', outputFile)

//
WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.refresh()

