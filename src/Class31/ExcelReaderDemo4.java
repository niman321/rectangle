package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\niman\\IdeaProjects\\lava1\\Files\\Sheet.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet Sheet1=xssfWorkbook.getSheet("Sheet1");
        int noOfRows=Sheet1.getPhysicalNumberOfRows();

         var excelData=new ArrayList<>();
       // List<Map<String,String>> ExcelData=new ArrayList<>();
        for (int i = 1; i <noOfRows ; i++) {
            Row row=Sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap();
            rowMap.put("name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("cirty",row.getCell(2));
            rowMap.put("salary",row.getCell(3));
            excelData.add(rowMap);

        }



    }
}
