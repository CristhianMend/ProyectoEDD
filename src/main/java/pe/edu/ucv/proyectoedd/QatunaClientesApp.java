package pe.edu.ucv.proyectoedd;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import pe.edu.ucv.proyectoedd.clientes.Cliente;

/**
 * @author Grupo 3
 */
public class QatunaClientesApp extends javax.swing.JFrame {

    int filaSeleCliente;
    public static ListaClientes listaClientes;

    /**
     * Creates new form QatunaApp
     */
    public QatunaClientesApp() {
        filaSeleCliente = -1;

        listaClientes = new ListaClientes();

        initComponents();
        
        listaClientes.agregarInicio(new Cliente("Pedro", "Mendoza", 19));
        listaClientes.actualizarTabla();

        clientesActualizarButton.setEnabled(false);
        clientesEliminarButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nuevoClienteNombreTextField = new javax.swing.JTextField();
        nuevoClienteAgregarButton = new javax.swing.JButton();
        nuevoClienteApellidosTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nuevoClienteEdadTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        clientesNombreTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        clientesEdadTextField = new javax.swing.JTextField();
        clientesActualizarButton = new javax.swing.JButton();
        clientesEliminarButton = new javax.swing.JButton();
        clientesSeleccionLabel = new javax.swing.JLabel();
        clientesApellidosTextField = new javax.swing.JTextField();
        panelAnteriorButton = new javax.swing.JButton();
        panelSiguienteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));

        jLabel2.setText("Nombre:");

        nuevoClienteAgregarButton.setText("Agregar");
        nuevoClienteAgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteAgregarButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Edad:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nuevoClienteAgregarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevoClienteNombreTextField)
                            .addComponent(nuevoClienteEdadTextField)
                            .addComponent(nuevoClienteApellidosTextField))))
                .addGap(573, 573, 573))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nuevoClienteNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nuevoClienteApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nuevoClienteEdadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(nuevoClienteAgregarButton)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrar Cliente"));

        clientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Edad"
            }
        ));
        clientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(clientesTable);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Edad:");

        clientesActualizarButton.setText("Actualizar");
        clientesActualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActualizarButtonActionPerformed(evt);
            }
        });

        clientesEliminarButton.setText("Eliminar");
        clientesEliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesEliminarButtonActionPerformed(evt);
            }
        });

        clientesSeleccionLabel.setText("Producto Seleccionado: N/A");

        panelAnteriorButton.setText("Anterior Panel");
        panelAnteriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelAnteriorButtonActionPerformed(evt);
            }
        });

        panelSiguienteButton.setText("Siguiente Panel");
        panelSiguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelSiguienteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelAnteriorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSiguienteButton))
                    .addComponent(clientesSeleccionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(clientesActualizarButton)
                                .addGap(97, 97, 97)
                                .addComponent(clientesEliminarButton))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clientesNombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(clientesApellidosTextField)
                                    .addComponent(clientesEdadTextField))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(clientesNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientesApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(clientesEdadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientesActualizarButton)
                            .addComponent(clientesEliminarButton))
                        .addGap(46, 46, 46)
                        .addComponent(clientesSeleccionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(panelAnteriorButton)
                            .addComponent(panelSiguienteButton)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro de Clientes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesEliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesEliminarButtonActionPerformed
        if (filaSeleCliente < 0) {
            return;
        }

        NodoClientes nodo = listaClientes.obtenerNodo(filaSeleCliente);
        listaClientes.eliminarNodo(nodo);
        listaClientes.actualizarTabla();

        clientesTable.clearSelection();
        filaSeleCliente = -1;
        clientesSeleccionLabel.setText("Cliente Seleccionado: N/A");
        clientesNombreTextField.setText("");
        clientesApellidosTextField.setText("");
        clientesEdadTextField.setText("");
        
        clientesActualizarButton.setEnabled(false);
        clientesEliminarButton.setEnabled(false);
    }//GEN-LAST:event_clientesEliminarButtonActionPerformed

    private void clientesActualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActualizarButtonActionPerformed
        if (filaSeleCliente < 0) {
            return;
        }

        NodoClientes nodo = listaClientes.obtenerNodo(filaSeleCliente);

        String name = clientesNombreTextField.getText().trim().replaceAll("\\s+", " ");
        String apellidos = clientesApellidosTextField.getText().trim().replaceAll("\\s+", " ");
        String edad = clientesEdadTextField.getText().trim().strip();
        
        String nameOld = nodo.cliente.getNombre();
        String apellidosOld = nodo.cliente.getApellidos();
        
        if (name.isEmpty()) {
            mostrarError("El espacio del nombre esta vacio");
            return;
        } else if (apellidos.isEmpty()) {
            mostrarError("El espacio del apellidos esta vacio");
            return;
        } else if ((!nameOld.equalsIgnoreCase(name) || 
                !apellidosOld.equalsIgnoreCase(apellidos)) &&
                listaClientes.existe(name, apellidos)) {
            mostrarError("El cliente " + name + " ya existe");
            return;
        } else if (!esInteger(edad)) {
            mostrarError("La edad solo permite numeros");
            return;
        } else if (Integer.parseInt(edad) < 18) {
            mostrarError("Un menor de edad no puede ser un cliente");
            return;
        }

        nodo.cliente.setNombre(name);
        nodo.cliente.setApellidos(apellidos);
        nodo.cliente.setEdad(Integer.parseInt(edad));

        listaClientes.actualizarTabla();

        clientesTable.clearSelection();
        filaSeleCliente = -1;
        clientesSeleccionLabel.setText("Cliente Seleccionado: N/A");
        clientesNombreTextField.setText("");
        clientesApellidosTextField.setText("");
        clientesEdadTextField.setText("");
        
        clientesActualizarButton.setEnabled(false);
        clientesEliminarButton.setEnabled(false);
    }//GEN-LAST:event_clientesActualizarButtonActionPerformed

    private void clientesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesTableMouseClicked
        int sele = clientesTable.getSelectedRow();

        if (sele == filaSeleCliente) {
            clientesTable.clearSelection();
            filaSeleCliente = -1;

            clientesSeleccionLabel.setText("Cliente Seleccionado: N/A");
            clientesNombreTextField.setText("");
            clientesApellidosTextField.setText("");
            clientesEdadTextField.setText("");
            
            clientesActualizarButton.setEnabled(false);
            clientesEliminarButton.setEnabled(false);
            return;
        }

        NodoClientes nodo = listaClientes.obtenerNodo(sele);
        clientesNombreTextField.setText(nodo.cliente.getNombre());
        clientesApellidosTextField.setText(nodo.cliente.getApellidos());
        clientesEdadTextField.setText(String.valueOf(nodo.cliente.getEdad()));

        filaSeleCliente = sele;
        clientesSeleccionLabel.setText("Cliente Seleccionado: " + nodo.cliente.getNombre() + " " + nodo.cliente.getApellidos());

        clientesActualizarButton.setEnabled(true);
        clientesEliminarButton.setEnabled(true);
    }//GEN-LAST:event_clientesTableMouseClicked

    private void nuevoClienteAgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteAgregarButtonActionPerformed
        String name = nuevoClienteNombreTextField.getText().trim().replaceAll("\\s+", " ");
        String apellidos = nuevoClienteApellidosTextField.getText().trim().replaceAll("\\s+", " ");
        String edad = nuevoClienteEdadTextField.getText().trim().strip();
        
        if (name.isEmpty()) {
            mostrarError("El espacio del nombre esta vacio");
            return;
        } else if (apellidos.isEmpty()) {
            mostrarError("El espacio del apellidos esta vacio");
            return;
        } else if (listaClientes.existe(name, apellidos)) {
            mostrarError("El cliente " + name + " ya existe");
            return;
        } else if (!esInteger(edad)) {
            mostrarError("La edad solo permite numeros");
            return;
        } else if (Integer.parseInt(edad) < 18) {
            mostrarError("Un menor de edad no puede ser un cliente");
            return;
        }

        Cliente cliente = new Cliente(name, apellidos, Integer.parseInt(edad));

        listaClientes.agregarFinal(cliente);
        listaClientes.actualizarTabla();
        nuevoClienteNombreTextField.setText("");
        nuevoClienteApellidosTextField.setText("");
        nuevoClienteEdadTextField.setText("");
    }//GEN-LAST:event_nuevoClienteAgregarButtonActionPerformed

    private void panelAnteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelAnteriorButtonActionPerformed
        Main.mostrarFrame1();
    }//GEN-LAST:event_panelAnteriorButtonActionPerformed

    private void panelSiguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelSiguienteButtonActionPerformed
        Main.mostrarFrame3();
    }//GEN-LAST:event_panelSiguienteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QatunaProductosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QatunaProductosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QatunaProductosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QatunaProductosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QatunaClientesApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientesActualizarButton;
    private javax.swing.JTextField clientesApellidosTextField;
    private javax.swing.JTextField clientesEdadTextField;
    private javax.swing.JButton clientesEliminarButton;
    private javax.swing.JTextField clientesNombreTextField;
    private javax.swing.JLabel clientesSeleccionLabel;
    private javax.swing.JTable clientesTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton nuevoClienteAgregarButton;
    private javax.swing.JTextField nuevoClienteApellidosTextField;
    private javax.swing.JTextField nuevoClienteEdadTextField;
    private javax.swing.JTextField nuevoClienteNombreTextField;
    private javax.swing.JButton panelAnteriorButton;
    private javax.swing.JButton panelSiguienteButton;
    // End of variables declaration//GEN-END:variables

    /**
     * METODOS
     */
    public void mostrarError(String error) {
        JFrame frame = new JFrame("Mensaje de error");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JLabel label = new JLabel("¡Error: " + error + "!");
        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        panel.add(label);

        JOptionPane.showMessageDialog(frame, panel, "Error", JOptionPane.ERROR_MESSAGE);

    }

    public boolean contieneSoloNumeros(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public boolean esInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
    
    /**
     * CLIENTES
     */
    public class NodoClientes {

        Cliente cliente;
        NodoClientes siguiente, anterior;

        public NodoClientes(Cliente cliente) {
            this(cliente, null, null);
        }

        public NodoClientes(Cliente cliente, NodoClientes siguiente, NodoClientes anterior) {
            this.cliente = cliente;
            this.siguiente = siguiente;
            this.anterior = anterior;
        }
    }
    
    public class ListaClientes {

        NodoClientes inicio;
        NodoClientes fin;

        public ListaClientes() {
            inicio = fin = null;
        }

        public boolean estaVacia() {
            return inicio == null;
        }

        public void agregarFinal(Cliente cliente) {
            if (!estaVacia()) {
                fin = new NodoClientes(cliente, null, fin);
                fin.anterior.siguiente = fin;
            } else {
                inicio = fin = new NodoClientes(cliente);
            }
        }

        public void agregarInicio(Cliente cliente) {
            if (!estaVacia()) {
                inicio = new NodoClientes(cliente, inicio, null);
                inicio.siguiente.anterior = inicio;
            } else {
                inicio = fin = new NodoClientes(cliente);
            }
        }

        public Cliente eliminarInicio() {
            Cliente elemento = inicio.cliente;
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.siguiente;
                inicio.anterior = null;
            }
            return elemento;
        }

        public Cliente eliminarFinal() {
            Cliente elemento = fin.cliente;
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                fin = fin.anterior;
                fin.siguiente = null;
            }
            return elemento;
        }

        public boolean eliminarNodo(NodoClientes nodo) {
            NodoClientes actual = inicio;

            while (actual != null) {
                if (actual.cliente == nodo.cliente) {
                    break;
                }
                actual = actual.siguiente;
            }

            if (actual == null) {
                return false;
            }

            if (actual.anterior != null) {
                actual.anterior.siguiente = actual.siguiente;
            } else {
                inicio = actual.siguiente;
            }

            if (actual.siguiente != null) {
                actual.siguiente.anterior = actual.anterior;
            } else {
                fin = actual.anterior;
            }
            return true;
        }

        public int contarNodos() {
            int contador = 0;
            NodoClientes actual = inicio;
            while (actual != null) {
                contador++;
                actual = actual.siguiente;
            }
            return contador;
        }

        public NodoClientes obtenerNodo(int index) {
            int contador = 0;
            NodoClientes actual = inicio;
            while (actual != null) {
                if (index == contador) {
                    break;
                }
                contador++;
                actual = actual.siguiente;
            }
            return actual;
        }
        
        public boolean existe(String name, String apellidos) {
            if (estaVacia()) {
                return false;
            }

            NodoClientes actual = inicio;
            while (actual != null) {
                if (name.equalsIgnoreCase(actual.cliente.getNombre()) &&
                        apellidos.equalsIgnoreCase(actual.cliente.getApellidos())) {
                    return true;
                }
                actual = actual.siguiente;
            }

            return false;
        }
        
        public String[] obtenerListaNombres() {
            int numNodos = contarNodos();
            String[] lista = new String[numNodos];
            NodoClientes actual = inicio;
            int fila = 0;
            while (actual != null) {
                lista[fila] = actual.cliente.getNombre() + " " + actual.cliente.getApellidos();
                actual = actual.siguiente;
                fila++;
            }
            return lista;
        }

        public Object[][] obtenerDatosTabla() {
            int numNodos = contarNodos();
            Object[][] datos = new Object[numNodos][4];
            NodoClientes actual = inicio;
            int fila = 0;
            while (actual != null) {
                datos[fila][0] = actual.cliente.getID().toString();
                datos[fila][1] = actual.cliente.getNombre();
                datos[fila][2] = actual.cliente.getApellidos();
                datos[fila][3] = actual.cliente.getEdad();
                actual = actual.siguiente;
                fila++;
            }
            return datos;
        }

        public void actualizarTabla() {
            DefaultTableModel modeloTabla = (DefaultTableModel) clientesTable.getModel();
            modeloTabla.setRowCount(0);
            Object[][] datos = obtenerDatosTabla();
            for (Object[] fila : datos) {
                modeloTabla.addRow(fila);
            }
        }
    }
}
