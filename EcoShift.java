/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoshift;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
public class EcoShift extends JFrame implements ActionListener{
    
    public static EcoShift ecoShift;
    public static FoodOrDrinkScreen foodOrDrinkScreen;
    public static TransportationScreen transport;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ecoShift = new EcoShift(1);
    }
    
    private JLabel homeBkgrLabel, instructionLabel;
    private JPanel instructionPanel, middlePanel;
    private JButton firstButton, secondButton, thirdButton, fourthButton;
    private JButton[] generalButtons;
    private ImageIcon transportButton = 
            new ImageIcon(this.getClass().getResource("Transport.png"));
    private ImageIcon foodAndDrinkButton = 
            new ImageIcon(this.getClass().getResource("FoodAndDrink.png"));
    private ImageIcon chooseCategory = 
            new ImageIcon(this.getClass().getResource("ChooseCategory.png")); 
    private ImageIcon electricityButton = 
            new ImageIcon(this.getClass().getResource("Electricity.png")); 
    private ImageIcon hydroButton = 
            new ImageIcon(this.getClass().getResource("Hydro.png")); 
    private ImageIcon introBkgr = 
            new ImageIcon(this.getClass().getResource("EcoShiftScreen.png"));
    private ImageIcon firstInfoScreen = 
            new ImageIcon(this.getClass().getResource("FirstInfoScreen.png"));
    private ImageIcon secondInfoScreen = 
            new ImageIcon(this.getClass().getResource("SecondInfoScreen.png"));
    private ImageIcon thirdInfoScreen = 
            new ImageIcon(this.getClass().getResource("ThirdInfoScreen.png"));
    
    
    public EcoShift(int n){
        setSize(350, 600);
        setTitle("EcoShift");
            
        firstButton = new JButton(introBkgr);
        firstButton.setOpaque(true);
        firstButton.addActionListener(this);
        firstButton.setBorderPainted(false);
        this.add(firstButton);       
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    public EcoShift(String s){
        setSize(350, 600);
        setTitle("EcoShift");
            
        secondButton = new JButton(firstInfoScreen);
        secondButton.setOpaque(true);
        secondButton.addActionListener(this);
        secondButton.setBorderPainted(false);
        this.add(secondButton);       
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public EcoShift(){
        setSize(350, 600);
        setTitle("EcoShift");
            
        thirdButton = new JButton(secondInfoScreen);
        thirdButton.addActionListener(this);
        thirdButton.setBorderPainted(false);
        this.add(thirdButton);       
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public EcoShift(char a){
        setSize(350, 600);
        setTitle("EcoShift");
            
        fourthButton = new JButton(thirdInfoScreen);
        fourthButton.addActionListener(this);
        fourthButton.setBorderPainted(false);
        this.add(fourthButton);       
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
      
    public EcoShift(double n){
        setSize(350, 600);
        setTitle("EcoShift");
        
        // Initialize font
        Font f = new Font("SansSerif", Font.BOLD, 36);
        
        instructionPanel = new JPanel();
        instructionPanel.setBackground(Color.WHITE);
        
        instructionLabel = new JLabel(chooseCategory);
        instructionLabel.setBackground(Color.WHITE);
        instructionPanel.add(instructionLabel);
        
        homeBkgrLabel = new JLabel();
        homeBkgrLabel.setOpaque(true);
        homeBkgrLabel.setBackground(Color.WHITE);
        homeBkgrLabel.setLayout(new GridLayout(2, 2, 6, 6));
        
        generalButtons = new JButton[4]; 
        for (int i = 0; i < 4; i++) { 
            generalButtons[i] = new JButton(""); 
            generalButtons[i].addActionListener(this); 
            generalButtons[i].setFont(f); 
            generalButtons[i].setBackground(Color.WHITE); 
            generalButtons[i].setBorderPainted(false);
            homeBkgrLabel.add(generalButtons[i]); 
        } // end for
        
        generalButtons[0].setIcon(transportButton);
        generalButtons[1].setIcon(foodAndDrinkButton);
        generalButtons[2].setIcon(hydroButton);
        generalButtons[3].setIcon(electricityButton);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        JPanel rightPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JLabel bottomLabel = new JLabel(" ");
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.add(bottomLabel);
        rightPanel.setBackground(Color.WHITE);
        middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(1, 1, 1, 1));
        middlePanel.add(homeBkgrLabel);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(instructionPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.SOUTH);
         
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == firstButton) {
            EcoShift game = new EcoShift("change");
            this.dispose();
        } // end if
        else if (e.getSource() == secondButton) {
            EcoShift game = new EcoShift();
            this.dispose();
        } // end if
        else if (e.getSource() == thirdButton) {
            EcoShift game = new EcoShift('a');
            this.dispose();
        } // end if
        else if (e.getSource() == fourthButton) {
            EcoShift game = new EcoShift(1.1);
            this.dispose();
        } // end if
        else if (e.getSource() == generalButtons[1]) {
            foodOrDrinkScreen = new FoodOrDrinkScreen(1.1);
            this.dispose();
        } // end if
    }

}
