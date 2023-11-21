### Java-Selenium
1. Selenium
2. Automation Framework
3. Core Java
4. Miscellaneous

**Topics:**
1. Selenium WebDriver
2. Selenium 4.0 CDP Protocol
3. Selenium Grid
4. TestNG
5. Maven
6. ANT
7. Jenkins
8. Log4j
9. Extent Test Execution Reports
10. Parallel Test Execution
11. Cucumber
12. Data Driven Framework
13. Hybrid Framework
14. Page Object Model Framework
15. Database Testing with Selenium
16. Performance Testing with Selenium
17. Cloud Automation with Sauce Labs
18. AutoIT - Desktop Automation Integration with Selenium

Selenium is a parent which releases multiple products.
**Selenium is a suite of tools to automate web browsers across many platforms. Primarily it is for automating Web Applications
for testing purposes, but is certainly not limited to just that.Boring web-based administration tasks can (and should) 
also be automated as well.**

**Suite of Tools:**
- Selenium WebDriver (Helps to create robust regression test suite)
- Selenium IDE (Record and Playback tool)
- Selenium Grid

**Selenium WebDriver:**
- If you want to create robust, browser-based regression automation suites and tests, scale and distribute scripts across
  many environments, then you want to use Selenium WebDriver, a collection of language specific bindings to drive a browser
  - the way it is meant to be driven.

**Selenium IDE:**
- If you want to create quick bug reproduction scripts, create scripts to aid in automation-aided exploratory testing, 
  then you want to use Selenium IDE; a Chrome, Firefox and Edge add-on that will do simple record-and-playback of interactions
  with the browser.
- Selenium WebDriver is successor of Selenium RC.Before Selenium WenDriver selenium introduced selenium RC, but it has lot
  disadvantages. Selenium RC officially deprecated (means it will work on 2011 browsers ex Chrome version 24,25).

**Selenium Grid:**
- If you want to scale by distributing and running tests on several machines and manage multiple environments from a central
  point, making it easy to run the tests against a vast combination of browsers/OS, then you want to use Selenium Grid.

**Selenium Features:**
- Selenium is open source Automation Testing tool. (Before selenium came into market, there is a tool called QTP which is
  sponsored by HP guys. It's a paid tool)
- It is exclusively for Web Based Applications.(Everything that is rendered on browser)
- Selenium supports multiple browsers - Chrome, Firefox, Internet Explorer, Safari, etc
- Selenium works with multiple platforms.(Windows, Apples OS, Linux)
- Selenium can be coded in multiple languages only syntax is different.(Java, C#, Python, JS, PHP, Ruby, etc.)

**Selenium WebDriver Architecture Simplified:**

![Selenium WebDriver Architecture](/Images/selenium_webdriver_architexcture.png)

- After we trigger the Test, complete selenium code (Client) which we have written will be converted to Json format.
- Generated Json is sent to Browser Driver (Server) through http protocol.
- Note: Each browser driver contains a separate browser driver.
- Browser Drivers communicate with its respective browser and executes the commands by interpreting Json which it received
  on the browser.
- Browser Driver receives response back from the browser, and it sends Json back to Client.

**5 Step-by-Step Instructions to run first basic Selenium Program:**
- Install Java and Set Java Home path in System Variables.
- Install Eclipse and Create new Maven Project with Selenium Dependencies.
- Understand Creation of WebDriver Object and its related classes.
- Run the first selenium webserver program with browser invocation.
- Different ways of setting Browser Driver executable files.

**Maven(MVN Repository):**
- 

**Invoking Browser:**
- Chrome - TO start running our tests in Chrome Browser Selenium guys have released one class ChromeDriver. This class 
  has all the methods which will help us to automate in Chrome Browser.

**What is Interface in Java?**
- An interface is a group of related methods with empty bodies.
- It's class responsibility to implement the methods declared in the interface.
- When class is agreed to implement the interface, they must need to provide implementation/bodies to all the defined 
  methods in interface.
- In simple terms, Interface enforces the contract to class to follow.

**WebDriver is an Interface which provides set of Browser automation methods with empty bodies(Abstract methods):**
- Classes like ChromeDrive, FirefoxDriver, etc implement the WebDriver interface and provide their own implementation to 
  the WebDriver methods.
- browser driver classes have WebDriver methods + class methods

**Different ways to Setting Browser Driver:**
- To implement only WebDriver methods
- WebDriver driver = new ChromeDriver();
- To implement both WebDriver and ChromeDriver methods
- ChromeDriver driver = new ChromeDriver();

Two ways of invoking chrome driver:
- If we not explicitly specify chrome driver path ChromeDriver class has in built library called SeleniumManager.
- The duty of selenium manager is to check whether if there is any step written to invoke ChromeDriver.
- If there is no step defined, then selenium manager library do this magic for us.
- So it will connect to the web, and it will download the appropriate chrome driver for you automatically, and it will place
- in the right path so that we really no need to worry about anything about this chrome driver file.
