import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    JTextField name_field, lastname_field,mail_field;
    JRadioButton male,female;
    JCheckBox check_box;
    public ContactForm(){
        super("Accueil");
        super.setBounds(350,250,350,150);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,3,2,1));

        JLabel name = new JLabel("Votre Nom:");
        name_field = new JTextField("",1);
        JLabel lastname = new JLabel("Votre Prenom:");
        lastname_field = new JTextField("",1);
        JLabel mail = new JLabel("Votre email:");
        mail_field = new JTextField("@",1);

        container.add(name);
        container.add(name_field);
        container.add(lastname);
        container.add(lastname_field);
        container.add(mail);
        container.add(mail_field);

        male = new JRadioButton("Homme");
        female = new JRadioButton("Femme");
        check_box = new JCheckBox("Conformité",true);
        JButton send_button = new JButton("Envoyer");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check_box);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String lastname = lastname_field.getText();
            String email = mail_field.getText();

           String isMale = "Homme";
           if (!male.isSelected())
               isMale = "Femme";

            String checkbox = "Oui";
            if (checkbox.isEmpty());



            JOptionPane.showMessageDialog(null,"Votre email: " + email +
                            "\nVotre sexe: " +isMale + "\nVous confirme? " + checkbox, "Bonjour " + name + " "
                            + lastname, JOptionPane.PLAIN_MESSAGE);


        }
    }
}
