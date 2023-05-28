package task

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import helper.Helper
import commonUtilities.CommonFunctions


public class Task2 {

	def expectedText
	def actualText

	Task2_object object = new Task2_object()
	CommonFunctions common = new CommonFunctions()

	@Keyword
	def navigatetopage(String page) {

		def description

		WebUI.maximizeWindow()

		switch (page) {

			case "About Us":

				expectedText = 'Whether you know exactly where you want to go, or you are looking for some ideas, '+
				'VELTRA has over 4,500 tours and activities around the world waiting for you to discover. '+
				'With new destinations continually added, VELTRA will change your life one visit at a time,'+
				' in fact, by simply re-arranging the letters, "VELTRA" changes "TRAVEL".'

				WebUI.scrollToElement(object.btn_footer("About Us"), 0)
				WebUI.delay(50)
				WebUI.waitForElementPresent(object.btn_footer("About Us"), 0, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(object.btn_footer("About Us"))
				actualText = WebUI.getText(object.txt_description())
				WebUI.verifyMatch(actualText, expectedText, false)
				break

			case "See All 5-Star Reviews":

				expectedText = 'MOST RECENT 5-STAR REVIEWS'

				WebUI.delay(30)
				WebUI.scrollToElement(object.btn_see_all_reviews(), 0)
				WebUI.delay(30)
				WebUI.click(object.btn_see_all_reviews())
				actualText = WebUI.getText(object.txt_page_header())
				WebUI.verifyMatch(actualText, expectedText, false)
				break
		}
	}

	@Keyword
	def change_language(String language) {

		def webURL
		def currentWebURL

		WebUI.maximizeWindow()
		WebUI.delay(50)
		WebUI.click(object.dropdown_language_menu())

		if (language == "jp") {

			//get the Japan web URL from data file
			webURL = common.getURL("veltra_jp")
			WebUI.click(object.txt_jp())
			WebUI.delay(30)

			//verification of webURL
			currentWebURL = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyMatch(currentWebURL, webURL, false)

			//Verification text in the web
			expectedText = "保存リスト"
			actualText = WebUI.getText(object.txt_jp_save_list())
			WebUI.verifyMatch(actualText, expectedText, false)

		} else if (language == "English (PH)") {

			//click onto English (PH) language option
		} else {

			//click onto English (International)
		}
	}
}


