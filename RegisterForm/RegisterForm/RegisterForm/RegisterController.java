package RegisterForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterController implements ActionListener {

    RegisterView view;

    public RegisterController() {
        view = new RegisterView();
        view.jBRegister.addActionListener(this);

    }

    public static void main(String[] args) {
        new RegisterController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        String name = view.jTxfName.getText();
        String email = view.jTxfEmail.getText();
        String city = (String) view.cityList.getSelectedItem();

        String gender = " ";
        if (view.jRbMale.isSelected()) {
            gender = " Male ";
        } else {
            gender = "Female";
        }

        ArrayList<String> Language = new ArrayList<String>();
        if (view.jCbC.isSelected()) {
            Language.add("C");
        }
        if (view.jCbDart.isSelected()) {
            Language.add("dart");
        }
        if (view.jCbJava.isSelected()) {
            Language.add("Java");
        }

        System.out.println("name: " + name);
        System.out.println("email:" + email);
        System.out.println("city:" + city);
        System.out.println("Gender:" + gender);
        System.out.println("Language: ");

        for (String Languages : Language) {
            System.out.println(Languages + ", ");
        }
    }

}