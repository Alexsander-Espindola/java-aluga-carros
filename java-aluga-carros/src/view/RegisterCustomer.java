package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Choice;
import java.awt.Button;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JMenuItem;

public class RegisterCustomer extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
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
    
    TextField textFieldName = new TextField();
    textFieldName.setBounds(20, 37, 222, 19);
    contentPane.add(textFieldName);
    
    Label name = new Label("Name:");
    name.setBounds(10, 10, 68, 21);
    contentPane.add(name);
    
    TextField textFieldEmail = new TextField();
    textFieldEmail.setBounds(20, 89, 222, 19);
    contentPane.add(textFieldEmail);
    
    TextField textFieldAdress = new TextField();
    textFieldAdress.setBounds(20, 141, 222, 19);
    contentPane.add(textFieldAdress);
    
    Label email = new Label("Email:");
    email.setBounds(10, 62, 68, 21);
    contentPane.add(email);
    
    Label adress = new Label("Adress:");
    adress.setBounds(10, 114, 68, 21);
    contentPane.add(adress);
    
    Label phoneNumber = new Label("Phone Number:");
    phoneNumber.setBounds(10, 166, 105, 21);
    contentPane.add(phoneNumber);
    
    Label driverLicense = new Label("Driver License:");
    driverLicense.setBounds(10, 218, 105, 21);
    contentPane.add(driverLicense);
    
    TextField textFieldPhoneNumber = new TextField();
    textFieldPhoneNumber.setBounds(20, 193, 222, 19);
    contentPane.add(textFieldPhoneNumber);
    
    TextField textFieldDriverLicense = new TextField();
    textFieldDriverLicense.setBounds(20, 246, 222, 19);
    contentPane.add(textFieldDriverLicense);
    
    Label birthDate = new Label("Birth Date:");
    birthDate.setBounds(10, 271, 105, 21);
    contentPane.add(birthDate);
    
    Button btnRegister = new Button("Register");
    btnRegister.setBounds(10, 343, 86, 23);
    contentPane.add(btnRegister);
    
    Label day = new Label("day:");
    day.setBounds(20, 298, 34, 21);
    contentPane.add(day);
    
    Label month = new Label("month:");
    month.setBounds(269, 289, 105, 21);
    contentPane.add(month);
    
    Label year = new Label("year:");
    year.setBounds(269, 345, 105, 21);
    contentPane.add(year);
    
    JMenuItem mntmDay = new JMenuItem("day");
    mntmDay.setBounds(60, 300, 36, 19);
    contentPane.add(mntmDay);
  }
}
