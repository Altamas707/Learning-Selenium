package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFromExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Create object file
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		//Step 2: Create workbook object
		Workbook book = WorkbookFactory.create(fis);
		
		//Step 3: Call methods
		String url = book.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String username = book.getSheet("Sheet1").getRow(1).getCell(0).toString();	
		String password = book.getSheet("Sheet1").getRow(2).getCell(0).toString();
		
		//Automation script
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		

	}

}
