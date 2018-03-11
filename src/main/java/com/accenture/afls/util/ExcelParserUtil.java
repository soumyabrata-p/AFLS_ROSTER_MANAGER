package com.accenture.afls.util;

import com.accenture.afls.data.entity.ResourceDetails;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.*;

/**
 * This class will be used for parsing excel sheet,
 * provided for importing data and model will be
 * populated.
 *
 */
public class ExcelParserUtil {

    public List<ResourceDetails> parseExcel(FileInputStream file) throws Exception {
        List<ResourceDetails> resourceDetails = new ArrayList<>();
        try{

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            //This data needs to be written (Object[])
            Map<Integer, Object[]> data = new TreeMap<Integer, Object[]>();

            int count = 1;
            Map<Integer,String>  columnIndexMap = new HashMap<>();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                int cellCount = 1;

                while (cellIterator.hasNext()) {
                    ResourceDetails detail = new ResourceDetails();
                    Cell cell = cellIterator.next();
                    if(cellCount == 1){
                        columnIndexMap.put(cell.getColumnIndex(),cell.getStringCellValue());
                    }
                    else{
                        String dataType = columnIndexMap.get(cell.getColumnIndex());
                        if(dataType.equalsIgnoreCase("Name")){
                            detail.setName(cell.getStringCellValue());
                        }
                        if(dataType.equalsIgnoreCase("Designation")) {
                            detail.setDesignation(cell.getStringCellValue());
                        }

                        resourceDetails.add(detail);
                    }
                    cellCount++;
                }
            }

        }catch(Exception e){

        }

        return resourceDetails;
    }
}
