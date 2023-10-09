package gui;

import controllers.PassengerController;
import infraestructure.PassangerRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPassengers {
    private JTable registeredPassenger;
    private JPanel panel1;
    private JButton loadPassengers;

    public ViewPassengers() {
        loadPassengers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PassengerController passengerController = new PassengerController(new PassangerRepository());
                var registeredPassengers = passengerController.getPassengers();

            }
        });
    }
}
