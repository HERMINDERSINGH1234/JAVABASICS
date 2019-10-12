
public class OkDialog extends javax.swing.JFrame {
    String title;
    String message;
    /** Creates new form OkCancelDialog */
    public OkDialog(){
            initComponents();
    }
    public OkDialog(String title, String message) {
        super(title);
        this.title = title;
        this.message = message;
        initComponents();
        lblmessage.setText(message);
        this.setVisible(true);
    }
    
   
    private void initComponents() {

        lblmessage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); lblmessage.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblmessage, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
       pack();
    }
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        this.dispose();
    }
   
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OkDialog().setVisible(true);
            }
        } );
    }

