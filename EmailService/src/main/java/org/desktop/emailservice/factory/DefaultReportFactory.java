package org.desktop.emailservice.factory;

import org.desktop.emailservice.builder.DefaultExcelReportBuilder;
import org.desktop.emailservice.template.BaseExcelReport;
import org.desktop.emailservice.template.UserStatsReport;
import org.springframework.stereotype.Component;

@Component
public class DefaultReportFactory implements ReportFactory {

    @Override
    public BaseExcelReport createReport() {
        var build = new DefaultExcelReportBuilder();
        return new UserStatsReport(build);
    }
}