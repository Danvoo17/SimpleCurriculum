/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import reports.Experience;
import reports.JasperLoader;
import reports.Reference;

/**
 *
 * @author Ronny Trinidad
 */
public class CreateBasic extends javax.swing.JFrame {

    /**
     * Creates new form CreateBasic
     */
    public CreateBasic() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        initPanelExp();
        initPanelRef();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        panel_base = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_birth = new javax.swing.JLabel();
        lbl_birthplace = new javax.swing.JLabel();
        lbl_state = new javax.swing.JLabel();
        lbl_nation = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_primary = new javax.swing.JLabel();
        txt_birthplace = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_day = new javax.swing.JTextField();
        lbl_separator = new javax.swing.JLabel();
        cmb_month = new javax.swing.JComboBox<>();
        lbl_month = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        cmb_state = new javax.swing.JComboBox<>();
        txt_nation = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_primary = new javax.swing.JTextField();
        lbl_high = new javax.swing.JLabel();
        txt_high = new javax.swing.JTextField();
        lbl_college = new javax.swing.JLabel();
        txt_college = new javax.swing.JTextField();
        lbl_year = new javax.swing.JLabel();
        txt_career = new javax.swing.JTextField();
        rad_college = new javax.swing.JRadioButton();
        rad_high = new javax.swing.JRadioButton();
        lbl_exp = new javax.swing.JLabel();
        scrollExp = new javax.swing.JScrollPane();
        panel_exp = new javax.swing.JPanel();
        lbl_ref = new javax.swing.JLabel();
        scrollref = new javax.swing.JScrollPane();
        panel_ref = new javax.swing.JPanel();
        btn_addref = new javax.swing.JButton();
        btn_addexp = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        separator_header = new javax.swing.JSeparator();
        panel_header = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setText("Atras");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        title.setFont(new java.awt.Font("Book Antiqua", 3, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Basico");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 74));

        panel_base.setBackground(new java.awt.Color(240, 240, 240));
        panel_base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_name.setText("Nombre Completo");
        panel_base.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbl_address.setText("Direccion");
        panel_base.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_addressKeyTyped(evt);
            }
        });
        panel_base.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        lbl_phone.setText("Numero Telefonico");
        panel_base.add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lbl_email.setText("Correo Electronico (opcional)");
        panel_base.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lbl_birth.setText("Fecha de Nacimiento");
        panel_base.add(lbl_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbl_birthplace.setText("Lugar de Nacimiento");
        panel_base.add(lbl_birthplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lbl_state.setText("Estado Civil");
        panel_base.add(lbl_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lbl_nation.setText("Nacionalidad");
        panel_base.add(lbl_nation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        lbl_cedula.setText("Cedula");
        panel_base.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        lbl_primary.setText("Estudios Primarios");
        panel_base.add(lbl_primary, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txt_birthplace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_birthplaceKeyTyped(evt);
            }
        });
        panel_base.add(txt_birthplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, -1));

        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        panel_base.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        panel_base.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));
        panel_base.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, -1));

        txt_day.setText("1");
        txt_day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dayKeyTyped(evt);
            }
        });
        panel_base.add(txt_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 20, -1));

        lbl_separator.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbl_separator.setText(":");
        panel_base.add(lbl_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 10, 30));

        cmb_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        panel_base.add(cmb_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 20));

        lbl_month.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_month.setText("/");
        panel_base.add(lbl_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        txt_year.setText("1900");
        txt_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_yearKeyTyped(evt);
            }
        });
        panel_base.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 40, -1));

        cmb_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero.", "Soltera.", "Casado.", "Casada.", "Union Libre." }));
        panel_base.add(cmb_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 170, 20));

        txt_nation.setText("Dominicana");
        txt_nation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nationKeyTyped(evt);
            }
        });
        panel_base.add(txt_nation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 170, -1));

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        panel_base.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, -1));

        txt_primary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primaryKeyTyped(evt);
            }
        });
        panel_base.add(txt_primary, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, -1));

        lbl_high.setText("Estudios Secundarios");
        panel_base.add(lbl_high, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        txt_high.setBackground(new java.awt.Color(220, 220, 220));
        txt_high.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_highMouseClicked(evt);
            }
        });
        panel_base.add(txt_high, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 170, -1));

        lbl_college.setText("Universidad");
        panel_base.add(lbl_college, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        txt_college.setBackground(new java.awt.Color(220, 220, 220));
        txt_college.setText("Uasd");
        txt_college.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_collegeMouseClicked(evt);
            }
        });
        panel_base.add(txt_college, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 50, -1));

        lbl_year.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_year.setText(" /");
        panel_base.add(lbl_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 30, 20));

        txt_career.setBackground(new java.awt.Color(220, 220, 220));
        txt_career.setText("Ingenieria en...");
        txt_career.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_careerMouseClicked(evt);
            }
        });
        panel_base.add(txt_career, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, -1));

        rad_college.setText("Si");
        rad_college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_collegeActionPerformed(evt);
            }
        });
        panel_base.add(rad_college, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 40, 20));

        rad_high.setSelected(true);
        rad_high.setText("No");
        rad_high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_highActionPerformed(evt);
            }
        });
        panel_base.add(rad_high, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 50, 20));

        lbl_exp.setText("Experiencia Laboral");
        panel_base.add(lbl_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        scrollExp.setBackground(new java.awt.Color(255, 255, 255));

        panel_exp.setBackground(new java.awt.Color(255, 255, 255));
        panel_exp.setLayout(new javax.swing.BoxLayout(panel_exp, javax.swing.BoxLayout.LINE_AXIS));
        scrollExp.setViewportView(panel_exp);

        panel_base.add(scrollExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 240, 140));

        lbl_ref.setText("Referencia Personal");
        panel_base.add(lbl_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        panel_ref.setBackground(new java.awt.Color(255, 255, 255));
        panel_ref.setLayout(new javax.swing.BoxLayout(panel_ref, javax.swing.BoxLayout.LINE_AXIS));
        scrollref.setViewportView(panel_ref);

        panel_base.add(scrollref, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 240, 140));

        btn_addref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_addref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addrefActionPerformed(evt);
            }
        });
        panel_base.add(btn_addref, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 20, 20));

        btn_addexp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_addexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addexpActionPerformed(evt);
            }
        });
        panel_base.add(btn_addexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 20, 20));

        getContentPane().add(panel_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 710, 380));

        btn_print.setText("Imprimir");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, -1, -1));

        separator_header.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(separator_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 10, 50));

        panel_header.setBackground(new java.awt.Color(1, 0, 73));
        getContentPane().add(panel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainback.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        Create open = new Create();
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addexpActionPerformed

        addexp();
    }//GEN-LAST:event_btn_addexpActionPerformed

    private void btn_addrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addrefActionPerformed

        addref();
    }//GEN-LAST:event_btn_addrefActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed

        printReport();
    }//GEN-LAST:event_btn_printActionPerformed

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        
        txt_name.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addressKeyTyped
        
        txt_address.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_addressKeyTyped

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        
        txt_phone.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_dayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dayKeyTyped
        
        txt_day.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_dayKeyTyped

    private void txt_yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_yearKeyTyped
        
        txt_year.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_yearKeyTyped

    private void txt_birthplaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_birthplaceKeyTyped
        
        txt_birthplace.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_birthplaceKeyTyped

    private void txt_nationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nationKeyTyped
        
        txt_nation.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_nationKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        
        txt_cedula.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_primaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primaryKeyTyped
        
        txt_primary.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_primaryKeyTyped

    private void txt_highMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_highMouseClicked
        
        if (rad_high.isSelected()) {
            
            JOptionPane.showMessageDialog(this, "No puedes llenar estudios secundarios mientras \"No\" esté activado", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txt_highMouseClicked

    private void rad_highActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_highActionPerformed
        
        if (rad_high.isSelected()) {
            
            txt_high.setEnabled(false);
            txt_high.setBackground(new Color(220,220,220));
        } else {
            
            txt_high.setBackground(new Color(255,255,255));
            txt_high.setEnabled(true);
        }
    }//GEN-LAST:event_rad_highActionPerformed

    private void rad_collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_collegeActionPerformed
        
        if (rad_college.isSelected()) {
            
            txt_college.setBackground(new Color(255,255,255));
            txt_college.setEnabled(true);
            
            txt_career.setBackground(new Color(255,255,255));
            txt_career.setEnabled(true);
        } else {
            
            txt_college.setEnabled(false);
            txt_college.setBackground(new Color(220,220,220));
            
            txt_career.setEnabled(false);
            txt_career.setBackground(new Color(220,220,220));
        }
    }//GEN-LAST:event_rad_collegeActionPerformed

    private void txt_careerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_careerMouseClicked
        
        if (rad_college.isSelected()) {
        
        } else {
            JOptionPane.showMessageDialog(this, "No puedes llenar la carrera mientras \"Si\" esté desactivado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_careerMouseClicked

    private void txt_collegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_collegeMouseClicked
        
        if (rad_college.isSelected()) {
            
        } else {
            JOptionPane.showMessageDialog(this, "No puedes poner la Universidad mientras \"Si\" esté desactivado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_collegeMouseClicked
    
    private void printReport() {
        
        // Verify if required text fields are empty
        if (txt_name.getText().trim().isEmpty() || 
            txt_address.getText().trim().isEmpty() || 
            txt_phone.getText().trim().isEmpty() ||
            txt_day.getText().trim().isEmpty() && txt_year.getText().trim().isEmpty() ||
            txt_birthplace.getText().trim().isEmpty() ||
            txt_nation.getText().trim().isEmpty() ||
            txt_cedula.getText().trim().isEmpty() ||
            txt_primary.getText().trim().isEmpty()) 
            {
                // Validate if each textfield is empty to change color
                if (txt_name.getText().trim().isEmpty()) {
                    txt_name.setBackground(new Color(255, 195, 195));
                } 
                if (txt_address.getText().trim().isEmpty()) {
                    txt_address.setBackground(new Color(255, 195, 195));
                } 
                if (txt_phone.getText().trim().isEmpty()) {
                    txt_phone.setBackground(new Color(255, 195, 195));
                } 
                if (txt_day.getText().trim().isEmpty()) {
                    txt_day.setBackground(new Color(255, 195, 195));
                }   
                if (txt_year.getText().trim().isEmpty()) {
                    txt_year.setBackground(new Color(255, 195, 195));
                } 
                if (txt_birthplace.getText().trim().isEmpty()) {
                    txt_birthplace.setBackground(new Color(255, 195, 195));
                } 
                if (txt_nation.getText().trim().isEmpty()) {
                    txt_nation.setBackground(new Color(255, 195, 195));
                } 
                if (txt_cedula.getText().trim().isEmpty()) {
                    txt_cedula.setBackground(new Color(255, 195, 195));
                } 
                if (txt_primary.getText().trim().isEmpty()) {
                    txt_primary.setBackground(new Color(255, 195, 195));
                }
                 
            // Show dialog
            JOptionPane.showMessageDialog(this, "Llene los campos requeridos!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Create the lists for Experience and Reference
        List<Experience> experiences = new ArrayList<>();
        List<Reference> references = new ArrayList<>();

        // Create a hashmap with the textFields data
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("name", txt_name.getText());
        parametros.put("address", txt_address.getText());
        parametros.put("birthplace", txt_birthplace.getText());
        parametros.put("state", cmb_state.getSelectedItem());
        parametros.put("nation", txt_nation.getText());
        parametros.put("cedula", txt_cedula.getText());
        parametros.put("primary", txt_primary.getText());
        parametros.put("high", txt_high.getText());

        // Add "Cel.: " to the number start
        String phone = txt_phone.getText().trim();
        String finalPhone = "Cel.: " + phone;
        parametros.put("phone", finalPhone);

        // Verify if the email is empty.
        String email = txt_email.getText().trim();
        String finalEmail = email.isEmpty() ? "" : "Email.: " + email;
        parametros.put("email", finalEmail);

        // Put the birthday data together
        String day = txt_day.getText().trim();
        String month = (String) cmb_month.getSelectedItem();
        String year = txt_year.getText();
        String finalBirth = day + " de " + month + " de " + year + ".";
        parametros.put("birth", finalBirth);
        
        //Put the college data together
        String college = txt_college.getText().trim().toUpperCase();
        String career = txt_career.getText().trim();
        String finalCollege = career + " (" + college + ").";
        parametros.put("college", finalCollege);

        // Run through laboral experiences
        for (Component comp : panel_exp.getComponents()) {
            if (comp instanceof JPanel) {
                JPanel row = (JPanel) comp;
                JTextField txt_company = (JTextField) row.getComponent(0);
                JTextField txt_position = (JTextField) row.getComponent(1);
                String companydot = txt_company.getText() + ":";
                experiences.add(new Experience(companydot, txt_position.getText()));
            }
        }

        // Run through pesonal references
        for (Component comp : panel_ref.getComponents()) {
            if (comp instanceof JPanel) {
                JPanel row = (JPanel) comp;
                JTextField txt_refname = (JTextField) row.getComponent(0);
                JTextField txt_refphone = (JTextField) row.getComponent(1);
                String refdot = txt_refname.getText() + ":";
                references.add(new Reference(refdot, txt_refphone.getText()));
            }
        }

        // Show the generated curriculum depending on the selected ratios
        if(rad_high.isSelected()) {
            
            JasperLoader.generateBasicNoHigh(parametros, experiences, references);
        }
        else if(rad_college.isSelected()) {
            
            JasperLoader.generateBasicUni(parametros, experiences, references);
        }
        else {
            
            JasperLoader.generateBasic(parametros, experiences, references);
        }
        
    }
    
    private void initPanelExp() {
        panel_exp.setLayout(new BoxLayout(panel_exp, BoxLayout.Y_AXIS));
        scrollExp.setViewportView(panel_exp);
    }
    
    private void initPanelRef() {
        panel_ref.setLayout(new BoxLayout(panel_ref, BoxLayout.Y_AXIS));
        scrollref.setViewportView(panel_ref);
    }
    
    private void addexp() {
        JPanel fila = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fila.setBackground(Color.WHITE);
    
        JTextField txt_company = new JTextField("empresa", 15);
        JTextField txt_position = new JTextField("puesto", 15);
        JButton btn_deletexp = new JButton("X");
        
        btn_deletexp.setPreferredSize(new Dimension(43, 20));
        btn_deletexp.setBackground(Color.RED);
        btn_deletexp.setForeground(Color.WHITE);

        btn_deletexp.addActionListener(e -> {
            panel_exp.remove(fila);
            panel_exp.revalidate();
            panel_exp.repaint();
        });

        fila.add(txt_company);
        fila.add(txt_position);
        fila.add(btn_deletexp);

        panel_exp.add(fila);
        panel_exp.revalidate();
        panel_exp.repaint();
    }
    
    private void addref() {
        JPanel fila = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fila.setBackground(Color.WHITE);
    
        JTextField txt_refname = new JTextField("nombre", 15);
        JTextField txt_refphone = new JTextField("telefono", 15);
        JButton btn_deletref = new JButton("X");
        
        btn_deletref.setPreferredSize(new Dimension(43, 20));
        btn_deletref.setBackground(Color.RED);
        btn_deletref.setForeground(Color.WHITE);

        btn_deletref.addActionListener(e -> {
            panel_ref.remove(fila);
            panel_ref.revalidate();
            panel_ref.repaint();
        });

        fila.add(txt_refname);
        fila.add(txt_refphone);
        fila.add(btn_deletref);

        panel_ref.add(fila);
        panel_ref.revalidate();
        panel_ref.repaint();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBasic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_addexp;
    private javax.swing.JButton btn_addref;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> cmb_month;
    private javax.swing.JComboBox<String> cmb_state;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_birth;
    private javax.swing.JLabel lbl_birthplace;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_college;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_exp;
    private javax.swing.JLabel lbl_high;
    private javax.swing.JLabel lbl_month;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_nation;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_primary;
    private javax.swing.JLabel lbl_ref;
    private javax.swing.JLabel lbl_separator;
    private javax.swing.JLabel lbl_state;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPanel panel_exp;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_ref;
    private javax.swing.JRadioButton rad_college;
    private javax.swing.JRadioButton rad_high;
    private javax.swing.JScrollPane scrollExp;
    private javax.swing.JScrollPane scrollref;
    private javax.swing.JSeparator separator_header;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_birthplace;
    private javax.swing.JTextField txt_career;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_college;
    private javax.swing.JTextField txt_day;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_high;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nation;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_primary;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
