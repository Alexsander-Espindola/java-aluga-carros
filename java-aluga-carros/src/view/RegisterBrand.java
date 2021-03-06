package view;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BrandController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterBrand extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          RegisterBrand frame = new RegisterBrand();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public RegisterBrand() {
    setTitle("Register Brand");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 450, 200);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    TextField textFieldName = new TextField();
    textFieldName.setBounds(20, 37, 222, 19);
    contentPane.add(textFieldName);

    Label nameBrand = new Label("Name:");
    nameBrand.setBounds(10, 10, 68, 21);
    contentPane.add(nameBrand);

    Button btnRegister = new Button("Register");
    btnRegister.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name = textFieldName.getText();
        boolean success;
        try {
          BrandController brandController = new BrandController();
          success = brandController.registerBrand(name);
          if (success) {
            JOptionPane.showMessageDialog(null, "Marca registrada com SUCCESS!!!!!!!!!!!");
          } else {
            JOptionPane.showMessageDialog(null, "Marca não foi registrada, foi um DES SUCCESS.");
          }
        } catch (Exception error) {
          JOptionPane.showMessageDialog(null, "ERRO: " + error.getMessage());
        }
      }
    });
    btnRegister.setBounds(20, 73, 86, 23);
    contentPane.add(btnRegister);
  }

}
