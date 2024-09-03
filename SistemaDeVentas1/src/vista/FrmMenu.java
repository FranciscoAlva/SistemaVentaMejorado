package vista;

import java.awt.Dimension;

/**
 *
 * @author maygr
 */
public class FrmMenu extends javax.swing.JFrame {

    
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("SISTEMA DE VENTA");        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem2_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Donantes.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem1_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addusergroup_1251.png"))); // NOI18N
        jMenuItem1_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem1_nuevo_usuario.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu1.add(jMenuItem1_nuevo_usuario);

        jMenuItem2_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jMenuItem2_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem2_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu1.add(jMenuItem2_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem3.setText("Nuevo Producto");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem4.setText("Gestionar Productos");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem5.setText("Actualizar Stock");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem6.setText("Nuevo Cliente");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        jMenuItem7.setText("Gestionar Cliente");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem8.setText("Nueva Categoria");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu4.add(jMenuItem8);

        jMenuItem18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem18.setText("Gestionar Categoria");
        jMenuItem18.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem10.setText("Nueva Venta");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(jMenuItem10);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem9.setText("Gestionar Ventas");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reporte");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem12.setText("Reportes Clientes");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem13.setText("Reportes Categorias");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem14.setText("Reportes Productos");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem15.setText("Reportes Ventas");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem16.setText("Ver Historial");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesion");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem17.setText("Cerrar Sesion");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu8.add(jMenuItem17);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem1_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem2_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
