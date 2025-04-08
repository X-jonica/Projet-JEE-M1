/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ejbs;

import com.example.excel.ExcelReader;
import jakarta.ejb.Stateless;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Henintsoa
 */
@Stateless
public class ExcelImporterEJB {
    public void importExcelData(File excelFile) {
    try {
        ExcelReader reader = new ExcelReader();
        reader.readExcelFile(excelFile.getAbsolutePath());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
