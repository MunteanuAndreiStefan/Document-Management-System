package Controller;


import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.math.BigDecimal;

import java.util.Date;

import net.sf.dynamicreports.adhoc.AdhocManager;
import net.sf.dynamicreports.adhoc.configuration.AdhocColumn;
import net.sf.dynamicreports.adhoc.configuration.AdhocConfiguration;
import net.sf.dynamicreports.adhoc.configuration.AdhocReport;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.exception.DRException;

import net.sf.jasperreports.engine.JRDataSource;

public class Report {


        public Report() {

            build();

        }

        private void build() {

            AdhocConfiguration configuration = new AdhocConfiguration();

            AdhocReport report = new AdhocReport();

            configuration.setReport(report);


            AdhocColumn column = new AdhocColumn();

            column.setName("item");

            report.addColumn(column);


            column = new AdhocColumn();

            column.setName("quantity");

            report.addColumn(column);


            try {

                // The following code stores the configuration to an xml file

                AdhocManager.saveConfiguration(configuration, new FileOutputStream("/home/stefan/configuration.xml"));

                @SuppressWarnings("unused")
                // The following code loads a configuration from an xml file
                        AdhocConfiguration loadedConfiguration = AdhocManager.loadConfiguration(new FileInputStream("/home/stefan/configuration.xml"));
                JasperReportBuilder reportBuilder = AdhocManager.createReport(configuration.getReport());
                reportBuilder.setDataSource(createDataSource());
                reportBuilder.show();
            } catch (DRException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        private JRDataSource createDataSource() {
            DRDataSource dataSource = new DRDataSource("item", "orderdate", "quantity", "unitprice");
            for (int i = 0; i < 20; i++) {
                dataSource.add("Book", new Date(), (int) (Math.random() * 10) + 1, new BigDecimal(Math.random() * 100 + 1));
            }
            return dataSource;
        }
}
