package com.orangehrm.testsuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.jsp.SkipPageException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.pageclasses.AddEmployeePage;
import com.orangehrm.pageclasses.Menu;

public class AddEmployee  extends BaseClass{
	
	@Test
	public void addEmpoyeeTest() throws IOException, SkipPageException
	{
		
		String runMode=eo.getCellData(dataEngine,0,2,2);
		if(runMode.equals("N"))
			throw new SkipPageException("AddEmp test case skipped");
		int rowCount=eo.getRowCount(empList,0);
		for(int i=1;i<=rowCount;i++)
		{
			Row r=eo.getRow(empList,0,i);
			Menu menu=PageFactory.initElements(driver,Menu.class);
			Sleeper.sleepTightInSeconds(7);
			menu.pim();
			Sleeper.sleepTightInSeconds(7);
			AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
			aep.addEmployee(r);
			Sleeper.sleepTightInSeconds(7);
		}
	}

}
