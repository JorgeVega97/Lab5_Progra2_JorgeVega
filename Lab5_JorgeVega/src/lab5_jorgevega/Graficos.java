package lab5_jorgevega;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 Jorge Vega
 */
public class Graficos extends javax.swing.JFrame {
         public Graficos() {
         initComponents();
         this.setLocationRelativeTo(null);
         
         
         
         
         
         
         
         
         GENERO_VARON.setSelected(true);
         SELE_LICENCIATURAS.setSelected(true);
         list_licenciado.setVisible(false);
         list_ingenieros.setVisible(false);
         list_medicos.setVisible(false);
                                DefaultComboBoxModel EXAMPLE = (DefaultComboBoxModel) list_licenciado.getModel();
                                EXAMPLE.addElement(new Facultad_Licenciaturas("FINANZAS",                   "FINANZAS",                   "Lic.tura",      "Licenciada Ema Rodriguez", 24000));
       
                                EXAMPLE.addElement(new Facultad_Licenciaturas("DERECHO",                    "DERECHO",                    "Lic.tura",      "Licenciada Elly Atuan", 35000));
       
                                EXAMPLE.addElement(new Facultad_Licenciaturas("ADMINISTRACION DE EMPRESAS", "ADMINISTRACION DE EMPRESAS", "Lic.tura",      "Licenciado Emerson Gomez", 29000));
       
                                EXAMPLE.addElement(new Facultad_Licenciaturas("DISENO GRAFICO",             "DISENO GRAFICO",             "Lic.tura",      "Licenciado Edgar Turcios", 26000));
       
                                EXAMPLE.addElement(new Facultad_Licenciaturas("MERCADOTECNIA",              "MERCADOTECNIA",              "Lic.tura",      "Licenciado Jorge Villanueva", 27000));
                                list_licenciado.setModel(EXAMPLE);
                                DefaultComboBoxModel EXAMPLES = (DefaultComboBoxModel) list_ingenieros.getModel();
                                EXAMPLES.addElement(new Facultad_Ingenieria("SISTEMAS COMPUTACIONALES", "SISTEMAS COMPUTACIONALES", "Ing.ria",           "Ingeniero Luis Fortin", 40000));
        
                                EXAMPLES.addElement(new Facultad_Ingenieria("INDUSTRIAL",               "INDUSTRIAL",               "Ing.ria",           "Ingeniero Hector Lopez", 43000));
        
                                EXAMPLES.addElement(new Facultad_Ingenieria("MECATRONICA",              "MECATRONICA",              "Ing.ria",           "Ingeniera Carmen Avilez", 44000));
        
                                EXAMPLES.addElement(new Facultad_Ingenieria("BIOMEDICA",                "BIOMEDICA",                "Ing.ria",           "Ingeniero Diana Aguilar", 54000));
        
                                EXAMPLES.addElement(new Facultad_Ingenieria("ENERGIA",                  "ENERGIA",                  "Ing.ria",           "Ingeniero Mariza Santos", 56000));
                                list_ingenieros.setModel(EXAMPLES);
                                DefaultComboBoxModel EXAMPLESS = (DefaultComboBoxModel) list_medicos.getModel();
                                EXAMPLESS.addElement(new Facultad_Medicina("MEDICINA",          "MEDICINA",          "Doctorado",      "Doctor Juan Medina", 50000));
        
                                EXAMPLESS.addElement(new Facultad_Medicina("ODONTOLOGIA",       "ODONTOLOGIA",       "C.Salud",        "Doctor Augusto Vega", 51000));
       
                                EXAMPLESS.addElement(new Facultad_Medicina("NUTRICION",         "NUTRICION",         "C.Salud",        "Doctor Jeremy Mejia", 57000));
       
                                EXAMPLESS.addElement(new Facultad_Medicina("TERAPIA FUNCIONAL", "TERAPIA FUNCIONAL", "C.Salud",        "Doctora Mercedes Agurcia", 57000));
                                list_medicos.setModel(EXAMPLESS);} @SuppressWarnings("cod")
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GENERO_ELE = new javax.swing.ButtonGroup();
        FACULTADES = new javax.swing.JTextField();
        COURSES = new javax.swing.ButtonGroup();
        BUTTON = new javax.swing.ButtonGroup();
        CONTROL_ADMI = new javax.swing.JPopupMenu();
        QUIERO_MODIFICAR = new javax.swing.JMenuItem();
        QUIERO_ELIMINAR = new javax.swing.JMenuItem();
        ARBOLITOP = new javax.swing.JMenuItem();
        BANDEJA2 = new javax.swing.JPopupMenu();
        modi = new javax.swing.JMenuItem();
        eli = new javax.swing.JMenuItem();
        arbol_opciones = new javax.swing.JPopupMenu();
        editar = new javax.swing.JMenuItem();
        borrar = new javax.swing.JMenuItem();
        modificar_arbol = new javax.swing.JPopupMenu();
        edicion = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        men3 = new javax.swing.JPopupMenu();
        modificatior = new javax.swing.JMenuItem();
        deltior = new javax.swing.JMenuItem();
        maestros_opciones = new javax.swing.JPopupMenu();
        modificar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        C1 = new javax.swing.JTabbedPane();
        PRICIPAL_PANEL = new javax.swing.JPanel();
        C2 = new javax.swing.JTabbedPane();
        Panel_registro_estudiantes = new javax.swing.JPanel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        REGIS_NOM_ESTUDENT = new javax.swing.JTextField();
        REGIS_APE_ESTUDENT = new javax.swing.JTextField();
        REGIS_EDAD_ESTUDEN = new javax.swing.JFormattedTextField();
        GENERO_MUJER = new javax.swing.JRadioButton();
        GENERO_VARON = new javax.swing.JRadioButton();
        BUTTON_REGISTRAR_estudianteNuevo = new javax.swing.JButton();
        list_licenciado = new javax.swing.JComboBox<>();
        L1 = new javax.swing.JLabel();
        SELE_LICENCIATURAS = new javax.swing.JRadioButton();
        SELE_INGENIERIA = new javax.swing.JRadioButton();
        SELE_CCS = new javax.swing.JRadioButton();
        list_medicos = new javax.swing.JComboBox<>();
        list_ingenieros = new javax.swing.JComboBox<>();
        Panel_registro_carreras = new javax.swing.JPanel();
        L8 = new javax.swing.JLabel();
        REGIS_NOM_CARRE = new javax.swing.JTextField();
        L10 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        REGIS_JEFE_FACU = new javax.swing.JTextField();
        REGIS_COS_CARRE = new javax.swing.JFormattedTextField();
        BUTTON_REGIS_CARRE = new javax.swing.JButton();
        SELE_CARRE_LIC = new javax.swing.JRadioButton();
        SELE_CARRE_ING = new javax.swing.JRadioButton();
        SELE_CARRE_MEDI = new javax.swing.JRadioButton();
        PANEL_REGIS_MAESTROS = new javax.swing.JPanel();
        L12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        REGIS_APELLIDO_MAES = new javax.swing.JTextField();
        REGIS_NOM_MAES = new javax.swing.JTextField();
        L14 = new javax.swing.JLabel();
        REGIS_EDAD_MAES = new javax.swing.JFormattedTextField();
        REGIS_SUEL_MAES = new javax.swing.JFormattedTextField();
        L15 = new javax.swing.JLabel();
        BUTTON_REGIS_CATEDRATICO = new javax.swing.JButton();
        P = new javax.swing.JScrollPane();
        SHOW_ME_BEBE = new javax.swing.JList<>();
        L16 = new javax.swing.JLabel();
        LIST_CLSS_IMPARTE = new javax.swing.JComboBox<>();
        CORRER = new javax.swing.JButton();
        PANEL_CLASS_REGIS = new javax.swing.JPanel();
        L17 = new javax.swing.JLabel();
        L18 = new javax.swing.JLabel();
        REGIS_CODClass = new javax.swing.JTextField();
        L19 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        L22 = new javax.swing.JLabel();
        REGIS_NOM_CLASS = new javax.swing.JTextField();
        REGIS_AULA = new javax.swing.JTextField();
        REGIS_COD_EDIFICIO = new javax.swing.JTextField();
        BUTTON_REGIS_ASIGNATURA = new javax.swing.JButton();
        L21 = new javax.swing.JLabel();
        AIRE_YES = new javax.swing.JRadioButton();
        AIRE_NO = new javax.swing.JRadioButton();
        panel_other = new javax.swing.JPanel();
        contenedor_panel = new javax.swing.JTabbedPane();
        PANEL_ADMIN_ESTU = new javax.swing.JPanel();
        L23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADMI_ESTUDENTS = new javax.swing.JList<>();
        PANEL_ADMIN_CARRE = new javax.swing.JPanel();
        L24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ADMIN_CARRE = new javax.swing.JList<>();
        PANEL_ADMIN_MAESTR = new javax.swing.JPanel();
        L25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ADMIN_MAES = new javax.swing.JList<>();
        PANEL_ADMIN_ASIGNT = new javax.swing.JPanel();
        L26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ADMIN_ASIGNAT = new javax.swing.JList<>();
        PANEL_ARBOLITO = new javax.swing.JPanel();
        NEW = new javax.swing.JScrollPane();
        ARBOLITO_BONITO = new javax.swing.JTree();

        QUIERO_MODIFICAR.setText("Modificar");
        QUIERO_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUIERO_MODIFICARActionPerformed(evt);
            }
        });
        CONTROL_ADMI.add(QUIERO_MODIFICAR);

        QUIERO_ELIMINAR.setText("Eliminar");
        QUIERO_ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUIERO_ELIMINARActionPerformed(evt);
            }
        });
        CONTROL_ADMI.add(QUIERO_ELIMINAR);

        ARBOLITOP.setText("Jtree");
        ARBOLITOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARBOLITOPActionPerformed(evt);
            }
        });
        CONTROL_ADMI.add(ARBOLITOP);

        modi.setText("Modificar");
        modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiActionPerformed(evt);
            }
        });
        BANDEJA2.add(modi);

        eli.setText("Eliminar");
        eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliActionPerformed(evt);
            }
        });
        BANDEJA2.add(eli);

        editar.setText("Editar");
        arbol_opciones.add(editar);

        borrar.setText("Eliminar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        arbol_opciones.add(borrar);

        edicion.setText("Editar");
        edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionActionPerformed(evt);
            }
        });
        modificar_arbol.add(edicion);

        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        modificar_arbol.add(delete);

        modificatior.setText("Modificar");
        modificatior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificatiorActionPerformed(evt);
            }
        });
        men3.add(modificatior);

        deltior.setText("Eliminar");
        deltior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltiorActionPerformed(evt);
            }
        });
        men3.add(deltior);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        maestros_opciones.add(modificar);

        eliminar.setText("Eliminar");
        eliminar.setToolTipText("");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        maestros_opciones.add(eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        C1.setBackground(new java.awt.Color(0, 0, 0));
        C1.setForeground(new java.awt.Color(153, 153, 153));
        C1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        C1.setOpaque(true);

        PRICIPAL_PANEL.setBackground(new java.awt.Color(51, 51, 51));

        C2.setBackground(new java.awt.Color(51, 51, 51));
        C2.setForeground(new java.awt.Color(153, 153, 153));
        C2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        C2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        C2.setDoubleBuffered(true);
        C2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        C2.setOpaque(true);

        Panel_registro_estudiantes.setBackground(new java.awt.Color(0, 51, 102));

        L4.setBackground(new java.awt.Color(0, 51, 102));
        L4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L4.setForeground(new java.awt.Color(102, 255, 255));
        L4.setText("INGRESE EL APELLIDOS DEL ESTUDIANTE");

        L5.setBackground(new java.awt.Color(0, 51, 102));
        L5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L5.setForeground(new java.awt.Color(102, 255, 255));
        L5.setText("INGRESE LA EDAD");

        L3.setBackground(new java.awt.Color(0, 51, 102));
        L3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L3.setForeground(new java.awt.Color(102, 255, 255));
        L3.setText("INGRESE EL NOMBRES DEL ESTUDIANTE");

        L2.setBackground(new java.awt.Color(0, 51, 102));
        L2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(102, 255, 255));
        L2.setText("ELIJA EL GENERO");

        L6.setBackground(new java.awt.Color(0, 51, 102));
        L6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L6.setForeground(new java.awt.Color(102, 255, 255));
        L6.setText("ELIJA LA CARRERA");

        REGIS_NOM_ESTUDENT.setBackground(new java.awt.Color(204, 204, 255));

        REGIS_APE_ESTUDENT.setBackground(new java.awt.Color(204, 204, 255));

        REGIS_EDAD_ESTUDEN.setBackground(new java.awt.Color(204, 204, 255));
        REGIS_EDAD_ESTUDEN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        GENERO_MUJER.setBackground(new java.awt.Color(0, 51, 102));
        GENERO_ELE.add(GENERO_MUJER);
        GENERO_MUJER.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        GENERO_MUJER.setForeground(new java.awt.Color(255, 255, 255));
        GENERO_MUJER.setText("MUJER");

        GENERO_VARON.setBackground(new java.awt.Color(0, 51, 102));
        GENERO_ELE.add(GENERO_VARON);
        GENERO_VARON.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        GENERO_VARON.setForeground(new java.awt.Color(255, 255, 255));
        GENERO_VARON.setText("HOMBRE");
        GENERO_VARON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERO_VARONActionPerformed(evt);
            }
        });

        BUTTON_REGISTRAR_estudianteNuevo.setBackground(new java.awt.Color(0, 0, 0));
        BUTTON_REGISTRAR_estudianteNuevo.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        BUTTON_REGISTRAR_estudianteNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_REGISTRAR_estudianteNuevo.setText("CREAR");
        BUTTON_REGISTRAR_estudianteNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUTTON_REGISTRAR_estudianteNuevoMouseClicked(evt);
            }
        });

        list_licenciado.setBackground(new java.awt.Color(0, 0, 0));
        list_licenciado.setForeground(new java.awt.Color(204, 204, 204));

        L1.setBackground(new java.awt.Color(0, 51, 102));
        L1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("Formulario para registro de estudiantes");
        L1.setOpaque(true);

        SELE_LICENCIATURAS.setBackground(new java.awt.Color(0, 51, 102));
        COURSES.add(SELE_LICENCIATURAS);
        SELE_LICENCIATURAS.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        SELE_LICENCIATURAS.setForeground(new java.awt.Color(102, 255, 255));
        SELE_LICENCIATURAS.setText("LICENCIATURA");
        SELE_LICENCIATURAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELE_LICENCIATURASMouseClicked(evt);
            }
        });

        SELE_INGENIERIA.setBackground(new java.awt.Color(0, 51, 102));
        COURSES.add(SELE_INGENIERIA);
        SELE_INGENIERIA.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        SELE_INGENIERIA.setForeground(new java.awt.Color(102, 255, 255));
        SELE_INGENIERIA.setText("INGENIERIA");
        SELE_INGENIERIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELE_INGENIERIAMouseClicked(evt);
            }
        });

        SELE_CCS.setBackground(new java.awt.Color(0, 51, 102));
        COURSES.add(SELE_CCS);
        SELE_CCS.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        SELE_CCS.setForeground(new java.awt.Color(102, 255, 255));
        SELE_CCS.setText("MEDICINA");
        SELE_CCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELE_CCSMouseClicked(evt);
            }
        });

        list_medicos.setBackground(new java.awt.Color(0, 0, 0));
        list_medicos.setForeground(new java.awt.Color(204, 204, 204));

        list_ingenieros.setBackground(new java.awt.Color(0, 0, 0));
        list_ingenieros.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout Panel_registro_estudiantesLayout = new javax.swing.GroupLayout(Panel_registro_estudiantes);
        Panel_registro_estudiantes.setLayout(Panel_registro_estudiantesLayout);
        Panel_registro_estudiantesLayout.setHorizontalGroup(
            Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(list_ingenieros, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_licenciado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(L6))
                    .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                        .addComponent(SELE_INGENIERIA, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SELE_CCS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SELE_LICENCIATURAS, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(REGIS_EDAD_ESTUDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(BUTTON_REGISTRAR_estudianteNuevo))
                    .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(L4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L3)
                        .addComponent(REGIS_APE_ESTUDENT)
                        .addComponent(REGIS_NOM_ESTUDENT)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_estudiantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_estudiantesLayout.createSequentialGroup()
                        .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(L2))
                            .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                                .addComponent(GENERO_VARON)
                                .addGap(46, 46, 46)
                                .addComponent(GENERO_MUJER)))
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_estudiantesLayout.createSequentialGroup()
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Panel_registro_estudiantesLayout.setVerticalGroup(
            Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registro_estudiantesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(L1)
                .addGap(18, 18, 18)
                .addComponent(L2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GENERO_VARON)
                    .addComponent(GENERO_MUJER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L3)
                .addGap(5, 5, 5)
                .addComponent(REGIS_NOM_ESTUDENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_APE_ESTUDENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_EDAD_ESTUDEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L6)
                .addGap(3, 3, 3)
                .addGroup(Panel_registro_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SELE_CCS)
                    .addComponent(SELE_INGENIERIA)
                    .addComponent(SELE_LICENCIATURAS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUTTON_REGISTRAR_estudianteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(list_ingenieros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(list_licenciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        C2.addTab("ESTUDIANTE", Panel_registro_estudiantes);

        Panel_registro_carreras.setBackground(new java.awt.Color(102, 0, 0));

        L8.setBackground(new java.awt.Color(102, 0, 0));
        L8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L8.setForeground(new java.awt.Color(255, 153, 255));
        L8.setText("INGRESE NOMBRE");

        REGIS_NOM_CARRE.setBackground(new java.awt.Color(255, 204, 204));

        L10.setBackground(new java.awt.Color(102, 0, 0));
        L10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L10.setForeground(new java.awt.Color(255, 153, 255));
        L10.setText("INGRESE LA FACULTAD");

        L9.setBackground(new java.awt.Color(102, 0, 0));
        L9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L9.setForeground(new java.awt.Color(255, 153, 255));
        L9.setText("INGRESE JEFE DE CARRERA");

        L11.setBackground(new java.awt.Color(102, 0, 0));
        L11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L11.setForeground(new java.awt.Color(255, 153, 255));
        L11.setText("INGRESE EL COSTO MENSUAL");

        L7.setBackground(new java.awt.Color(102, 0, 0));
        L7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        L7.setForeground(new java.awt.Color(255, 255, 255));
        L7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L7.setText("Formulario para registro de carreras");
        L7.setOpaque(true);

        REGIS_JEFE_FACU.setBackground(new java.awt.Color(255, 204, 204));

        REGIS_COS_CARRE.setBackground(new java.awt.Color(255, 204, 204));
        REGIS_COS_CARRE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        BUTTON_REGIS_CARRE.setBackground(new java.awt.Color(51, 51, 51));
        BUTTON_REGIS_CARRE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        BUTTON_REGIS_CARRE.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_REGIS_CARRE.setText("CREAR");
        BUTTON_REGIS_CARRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUTTON_REGIS_CARREMouseClicked(evt);
            }
        });

        SELE_CARRE_LIC.setBackground(new java.awt.Color(102, 0, 0));
        COURSES.add(SELE_CARRE_LIC);
        SELE_CARRE_LIC.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        SELE_CARRE_LIC.setForeground(new java.awt.Color(255, 255, 255));
        SELE_CARRE_LIC.setText("LICENCIATURA");
        SELE_CARRE_LIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELE_CARRE_LICMouseClicked(evt);
            }
        });

        SELE_CARRE_ING.setBackground(new java.awt.Color(102, 0, 0));
        COURSES.add(SELE_CARRE_ING);
        SELE_CARRE_ING.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        SELE_CARRE_ING.setForeground(new java.awt.Color(255, 255, 255));
        SELE_CARRE_ING.setText("INGENIERIA");
        SELE_CARRE_ING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELE_CARRE_INGMouseClicked(evt);
            }
        });

        SELE_CARRE_MEDI.setBackground(new java.awt.Color(102, 0, 0));
        COURSES.add(SELE_CARRE_MEDI);
        SELE_CARRE_MEDI.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        SELE_CARRE_MEDI.setForeground(new java.awt.Color(255, 255, 255));
        SELE_CARRE_MEDI.setText("MEDICINA");
        SELE_CARRE_MEDI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELE_CARRE_MEDIMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_registro_carrerasLayout = new javax.swing.GroupLayout(Panel_registro_carreras);
        Panel_registro_carreras.setLayout(Panel_registro_carrerasLayout);
        Panel_registro_carrerasLayout.setHorizontalGroup(
            Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_carrerasLayout.createSequentialGroup()
                        .addGroup(Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_carrerasLayout.createSequentialGroup()
                                .addComponent(SELE_CARRE_ING)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SELE_CARRE_LIC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SELE_CARRE_MEDI))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_carrerasLayout.createSequentialGroup()
                                .addComponent(L8)
                                .addGap(82, 82, 82))
                            .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                                .addGroup(Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(L10))
                                            .addGroup(Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(L9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(REGIS_NOM_CARRE)
                                                .addComponent(REGIS_JEFE_FACU, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(L11))
                                    .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(REGIS_COS_CARRE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(BUTTON_REGIS_CARRE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registro_carrerasLayout.createSequentialGroup()
                        .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        Panel_registro_carrerasLayout.setVerticalGroup(
            Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registro_carrerasLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(L7)
                .addGap(30, 30, 30)
                .addComponent(L8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(REGIS_NOM_CARRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_JEFE_FACU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_registro_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SELE_CARRE_LIC)
                    .addComponent(SELE_CARRE_ING)
                    .addComponent(SELE_CARRE_MEDI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_COS_CARRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUTTON_REGIS_CARRE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        C2.addTab("CARRERA", Panel_registro_carreras);

        PANEL_REGIS_MAESTROS.setBackground(new java.awt.Color(153, 102, 0));

        L12.setBackground(new java.awt.Color(153, 102, 0));
        L12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        L12.setForeground(new java.awt.Color(255, 255, 255));
        L12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L12.setText("Formulario para registro de maestros");
        L12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 102, 0));
        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("INGRESE NOMBRE DEL CATEDRATICO");

        L13.setBackground(new java.awt.Color(204, 102, 0));
        L13.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L13.setForeground(new java.awt.Color(255, 255, 51));
        L13.setText("INGRESE APELLIDO");

        REGIS_APELLIDO_MAES.setBackground(new java.awt.Color(255, 255, 153));

        REGIS_NOM_MAES.setBackground(new java.awt.Color(255, 255, 153));

        L14.setBackground(new java.awt.Color(204, 102, 0));
        L14.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L14.setForeground(new java.awt.Color(255, 255, 51));
        L14.setText("INGRESE LA EDAD");

        REGIS_EDAD_MAES.setBackground(new java.awt.Color(255, 255, 153));
        REGIS_EDAD_MAES.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        REGIS_SUEL_MAES.setBackground(new java.awt.Color(255, 255, 153));
        REGIS_SUEL_MAES.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        L15.setBackground(new java.awt.Color(204, 102, 0));
        L15.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L15.setForeground(new java.awt.Color(255, 255, 51));
        L15.setText("INGRESE EL SALARIO DEL MAESTRO");

        BUTTON_REGIS_CATEDRATICO.setBackground(new java.awt.Color(0, 0, 0));
        BUTTON_REGIS_CATEDRATICO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        BUTTON_REGIS_CATEDRATICO.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_REGIS_CATEDRATICO.setText("CREAR");
        BUTTON_REGIS_CATEDRATICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUTTON_REGIS_CATEDRATICOMouseClicked(evt);
            }
        });

        SHOW_ME_BEBE.setBackground(new java.awt.Color(255, 255, 153));
        SHOW_ME_BEBE.setModel(new DefaultListModel());
        P.setViewportView(SHOW_ME_BEBE);

        L16.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L16.setForeground(new java.awt.Color(255, 255, 51));
        L16.setText("LAS CLASES QUE IMPARTE SON:");

        LIST_CLSS_IMPARTE.setBackground(new java.awt.Color(0, 0, 0));

        CORRER.setBackground(new java.awt.Color(0, 0, 0));
        CORRER.setText(">");
        CORRER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CORRERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PANEL_REGIS_MAESTROSLayout = new javax.swing.GroupLayout(PANEL_REGIS_MAESTROS);
        PANEL_REGIS_MAESTROS.setLayout(PANEL_REGIS_MAESTROSLayout);
        PANEL_REGIS_MAESTROSLayout.setHorizontalGroup(
            PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L12, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
            .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                .addGroup(PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(REGIS_APELLIDO_MAES, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                            .addGap(251, 251, 251)
                            .addComponent(L13))
                        .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(L15))
                        .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(REGIS_NOM_MAES, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                                .addGroup(PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(REGIS_EDAD_MAES)
                                        .addComponent(L14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(REGIS_SUEL_MAES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(240, 240, 240))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                                .addComponent(L16)
                                .addGap(187, 187, 187)))
                        .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                            .addComponent(LIST_CLSS_IMPARTE, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CORRER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(187, 187, 187)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                        .addComponent(BUTTON_REGIS_CATEDRATICO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
        );
        PANEL_REGIS_MAESTROSLayout.setVerticalGroup(
            PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_REGIS_MAESTROSLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(L12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_NOM_MAES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_APELLIDO_MAES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(L14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_EDAD_MAES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_SUEL_MAES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANEL_REGIS_MAESTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CORRER, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LIST_CLSS_IMPARTE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUTTON_REGIS_CATEDRATICO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        C2.addTab("MAESTRO", PANEL_REGIS_MAESTROS);

        PANEL_CLASS_REGIS.setBackground(new java.awt.Color(0, 102, 51));

        L17.setBackground(new java.awt.Color(0, 102, 51));
        L17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        L17.setForeground(new java.awt.Color(255, 255, 255));
        L17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L17.setText("Formulario para registro de Asignaturas");
        L17.setOpaque(true);

        L18.setBackground(new java.awt.Color(0, 102, 0));
        L18.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L18.setForeground(new java.awt.Color(102, 255, 102));
        L18.setText("INGRESE EL NOMBRE");

        REGIS_CODClass.setBackground(new java.awt.Color(204, 255, 204));

        L19.setBackground(new java.awt.Color(0, 102, 0));
        L19.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L19.setForeground(new java.awt.Color(102, 255, 102));
        L19.setText("INGRESE LA SECCION");

        L20.setBackground(new java.awt.Color(0, 102, 0));
        L20.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L20.setForeground(new java.awt.Color(102, 255, 102));
        L20.setText("INGRESE EL NUMERO DE AULA");

        L22.setBackground(new java.awt.Color(0, 102, 0));
        L22.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L22.setForeground(new java.awt.Color(102, 255, 102));
        L22.setText("CODIGO DE EDIFICIO");

        REGIS_NOM_CLASS.setBackground(new java.awt.Color(204, 255, 204));

        REGIS_AULA.setBackground(new java.awt.Color(204, 255, 204));

        REGIS_COD_EDIFICIO.setBackground(new java.awt.Color(204, 255, 204));

        BUTTON_REGIS_ASIGNATURA.setBackground(new java.awt.Color(0, 0, 0));
        BUTTON_REGIS_ASIGNATURA.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        BUTTON_REGIS_ASIGNATURA.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_REGIS_ASIGNATURA.setText("CREAR");
        BUTTON_REGIS_ASIGNATURA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUTTON_REGIS_ASIGNATURAMouseClicked(evt);
            }
        });
        BUTTON_REGIS_ASIGNATURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_REGIS_ASIGNATURAActionPerformed(evt);
            }
        });

        L21.setBackground(new java.awt.Color(0, 102, 0));
        L21.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        L21.setForeground(new java.awt.Color(102, 255, 102));
        L21.setText("EL SALON TIENE AIRE ACONDICIONADO?");

        AIRE_YES.setBackground(new java.awt.Color(0, 102, 51));
        AIRE_YES.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        AIRE_YES.setForeground(new java.awt.Color(255, 255, 255));
        AIRE_YES.setText("SI TIENE");

        AIRE_NO.setBackground(new java.awt.Color(0, 102, 51));
        AIRE_NO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        AIRE_NO.setForeground(new java.awt.Color(255, 255, 255));
        AIRE_NO.setText("NO TIENE");

        javax.swing.GroupLayout PANEL_CLASS_REGISLayout = new javax.swing.GroupLayout(PANEL_CLASS_REGIS);
        PANEL_CLASS_REGIS.setLayout(PANEL_CLASS_REGISLayout);
        PANEL_CLASS_REGISLayout.setHorizontalGroup(
            PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L17, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_CLASS_REGISLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_CLASS_REGISLayout.createSequentialGroup()
                        .addComponent(L19)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_CLASS_REGISLayout.createSequentialGroup()
                        .addComponent(L18)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_CLASS_REGISLayout.createSequentialGroup()
                        .addComponent(L20)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_CLASS_REGISLayout.createSequentialGroup()
                        .addComponent(L21)
                        .addGap(163, 163, 163))))
            .addGroup(PANEL_CLASS_REGISLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_CLASS_REGISLayout.createSequentialGroup()
                        .addGroup(PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANEL_CLASS_REGISLayout.createSequentialGroup()
                                .addComponent(AIRE_YES)
                                .addGap(39, 39, 39)
                                .addComponent(AIRE_NO))
                            .addGroup(PANEL_CLASS_REGISLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(REGIS_COD_EDIFICIO))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PANEL_CLASS_REGISLayout.createSequentialGroup()
                        .addGroup(PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(REGIS_CODClass, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(REGIS_NOM_CLASS)
                            .addComponent(REGIS_AULA, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(204, 204, 204))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_CLASS_REGISLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTON_REGIS_ASIGNATURA)
                .addGap(250, 250, 250))
        );
        PANEL_CLASS_REGISLayout.setVerticalGroup(
            PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_CLASS_REGISLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(L17)
                .addGap(18, 18, 18)
                .addComponent(L18)
                .addGap(4, 4, 4)
                .addComponent(REGIS_NOM_CLASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(L19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_CODClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_AULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANEL_CLASS_REGISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIRE_YES)
                    .addComponent(AIRE_NO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REGIS_COD_EDIFICIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUTTON_REGIS_ASIGNATURA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        C2.addTab("ASIGANATURAS", PANEL_CLASS_REGIS);

        javax.swing.GroupLayout PRICIPAL_PANELLayout = new javax.swing.GroupLayout(PRICIPAL_PANEL);
        PRICIPAL_PANEL.setLayout(PRICIPAL_PANELLayout);
        PRICIPAL_PANELLayout.setHorizontalGroup(
            PRICIPAL_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRICIPAL_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PRICIPAL_PANELLayout.setVerticalGroup(
            PRICIPAL_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRICIPAL_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C2)
                .addContainerGap())
        );

        C1.addTab("CREAR", PRICIPAL_PANEL);

        panel_other.setBackground(new java.awt.Color(51, 51, 51));

        contenedor_panel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        contenedor_panel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        contenedor_panel.setDoubleBuffered(true);
        contenedor_panel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        PANEL_ADMIN_ESTU.setBackground(new java.awt.Color(0, 0, 0));

        L23.setBackground(new java.awt.Color(0, 51, 102));
        L23.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        L23.setForeground(new java.awt.Color(255, 255, 255));
        L23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L23.setText("Administrar Estudiantes");
        L23.setOpaque(true);

        ADMI_ESTUDENTS.setBackground(new java.awt.Color(153, 153, 255));
        ADMI_ESTUDENTS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ADMI_ESTUDENTS.setModel(new DefaultListModel());
        ADMI_ESTUDENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMI_ESTUDENTSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ADMI_ESTUDENTS);

        javax.swing.GroupLayout PANEL_ADMIN_ESTULayout = new javax.swing.GroupLayout(PANEL_ADMIN_ESTU);
        PANEL_ADMIN_ESTU.setLayout(PANEL_ADMIN_ESTULayout);
        PANEL_ADMIN_ESTULayout.setHorizontalGroup(
            PANEL_ADMIN_ESTULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        PANEL_ADMIN_ESTULayout.setVerticalGroup(
            PANEL_ADMIN_ESTULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ADMIN_ESTULayout.createSequentialGroup()
                .addComponent(L23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
        );

        contenedor_panel.addTab("ESTUDIANTES", PANEL_ADMIN_ESTU);

        PANEL_ADMIN_CARRE.setBackground(new java.awt.Color(0, 0, 0));

        L24.setBackground(new java.awt.Color(153, 0, 0));
        L24.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        L24.setForeground(new java.awt.Color(255, 255, 255));
        L24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L24.setText("Administrar Carreras");
        L24.setOpaque(true);

        ADMIN_CARRE.setBackground(new java.awt.Color(255, 102, 102));
        ADMIN_CARRE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADMIN_CARRE.setModel(new DefaultListModel());
        ADMIN_CARRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMIN_CARREMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ADMIN_CARRE);

        javax.swing.GroupLayout PANEL_ADMIN_CARRELayout = new javax.swing.GroupLayout(PANEL_ADMIN_CARRE);
        PANEL_ADMIN_CARRE.setLayout(PANEL_ADMIN_CARRELayout);
        PANEL_ADMIN_CARRELayout.setHorizontalGroup(
            PANEL_ADMIN_CARRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(L24, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        PANEL_ADMIN_CARRELayout.setVerticalGroup(
            PANEL_ADMIN_CARRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ADMIN_CARRELayout.createSequentialGroup()
                .addComponent(L24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );

        contenedor_panel.addTab("CARRERAS", PANEL_ADMIN_CARRE);

        PANEL_ADMIN_MAESTR.setBackground(new java.awt.Color(0, 0, 0));

        L25.setBackground(new java.awt.Color(153, 102, 0));
        L25.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        L25.setForeground(new java.awt.Color(255, 255, 255));
        L25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L25.setText("Administrar Maestros");
        L25.setOpaque(true);

        ADMIN_MAES.setBackground(new java.awt.Color(255, 204, 51));
        ADMIN_MAES.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADMIN_MAES.setModel(new DefaultListModel());
        ADMIN_MAES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMIN_MAESMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ADMIN_MAES);

        javax.swing.GroupLayout PANEL_ADMIN_MAESTRLayout = new javax.swing.GroupLayout(PANEL_ADMIN_MAESTR);
        PANEL_ADMIN_MAESTR.setLayout(PANEL_ADMIN_MAESTRLayout);
        PANEL_ADMIN_MAESTRLayout.setHorizontalGroup(
            PANEL_ADMIN_MAESTRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addComponent(L25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PANEL_ADMIN_MAESTRLayout.setVerticalGroup(
            PANEL_ADMIN_MAESTRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ADMIN_MAESTRLayout.createSequentialGroup()
                .addComponent(L25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contenedor_panel.addTab("MAESTROS", PANEL_ADMIN_MAESTR);

        PANEL_ADMIN_ASIGNT.setBackground(new java.awt.Color(0, 0, 0));

        L26.setBackground(new java.awt.Color(0, 102, 0));
        L26.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        L26.setForeground(new java.awt.Color(255, 255, 255));
        L26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L26.setText("Administracion de Asignaturas");
        L26.setOpaque(true);

        ADMIN_ASIGNAT.setBackground(new java.awt.Color(102, 255, 51));
        ADMIN_ASIGNAT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADMIN_ASIGNAT.setModel(new DefaultListModel());
        ADMIN_ASIGNAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMIN_ASIGNATMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADMIN_ASIGNATMouseEntered(evt);
            }
        });
        jScrollPane6.setViewportView(ADMIN_ASIGNAT);

        javax.swing.GroupLayout PANEL_ADMIN_ASIGNTLayout = new javax.swing.GroupLayout(PANEL_ADMIN_ASIGNT);
        PANEL_ADMIN_ASIGNT.setLayout(PANEL_ADMIN_ASIGNTLayout);
        PANEL_ADMIN_ASIGNTLayout.setHorizontalGroup(
            PANEL_ADMIN_ASIGNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L26, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
        );
        PANEL_ADMIN_ASIGNTLayout.setVerticalGroup(
            PANEL_ADMIN_ASIGNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ADMIN_ASIGNTLayout.createSequentialGroup()
                .addComponent(L26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contenedor_panel.addTab("ASIGNATURAS", PANEL_ADMIN_ASIGNT);

        javax.swing.GroupLayout panel_otherLayout = new javax.swing.GroupLayout(panel_other);
        panel_other.setLayout(panel_otherLayout);
        panel_otherLayout.setHorizontalGroup(
            panel_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
        );
        panel_otherLayout.setVerticalGroup(
            panel_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_otherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor_panel)
                .addContainerGap())
        );

        C1.addTab("ADMIN", panel_other);

        PANEL_ARBOLITO.setBackground(new java.awt.Color(0, 0, 0));

        ARBOLITO_BONITO.setBackground(new java.awt.Color(51, 51, 51));
        ARBOLITO_BONITO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ARBOLITO_BONITO.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        ARBOLITO_BONITO.setForeground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("ARBOL DE CARRERAS");
        ARBOLITO_BONITO.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ARBOLITO_BONITO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ARBOLITO_BONITO.setEditable(true);
        ARBOLITO_BONITO.setShowsRootHandles(true);
        ARBOLITO_BONITO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ARBOLITO_BONITOMouseClicked(evt);
            }
        });
        NEW.setViewportView(ARBOLITO_BONITO);

        javax.swing.GroupLayout PANEL_ARBOLITOLayout = new javax.swing.GroupLayout(PANEL_ARBOLITO);
        PANEL_ARBOLITO.setLayout(PANEL_ARBOLITOLayout);
        PANEL_ARBOLITOLayout.setHorizontalGroup(
            PANEL_ARBOLITOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ARBOLITOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NEW, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        PANEL_ARBOLITOLayout.setVerticalGroup(
            PANEL_ARBOLITOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_ARBOLITOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NEW, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );

        C1.addTab("TREE", PANEL_ARBOLITO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(C1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(C1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    private void BUTTON_REGISTRAR_estudianteNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUTTON_REGISTRAR_estudianteNuevoMouseClicked
         String SEX = "";
         String CARR = "";
         Random ALE = new Random();
         int COUNT = 0;
         
         
         
         
         
         
         
         
         
         
         
         
        if (GENERO_MUJER.isSelected()) {
            SEX = "Mujer";} else {SEX = "Hombre";}
                while (CC(COUNT) == true) {
                COUNT =30000 + ALE.nextInt(430000);} 
                        list_NumCuenta.add(COUNT);
                        DefaultListModel EXAM = (DefaultListModel) ADMI_ESTUDENTS.getModel();
                       if (SELE_LICENCIATURAS.isSelected()) {
                       CARR = list_licenciado.getSelectedItem().toString();} else if (SELE_INGENIERIA.isSelected()) {
                       CARR = list_ingenieros.getSelectedItem().toString();} else {CARR = list_medicos.getSelectedItem().toString();}

            try {EXAM.addElement(new Clase_Estudiante(REGIS_NOM_ESTUDENT.getText(), REGIS_APE_ESTUDENT.getText(), COUNT, SEX, Integer.parseInt(REGIS_EDAD_ESTUDEN.getText()), CARR));
                     JOptionPane.showMessageDialog(this, "SE CREO UN NUEVO ESTUDIANTE");
                     list_licenciado.setVisible(false);list_ingenieros.setVisible(false);list_medicos.setVisible(false);
                     ADMI_ESTUDENTS.setModel(EXAM);REGIS_NOM_ESTUDENT.setText("");REGIS_APE_ESTUDENT.setText("");
                     GENERO_VARON.setSelected(true);REGIS_EDAD_ESTUDEN.setText("");
                     list_licenciado.setSelectedIndex(0);
                     }catch (Exception S) {JOptionPane.showMessageDialog(this, "NO PUEDEN QUEDAR CAMPOS EN BLANCO");} 
            
            
            
            
            
            
            
            
            
            
            
            
    }//GEN-LAST:event_BUTTON_REGISTRAR_estudianteNuevoMouseClicked

    private void SELE_LICENCIATURASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELE_LICENCIATURASMouseClicked
                    if (SELE_LICENCIATURAS.isSelected()) {list_licenciado.setVisible(true);}
    }//GEN-LAST:event_SELE_LICENCIATURASMouseClicked

    private void SELE_INGENIERIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELE_INGENIERIAMouseClicked
                    if (SELE_INGENIERIA.isSelected()) { list_ingenieros.setVisible(true);}
    }//GEN-LAST:event_SELE_INGENIERIAMouseClicked

    private void SELE_CCSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELE_CCSMouseClicked
                    if (SELE_CCS.isSelected()) {list_medicos.setVisible(true);}
    }//GEN-LAST:event_SELE_CCSMouseClicked

    private void BUTTON_REGIS_CARREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUTTON_REGIS_CARREMouseClicked

        
        
        
        
        
        
        
        
        
                      DefaultListModel EXAM = (DefaultListModel) ADMIN_CARRE.getModel();
                      DefaultListModel EXAMS = (DefaultListModel) ADMIN_CARRE.getModel();
                      DefaultListModel EXAMSS = (DefaultListModel) ADMIN_CARRE.getModel();
                      if (SELE_LICENCIATURAS.isSelected()) {
                                 Facultad_Licenciaturas INTANCIA_LICENCIATURA = new Facultad_Licenciaturas("LICENCIATURA", REGIS_NOM_CARRE.getText(), "LICENCIATURA", REGIS_JEFE_FACU.getText(), Float.parseFloat(REGIS_COS_CARRE.getText()));
                                 JOptionPane.showMessageDialog(this, "SE CREO UNA NUEVA CARRERA");
                                 EXAM.addElement(INTANCIA_LICENCIATURA);
                                 DefaultComboBoxModel OBJECT_LICENCIATURA = (DefaultComboBoxModel) list_licenciado.getModel();
                                 OBJECT_LICENCIATURA.addElement(INTANCIA_LICENCIATURA);
                                 list_licenciado.setModel(OBJECT_LICENCIATURA);
                                 REGIS_NOM_CARRE.setText("");REGIS_JEFE_FACU.setText("");
                                 REGIS_COS_CARRE.setText(""); SELE_LICENCIATURAS.setSelected(true);
                      } else if (SELE_INGENIERIA.isSelected()) {
                                 Facultad_Ingenieria INSTANCIA_INGENIERIA = new Facultad_Ingenieria("INGENIERIA", REGIS_NOM_CARRE.getText(), "INGENIERIA", REGIS_JEFE_FACU.getText(), Float.parseFloat(REGIS_COS_CARRE.getText()));
                                 DefaultComboBoxModel OBJECT_INGENIERIA = (DefaultComboBoxModel) list_ingenieros.getModel();
                                 OBJECT_INGENIERIA.addElement(INSTANCIA_INGENIERIA);
                                 JOptionPane.showMessageDialog(this, "SE CREO UNA NUEVA CARRERA");
                                 EXAMS.addElement(INSTANCIA_INGENIERIA);
                                 list_ingenieros.setModel(OBJECT_INGENIERIA);
                                 REGIS_NOM_CARRE.setText("");REGIS_JEFE_FACU.setText("");
                                 REGIS_COS_CARRE.setText("");SELE_LICENCIATURAS.setSelected(true);
                            } else {
                                    Facultad_Medicina INSTANCIA_SALUD = new Facultad_Medicina("CCS.SALUD", REGIS_NOM_CARRE.getText(), "CCS.SALUD", REGIS_JEFE_FACU.getText(), Float.parseFloat(REGIS_COS_CARRE.getText()));
                                    DefaultComboBoxModel OBJETO_SALUD = (DefaultComboBoxModel) list_medicos.getModel();
                                    OBJETO_SALUD.addElement(INSTANCIA_SALUD);
                                    JOptionPane.showMessageDialog(this, "SE CREO UNA NUEVA CARRERA");
                                    EXAMSS.addElement(INSTANCIA_SALUD);
                                    list_medicos.setModel(OBJETO_SALUD);
                                    REGIS_NOM_CARRE.setText("");
                                    REGIS_JEFE_FACU.setText("");
                                    REGIS_COS_CARRE.setText("");
                                    SELE_LICENCIATURAS.setSelected(true);}
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
    }//GEN-LAST:event_BUTTON_REGIS_CARREMouseClicked

    private void SELE_CARRE_LICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELE_CARRE_LICMouseClicked

    }//GEN-LAST:event_SELE_CARRE_LICMouseClicked

    private void SELE_CARRE_INGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELE_CARRE_INGMouseClicked

    }//GEN-LAST:event_SELE_CARRE_INGMouseClicked

    private void SELE_CARRE_MEDIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELE_CARRE_MEDIMouseClicked

    }//GEN-LAST:event_SELE_CARRE_MEDIMouseClicked

    private void QUIERO_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUIERO_MODIFICARActionPerformed
       
        
        
        
        
        
        
        
        
        
        
        
        if (ADMI_ESTUDENTS.getSelectedIndex() >= 0) {
            int OP_0 = Integer.parseInt(JOptionPane.showInputDialog(this, 
                      "1) NOMBRE\n"
                    + "2) APELLIDO\n"
                    + "3) EDAD\n"
                    + "4) CARRERA\n\n"
                    + "INGRESE LA OPCION:"));
                    switch (OP_0) {
                    case 1:
                        
                        
                               DefaultListModel ex = (DefaultListModel) ADMI_ESTUDENTS.getModel();
                               ((Clase_Estudiante) ex.get(ADMI_ESTUDENTS.getSelectedIndex())).setNAME(JOptionPane.showInputDialog("Nombre"));
                               ADMI_ESTUDENTS.setModel(ex);
                               JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                               break;
                               
                               
                    case 2:
                        
                        
                               DefaultListModel exs = (DefaultListModel) ADMI_ESTUDENTS.getModel();
                               ((Clase_Estudiante) exs.get(ADMI_ESTUDENTS.getSelectedIndex())).setAPELLI(JOptionPane.showInputDialog("Apellido"));
                               ADMI_ESTUDENTS.setModel(exs);
                               JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                               break;
                               
                               
                    case 3:
                        
                        
                               DefaultListModel exss = (DefaultListModel) ADMI_ESTUDENTS.getModel();
                               ((Clase_Estudiante) exss.get(ADMI_ESTUDENTS.getSelectedIndex())).setEDAD(Integer.parseInt(JOptionPane.showInputDialog("Apellido")));
                               ADMI_ESTUDENTS.setModel(exss);
                               JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                               break;
                               
                               
                    case 4:
                        
                        
                              DefaultListModel exsss = (DefaultListModel) ADMI_ESTUDENTS.getModel();
                              ((Clase_Estudiante) exsss.get(ADMI_ESTUDENTS.getSelectedIndex())).setCARRE(JOptionPane.showInputDialog("Carrera"));
                               ADMI_ESTUDENTS.setModel(exsss);
                               JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                               break;
                               
                               
                    default:
                    JOptionPane.showMessageDialog(this, "LA OPCION NO ES CORRECTA");}}
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_QUIERO_MODIFICARActionPerformed

    private void QUIERO_ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUIERO_ELIMINARActionPerformed
       
        
        
        
        
        if (ADMI_ESTUDENTS.getSelectedIndex() >= 0) {
            int controla = JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR ?", "VERIFICACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (controla == JOptionPane.OK_OPTION) {
                DefaultListModel exampl = (DefaultListModel) ADMI_ESTUDENTS.getModel();
                exampl.remove(ADMI_ESTUDENTS.getSelectedIndex());
                ADMI_ESTUDENTS.setModel(exampl);
                JOptionPane.showMessageDialog(this, "SE ELIMINO CORRECTAMENTE");}}
        
        
        
        
        
        
    }//GEN-LAST:event_QUIERO_ELIMINARActionPerformed

    private void modiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiActionPerformed

        if (ADMIN_ASIGNAT.getSelectedIndex() >= 0) {
            int op1 = Integer.parseInt(JOptionPane.showInputDialog(this, 
                      "1) NOMBRE\n"
                    + "2) SECCION\n"
                    + "3) EDIFICIO\n"
                    + "4) AULA\n\n"
                    + "INGRESE LA OPCION A MODIFICAR:"));
            switch (op1) {
                case 1:
                    
                    
                    
                    
                    DefaultListModel L_exam = (DefaultListModel) ADMIN_ASIGNAT.getModel();
                    ((Clase_Asignaturas) L_exam.get(ADMIN_ASIGNAT.getSelectedIndex())).setNAME(JOptionPane.showInputDialog("NOMBRE"));
                    ADMIN_ASIGNAT.setModel(L_exam);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                case 2:
                    
                    
                    
                    
                    DefaultListModel L_exampls = (DefaultListModel) ADMIN_ASIGNAT.getModel();
                    ((Clase_Asignaturas) L_exampls.get(ADMIN_ASIGNAT.getSelectedIndex())).setSECC(JOptionPane.showInputDialog("SECCION"));
                    ADMIN_ASIGNAT.setModel(L_exampls);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                    
                case 3:
                    
                    
                    
                    
                    
                    DefaultListModel L_examplss = (DefaultListModel) ADMIN_ASIGNAT.getModel();
                    ((Clase_Asignaturas) L_examplss.get(ADMIN_CARRE.getSelectedIndex())).setEDIFICIO(JOptionPane.showInputDialog("EDIFICIO"));
                    ADMIN_ASIGNAT.setModel(L_examplss);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                    
                case 4:
                    
                    
                    
                    
                    DefaultListModel L_examplsss = (DefaultListModel) ADMIN_ASIGNAT.getModel();
                    ((Clase_Asignaturas) L_examplsss.get(ADMIN_CARRE.getSelectedIndex())).setAULA(JOptionPane.showInputDialog("AULA"));
                    ADMIN_ASIGNAT.setModel(L_examplsss);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                default:
                    JOptionPane.showMessageDialog(this, "LA OPCION NO ES VALIDA"); } }
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_modiActionPerformed

    private void eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliActionPerformed
       
        
        
        
        
        
        
        if (ADMIN_ASIGNAT.getSelectedIndex() >= 0) {
            int control = JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR ?", "VERIFICACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (control == JOptionPane.OK_OPTION) {
                DefaultListModel examplee = (DefaultListModel) ADMIN_ASIGNAT.getModel();
                examplee.remove(ADMIN_ASIGNAT.getSelectedIndex());
                ADMIN_ASIGNAT.setModel(examplee);
                JOptionPane.showMessageDialog(this, "SE ELIMINO CORRECTAMENTE"); }}
        
        
        
        
        
        
    }//GEN-LAST:event_eliActionPerformed

    private void ARBOLITOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARBOLITOPActionPerformed
        
        
        
        
        if (ADMI_ESTUDENTS.getSelectedIndex() >= 0) {
            DefaultTreeModel tree_bonito_exam = (DefaultTreeModel) ARBOLITO_BONITO.getModel();
            DefaultMutableTreeNode origin = (DefaultMutableTreeNode) tree_bonito_exam.getRoot();
            DefaultListModel DISPONIBLES = (DefaultListModel) ADMI_ESTUDENTS.getModel();
            String COURSE; Clase_Estudiante JJ;
            JJ = ((Clase_Estudiante) DISPONIBLES.get(ADMI_ESTUDENTS.getSelectedIndex()));
            COURSE = ((Clase_Estudiante) DISPONIBLES.get(ADMI_ESTUDENTS.getSelectedIndex())).getCARRE();
            int CONTROLADOR = -1;
            
            
            
            for (int J = 0; J < origin.getChildCount(); J++) {
                if (origin.getChildAt(J).toString().equals(COURSE)) {
                    DefaultMutableTreeNode KK = new DefaultMutableTreeNode(JJ);
                    ((DefaultMutableTreeNode) origin.getChildAt(J)).add(KK);
                    CONTROLADOR = 1;}}

            
            
            
            if (CONTROLADOR == -1) {
                DefaultMutableTreeNode JJJ = new DefaultMutableTreeNode(COURSE);
                DefaultMutableTreeNode KK = new DefaultMutableTreeNode(JJ);
                JJJ.add(KK);
                origin.add(JJJ);}tree_bonito_exam.reload();} else {JOptionPane.showMessageDialog(this,"NO HA SELECCIONADO NINGUNA PERSONA AUN");}
        
        
        
        
        
        
        
    }//GEN-LAST:event_ARBOLITOPActionPerformed

    private void ADMI_ESTUDENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMI_ESTUDENTSMouseClicked
       
        
        
        
        
        
        if (ADMI_ESTUDENTS.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                CONTROL_ADMI.show(evt.getComponent(), evt.getX(), evt.getY());}}
        
        
        
        
        
        
    }//GEN-LAST:event_ADMI_ESTUDENTSMouseClicked

    private void BUTTON_REGIS_CATEDRATICOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUTTON_REGIS_CATEDRATICOMouseClicked
      
        
        
        
        
        
        
        DefaultListModel EXAMP = (DefaultListModel) SHOW_ME_BEBE.getModel();
        ArrayList<Clase_Asignaturas> clasesitas = new ArrayList();
        for (int J = 0; J < EXAMP.getSize(); J++) {
            Clase_Asignaturas c = (Clase_Asignaturas)EXAMP.getElementAt(J);
            clasesitas.add(c);}
        DefaultListModel EXAMSSS = (DefaultListModel) ADMIN_MAES.getModel();
        EXAMSSS.addElement(new Clase_Maestro(REGIS_NOM_MAES.getText(), REGIS_APELLIDO_MAES.getText(), Float.parseFloat(REGIS_SUEL_MAES.getText()), Integer.parseInt(REGIS_EDAD_MAES.getText()),clasesitas));
        JOptionPane.showMessageDialog(this, "SE HA CREADA UN NUEVO MAESTRO");
        
        
        
        
        
        
        
    }//GEN-LAST:event_BUTTON_REGIS_CATEDRATICOMouseClicked

    private void BUTTON_REGIS_ASIGNATURAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUTTON_REGIS_ASIGNATURAMouseClicked
       
        
        
        
        
        
        
        DefaultListModel EJEMPLO = (DefaultListModel) ADMIN_ASIGNAT.getModel();
        String ACONDICIONADA = "";
        if (AIRE_YES.isSelected()) {ACONDICIONADA = "SI";} else {ACONDICIONADA = "NO";}
        Clase_Asignaturas WW = new Clase_Asignaturas(REGIS_NOM_CLASS.getText(), REGIS_CODClass.getText(), REGIS_COD_EDIFICIO.getText(), REGIS_AULA.getText(), ACONDICIONADA);
        EJEMPLO.addElement(WW);
        DefaultComboBoxModel COMBO_BOX = (DefaultComboBoxModel) LIST_CLSS_IMPARTE.getModel();
        COMBO_BOX.addElement(WW);
        LIST_CLSS_IMPARTE.setModel(COMBO_BOX);
        JOptionPane.showMessageDialog(this, "SE HA CREADA UNA NUEVA CLASE");
        REGIS_NOM_CLASS.setText("");REGIS_CODClass.setText("");
        REGIS_COD_EDIFICIO.setText("");REGIS_AULA.setText("");
        
        
        
        
        
        
        

    }//GEN-LAST:event_BUTTON_REGIS_ASIGNATURAMouseClicked

    private void ADMIN_ASIGNATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMIN_ASIGNATMouseClicked
        
        
        
        
        
        
        
        if (ADMIN_ASIGNAT.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {BANDEJA2.show(evt.getComponent(), evt.getX(), evt.getY());} }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_ADMIN_ASIGNATMouseClicked

    private void ADMIN_ASIGNATMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMIN_ASIGNATMouseEntered
        
    }//GEN-LAST:event_ADMIN_ASIGNATMouseEntered

    private void BUTTON_REGIS_ASIGNATURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_REGIS_ASIGNATURAActionPerformed
     
    }//GEN-LAST:event_BUTTON_REGIS_ASIGNATURAActionPerformed

    private void edicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionActionPerformed
     
        
        
        DefaultTreeModel m = (DefaultTreeModel) ARBOLITO_BONITO.getModel();
        estudiante_seleccionado.setNAME(JOptionPane.showInputDialog("INGRESE EL NOMBRE NUEVO"));
        m.reload();
        
        
        
        
    }//GEN-LAST:event_edicionActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
        
        
        
        
        
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR ?", "VERIFICACION",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) ARBOLITO_BONITO.getModel();
            m.removeNodeFromParent(elec_NODOS);
            m.reload();}
        
        
        
        
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void deltiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltiorActionPerformed
        
        
        
        
        
        
        
        
        if (ADMIN_CARRE.getSelectedIndex() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR ?", "VERIFICACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                DefaultListModel modelo = (DefaultListModel) ADMIN_CARRE.getModel();
                modelo.remove(ADMIN_CARRE.getSelectedIndex());
                ADMIN_CARRE.setModel(modelo);
                JOptionPane.showMessageDialog(this, "SE ELIMINO CORRECTAMENTE");}}
        
        
        
        
        
        
        
    }//GEN-LAST:event_deltiorActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

    }//GEN-LAST:event_borrarActionPerformed

    private void ADMIN_CARREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMIN_CARREMouseClicked
       
        
        
        
        
        
        if (ADMIN_CARRE.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                men3.show(evt.getComponent(), evt.getX(), evt.getY()); }}
        
        
        
        
        
        
    }//GEN-LAST:event_ADMIN_CARREMouseClicked

    private void modificatiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificatiorActionPerformed
        if (ADMIN_CARRE.getSelectedIndex() >= 0) {
            int OP2 = Integer.parseInt(JOptionPane.showInputDialog(this, 
                      "1) NOMBRE\n"
                    + "2) COSTO MENSUAL\n"
                    + "3) JEFE DE CARRERA\n"
                    + "INGRESE LA OPCION A MODIFICAR:"));
            switch (OP2) {
                case 1:
                    
                    
                    
                    
                    
                    
                    DefaultListModel EJEMPLO = (DefaultListModel) ADMIN_CARRE.getModel();
                    ((Clase_Carreras) EJEMPLO.get(ADMIN_CARRE.getSelectedIndex())).setNOMBRE(JOptionPane.showInputDialog("NOMBRE"));
                    ADMIN_CARRE.setModel(EJEMPLO);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                    
                case 2:
                    
                    
                    
                    
                    DefaultListModel EJEMPLOS = (DefaultListModel) ADMIN_CARRE.getModel();
                    ((Clase_Carreras) EJEMPLOS.get(ADMIN_CARRE.getSelectedIndex())).setCOSTO(Integer.parseInt(JOptionPane.showInputDialog("Costo Menusal")));
                    ADMIN_CARRE.setModel(EJEMPLOS);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                    
                case 3:
                    
                    
                    
                    
                    
                    DefaultListModel EJEMPLOSS = (DefaultListModel) ADMIN_CARRE.getModel();
                    ((Clase_Carreras) EJEMPLOSS.get(ADMIN_CARRE.getSelectedIndex())).setNOMBRE(JOptionPane.showInputDialog("JEFE DE CARRERA"));
                    ADMIN_CARRE.setModel(EJEMPLOSS);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "LA OPCION NO ES VALIDA"); }}
        
        
        
        
        
        
        
    }//GEN-LAST:event_modificatiorActionPerformed

    private void CORRERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CORRERMouseClicked
       
        
        
        
        if (LIST_CLSS_IMPARTE.getSelectedIndex() >= 0) {
            DefaultComboBoxModel COMBO_BOX = (DefaultComboBoxModel) LIST_CLSS_IMPARTE.getModel();
            DefaultListModel EJEM_ONE = (DefaultListModel) SHOW_ME_BEBE.getModel();
            Clase_Asignaturas clase = (Clase_Asignaturas) LIST_CLSS_IMPARTE.getSelectedItem();
            EJEM_ONE.addElement(clase);
            SHOW_ME_BEBE.setModel(EJEM_ONE);
            COMBO_BOX.removeElement((Clase_Asignaturas) LIST_CLSS_IMPARTE.getSelectedItem());
            LIST_CLSS_IMPARTE.setModel(COMBO_BOX);
        } else {JOptionPane.showMessageDialog(null, "TODAVIA NO HA SELECCIONADO NINGUNA CLASE");
            JOptionPane.showMessageDialog(null, "CREE UNA NUEVA EN CASO DE NO HABER CLASES PARA SELECCIONAR");}
        
        
        
        
        
        
        
    }//GEN-LAST:event_CORRERMouseClicked

    private void ADMIN_MAESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMIN_MAESMouseClicked
          
        
        
        
        
            if (ADMIN_MAES.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                maestros_opciones.show(evt.getComponent(), evt.getX(), evt.getY());}}
            
            
            
            
            
            
            
    }//GEN-LAST:event_ADMIN_MAESMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      
        
        
        
        
        
        
        
        
        if (ADMIN_MAES.getSelectedIndex() >= 0) {
            int CONTROLES = JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR ?", "VERIFICACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (CONTROLES == JOptionPane.OK_OPTION) {
                DefaultListModel EJEM = (DefaultListModel) ADMIN_MAES.getModel();
                EJEM.remove(ADMIN_MAES.getSelectedIndex());
                ADMIN_MAES.setModel(EJEM);
                JOptionPane.showMessageDialog(this, "SE ELIMINO CORRECTAMENTE"); }}
        
        
        
        
        
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
       
        
        
        
        
        if (ADMIN_MAES.getSelectedIndex() >= 0) {
            int OP_3 = Integer.parseInt(JOptionPane.showInputDialog(this, 
                      "1) NOMBRE\n"
                    + "2) APELLIDO\n"
                    + "3) SUELDO\n"
                    + "4) EDAD\n\n"
                    + "INGRESE LA OPCION A MODIFICAR:"));
            switch (OP_3) {
                case 1:
                    
                    
                    
                    
                    
                    DefaultListModel EJEMP = (DefaultListModel) ADMIN_MAES.getModel();
                    ((Clase_Maestro) EJEMP.get(ADMIN_MAES.getSelectedIndex())).setNAME(JOptionPane.showInputDialog("NOMBRE"));
                    ADMIN_MAES.setModel(EJEMP);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                case 2:
                    
                    
                    
                    
                    
                    DefaultListModel EJEMPL = (DefaultListModel) ADMIN_MAES.getModel();
                    ((Clase_Maestro) EJEMPL.get(ADMIN_MAES.getSelectedIndex())).setAPELLI(JOptionPane.showInputDialog("Apellido"));
                    ADMIN_MAES.setModel(EJEMPL);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                    
                case 3:
                    
                    
                    
                    
                    
                    DefaultListModel EJEMPLO = (DefaultListModel) ADMIN_MAES.getModel();
                    ((Clase_Maestro) EJEMPLO.get(ADMIN_MAES.getSelectedIndex())).setSUELDO(Integer.parseInt(JOptionPane.showInputDialog("Salario")));
                    ADMI_ESTUDENTS.setModel(EJEMPLO);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                    
                    
                    
                    
                    
                case 4:
                    
                    
                    
                    
                    
                    DefaultListModel EJEMPLOS = (DefaultListModel) ADMIN_MAES.getModel();
                    ((Clase_Maestro) EJEMPLOS.get(ADMIN_MAES.getSelectedIndex())).setEDAD(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
                    ADMIN_MAES.setModel(EJEMPLOS);
                    JOptionPane.showMessageDialog(this, "SE MODIFICO CORRECTAMENTE");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "LA OPCION ES INVALIDA");}}
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_modificarActionPerformed

    private void GENERO_VARONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERO_VARONActionPerformed

    }//GEN-LAST:event_GENERO_VARONActionPerformed

    private void ARBOLITO_BONITOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ARBOLITO_BONITOMouseClicked

        if (evt.isMetaDown()) {
            int row = ARBOLITO_BONITO.getClosestRowForLocation(evt.getX(), evt.getY());
            ARBOLITO_BONITO.setSelectionRow(row);
            Object v1 = ARBOLITO_BONITO.getSelectionPath().getLastPathComponent();
            elec_NODOS = (DefaultMutableTreeNode) v1;
            if (elec_NODOS.getUserObject() instanceof Clase_Estudiante) {
                estudiante_seleccionado = (Clase_Estudiante) elec_NODOS.getUserObject();
                modificar_arbol.show(evt.getComponent(), evt.getX(), evt.getY());} }

    }//GEN-LAST:event_ARBOLITO_BONITOMouseClicked

    
    
    
    
    
    public static boolean CC(int cc) {
        for (int jjj = 0; jjj < list_NumCuenta.size(); jjj++) {
            if (list_NumCuenta.get(jjj) == cc) {
                return true;
            } else {return false;}}return false;}
    
    
    
    
    
    
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });}
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ADMIN_ASIGNAT;
    private javax.swing.JList<String> ADMIN_CARRE;
    private javax.swing.JList<String> ADMIN_MAES;
    private javax.swing.JList<String> ADMI_ESTUDENTS;
    private javax.swing.JRadioButton AIRE_NO;
    private javax.swing.JRadioButton AIRE_YES;
    private javax.swing.JMenuItem ARBOLITOP;
    private javax.swing.JTree ARBOLITO_BONITO;
    private javax.swing.JPopupMenu BANDEJA2;
    private javax.swing.ButtonGroup BUTTON;
    private javax.swing.JButton BUTTON_REGISTRAR_estudianteNuevo;
    private javax.swing.JButton BUTTON_REGIS_ASIGNATURA;
    private javax.swing.JButton BUTTON_REGIS_CARRE;
    private javax.swing.JButton BUTTON_REGIS_CATEDRATICO;
    private javax.swing.JTabbedPane C1;
    private javax.swing.JTabbedPane C2;
    private javax.swing.JPopupMenu CONTROL_ADMI;
    private javax.swing.JButton CORRER;
    private javax.swing.ButtonGroup COURSES;
    private javax.swing.JTextField FACULTADES;
    private javax.swing.ButtonGroup GENERO_ELE;
    private javax.swing.JRadioButton GENERO_MUJER;
    private javax.swing.JRadioButton GENERO_VARON;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L16;
    private javax.swing.JLabel L17;
    private javax.swing.JLabel L18;
    private javax.swing.JLabel L19;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L21;
    private javax.swing.JLabel L22;
    private javax.swing.JLabel L23;
    private javax.swing.JLabel L24;
    private javax.swing.JLabel L25;
    private javax.swing.JLabel L26;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JComboBox<String> LIST_CLSS_IMPARTE;
    private javax.swing.JScrollPane NEW;
    private javax.swing.JScrollPane P;
    private javax.swing.JPanel PANEL_ADMIN_ASIGNT;
    private javax.swing.JPanel PANEL_ADMIN_CARRE;
    private javax.swing.JPanel PANEL_ADMIN_ESTU;
    private javax.swing.JPanel PANEL_ADMIN_MAESTR;
    private javax.swing.JPanel PANEL_ARBOLITO;
    private javax.swing.JPanel PANEL_CLASS_REGIS;
    private javax.swing.JPanel PANEL_REGIS_MAESTROS;
    private javax.swing.JPanel PRICIPAL_PANEL;
    private javax.swing.JPanel Panel_registro_carreras;
    private javax.swing.JPanel Panel_registro_estudiantes;
    private javax.swing.JMenuItem QUIERO_ELIMINAR;
    private javax.swing.JMenuItem QUIERO_MODIFICAR;
    private javax.swing.JTextField REGIS_APELLIDO_MAES;
    private javax.swing.JTextField REGIS_APE_ESTUDENT;
    private javax.swing.JTextField REGIS_AULA;
    private javax.swing.JTextField REGIS_CODClass;
    private javax.swing.JTextField REGIS_COD_EDIFICIO;
    private javax.swing.JFormattedTextField REGIS_COS_CARRE;
    private javax.swing.JFormattedTextField REGIS_EDAD_ESTUDEN;
    private javax.swing.JFormattedTextField REGIS_EDAD_MAES;
    private javax.swing.JTextField REGIS_JEFE_FACU;
    private javax.swing.JTextField REGIS_NOM_CARRE;
    private javax.swing.JTextField REGIS_NOM_CLASS;
    private javax.swing.JTextField REGIS_NOM_ESTUDENT;
    private javax.swing.JTextField REGIS_NOM_MAES;
    private javax.swing.JFormattedTextField REGIS_SUEL_MAES;
    private javax.swing.JRadioButton SELE_CARRE_ING;
    private javax.swing.JRadioButton SELE_CARRE_LIC;
    private javax.swing.JRadioButton SELE_CARRE_MEDI;
    private javax.swing.JRadioButton SELE_CCS;
    private javax.swing.JRadioButton SELE_INGENIERIA;
    private javax.swing.JRadioButton SELE_LICENCIATURAS;
    private javax.swing.JList<String> SHOW_ME_BEBE;
    private javax.swing.JPopupMenu arbol_opciones;
    private javax.swing.JMenuItem borrar;
    private javax.swing.JTabbedPane contenedor_panel;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem deltior;
    private javax.swing.JMenuItem edicion;
    private javax.swing.JMenuItem editar;
    private javax.swing.JMenuItem eli;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> list_ingenieros;
    private javax.swing.JComboBox<String> list_licenciado;
    private javax.swing.JComboBox<String> list_medicos;
    private javax.swing.JPopupMenu maestros_opciones;
    private javax.swing.JPopupMenu men3;
    private javax.swing.JMenuItem modi;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JPopupMenu modificar_arbol;
    private javax.swing.JMenuItem modificatior;
    private javax.swing.JPanel panel_other;
    // End of variables declaration//GEN-END:variables
    static ArrayList<Integer> list_NumCuenta = new ArrayList();
    DefaultMutableTreeNode elec_NODOS;
    Clase_Estudiante estudiante_seleccionado;
}
