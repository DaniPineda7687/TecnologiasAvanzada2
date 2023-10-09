package gui;
import controllers.PassengerController;
import infraestructure.PassangerRepository;
import user.Passenger;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPassenger {
    private JButton registrarButton;
    private JTextField passengerName;
    private JTextField passwordTextField;
    private JPasswordField passengerPassword;
    private JTextField passportNumber;

    public RegisterPassenger() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PassengerController passengerController = new PassengerController(new PassangerRepository());
                passengerController.createPassenger(new Passenger());
            }
        });
    }
}
