package com.example.excel;

import org.apache.poi.hssf.usermodel.HSSFPrintSetup;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileOutputStream;
import java.io.IOException;

public class GeneraExcel {
    public static void main(String[] args) {
        // Crear un nuevo libro de trabajo (HSSFWorkbook)
        HSSFWorkbook workbook = new HSSFWorkbook();

        // Crear una nueva hoja dentro del libro de trabajo
        HSSFSheet sheet = workbook.createSheet("Reporte Mensual Luz Malta");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hola, Mundo!");

        // Configurar la orientación de la página a vertical
        HSSFPrintSetup printSetup = sheet.getPrintSetup();
        printSetup.setLandscape(true); // Establecer orientación vertical
        printSetup.setPaperSize(HSSFPrintSetup.A4_PAPERSIZE); // Tamaño del papel (opcional)

        // Guardar el libro de trabajo en un archivo
        String fileName = "orientacion_horizontal.xls";
        try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
            workbook.write(fileOut);
            System.out.println("Ruta completa del archivo Excel: " + fileOut.getFD().toString());
            System.out.println("El archivo Excel con orientación vertical se ha creado correctamente: " + fileName);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo Excel: " + e.getMessage());
        } finally {
            try {
                workbook.close(); // Cerrar el libro de trabajo
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
