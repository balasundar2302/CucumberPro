package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\Downloads\\Book 1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		w.createSheet("Data2").createRow(0).createCell(0).setCellValue("USERNAME");
		w.getSheet("Data2").getRow(0).createCell(1).setCellValue("PASSWORD");
		w.getSheet("Data2").createRow(1).createCell(0).setCellValue("Excel@123");
		w.getSheet("Data2").getRow(1).createCell(1).setCellValue("12345");
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
	
	
	}
	
	

}
