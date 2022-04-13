package com.demo.excel.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.demo.excel.controller.ExcelController;
import com.demo.excel.model.CreateRequest;
import com.demo.excel.model.ResponseBean;
import com.demo.excel.repository.StoreClient;
import com.demo.excel.util.ConvertExcel;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ExcelControllerImpl implements ExcelController{

	@Autowired
	StoreClient storeClient;

	@Override
	public ResponseEntity<?> excelReader(MultipartFile excel) {
		// TODO Auto-generated method stub
		CreateRequest createRequest = new CreateRequest();
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(excel.getInputStream());
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			/*for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
					System.out.print(row.getCell(j) +" ");
				}
				System.out.println("");
			}*/
			List<CreateRequest>convert_model=ConvertExcel.excelToModel(sheet);
			/*createRequest.setManager(sheet.getRow(1).getCell(0).toString());
			System.out.println(createRequest.getManager());*/
			convert_model.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.ok("success");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		CreateRequest createRequest = new CreateRequest();
		
		createRequest.setManager("1");
		createRequest.setCode("2");
		createRequest.setAction("3");
		createRequest.setName("4");
		createRequest.setCode("5");
		createRequest.setAction("6");
		createRequest.setName("7");
		createRequest.setActive("8");
		createRequest.setSignature("9");
		
		
		ResponseEntity<?> process = storeClient.process(createRequest);
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("status = "+process.getStatusCode());
		ResponseBean responseBean = objectMapper.convertValue(process.getBody(), ResponseBean.class);
		
		System.out.println("Valor del objeto completo ="+responseBean.toString());
	}	

}
