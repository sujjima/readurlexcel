package readurlexcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readURL {
	public static void main(String args[])
	{
		WebDriver wd;
		wd=new ChromeDriver();
		int i=0;
		try {
			File src=new File("C:\\Users\\hp\\Documents\\url.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0);
			for (i=0;i<5;i++)		
			{
				System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
				wd.get(sh.getRow(i).getCell(0).getStringCellValue());
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}

	
	
}
