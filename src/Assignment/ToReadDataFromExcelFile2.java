package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelFile2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Create object file
		FileInputStream fis = new FileInputStream("./testData/testData2.xlsx");
		
		//Step 2: Create workbook object
		Workbook book = WorkbookFactory.create(fis);
		
		//Step 3: Call methods
		
		String url = book.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String gender = book.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String firstName = book.getSheet("Sheet1").getRow(2).getCell(0).toString();
		String lastName = book.getSheet("Sheet1").getRow(3).getCell(0).toString();
		String email = book.getSheet("Sheet1").getRow(4).getCell(0).toString();
		String password = book.getSheet("Sheet1").getRow(5).getCell(0).toString();
		String comfirmpassword = book.getSheet("Sheet1").getRow(6).getCell(0).toString();
		
		//Automation script
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(comfirmpassword);
		driver.findElement(By.id("register-button")).click();

	}

}
