package org.desktop.emailservice.template;

import org.apache.poi.ss.usermodel.Workbook;
import org.desktop.emailservice.builder.ExcelReportBuilder;

public abstract class BaseExcelReport {

    protected final ExcelReportBuilder builder;

    protected BaseExcelReport(ExcelReportBuilder builder) {
        this.builder = builder;
    }

    public final Workbook generate(ReportContext context) {
        builder.createWorkbook();
        builder.createSheet(getSheetName());

        buildHeader(context);
        buildBody(context);

        return builder.build();
    }

    protected abstract String getSheetName();

    protected abstract void buildHeader(ReportContext context);

    protected abstract void buildBody(ReportContext context);
}
