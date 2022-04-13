package com.demo.excel.util;

import java.util.ArrayList;
import java.util.List;

import com.demo.excel.model.CreateRequest;
import com.demo.excel.model.MastercardParams;
import com.demo.excel.model.VisaParams;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ConvertExcel{
    
    public static List<CreateRequest> excelToModel(XSSFSheet sheet){
        List<CreateRequest> lista_request= new ArrayList<>();
        List<XSSFCell>datos= new ArrayList<>();
        CreateRequest cr_auxiliar;
        VisaParams vp_auxiliar;
        MastercardParams mp_auxiliar;
        for(int i=1; i<sheet.getPhysicalNumberOfRows();i++) {
            XSSFRow row = sheet.getRow(i);
            for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
                XSSFCell cell= row.getCell(j);
               datos.add(cell);
            }
            cr_auxiliar=new CreateRequest();
            cr_auxiliar.setManager(datos.get(0).toString());
            cr_auxiliar.setCode(datos.get(1).toString());
            cr_auxiliar.setAction(datos.get(2).toString());
            cr_auxiliar.setName(datos.get(3).toString());
            cr_auxiliar.setActive(datos.get(5).toString());
            vp_auxiliar=new VisaParams();
            vp_auxiliar.setAcquirerBin(datos.get(6).toString());
            vp_auxiliar.setMerchantName(datos.get(4).toString());
            vp_auxiliar.setAcquirerMerchantID(datos.get(8).toString());
            vp_auxiliar.setMerchantCountryCode(datos.get(9).toString());
            vp_auxiliar.setMcc(datos.get(10).toString());
            vp_auxiliar.setMerchantUrl(datos.get(11).toString());
            cr_auxiliar.setVisaParams(vp_auxiliar);
            mp_auxiliar=new MastercardParams();
            mp_auxiliar.setAcquirerBin(datos.get(6).toString());
            mp_auxiliar.setMerchantName(datos.get(4).toString());
            mp_auxiliar.setAcquirerMerchantID(datos.get(8).toString());
            mp_auxiliar.setMerchantCountryCode(datos.get(9).toString());
            mp_auxiliar.setMcc(datos.get(10).toString());
            mp_auxiliar.setMerchantUrl(datos.get(11).toString());
            cr_auxiliar.setMastercardParams(mp_auxiliar);
            lista_request.add(cr_auxiliar);
        }
        return lista_request;
    }
}