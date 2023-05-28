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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Task2_object {

	def btn_footer(String footer_text) {
		
		TestObject btn_footer = findTestObject('Homepage/btn_footer', [('footer_text') : footer_text])
	}
	
	def btn_see_all_reviews() {
		
		TestObject btn_see_all_reviews = findTestObject('Homepage/btn_see_all_reviews')
	}
	
	def dropdown_language_menu() {
		
		TestObject dropdown_language_menu = findTestObject('Homepage/dropdown_language_menu')
	}
	
	def txt_description() {
		
		TestObject txt_description = findTestObject('About Us page/txt_description')
	}
	
	def txt_page_header() {
		
		TestObject txt_page_header = findTestObject('Reviews page/txt_page_header')
	}
	
	def txt_jp() {
		
		TestObject txt_jp = findTestObject('Homepage/txt_jp')
	}
	
	def txt_jp_save_list() {
		
		TestObject txt_jp_save_list = findTestObject('Homepage/txt_jp_save_list')
	}
}
