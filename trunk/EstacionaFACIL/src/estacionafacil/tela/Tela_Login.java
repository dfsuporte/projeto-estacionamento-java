package estacionafacil.tela;//GEN-BEGIN:initComponents

import estacionafacil.modelo.Login;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Tela_Login extends javax.swing.JFrame {

    public Tela_Login() {
        initComponents();
        campo_usuario.grabFocus();
    }

    private void abreJanelaPrincipal() {
        Tela_Principal tela_Principal = new Tela_Principal();
        tela_Principal.setLocationRelativeTo(null);
        tela_Principal.setVisible(true);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        label_senha = new javax.swing.JLabel();
        campo_senha = new javax.swing.JPasswordField();
        label_usuario = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        img_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");

        label_senha.setText("Senha");
        label_senha.setBounds(130, 90, 90, 14);
        jDesktopPane1.add(label_senha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        campo_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_senhaKeyPressed(evt);
            }
        });
        campo_senha.setBounds(130, 110, 95, 20);
        jDesktopPane1.add(campo_senha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_usuario.setText("Usuário");
        label_usuario.setBounds(20, 90, 90, 14);
        jDesktopPane1.add(label_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        campo_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_usuarioKeyPressed(evt);
            }
        });
        campo_usuario.setBounds(20, 110, 98, 20);
        jDesktopPane1.add(campo_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        img_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/tela/img/img_login.png"))); // NOI18N
        img_login.setBounds(0, 0, 400, 200);
        jDesktopPane1.add(img_login, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private boolean validaLogin() {

        if (campo_usuario.getText().equals("") || campo_senha.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Informe o usuário e a senha.");
            return false;
        } else {
            Login login = new Login();
            login.setUsuario(campo_usuario.getText());
            login.setSenha(campo_senha.getText());
            if (login.isValido()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário e senha inválido");
                campo_usuario.setText(null);
                campo_senha.setText(null);
                campo_usuario.grabFocus();
                return false;
            }
        }

    }

    private void campo_usuarioKeyPressed(java.awt.event.KeyEvent evt) {

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (validaLogin()) {
                abreJanelaPrincipal();
            }
        }

    }

    private void campo_senhaKeyPressed(java.awt.event.KeyEvent evt) {

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (validaLogin()) {
                abreJanelaPrincipal();
            }
        }

    }
    // Variables declaration - do not modify
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel img_login;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_usuario;
    // End of variables declaration
}



    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

