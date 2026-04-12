package org.desktop.emailservice.template;


import org.desktop.emailservice.builder.ExcelReportBuilder;

public class UserStatsReport extends BaseExcelReport {

    public UserStatsReport(ExcelReportBuilder builder) {
        super(builder);
    }

    @Override
    protected String getSheetName() {
        return "User Stats";
    }

    @Override
    protected void buildHeader(ReportContext context) {
        builder.addHeader("User statistics header");
    }

    @Override
    protected void buildBody(ReportContext context) {
        builder.addBody(context.params().get("data"));
    }
}
