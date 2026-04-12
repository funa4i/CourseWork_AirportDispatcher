package org.desktop.emailservice.service;

import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Workbook;
import org.desktop.emailservice.builder.DefaultExcelReportBuilder;
import org.desktop.emailservice.factory.DefaultReportFactory;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ReportService {
    private final DefaultReportFactory defaultExcelReportBuilder;
    private final EmailStatisticService emailStatisticService;
    public FileOutputStream generateUserStatsReport(String token) {
        return null;
    }
}
