package view;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CarController;
import model.Brand;
import model.Categories;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterCar extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public void main(String[] args) {
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

    Label nameCar = new Label("Name:");
    nameCar.setBounds(10, 10, 68, 21);
    contentPane.add(nameCar);

    TextField textFieldName = new TextField();
    textFieldName.setBounds(20, 37, 222, 19);
    contentPane.add(textFieldName);

    Label brandCar = new Label("Brand:");
    brandCar.setBounds(10, 62, 68, 21);
    contentPane.add(brandCar);

    TextField textFieldBrand = new TextField();
    textFieldBrand.setBounds(20, 89, 222, 19);
    contentPane.add(textFieldBrand);

    Label categoryCar = new Label("Category:");
    categoryCar.setBounds(10, 114, 68, 21);
    contentPane.add(categoryCar);

    TextField textFieldCategory = new TextField();
    textFieldCategory.setBounds(20, 141, 222, 19);
    contentPane.add(textFieldCategory);

    Label licensePlate = new Label("License Plate:");
    licensePlate.setBounds(10, 166, 105, 21);
    contentPane.add(licensePlate);

    TextField textFieldLicensePlate = new TextField();
    textFieldLicensePlate.setBounds(20, 193, 222, 19);
    contentPane.add(textFieldLicensePlate);

    Label colorCar = new Label("Color:");
    colorCar.setBounds(10, 218, 105, 21);
    contentPane.add(colorCar);

    TextField textFieldColor = new TextField();
    textFieldColor.setBounds(20, 246, 222, 19);
    contentPane.add(textFieldColor);

    Label descriptionCar = new Label("Description:");
    descriptionCar.setBounds(10, 271, 105, 21);
    contentPane.add(descriptionCar);

    TextField textFieldDescription = new TextField();
    textFieldDescription.setBounds(20, 298, 222, 70);
    contentPane.add(textFieldDescription);

    Button btnRegister = new Button("Register");
    btnRegister.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String name = textFieldName.getText();
        String description = textFieldDescription.getText();
        double dailyRate = 10.0;
        double avaliable = 10.0;
        String licensePlate = textFieldLicensePlate.getText();
        String brandStr = textFieldBrand.getText();
//        Brand brand = new Brand();
//        Categories category = new Categories();
        String color = textFieldColor.getText();
        boolean success;

        try {
          CarController carController = new CarController();
          success = carController.registerCar(name, description, dailyRate, avaliable,
              licensePlate, color);
          if (success) {
            JOptionPane.showMessageDialog(null, "Alo mundão du bão, parece ki funfo isso ai em");
          } else {
            JOptionPane.showMessageDialog(null, "cê boto algum trem errado ai");
          }
        } catch (Exception error) {
          // TODO: handle exception
          JOptionPane.showMessageDialog(null, "Vish rapaz acho q deu um erro:" + error.getMessage());
        }

      }
    });
    btnRegister.setBounds(10, 374, 86, 23);
    contentPane.add(btnRegister);
  }
}
