# Veltra QA Assessment 2
```
This repo and scripts are executively for fullfilling the requirement for QA position in Veltra.
```
## 1. Introduction
This assessment is developed by using:
>Katalon Studio

Framework used in the project:
> Hybrid [Keyword Driven Framework + Page Object Model + Data Driven Framework]

Programming Language used:
> Groovy (Java)

Browser use for test:
> Chrome 

## 2. Prequisite

You need these tools before running this test cases in this project:

2.1. Katalon Studio
- Please refer to the **link below** for a detail instruction on downloading and install Katalon Studio into your machines (Window & Mac OS)

- Link: [Install Katalon Studio on macOS/Windows
](https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows)


2.2. ChromeDriver 
- Please ensure you had installed a chromedriver in your machine. The chromedriver need to be the same version as your browser. 


## 3. Download and extract project into Machine

*The assessment is submited through a Google form and the project is zipped (.zip) prior submission.*

3.1 Download the `Umira_Assessment2.zip` from the Google form

3.2 Extract the downloaded `Umira_Assessment2.zip` into your machine.

## 4. Import the extracted project into the Katalon Studio

4.1 Open Katalon Studio
- You should be able to see the **Start Page** and the **Open Project** button located a the top left side of the Katalon Studio. [Refer this image for detail.](https://ibb.co/mGfsDs6)

4.2 Open project into Katalon Studio
- Click onto the `Open Project` button and choose the extracted Project folder.

## 5. Running test 
*In order to run all the test cases sequentially, a test suite collection was created.* *`Assessment2` is our test suite collection*

5.1 On the left side menu, expand the `Test Suites` 

5.2 Double click on `Assessment2` to open the test suite collection.

5.3 On the test suites collection page, click onto the `Execute` button. [Refer here for better visualization](https://ibb.co/ZhmJFHS) 

- If an error detected regarding the version of chromedriver causes failure [Example as this image](https://ibb.co/6RQhWDx), please update the chromedriver through Katalon Studio. Detail steps are in the FAQ section below.

5.4 While test is running, progress can be monitor through the `Job Progress` section which will automatically triggered upon running the test. [Refer here for better visualization](https://ibb.co/QpW8Qmb)

 ## 6. Test Result report

6.1 Test result execution can be refer in the `Result` tab of the test suites collection. [Refer here for better visualization](https://ibb.co/VggXCY6)

6.2 For detail test result, please refer the Test Result doc included in the zip file

## 7. FAQ
7.1 RECEIVE an error [chromedriver outdated](https://ibb.co/6RQhWDx) while running the code. We can update chromedriver in the katalon studio.

- On the Katalon top menu bar. Go to:
```
Tools >> Update Webdriver >> Choose your browser 
```
*The test suites collection execution setting is set to be Chrome. Please choose chrome as your browser*