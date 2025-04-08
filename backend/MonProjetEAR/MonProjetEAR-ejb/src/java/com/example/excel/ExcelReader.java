/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Henintsoa
 */
public class ExcelReader {
        public void readExcelFile(String filePath) throws IOException {
        // Créer un objet File pour le fichier Excel
            FileInputStream fis = new FileInputStream(new File(filePath));

        // Créer un workbook (un classeur Excel) à partir du fichier
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Accéder à la première feuille (sheet)
            Sheet sheet = workbook.getSheetAt(0);

        // Parcourir toutes les lignes de la feuille
        for (Row row : sheet) {
            // Parcourir toutes les cellules de la ligne
            for (Cell cell : row) {
                // Afficher la valeur de chaque cellule
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    default:
                        System.out.print("Unknown Type\t");
                }
            }
            System.out.println();  // Nouvelle ligne après chaque ligne du fichier Excel
        }

        // Fermer le workbook
        workbook.close();
    }
}
