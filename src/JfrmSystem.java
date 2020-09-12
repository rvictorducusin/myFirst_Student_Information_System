
import java.sql.*;
import javax.swing.*;
//Database Name: student_grading_system
//Database Table Name: gradingsystem
public class JfrmSystem extends javax.swing.JFrame {
    
    
    Connection con;
    Connection con2;
    Statement stmt;
    Statement stmt2;
    ResultSet rs;
    ResultSet rs2;
    PreparedStatement pst;
    PreparedStatement pst2;
    ResultSet rs3;
    PreparedStatement pst3;
    
    
    
    
    public JfrmSystem() {
        initComponents();
        
        DoConnect();
    }
    
    private void DoConnect(){
        try{
            
            String host = "jdbc:mysql://localhost:3306/student_grading_system";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(host,user,pass);
            
            stmt = con.createStatement();
            String sql = "Select * from gradingsystem";
            rs = stmt.executeQuery(sql);
            
            stmt2 = con.createStatement();
            String sql2 = "Select * from subjects";
            rs2 = stmt2.executeQuery(sql2);
            
            rs2.next();
            int id_col2 = rs2.getInt("idnum");
            String id2 = Integer.toString(id_col2);
            String subj = rs2.getString("subject");
            int finalgrade_col = rs2.getInt("finalgrade");
            String finalgrade = Integer.toString(finalgrade_col);
            
            
            rs.next();
            
            int id_col = rs.getInt("idnum");
            String id = Integer.toString(id_col);
            String lastname = rs.getString("lastname");
            String firstname = rs.getString("firstname");
            String middlename = rs.getString("middlename");
            String course = rs.getString("course");
            int year_col = rs.getInt("year");
            String year = Integer.toString(year_col);
            String subject = rs.getString("subject");
//            int finalg_col = rs.getInt("finalgrade");
//            String finalg = Integer.toString(finalg_col);
            
                
        }
         catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "error");
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpnlgray = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jtxtDisplayid = new javax.swing.JTextField();
        jtxtDisplaylast = new javax.swing.JTextField();
        jtxtDisplayfirst = new javax.swing.JTextField();
        jtxtDisplaymid = new javax.swing.JTextField();
        jtxtDisplaycourse = new javax.swing.JTextField();
        jtxtDisplayyr = new javax.swing.JTextField();
        jtxtDisplaysubj = new javax.swing.JTextField();
        jtxtDisplayFinalGrade = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jcboxDsubj = new javax.swing.JComboBox();
        jlblPhoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Jpnlblue = new javax.swing.JPanel();
        jbtnSearch = new javax.swing.JButton();
        jbtnNew = new javax.swing.JButton();
        jbtnEdit = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtMid = new javax.swing.JTextField();
        jtxtFirst = new javax.swing.JTextField();
        jtxtLast = new javax.swing.JTextField();
        jtxtIdnum = new javax.swing.JTextField();
        idnum = new javax.swing.JSeparator();
        idnum1 = new javax.swing.JSeparator();
        idnum2 = new javax.swing.JSeparator();
        idnum3 = new javax.swing.JSeparator();
        idnum4 = new javax.swing.JSeparator();
        idnum5 = new javax.swing.JSeparator();
        idnum6 = new javax.swing.JSeparator();
        idnum7 = new javax.swing.JSeparator();
        jtxtCourse = new javax.swing.JTextField();
        jtxtYr = new javax.swing.JTextField();
        jtxtsubj = new javax.swing.JTextField();
        jtxtFinal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcboxYr = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jtxtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jcboxSubj = new javax.swing.JComboBox();
        jcboxCourse = new javax.swing.JComboBox();
        jbtnSubject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpnlgray.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 8, 44));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Last Name");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("ID Number");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("First Name");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Middle Name");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Course");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Year");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 0));
        jLabel18.setText("Subject");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 0));
        jLabel19.setText("Final Grade");

        jLabel20.setFont(new java.awt.Font("Dotum", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setText("INFORMATION");

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtDisplayid.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplayid.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplayid.setBorder(null);
        jtxtDisplayid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayidActionPerformed(evt);
            }
        });

        jtxtDisplaylast.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplaylast.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplaylast.setBorder(null);

        jtxtDisplayfirst.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplayfirst.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplayfirst.setBorder(null);

        jtxtDisplaymid.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplaymid.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplaymid.setBorder(null);

        jtxtDisplaycourse.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplaycourse.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplaycourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDisplaycourse.setBorder(null);

        jtxtDisplayyr.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplayyr.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplayyr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDisplayyr.setBorder(null);

        jtxtDisplaysubj.setEditable(false);
        jtxtDisplaysubj.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplaysubj.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplaysubj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDisplaysubj.setBorder(null);

        jtxtDisplayFinalGrade.setEditable(false);
        jtxtDisplayFinalGrade.setFont(new java.awt.Font("MonospaceTypewriter", 0, 14)); // NOI18N
        jtxtDisplayFinalGrade.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDisplayFinalGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDisplayFinalGrade.setBorder(null);

        jcboxDsubj.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jcboxDsubj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Math", "Filipino", "Computer Programming 1", "Data Structure" }));
        jcboxDsubj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxDsubjActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JpnlgrayLayout = new javax.swing.GroupLayout(Jpnlgray);
        Jpnlgray.setLayout(JpnlgrayLayout);
        JpnlgrayLayout.setHorizontalGroup(
            JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlgrayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpnlgrayLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel20))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jtxtDisplaylast, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jtxtDisplayfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtDisplaymid, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpnlgrayLayout.createSequentialGroup()
                                .addComponent(jtxtDisplaycourse, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jtxtDisplayyr, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpnlgrayLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel16)
                                .addGap(184, 184, 184)
                                .addComponent(jLabel17))))
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpnlgrayLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel13))
                            .addGroup(JpnlgrayLayout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel21)))
                        .addGap(18, 18, 18)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtDisplayid, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jlblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnlgrayLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpnlgrayLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel18))
                            .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcboxDsubj, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtDisplaysubj, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtDisplayFinalGrade)
                            .addComponent(jLabel19))))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        JpnlgrayLayout.setVerticalGroup(
            JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlgrayLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
            .addGroup(JpnlgrayLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtDisplayid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDisplaylast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDisplayfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDisplaymid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDisplaycourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDisplayyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(39, 39, 39)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcboxDsubj, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDisplayFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDisplaysubj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlgrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Jpnlgray, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 910, 1080));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Jpnlblue.setBackground(new java.awt.Color(57, 57, 139));

        jbtnSearch.setBackground(new java.awt.Color(19, 31, 160));
        jbtnSearch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSearch.setText("Search");
        jbtnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jbtnNew.setBackground(new java.awt.Color(19, 31, 160));
        jbtnNew.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnNew.setForeground(new java.awt.Color(255, 255, 255));
        jbtnNew.setText("New");
        jbtnNew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewActionPerformed(evt);
            }
        });

        jbtnEdit.setBackground(new java.awt.Color(19, 31, 160));
        jbtnEdit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnEdit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEdit.setText("Edit");
        jbtnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });

        jbtnUpdate.setBackground(new java.awt.Color(19, 31, 160));
        jbtnUpdate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUpdate.setText("Update");
        jbtnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnSave.setBackground(new java.awt.Color(19, 31, 160));
        jbtnSave.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnSave.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSave.setText("Save");
        jbtnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jbtnDelete.setBackground(new java.awt.Color(19, 31, 160));
        jbtnDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDelete.setText("Delete");
        jbtnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Number");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Middle Name");

        jtxtMid.setBackground(new java.awt.Color(57, 57, 139));
        jtxtMid.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtMid.setForeground(new java.awt.Color(255, 255, 255));
        jtxtMid.setBorder(null);
        jtxtMid.setCaretColor(new java.awt.Color(255, 255, 255));

        jtxtFirst.setBackground(new java.awt.Color(57, 57, 139));
        jtxtFirst.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtFirst.setForeground(new java.awt.Color(255, 255, 255));
        jtxtFirst.setBorder(null);
        jtxtFirst.setCaretColor(new java.awt.Color(255, 255, 255));

        jtxtLast.setBackground(new java.awt.Color(57, 57, 139));
        jtxtLast.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtLast.setForeground(new java.awt.Color(255, 255, 255));
        jtxtLast.setBorder(null);
        jtxtLast.setCaretColor(new java.awt.Color(255, 255, 255));

        jtxtIdnum.setBackground(new java.awt.Color(57, 57, 139));
        jtxtIdnum.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtIdnum.setForeground(new java.awt.Color(255, 255, 255));
        jtxtIdnum.setBorder(null);
        jtxtIdnum.setCaretColor(new java.awt.Color(255, 255, 255));

        idnum.setForeground(new java.awt.Color(51, 51, 51));
        idnum.setPreferredSize(new java.awt.Dimension(100, 100));

        idnum1.setPreferredSize(new java.awt.Dimension(90, 10));

        idnum2.setPreferredSize(new java.awt.Dimension(90, 10));

        idnum3.setPreferredSize(new java.awt.Dimension(90, 10));

        idnum4.setPreferredSize(new java.awt.Dimension(90, 10));

        idnum5.setPreferredSize(new java.awt.Dimension(90, 10));

        idnum6.setPreferredSize(new java.awt.Dimension(90, 10));

        idnum7.setPreferredSize(new java.awt.Dimension(90, 10));

        jtxtCourse.setEditable(false);
        jtxtCourse.setBackground(new java.awt.Color(57, 57, 139));
        jtxtCourse.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtCourse.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCourse.setBorder(null);
        jtxtCourse.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCourseActionPerformed(evt);
            }
        });

        jtxtYr.setEditable(false);
        jtxtYr.setBackground(new java.awt.Color(57, 57, 139));
        jtxtYr.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtYr.setForeground(new java.awt.Color(255, 255, 255));
        jtxtYr.setBorder(null);
        jtxtYr.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtYrActionPerformed(evt);
            }
        });

        jtxtsubj.setEditable(false);
        jtxtsubj.setBackground(new java.awt.Color(57, 57, 139));
        jtxtsubj.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtsubj.setForeground(new java.awt.Color(255, 255, 255));
        jtxtsubj.setBorder(null);
        jtxtsubj.setCaretColor(new java.awt.Color(255, 255, 255));

        jtxtFinal.setEditable(false);
        jtxtFinal.setBackground(new java.awt.Color(57, 57, 139));
        jtxtFinal.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtFinal.setForeground(new java.awt.Color(255, 255, 255));
        jtxtFinal.setBorder(null);
        jtxtFinal.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course");

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subject");

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Final Grade");

        jbtnExit.setBackground(new java.awt.Color(19, 31, 160));
        jbtnExit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("Log Out");
        jbtnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Grading System");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pctlogo.png"))); // NOI18N

        jcboxYr.setBackground(new java.awt.Color(57, 57, 139));
        jcboxYr.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jcboxYr.setForeground(new java.awt.Color(255, 255, 255));
        jcboxYr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jcboxYr.setBorder(null);
        jcboxYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxYrActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(57, 57, 139));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jtxtSearch.setBackground(new java.awt.Color(57, 57, 139));
        jtxtSearch.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtxtSearch.setForeground(new java.awt.Color(255, 255, 255));
        jtxtSearch.setBorder(null);
        jtxtSearch.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtSearch.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jtxtSearchAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22))
            .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jcboxSubj.setBackground(new java.awt.Color(57, 57, 139));
        jcboxSubj.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jcboxSubj.setForeground(new java.awt.Color(255, 255, 255));
        jcboxSubj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Math", "Filipino", "Computer Programming 1", "Data Structure" }));
        jcboxSubj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxSubjActionPerformed(evt);
            }
        });

        jcboxCourse.setBackground(new java.awt.Color(57, 57, 139));
        jcboxCourse.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jcboxCourse.setForeground(new java.awt.Color(255, 255, 255));
        jcboxCourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BSIT", "BSCS", "ACT" }));
        jcboxCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxCourseActionPerformed(evt);
            }
        });

        jbtnSubject.setBackground(new java.awt.Color(19, 31, 160));
        jbtnSubject.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbtnSubject.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSubject.setText("Subject");
        jbtnSubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpnlblueLayout = new javax.swing.GroupLayout(Jpnlblue);
        Jpnlblue.setLayout(JpnlblueLayout);
        JpnlblueLayout.setHorizontalGroup(
            JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlblueLayout.createSequentialGroup()
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnlblueLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpnlblueLayout.createSequentialGroup()
                                .addComponent(jbtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpnlblueLayout.createSequentialGroup()
                                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JpnlblueLayout.createSequentialGroup()
                                        .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(JpnlblueLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpnlblueLayout.createSequentialGroup()
                                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtxtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JpnlblueLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jcboxSubj, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtsubj, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10)))
                            .addGroup(JpnlblueLayout.createSequentialGroup()
                                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(idnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtIdnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtxtLast, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(idnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(idnum4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtYr, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpnlblueLayout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jcboxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpnlblueLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jcboxYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(idnum5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(idnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JpnlblueLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnlblueLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(JpnlblueLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(103, 103, 103)
                                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(111, 111, 111)))
                .addContainerGap(4519, Short.MAX_VALUE))
        );
        JpnlblueLayout.setVerticalGroup(
            JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlblueLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(JpnlblueLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnlblueLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtIdnum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idnum, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(idnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnlblueLayout.createSequentialGroup()
                        .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcboxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jcboxYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtYr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(idnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jcboxSubj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsubj, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(JpnlblueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(Jpnlblue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtSearchAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtxtSearchAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSearchAncestorMoved

    private void jbtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewActionPerformed

        try{
            String host = "jdbc:mysql://localhost:3306/student_grading_system";
            String user = "root";
            String pass = "";
            con2 = DriverManager.getConnection(host,user,pass);
            pst2 = con2.prepareStatement("Select * from gradingsystem ORDER by idnum DESC LIMIT 1");
            rs2 = pst2.executeQuery();
            while(rs2.next()){

                jtxtIdnum.setText(rs2.getString("idnum"));
                String idstr = jtxtIdnum.getText();
                int idascend = Integer.parseInt(idstr);
                int newIdascend = (idascend+1);
                String finalIdAscend = String.valueOf(newIdascend);
                jtxtIdnum.setText(finalIdAscend);
                jtxtIdnum.setEditable(false);
                jtxtSearch.setText("");
                jtxtSearch.setEditable(true);
                jtxtCourse.setText("");
                jtxtCourse.setEditable(false);
                jtxtFirst.setText("");
                jtxtFirst.setEditable(true);
                jtxtLast.setText("");
                jtxtLast.setEditable(true);
                jtxtMid.setText("");
                jtxtMid.setEditable(true);
                jtxtYr.setText("");
                jtxtYr.setEditable(false);
                jtxtsubj.setText("");
                jtxtsubj.setEditable(true);
                jtxtDisplayFinalGrade.setText("");
                jtxtDisplayFinalGrade.setEditable(false);
                jtxtDisplaycourse.setText("");
                jtxtDisplaycourse.setEditable(false);
                jtxtDisplayfirst.setText("");
                jtxtDisplayfirst.setEditable(false);
                jtxtDisplayid.setText("");
                jtxtDisplayid.setEditable(false);
                jtxtDisplaylast.setText("");
                jtxtDisplaylast.setEditable(false);
                jtxtDisplaymid.setText("");
                jtxtDisplaymid.setEditable(false);
                jtxtDisplaysubj.setText("");
                jtxtDisplaysubj.setEditable(false);
                jtxtDisplayyr.setText("");
                jtxtDisplayyr.setEditable(false);
                jcboxDsubj.setEditable(false);
                
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
//********************************88ORIGINAL***********************
        
    }//GEN-LAST:event_jbtnNewActionPerformed

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        
        try{
            String id = jtxtIdnum.getText();
            int newID = Integer.parseInt(id);
            String firstname = jtxtFirst.getText();
            String lastname = jtxtLast.getText();
            String middlename = jtxtMid.getText();
            String course = jtxtCourse.getText();
            String subj = jtxtsubj.getText();
            String yr = jtxtYr.getText();            
            int newYr = Integer.parseInt(yr);
//            String finalg = jtxtFinal.getText();
//            int newFinal = Integer.parseInt(finalg);

            String insert = "INSERT INTO gradingsystem VALUES('"+newID+"','"+firstname+"','"+lastname+"','"+middlename+"','"+course+"','"+newYr+"','"+subj+
                    "')";
            stmt.executeUpdate(insert);
            
            JOptionPane.showMessageDialog(null, "A new record is Added!");
                jtxtSearch.setText("");
                jtxtIdnum.setText("");
                jtxtCourse.setText("");
//                jtxtFinal.setText("");
                jtxtFirst.setText("");
                jtxtLast.setText("");
                jtxtMid.setText("");
                jtxtYr.setText("");
                jtxtsubj.setText("");
                jcboxYr.setEditable(false);
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "That ID is already taken!");
        }
        
        
        
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        String idsearch = jtxtSearch.getText();
        
        try{
            String host = "jdbc:mysql://localhost:3306/student_grading_system";
            String user = "root";
            String pass = "";
            con2 = DriverManager.getConnection(host,user,pass);
            pst2 = con2.prepareStatement("Select * from subjects where idnum=?");
            pst2.setString(1, idsearch);
            rs2 = pst2.executeQuery();
            while(rs2.next()){
                
                
                jtxtDisplaysubj.setText(rs2.getString("subject"));
                jtxtDisplaysubj.setEditable(false);
                jtxtDisplayFinalGrade.setText(rs2.getString("finalgrade"));
                jtxtDisplayFinalGrade.setEditable(false);
                
                String photo = jtxtSearch.getText();
                ImageIcon image = new ImageIcon("C:\\Users\\COMLAB208\\Desktop\\"+photo+".jpg");
                jlblPhoto.setIcon(image);
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
       
        try{
            String host = "jdbc:mysql://localhost:3306/student_grading_system";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(host,user,pass);
            pst = con.prepareStatement("Select * from gradingsystem where idnum=?");
            pst.setString(1, idsearch);
            rs2 = pst2.executeQuery();
            rs = pst.executeQuery();
            while(rs.next()){
                
                jtxtDisplayid.setText(rs.getString("idnum"));
                jtxtDisplayid.setEditable(false);
                jtxtDisplayfirst.setText(rs.getString("firstname"));
                jtxtDisplayfirst.setEditable(false);
                jtxtDisplaylast.setText(rs.getString("lastname"));
                jtxtDisplaylast.setEditable(false);
                jtxtDisplaymid.setText(rs.getString("middlename"));
                jtxtDisplaymid.setEditable(false);
                jtxtDisplaycourse.setText(rs.getString("course"));
                jtxtDisplaycourse.setEditable(false);
                jtxtDisplayyr.setText(rs.getString("year"));
                jtxtDisplayyr.setEditable(false);

                
                jtxtCourse.setText("");
                jtxtIdnum.setText("");
                jtxtFirst.setText("");
                jtxtLast.setText("");
                jtxtMid.setText("");
                jtxtYr.setText("");
                jtxtsubj.setText("");
                jtxtCourse.setEditable(false);
                jtxtIdnum.setEditable(false);
                jtxtFirst.setEditable(false);
                jtxtLast.setEditable(false);
                jtxtMid.setEditable(false);
                jtxtYr.setEditable(false);
                jtxtsubj.setEditable(false);
            
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed
        String idsearch = jtxtSearch.getText();
       
        try{
            String host = "jdbc:mysql://localhost:3306/student_grading_system";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(host,user,pass);
            pst = con.prepareStatement("Select * from gradingsystem where idnum=?");
            pst.setString(1, idsearch);
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                jtxtIdnum.setText(rs.getString("idnum"));
                jtxtIdnum.setEditable(true);
                jtxtFirst.setText(rs.getString("firstname"));
                jtxtFirst.setEditable(true);
                jtxtLast.setText(rs.getString("lastname"));
                jtxtLast.setEditable(true);
                jtxtMid.setText(rs.getString("middlename"));
                jtxtMid.setEditable(true);
                jtxtCourse.setText(rs.getString("course"));
                jtxtCourse.setEditable(false);
                jtxtYr.setText(rs.getString("year"));
                jtxtYr.setEditable(false);
                jtxtsubj.setText(rs.getString("subject"));
                jtxtsubj.setEditable(false);
//                jtxtFinal.setText(rs.getString("finalgrade"));
//                jtxtFinal.setEditable(false);
                
                jtxtDisplayFinalGrade.setText("");
                jtxtDisplayfirst.setText("");
                jtxtDisplaymid.setText("");
                jtxtDisplaylast.setText("");
                jtxtDisplaycourse.setText("");
                jtxtDisplayyr.setText("");
                jtxtDisplaysubj.setText("");
                jtxtDisplayid.setText("");
            
            }
            
//            JOptionPane.showMessageDialog(null, "Record not Found !");
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbtnEditActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        try {
            
            String sql = "Update gradingsystem set firstname = '"+jtxtFirst.getText()+
                    "',lastname='"+jtxtLast.getText()+"',middlename='"+jtxtMid.getText()
                    +"',course='"+jtxtCourse.getText()+"',year='"+jtxtYr.getText()
                    +"',subject='"+jtxtsubj.getText()+"' where idnum = '"+jtxtIdnum.getText()+"'";
            
            pst=con.prepareStatement(sql);
            pst.execute();                           
            
            JOptionPane.showMessageDialog(null, "Record has been updated!");
            
                
                        
        }
        
        catch (SQLException  e) 
        {
              JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed

        int option=JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete?","",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        
        if (option==JOptionPane.YES_OPTION)
        {
            try {
            
            String sql = "Delete from gradingsystem where idnum = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1,jtxtIdnum.getText());
            pst.executeUpdate();
            
            jtxtSearch.setText("");
                jtxtIdnum.setText("");
                jtxtCourse.setText("");
//                jtxtFinal.setText("");
                jtxtFirst.setText("");
                jtxtLast.setText("");
                jtxtMid.setText("");
                jtxtYr.setText("");
                jtxtsubj.setText("");
                        
        }
        
        catch (SQLException  e) 
        {
              JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtxtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCourseActionPerformed
       
    }//GEN-LAST:event_jtxtCourseActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        int option=JOptionPane.showConfirmDialog(null,"Are you sure you want to Log Out?","",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        
        if (option==JOptionPane.YES_OPTION)
        {
            
            new JfrmLogin().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

   
    private void jtxtYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtYrActionPerformed
        
    }//GEN-LAST:event_jtxtYrActionPerformed

    private void jcboxYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxYrActionPerformed
        jtxtYr.setText(jcboxYr.getSelectedItem().toString());
        jtxtYr.setEditable(false);
    }//GEN-LAST:event_jcboxYrActionPerformed

    private void jcboxSubjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxSubjActionPerformed
        jtxtsubj.setText(jcboxSubj.getSelectedItem().toString());
        jtxtsubj.setEditable(false);
    }//GEN-LAST:event_jcboxSubjActionPerformed

    private void jtxtDisplayidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayidActionPerformed

    private void jcboxCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxCourseActionPerformed
        jtxtCourse.setText(jcboxCourse.getSelectedItem().toString());
        jtxtCourse.setEditable(false);
    }//GEN-LAST:event_jcboxCourseActionPerformed

    private void jbtnSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubjectActionPerformed
        
        new JfrmSubjects().setVisible(true);
        this.setVisible(false);                
    }//GEN-LAST:event_jbtnSubjectActionPerformed

    private void jcboxDsubjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxDsubjActionPerformed
String subjsearch = jcboxDsubj.getSelectedItem().toString();
        String idsearch2 = jtxtDisplayid.getText();
       
        try{
            //pst = con.prepareStatement("Select * from subjects where idnum=?");
            //pst.setString(1, idsearch2);
            //rs = pst.executeQuery();
            pst2 = con.prepareStatement("Select * from subjects where subject=? and idnum=?");
            pst2.setString(1, subjsearch);
            pst2.setString(2, idsearch2);
            rs2 = pst2.executeQuery();
            
            while(rs2.next()){
                jtxtDisplayFinalGrade.setText(rs2.getString("finalgrade"));
                jtxtDisplaysubj.setText(jcboxDsubj.getSelectedItem().toString());
                jtxtDisplaysubj.setEditable(false);
            }
                        
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }        
        //***********************ORIGINAL**************************
//        String subjsearch = jcboxDsubj.getSelectedItem().toString();
//        String idsearch = jtxtDisplayid.getText();
//       
//        try{
//            pst = con.prepareStatement("Select * from subjects where subject=?");
//            pst.setString(1, subjsearch);
//            rs = pst.executeQuery();
//            
//            while(rs.next()){
//               
//                jtxtDisplayFinalGrade.setText(rs.getString("finalgrade"));
//                jtxtDisplayFinalGrade.setEditable(false);
//                jtxtDisplaysubj.setText(jcboxDsubj.getSelectedItem().toString());
//                jtxtDisplaysubj.setEditable(false);
//                
//            }
//            
//        }
//        
//        catch(SQLException e){
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_jcboxDsubjActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpnlblue;
    private javax.swing.JPanel Jpnlgray;
    private javax.swing.JSeparator idnum;
    private javax.swing.JSeparator idnum1;
    private javax.swing.JSeparator idnum2;
    private javax.swing.JSeparator idnum3;
    private javax.swing.JSeparator idnum4;
    private javax.swing.JSeparator idnum5;
    private javax.swing.JSeparator idnum6;
    private javax.swing.JSeparator idnum7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNew;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnSubject;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox jcboxCourse;
    private javax.swing.JComboBox jcboxDsubj;
    private javax.swing.JComboBox jcboxSubj;
    private javax.swing.JComboBox<String> jcboxYr;
    private javax.swing.JLabel jlblPhoto;
    private javax.swing.JTextField jtxtCourse;
    private javax.swing.JTextField jtxtDisplayFinalGrade;
    private javax.swing.JTextField jtxtDisplaycourse;
    private javax.swing.JTextField jtxtDisplayfirst;
    private javax.swing.JTextField jtxtDisplayid;
    private javax.swing.JTextField jtxtDisplaylast;
    private javax.swing.JTextField jtxtDisplaymid;
    private javax.swing.JTextField jtxtDisplaysubj;
    private javax.swing.JTextField jtxtDisplayyr;
    private javax.swing.JTextField jtxtFinal;
    private javax.swing.JTextField jtxtFirst;
    private javax.swing.JTextField jtxtIdnum;
    private javax.swing.JTextField jtxtLast;
    private javax.swing.JTextField jtxtMid;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTextField jtxtYr;
    private javax.swing.JTextField jtxtsubj;
    // End of variables declaration//GEN-END:variables
}
