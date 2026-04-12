package org.desktop.emailservice.factory;

import org.desktop.emailservice.template.BaseExcelReport;

public interface ReportFactory {
    BaseExcelReport createReport();
}