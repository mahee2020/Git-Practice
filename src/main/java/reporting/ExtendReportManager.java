package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtendReportManager {

    public  static  ExtentReports  extentReports;
    public static ExtentReports createInstance(String filename, String reportName, String documenttitle){
        ExtentSparkReporter extentSparkReporter= new ExtentSparkReporter(filename);
        extentSparkReporter.config().setReportName(reportName);
        extentSparkReporter.config().setDocumentTitle(documenttitle);
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setEncoding("utf-8");
        extentReports  = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        return extentReports;

        }

        public  static String getReportNameWithTimeStamp(){
            DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern(" yyyy-mm-dd hh:mm:ss");
            LocalDateTime localDateTime= LocalDateTime.now();
            String formatedDate=dateTimeFormatter.format(localDateTime);
            String reportName="Test Report"+formatedDate+".html";
            return reportName;

        }
        public static void logPassDetails(String log){
        Setup.extentTest.get().pass(MarkupHelper.createLabel(log, ExtentColor.GREEN));
        }
        public static void logFailDetails(String log){
        Setup.extentTest.get().fail(MarkupHelper.createLabel(log, ExtentColor.RED));
    }   public static void logInfoDetails(String log){
        Setup.extentTest.get().info(MarkupHelper.createLabel(log, ExtentColor.GREY));
    }   public static void logWarningDetails(String log){
        Setup.extentTest.get().warning(MarkupHelper.createLabel(log, ExtentColor.YELLOW));
    }



}