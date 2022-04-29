package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainPage extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainPage frame = new MainPage();
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
  public MainPage() {
    setTitle("Alucar");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 800, 600);
    
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    
    JMenu mnRentals = new JMenu("Retals");
    menuBar.add(mnRentals);
    
    JMenuItem mntmRental = new JMenuItem("Rental");
    mnRentals.add(mntmRental);
    
    JMenuItem mntmConsult = new JMenuItem("Consult");
    mnRentals.add(mntmConsult);
    
    JMenu mnRegister = new JMenu("Register");
    menuBar.add(mnRegister);
    
    JMenuItem mntmCar = new JMenuItem("Car");
    mnRegister.add(mntmCar);
    
    JMenuItem mntmCustomer = new JMenuItem("Customer");
    mnRegister.add(mntmCustomer);
    
    JMenuItem mntmBrand = new JMenuItem("Brand");
    mnRegister.add(mntmBrand);
    
    JMenuItem mntmCategory = new JMenuItem("Category");
    mnRegister.add(mntmCategory);
    
    JMenuItem mntmSpecification = new JMenuItem("Specification");
    mnRegister.add(mntmSpecification);
    
    JMenu mnExit = new JMenu("Exit");
    menuBar.add(mnExit);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
  }

}