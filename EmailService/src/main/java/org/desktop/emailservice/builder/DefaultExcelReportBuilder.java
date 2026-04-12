package org.desktop.emailservice.builder;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DefaultExcelReportBuilder implements ExcelReportBuilder {

    private Workbook workbook;

    @Override
    public ExcelReportBuilder createWorkbook() {
        this.workbook = new XSSFWorkbook();
        return this;
    }

    @Override
    public ExcelReportBuilder createSheet(String name) {
        workbook.createSheet(name);
        return this;
    }

    @Override
    public ExcelReportBuilder addHeader(Object headerDefinition) {
        // TODO: реализовать
        return this;
    }

    @Override
    public ExcelReportBuilder addBody(Object data) {
        // TODO: реализовать
        return this;
    }

    @Override
    public Workbook build() {
        return workbook;
    }
}
