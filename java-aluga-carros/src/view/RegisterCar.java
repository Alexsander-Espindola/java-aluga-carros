package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;

public class RegisterCar extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          RegisterCar frame = new RegisterCar();
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
  public RegisterCar() {
    setTitle("Register Car");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    Label nameCar = new Label("Name:");
    nameCar.setBounds(10, 10, 68, 21);
    contentPane.add(nameCar);

    TextField textFieldBrand = new TextField();
    textFieldBrand.setBounds(20, 89, 222, 19);
    contentPane.add(textFieldBrand);

    TextField textFieldCategory = new TextField();
    textFieldCategory.setBounds(20, 141, 222, 19);
    contentPane.add(textFieldCategory);

    Label brandCar = new Label("Brand:");
    brandCar.setBounds(10, 62, 68, 21);
    contentPane.add(brandCar);

    Label categoryCar = new Label("Category:");
    categoryCar.setBounds(10, 114, 68, 21);
    contentPane.add(categoryCar);

    Label licensePlate = new Label("License Plate:");
    licensePlate.setBounds(10, 166, 105, 21);
    contentPane.add(licensePlate);

    Label colorCar = new Label("Color:");
    colorCar.setBounds(10, 218, 105, 21);
    contentPane.add(colorCar);

    TextField textFieldlicensePlate = new TextField();
    textFieldlicensePlate.setBounds(20, 193, 222, 19);
    contentPane.add(textFieldlicensePlate);

    TextField textFieldColor = new TextField();
    textFieldColor.setBounds(20, 246, 222, 19);
    contentPane.add(textFieldColor);

    Label descriptionCar = new Label("Description:");
    descriptionCar.setBounds(10, 271, 105, 21);
    contentPane.add(descriptionCar);

    Button btnRegister = new Button("Register");
    btnRegister.setBounds(10, 374, 86, 23);
    contentPane.add(btnRegister);

    TextField textFieldDescription = new TextField();
    textFieldDescription.setBounds(20, 298, 222, 70);
    contentPane.add(textFieldDescription);
  }
}
