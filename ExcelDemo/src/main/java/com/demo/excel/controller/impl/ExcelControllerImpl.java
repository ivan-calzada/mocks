package com.demo.excel.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.demo.excel.controller.ExcelController;

@RestController
public class ExcelControllerImpl implements ExcelController{

	@Override
	public ResponseEntity<?> excelReader(MultipartFile excel) {
		// TODO Auto-generated method stub
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(excel.getInputStream());
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
					System.out.print(row.getCell(j) +" ");
				}
				System.out.println("");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.ok("success");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}	

}
