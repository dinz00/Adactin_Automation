package com.adactin.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class1 {
	
	public static WebDriver driver;

	public static WebDriver getbrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void clickontoElement(WebElement element) {
		element.click();
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void navigateto(String value) {
		driver.navigate().to(value);
	}

	public static void navigateforward() {
		driver.navigate().back();
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		System.out.println(options);
	}

	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void scrollup_scrooldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void takescreenshot(String path) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (type.equalsIgnoreCase("Value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("Visible text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void waitconcept(WebElement element, String wait, int duration, TimeUnit format) {
		if (wait.equalsIgnoreCase("implicit wait")) {
			driver.manage().timeouts().implicitlyWait(duration, format);
		} else if (wait.equalsIgnoreCase("explicit wait")) {
			WebDriverWait wait1 = new WebDriverWait(driver, duration);
			wait1.until(ExpectedConditions.visibilityOf(element));
		}
	}

	public static void Robot1(WebElement element, String press) throws Throwable {
		Robot r = new Robot();
		if (press.equalsIgnoreCase("Down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		} else if (press.equalsIgnoreCase("Double down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_KP_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	public static void action(WebElement element, String click) {
		Actions a = new Actions(driver);
		if (click.equalsIgnoreCase("Click")) {
			a.click().build().perform();
		} 
		else if (click.equalsIgnoreCase("Context click")) {
			a.contextClick().build().perform();
		} 
		else if (click.equalsIgnoreCase("Double Click")) {
			a.doubleClick().build().perform();
		} 
		else if (click.equalsIgnoreCase("Move to Element")) {
			a.moveToElement(element).build().perform();
		}
	}

	public static void frame(String type, String Value) {
		if (type.equalsIgnoreCase("ID")) {
			driver.switchTo().frame(Value);
		} else if (type.equalsIgnoreCase("Index")) {
			int parseInt = Integer.parseInt(Value);
			driver.switchTo().frame(parseInt);
		} 
		else if (type.equals("webelement")) {
			String element = null;
			driver.switchTo().frame(element);
		}
		}
	

	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}

	public static void confirmAlert(String ok, String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (ok.equalsIgnoreCase("Cancel")) {
			driver.switchTo().alert().dismiss();
		}

	}

	public static void promptAlert(String ok, String cancel, String Text) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(Text);
			driver.switchTo().alert().accept();
		} else if (ok.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().sendKeys(Text);
			driver.switchTo().alert().dismiss();

		}
	}

	public static void getfirstselectedoptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	public static void getallselectedoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement all_options : allSelectedOptions) {
			System.out.println(all_options.getText());
		}
	}

	public static void getoptions1(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement options1 : options) {
			System.out.println(options1.getText());

		}

	}																			

	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();
	}


}
