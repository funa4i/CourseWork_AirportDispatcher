package org.desktop.emailservice.builder;

import org.apache.poi.ss.usermodel.Workbook;

public interface ExcelReportBuilder {

    ExcelReportBuilder createWorkbook();

    ExcelReportBuilder createSheet(String name);

    ExcelReportBuilder addHeader(Object headerDefinition);

    ExcelReportBuilder addBody(Object data);

    Workbook build();
}
