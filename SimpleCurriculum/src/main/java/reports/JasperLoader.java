package reports;

import java.io.InputStream;
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
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ronny Trinidad
 */
public class JasperLoader {

    public static void generateBasic(Map<String, Object> parametros, List<Experience> experiences, List<Reference> references) {
        try {
            // Cargar el archivo .jrxml desde el .jar
            InputStream reportStream = JasperLoader.class.getClassLoader().getResourceAsStream("reports/Basic.jrxml");
            if (reportStream == null) {
                throw new RuntimeException("No se pudo encontrar el archivo Basic.jrxml");
            }

            JasperReport reporte = JasperCompileManager.compileReport(reportStream);

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
            // Cargar el archivo .jrxml desde el .jar
            InputStream reportStream = JasperLoader.class.getClassLoader().getResourceAsStream("reports/BasicUni.jrxml");
            if (reportStream == null) {
                throw new RuntimeException("No se pudo encontrar el archivo BasicUni.jrxml");
            }

            JasperReport reporte = JasperCompileManager.compileReport(reportStream);

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
            // Cargar el archivo .jrxml desde el .jar
            InputStream reportStream = JasperLoader.class.getClassLoader().getResourceAsStream("reports/BasicNoHigh.jrxml");
            if (reportStream == null) {
                throw new RuntimeException("No se pudo encontrar el archivo BasicNoHigh.jrxml");
            }

            JasperReport reporte = JasperCompileManager.compileReport(reportStream);

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
