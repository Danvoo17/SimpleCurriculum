/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reports;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ronny Trinidad
 */
public class JasperLoader {

    public static void generateBasic(Map<String, Object> parametros, List<Experience> experiences, List<Reference> references) {
        try {
            // Ruta al archivo .jrxml dentro de la carpeta reports
            String jrxmlPath = "src/main/java/reports/Basic.jrxml";
            String jasperPath = "src/main/java/reports/Basic.jasper";

            // Compilar el .jrxml si el .jasper no existe
            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);

            // Cargar el archivo .jasper
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(jasperPath);

            // Convertir listas en JRBeanCollectionDataSource
            JRBeanCollectionDataSource experienceDataSource = new JRBeanCollectionDataSource(experiences);
            JRBeanCollectionDataSource referenceDataSource = new JRBeanCollectionDataSource(references);

            // Agregar los nuevos parámetros
            parametros.put("EXPERIENCE_DATASOURCE", experienceDataSource);
            parametros.put("REFERENCE_DATASOURCE", referenceDataSource);

            // Llenar el reporte
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, new JREmptyDataSource());

            // Mostrar el reporte
            JasperViewer.viewReport(print, false);

        } catch (JRException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void generateBasicUni(Map<String, Object> parametros, List<Experience> experiences, List<Reference> references) {
        try {
            // Ruta al archivo .jrxml dentro de la carpeta reports
            String jrxmlPath = "src/main/java/reports/BasicUni.jrxml";
            String jasperPath = "src/main/java/reports/BasicUni.jasper";

            // Compilar el .jrxml si el .jasper no existe
            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);

            // Cargar el archivo .jasper
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(jasperPath);

            // Convertir listas en JRBeanCollectionDataSource
            JRBeanCollectionDataSource experienceDataSource = new JRBeanCollectionDataSource(experiences);
            JRBeanCollectionDataSource referenceDataSource = new JRBeanCollectionDataSource(references);

            // Agregar los nuevos parámetros
            parametros.put("EXPERIENCE_DATASOURCE", experienceDataSource);
            parametros.put("REFERENCE_DATASOURCE", referenceDataSource);

            // Llenar el reporte
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, new JREmptyDataSource());

            // Mostrar el reporte
            JasperViewer.viewReport(print, false);

        } catch (JRException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void generateBasicNoHigh(Map<String, Object> parametros, List<Experience> experiences, List<Reference> references) {
        try {
            // Ruta al archivo .jrxml dentro de la carpeta reports
            String jrxmlPath = "src/main/java/reports/BasicNoHigh.jrxml";
            String jasperPath = "src/main/java/reports/BasicNoHigh.jasper";

            // Compilar el .jrxml si el .jasper no existe
            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);

            // Cargar el archivo .jasper
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(jasperPath);

            // Convertir listas en JRBeanCollectionDataSource
            JRBeanCollectionDataSource experienceDataSource = new JRBeanCollectionDataSource(experiences);
            JRBeanCollectionDataSource referenceDataSource = new JRBeanCollectionDataSource(references);

            // Agregar los nuevos parámetros
            parametros.put("EXPERIENCE_DATASOURCE", experienceDataSource);
            parametros.put("REFERENCE_DATASOURCE", referenceDataSource);

            // Llenar el reporte
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, new JREmptyDataSource());

            // Mostrar el reporte
            JasperViewer.viewReport(print, false);

        } catch (JRException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

