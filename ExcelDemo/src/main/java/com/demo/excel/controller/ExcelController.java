package com.demo.excel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface ExcelController {

	@PostMapping("/excel")
	public ResponseEntity<?> excelReader(@RequestParam("file")MultipartFile excel);
}
