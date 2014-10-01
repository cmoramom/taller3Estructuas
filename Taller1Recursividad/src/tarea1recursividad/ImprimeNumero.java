package tarea1recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Mora Montero
 */
public class ImprimeNumero extends javax.swing.JFrame {

    public ImprimeNumero() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeroDigitado = new javax.swing.JTextField();
        generarInversa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numeroInverso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        numeroBuscado = new javax.swing.JTextField();
        buscarNumero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("tarea1recursividad/ConfiguracionNumeros"); // NOI18N
        jLabel1.setText(bundle.getString("numeros")); // NOI18N

        numeroDigitado.setToolTipText(bundle.getString("ayudaModulo")); // NOI18N

        generarInversa.setText("Generar");
        generarInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarInversaActionPerformed(evt);
            }
        });

        jLabel2.setText(bundle.getString("numeroInverso")); // NOI18N

        numeroInverso.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generarInversa)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarInversa))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeroInverso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Numero Inverso", jPanel1);

        jLabel3.setText(bundle.getString("numeros")); // NOI18N

        numeroBuscado.setToolTipText(bundle.getString("ayudaModulo")); // NOI18N

        buscarNumero.setText(bundle.getString("buscar")); // NOI18N
        buscarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(buscarNumero)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarNumero))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Busqueda Recursiva", jPanel2);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generarInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarInversaActionPerformed
        /* llamada a el moetodo de generacion del numero inverso*/

        //generarNumeroInverso(Integer.parseInt(numeroDigitado.getText()));
        LlamaNumeroInverso(numeroDigitado.getText());
    }//GEN-LAST:event_generarInversaActionPerformed

    private void buscarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNumeroActionPerformed
        busca(Integer.parseInt(numeroBuscado.getText()));
    }//GEN-LAST:event_buscarNumeroActionPerformed

 

    private String generaNumeroInverso(int indice, String[] numerosDigitados, String numeroInverso) {

        /* este metodo recibe un array con los numeros digitados por el usuario,
         y lo utiliza para generar el numero inverso al digitado*/
        --indice;
        if (indice < 0) {

            return numeroInverso;

        } else {
            numeroInverso += numerosDigitados[indice];
            return generaNumeroInverso(indice, numerosDigitados, numeroInverso);

        }

    }

    private void LlamaNumeroInverso(String numeroDigitado) {

        /* este metodo recibe los numeros digitos por el usuario y los trasforma
         en un array y se lo pasa al metodo recursivo generaNumeriInverso/*
         para posteriormente mostrarlo en el textBox del Jframe
         */
        String[] numerosnumerosDigitados = numeroDigitado.split("");
        numeroInverso.setText(generaNumeroInverso(numerosnumerosDigitados.length, numerosnumerosDigitados, ""));

    }

    public void busca(int x) {

        /* este emetodo setea el vector con sus valores y llama a al metodo recursivo 
         para buscar si el numero esta en el vector o no
         */
        int[] vector = {10, 20, 34, 45, 56, 78, 90};

        boolean encontrado = buscaR(x, vector, 0);

        if (encontrado) {
            JOptionPane.showMessageDialog(this, "Número encontrado en el vector");
        } else {
            JOptionPane.showMessageDialog(this, "Número NO encontrado en el vector, intente con otro");
        }

    }

    private boolean buscaR(int numeroBuscado, int[] vector, int posicionBusqueda) {
        /* este metodo busca recursivamente el numero digitado por el usuario ene l vector hasta que lo encuentre
         y devuelve true y recorre todo el vector y no lo encuentra devuelve false
         */

        if (posicionBusqueda < vector.length) {
            if (vector[posicionBusqueda] == numeroBuscado) {

                return true;

            } else {

                return buscaR(numeroBuscado, vector, ++posicionBusqueda);
            }

        } else {
            return false;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarNumero;
    private javax.swing.JButton generarInversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField numeroBuscado;
    private javax.swing.JTextField numeroDigitado;
    private javax.swing.JTextField numeroInverso;
    // End of variables declaration//GEN-END:variables
}
