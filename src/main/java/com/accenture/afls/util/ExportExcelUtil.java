package com.accenture.afls.util;


import com.accenture.afls.data.entity.Users;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExportExcelUtil {

    public Workbook exportUsers(List<Users> usersList) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Resource Roster Users");

        System.out.println("Creating excel");
        int rowNum = 0;
        Row row = null;
        Cell cell = null;
        int colNum = 0;
        for (Users user : usersList) {
            if (colNum == 0) {
                colNum = 0;
                row = sheet.createRow(rowNum++);

                cell = row.createCell(colNum++);
                cell.setCellValue("Enterprise ID");
                cell = row.createCell(colNum++);
                cell.setCellValue("Role");
                cell = row.createCell(colNum++);
                cell.setCellValue("Designation");
                cell = row.createCell(colNum++);
                cell.setCellValue("Password");
            }
            colNum = 0;
            row = sheet.createRow(rowNum++);

            cell = row.createCell(colNum++);
            cell.setCellValue(user.getEnterpriseId());
            cell = row.createCell(colNum++);
            cell.setCellValue(user.getUserRole());
            cell = row.createCell(colNum++);
            cell.setCellValue(user.getDesignation());
            cell = row.createCell(colNum++);
            cell.setCellValue(user.getPassword());
        }
        System.out.println("Done");
        return workbook;
    }
}
