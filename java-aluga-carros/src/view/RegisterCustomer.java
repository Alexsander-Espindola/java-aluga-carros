package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;

import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterCustomer extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          RegisterCustomer frame = new RegisterCustomer();
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
  public RegisterCustomer() {
    setTitle("Register Customer");
    setResizable(false);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 450, 500);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    Label nameCustomer = new Label("Name:");
    nameCustomer.setBounds(10, 10, 68, 21);
    contentPane.add(nameCustomer);

    TextField textFieldName = new TextField();
    textFieldName.setBounds(20, 37, 222, 19);
    contentPane.add(textFieldName);

    Label email = new Label("Email:");
    email.setBounds(10, 62, 68, 21);
    contentPane.add(email);

    TextField textFieldEmail = new TextField();
    textFieldEmail.setBounds(20, 89, 222, 19);
    contentPane.add(textFieldEmail);

    Label adress = new Label("Adress:");
    adress.setBounds(10, 114, 68, 21);
    contentPane.add(adress);

    TextField textFieldAdress = new TextField();
    textFieldAdress.setBounds(20, 141, 222, 19);
    contentPane.add(textFieldAdress);

    Label phoneNumber = new Label("Phone Number:");
    phoneNumber.setBounds(10, 166, 105, 21);
    contentPane.add(phoneNumber);

    TextField textFieldPhoneNumber = new TextField();
    textFieldPhoneNumber.setBounds(20, 193, 222, 19);
    contentPane.add(textFieldPhoneNumber);

    Label driverLicense = new Label("Driver License:");
    driverLicense.setBounds(10, 218, 105, 21);
    contentPane.add(driverLicense);

    TextField textFieldDriverLicense = new TextField();
    textFieldDriverLicense.setBounds(20, 246, 222, 19);
    contentPane.add(textFieldDriverLicense);

    Label birthDate_1 = new Label("Birth Date:");
    birthDate_1.setBounds(10, 271, 105, 21);
    contentPane.add(birthDate_1);

    TextField textFieldBirthDate = new TextField();
    textFieldBirthDate.setBounds(20, 298, 222, 19);
    contentPane.add(textFieldBirthDate);

    Button btnRegister = new Button("Register");
    btnRegister.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name = textFieldName.getText();
        String email = textFieldEmail.getText();
        String adress = textFieldAdress.getText();
        String phoneNumber = textFieldPhoneNumber.getText();
        String driverLicense = textFieldDriverLicense.getText();
        String birthDate = textFieldBirthDate.getText();
        boolean success;

        try {
          CustomerController customerController = new CustomerController();
          success = customerController.registerCustomer(name, birthDate, email, driverLicense, adress, phoneNumber);
          
          if (success) {
            JOptionPane.showMessageDialog(null, "Diga com voz de robô: Cliente cadastrado com sucesso");
          } else {
            JOptionPane.showMessageDialog(null, "Diga com voz de narrador do animal planet: E então, o nosso cliente foi pego"
                + " pelas presas do sistema de autenticação e não conseguiu fazer o seu cadastro");
          }
        } catch (Exception error) {
          // TODO: handle exception
          JOptionPane.showMessageDialog(null, "Vish rapaz acho q deu um erro:" + error.getMessage());
        }
      }
    });
    btnRegister.setBounds(10, 343, 86, 23);
    contentPane.add(btnRegister);
  }
}
