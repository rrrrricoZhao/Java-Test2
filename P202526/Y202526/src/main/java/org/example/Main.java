package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Main {
    private static int tickCounter = 0;

    public static void main(String[] args) {
        //8 Bays
        String[] bayName = {"Nightingale", "Barton", "Seacole", "Dix", "Henderson", "Cavell", "Sanger","Breckinridge"};

        //Create an Array for 4 services
        ArrayList<Services> services = new ArrayList<>();
        services.add(new UltrasoundScanner());
        services.add(new EcgRecorder());
        services.add(new DialysisMachine());
        services.add(new Masseur());

        //GUI Part
        JFrame frame = new JFrame("Hospital Monitor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(8,1));
        JPanel[] panels = new JPanel[8];
        JLabel[] labels = new JLabel[8];
        for (int i = 0; i < 8; i++){
            panels[i] = new JPanel();
            panels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            panels[i].setLayout(new BorderLayout());
            labels[i] = new JLabel("Loading..", SwingConstants.CENTER);
            //put the labels to the panel
            panels[i].add(labels[i]);
            //put the panel to the frame
            frame.add(panels[i]);
        }
        frame.setVisible(true);

        //Timer for contact the doctor every 1h = 3600000ms
        Timer timer = new Timer(3600000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tickCounter++;

                for (int i = 0; i < bay.length)
                //issuing report every 24h
                if (tickCounter % 24 == 0){
                    System.out.println("=== 24h Log: " + );
                }
            }
        })；


    }
}