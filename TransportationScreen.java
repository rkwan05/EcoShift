/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoshift;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author catherine
 */
public class TransportationScreen extends JFrame implements ActionListener{
    
    private ImageIcon foodAndDrinkShortcut = 
            new ImageIcon(this.getClass().getResource("FoodAndDrinkShortcut.png"));
    private ImageIcon transportationShortcut = 
            new ImageIcon(this.getClass().getResource("TransportationShortcut.png"));
    private ImageIcon homeShortcut = 
            new ImageIcon(this.getClass().getResource("HomeShortcut.png"));
    private ImageIcon hydroShortcut = 
            new ImageIcon(this.getClass().getResource("HydroShortcut.png"));
    private ImageIcon electricityShortcut = 
            new ImageIcon(this.getClass().getResource("ElectricityShortcut.png"));
    private ImageIcon carButton = 
            new ImageIcon(this.getClass().getResource("CarButton.png"));
    private ImageIcon motorcycleButton = 
            new ImageIcon(this.getClass().getResource("MotorcycleButton.png"));
    private ImageIcon busButton = 
            new ImageIcon(this.getClass().getResource("BusButton.png"));
    private ImageIcon trainButton = 
            new ImageIcon(this.getClass().getResource("TrainButton.png"));
    private ImageIcon planeButton = 
            new ImageIcon(this.getClass().getResource("PlaneButton.png"));
    private ImageIcon boatButton = 
            new ImageIcon(this.getClass().getResource("BoatButton.png"));
    private JButton[] menuButtons, transportButtons;
    private ImageIcon drivingInfo = 
            new ImageIcon(this.getClass().getResource("DrivingInfo.png"));
    public static FoodOrDrinkScreen foodOrDrink;
    
    public TransportationScreen(){
        setSize(350, 600);
        setTitle("EcoShift");
        
        JPanel transportBkgrPanel = new JPanel();
        transportBkgrPanel.setBackground(Color.WHITE);
        transportBkgrPanel.setLayout(new GridLayout(3, 2, 6, 6));
        
        transportButtons = new JButton[6]; 
        for (int i = 0; i < 6; i++) { 
            transportButtons[i] = new JButton(""); 
            transportButtons[i].addActionListener(this); 
            transportButtons[i].setBackground(Color.WHITE); 
            transportButtons[i].setBorderPainted(false);
            transportBkgrPanel.add(transportButtons[i]); 
        } // end for
        
        transportButtons[0].setIcon(carButton);
        transportButtons[1].setIcon(motorcycleButton);
        transportButtons[2].setIcon(busButton);
        transportButtons[3].setIcon(trainButton);
        transportButtons[4].setIcon(planeButton);
        transportButtons[5].setIcon(boatButton);
        
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(217, 217, 217));

        menuButtons = new JButton[5]; 
        for (int i = 0; i < 5; i++) { 
            menuButtons[i] = new JButton(""); 
            menuButtons[i].addActionListener(this); 
            menuButtons[i].setBackground(new Color(217, 217, 217)); 
            menuButtons[i].setBorderPainted(false);
            menuButtons[i].setPreferredSize(new Dimension(60, 40));
            menuPanel.add(menuButtons[i]); 
        } // end for
        
        menuButtons[0].setIcon(foodAndDrinkShortcut);
        menuButtons[1].setIcon(transportationShortcut);
        menuButtons[2].setIcon(homeShortcut);
        menuButtons[3].setIcon(homeShortcut);
        menuButtons[4].setIcon(electricityShortcut);
        
        this.add(menuPanel, BorderLayout.SOUTH); 
        this.add(transportBkgrPanel, BorderLayout.CENTER);
        
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public TransportationScreen(char c){
        setSize(350, 600);
        setTitle("EcoShift");
        
        JPanel topPanel = new JPanel();
        JLabel topLabel = new JLabel();
        topPanel.setBackground(Color.WHITE);
        topLabel.setIcon(drivingInfo);
        topPanel.add(topLabel);
        
                
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(217, 217, 217));

        menuButtons = new JButton[5]; 
        for (int i = 0; i < 5; i++) { 
            menuButtons[i] = new JButton(""); 
            menuButtons[i].addActionListener(this); 
            menuButtons[i].setBackground(new Color(217, 217, 217)); 
            menuButtons[i].setBorderPainted(false);
            menuButtons[i].setPreferredSize(new Dimension(60, 40));
            menuPanel.add(menuButtons[i]); 
        } // end for
        
        menuButtons[0].setIcon(foodAndDrinkShortcut);
        menuButtons[1].setIcon(transportationShortcut);
        menuButtons[2].setIcon(homeShortcut);
        menuButtons[3].setIcon(homeShortcut);
        menuButtons[4].setIcon(electricityShortcut);
        
        this.add(menuPanel, BorderLayout.SOUTH); 
        this.add(topPanel, BorderLayout.NORTH);
        
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == transportButtons[0]){
            TransportationScreen transport = new TransportationScreen('c');
            this.dispose();
        }
        else if (e.getSource() == menuButtons[2]){
            EcoShift game = new EcoShift(1.1);
            this.dispose();
        } 
        else if (e.getSource() == menuButtons[0]){
            FoodOrDrinkScreen foodOrDrink = new FoodOrDrinkScreen(1.1);
            this.dispose();
        }
    }
    
}
