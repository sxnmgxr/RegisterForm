package RegisterForm;

import javax.swing.*;
import java.awt.*;

public class RegisterView extends JFrame {

    // name
    JLabel jLblName = new JLabel("Name");
    JTextField jTxfName = new JTextField(10);

    // email
    JLabel jLblEmail = new JLabel("Email");
    JTextField jTxfEmail = new JTextField(10);

    // gender
    JLabel jLblGender = new JLabel("Gender");
    JRadioButton jRbMale = new JRadioButton("Male");
    JRadioButton jRbFemale = new JRadioButton("Female");
    ButtonGroup gendeGroup = new ButtonGroup();

    // city
    JLabel jLblCity = new JLabel("Cities");
    String[] cityArea = { "Kathmandu", "Bhaktapur", "Lalitpur" };
    @SuppressWarnings("rawtypes")
    JComboBox cityList = new JComboBox<>(cityArea);

    // age
    JLabel jLblAge = new JLabel("Age");
    JSlider jSlAge = new JSlider(15, 70, 20);

    // language
    JLabel jLblLanguages = new JLabel("Language:");

    JCheckBox jCbC = new JCheckBox("C");
    JCheckBox jCbPython = new JCheckBox("Python");
    JCheckBox jCbJava = new JCheckBox("JAVA");
    JCheckBox jCbDart = new JCheckBox("Dart");
    JCheckBox jCbOTher = new JCheckBox("Other");

    // Register
    JButton jBRegister = new JButton("Register");

    RegisterView() {
        setVisible(true);
        setTitle("RegisterForm");
        setSize(500, 500);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userGUI();
    }

    void userGUI() {
        Container window = getContentPane();
        window.setLayout(new GridLayout(10, 2));
        // Name
        window.add(jLblName);
        window.add(jTxfName);

        // email
        window.add(jLblEmail);
        window.add(jTxfEmail);

        // gender
        window.add(jLblGender);
        gendeGroup.add(jRbMale);
        gendeGroup.add(jRbFemale);
        window.add(jRbMale);
        window.add(new JLabel());
        window.add(jRbFemale);

        window.add(cityList);

        // city
        window.add(jLblCity);
        window.add(cityList);

        // age
        window.add(jLblAge);
        window.add(jSlAge);

        // lanague
        window.add(jLblLanguages);
        window.add(jCbC);
        window.add(jCbPython);
        window.add(jCbJava);
        window.add(jCbDart);
        window.add(jCbOTher);

        // register
        window.add(jBRegister);

    }
}
