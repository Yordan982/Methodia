package ExcelReader;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("C:\\Users\\pengu\\OneDrive\\Desktop\\testReader.xlsx");
        FileInputStream streamFile = new FileInputStream(sourceFile);

        Workbook wb = WorkbookFactory.create(streamFile);
        Sheet sheetNew = wb.getSheetAt(0);

        for (Row row : sheetNew) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING -> System.out.print(cell.getStringCellValue() + " | ");
                    case BOOLEAN -> System.out.print(cell.getBooleanCellValue() + " | ");
                    case NUMERIC -> System.out.print(cell.getNumericCellValue() + " | ");
                    default -> {
                    }
                }
            }
            System.out.println();
        }
        streamFile.close();
    }
}