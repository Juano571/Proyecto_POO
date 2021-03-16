
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Arellano <juan.arellano at epn.edu.ec>
 */
public class GUICampeonato1 extends javax.swing.JFrame {

    class Fondo extends JPanel {

        private Image imagen;
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoGUI.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    Fondo fondo = new Fondo();

    class FondoPanel extends JPanel {

        private Image imagen1;

        @Override
        public void paint(Graphics g) {
            imagen1 = new ImageIcon(getClass().getResource("/Imagenes/IconoGUI.png")).getImage();
            g.drawImage(imagen1, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    FondoPanel panel= new FondoPanel();
    
    Partido p;
    int numeroEquipos;
    int contador;  //Contador para arreglo de Equipos
    int contadorJugadores; //Contador para controlar el ingreso de jugadores (Min=11 y Max=15)
    String fechas;
    int[][] fechasMatriz;

    public GUICampeonato1() {
        this.setResizable(false);
        this.setContentPane(fondo);
        initComponents();
        contador = 0;
        contadorJugadores = 0;
        fechas = "";
        p = new Partido();
        try {
            numeroEquipos = Integer.parseInt(JOptionPane.showInputDialog(rootPane, 
                    "¿Cuántos equipos desea ingresar?", "CAMPEONATO", JOptionPane.QUESTION_MESSAGE));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Dede ingresar un número entero y par", 
                    "NÚMERO DE EQUIPOS", 2);
            System.exit(0);
        }

    }

    //Método que limpia solo los datos de Equipo 
    public void limpiarEquipo() {
        txtNombreEquipo.setText("");
        txtRepresentante.setText("");
        txtConctacto.setText("");
    }

    //Método que limpia solo los datos de Jugador
    public void limpiarJugadores() {
        txtNombreJugador.setText("");
        txtApellidoJugador.setText("");
        txtCedula.setText("");
        txtNumeroJugador.setText("");
        txtPosicion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNombreEquipo = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        lblRepresentante = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        lblConctacto = new javax.swing.JLabel();
        txtConctacto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblNombreJugador = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();
        lblApellidoJugador = new javax.swing.JLabel();
        txtApellidoJugador = new javax.swing.JTextField();
        lblNumeroJugador = new javax.swing.JLabel();
        txtNumeroJugador = new javax.swing.JTextField();
        lblPosicion = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JTextField();
        btnAgregarJugador = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btmFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaFechas = new javax.swing.JTextArea();
        lblInformación = new javax.swing.JLabel();
        jPanel4 = new FondoPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Información del Equipo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Engravers MT", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);

        lblNombreEquipo.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblNombreEquipo.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreEquipo.setText("Nombre:");

        lblRepresentante.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblRepresentante.setForeground(new java.awt.Color(0, 0, 0));
        lblRepresentante.setText("Respresentante:");

        btnConfirmar.setFont(new java.awt.Font("Engravers MT", 0, 10)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblConctacto.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblConctacto.setForeground(new java.awt.Color(0, 0, 0));
        lblConctacto.setText("Contacto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRepresentante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepresentante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombreEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblConctacto)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirmar)
                            .addComponent(txtConctacto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEquipo)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepresentante)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConctacto)
                    .addComponent(txtConctacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Información de los jugadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Engravers MT", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setOpaque(false);

        lblNombreJugador.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblNombreJugador.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreJugador.setText("Nombre:");

        txtNombreJugador.setEnabled(false);

        lblApellidoJugador.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblApellidoJugador.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoJugador.setText("Apellido:");

        txtApellidoJugador.setEnabled(false);

        lblNumeroJugador.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblNumeroJugador.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroJugador.setText("Número:");

        txtNumeroJugador.setEnabled(false);

        lblPosicion.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblPosicion.setForeground(new java.awt.Color(0, 0, 0));
        lblPosicion.setText("Posición:");

        txtPosicion.setEnabled(false);

        btnAgregarJugador.setFont(new java.awt.Font("Engravers MT", 0, 10)); // NOI18N
        btnAgregarJugador.setText("Agregar Jugador");
        btnAgregarJugador.setEnabled(false);
        btnAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJugadorActionPerformed(evt);
            }
        });

        lblCedula.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("Cédula:");
        lblCedula.setToolTipText("");

        txtCedula.setEnabled(false);

        btmFinalizar.setFont(new java.awt.Font("Engravers MT", 0, 10)); // NOI18N
        btmFinalizar.setText("Finalizar ");
        btmFinalizar.setEnabled(false);
        btmFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNombreJugador)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreJugador))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblApellidoJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoJugador))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPosicion)
                                            .addComponent(txtCedula)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblNumeroJugador)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmFinalizar)
                        .addGap(54, 54, 54))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreJugador)
                    .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoJugador)
                    .addComponent(txtApellidoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroJugador)
                    .addComponent(txtNumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicion)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarJugador)
                    .addComponent(btmFinalizar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txaFechas.setColumns(20);
        txaFechas.setRows(5);
        jScrollPane1.setViewportView(txaFechas);

        lblInformación.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        lblInformación.setForeground(new java.awt.Color(0, 0, 0));
        lblInformación.setText("Información");

        jPanel4.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(lblInformación)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblInformación)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (txtNombreEquipo.getText().matches("[a-zA-z0-9]{3,}")) {
            if (txtRepresentante.getText().matches("[a-zA-Z]+\\s[a-zA-Z]+")) {
                if (txtConctacto.getText().matches("[0][9][0-9]{8}")) {
                    p.agregarEquipo(new Equipo(txtNombreEquipo.getText().toUpperCase(), 
                            txtRepresentante.getText().toUpperCase(), txtConctacto.getText().toUpperCase()));
                    btnConfirmar.setEnabled(false);
                    btnAgregarJugador.setEnabled(true);
                    txtNombreEquipo.setEnabled(false);
                    txtRepresentante.setEnabled(false);
                    txtConctacto.setEnabled(false);
                    txtNombreJugador.setEnabled(true);
                    txtApellidoJugador.setEnabled(true);
                    txtCedula.setEnabled(true);
                    txtNumeroJugador.setEnabled(true);
                    txtPosicion.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe ingreasr un número de celular válido",
                            "CONTACTO", 2);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre y el apellido",
                        "NOMBRE DEL REPRESENTANTE", 2);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "El nombre del equipo debe tener más de 3 caracteres", 
                    "NOMBRE DEL EQUIPO", 2);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJugadorActionPerformed

        if (txtNombreJugador.getText().matches("[a-zA-Z]+")) {
            if (txtApellidoJugador.getText().matches("[a-zA-Z]+")) {
                if (txtNumeroJugador.getText().matches("[0-9]{1,2}")) {
                    Jugador j = new Jugador(txtNombreJugador.getText(), txtApellidoJugador.getText(), txtCedula.getText(),
                            Integer.parseInt(txtNumeroJugador.getText()), txtPosicion.getText());
                    if (j.esCedula()) {
                        p.getEquipos().get(contador).agregarJugador(j);
                        contadorJugadores++;
                        limpiarJugadores();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El número de cédula no es válido", 
                                "CÉDULA", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El numero debe ser de uno o dos dígitos",
                            "NÚMERO DE JUGADOR", 2);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "EL apellido del jugador solo debe tener letras",
                        "APELLIDO DEL JUGADOR", 2);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "El nombre del jugador debe tener solo letras",
                    "NOMBRE DEL JUGADOR", 2);
        }
        //Control de ingreso de datos de jugadores
        if (contadorJugadores == 1) {
            btmFinalizar.setEnabled(true);
        }
        if (contadorJugadores == 15) {
            btnAgregarJugador.setEnabled(false);
            txtNombreJugador.setEnabled(false);
            txtApellidoJugador.setEnabled(false);
            txtCedula.setEnabled(false);
            txtNumeroJugador.setEnabled(false);
            txtPosicion.setEnabled(false);

        }
    }//GEN-LAST:event_btnAgregarJugadorActionPerformed

    private void btmFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmFinalizarActionPerformed

        contador++;
        contadorJugadores = 0;
        btmFinalizar.setEnabled(false);
        txtNombreEquipo.setEnabled(true);
        txtRepresentante.setEnabled(true);
        txtConctacto.setEnabled(true);
        btnConfirmar.setEnabled(true);
        txtNombreJugador.setEnabled(false);
        txtApellidoJugador.setEnabled(false);
        txtCedula.setEnabled(false);
        txtNumeroJugador.setEnabled(false);
        txtPosicion.setEnabled(false);
        btnAgregarJugador.setEnabled(false);
        limpiarEquipo();

        if (contador == numeroEquipos) {

            if (numeroEquipos % 2 == 0) {
                fechasMatriz = Partido.generarFechas(numeroEquipos);
            } else {
                numeroEquipos++;
                p.agregarEquipo(new Equipo("descanza", null, null));
                fechasMatriz = Partido.generarFechas(numeroEquipos);
            }
            fechas += "PRIMERA VUELTA\n\n\n";
            fechas += llenarStringFechas(fechasMatriz);

            invertirMatriz(fechasMatriz);

            fechas += "\n\nSEGUNDA VUELTA\n\n\n";

            fechas += llenarStringFechas(fechasMatriz);

            txaFechas.setText(fechas);
        }

    }//GEN-LAST:event_btmFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public String llenarStringFechas(int fechasMatriz[][]) {
        String fechas1 = "";
        for (int i = 0; i < (numeroEquipos - 1) * 2; i += 2) {
            fechas1 += "FECHA " + (i / 2 + 1) + "\n\n";
            for (int j = 0; j < numeroEquipos / 2; j++) {
                fechas1 += p.getEquipos().get(fechasMatriz[j][i] - 1).getNombreEquipo() + "  -  " 
                        + p.getEquipos().get(fechasMatriz[j][i + 1] - 1).getNombreEquipo() + "           ";

            }
            fechas1 += "\n\n";
        }
        return fechas1;

    }

    public static void invertirMatriz(int matriz[][]) {
        int aux[] = new int[matriz.length];
        for (int k = 0, j = matriz[1].length - 1; k < matriz[1].length / 2; j--, k++) {
            for (int i = 0; i < matriz.length; i++) {
                aux[i] = matriz[i][k];
                matriz[i][k] = matriz[i][j];
                matriz[i][j] = aux[i];
            }
        }
    }

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
            java.util.logging.Logger.getLogger(GUICampeonato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICampeonato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICampeonato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICampeonato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICampeonato1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmFinalizar;
    private javax.swing.JButton btnAgregarJugador;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoJugador;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblConctacto;
    private javax.swing.JLabel lblInformación;
    private javax.swing.JLabel lblNombreEquipo;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblNumeroJugador;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblRepresentante;
    private javax.swing.JTextArea txaFechas;
    private javax.swing.JTextField txtApellidoJugador;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtConctacto;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtNumeroJugador;
    private javax.swing.JTextField txtPosicion;
    private javax.swing.JTextField txtRepresentante;
    // End of variables declaration//GEN-END:variables
}
