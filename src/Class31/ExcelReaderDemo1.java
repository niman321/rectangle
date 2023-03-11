package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Sheet.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);// this class is used to to work, read and write data from microsoft office
        XSSFSheet Sheet1=xssfWorkbook.getSheet("Sheet1");// here we tell xssfworkbook that from which sheet we are reading data
        Row row=Sheet1.getRow(1);// as we are interested in row we pass 1 inside the getrow method ,index number starts from 0
        Cell cell=row.getCell(1);// all numbers are treated as doubles in Excel
        System.out.println(cell);






    }
}
