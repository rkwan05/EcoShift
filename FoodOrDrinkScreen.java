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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author catherine
 */
public class FoodOrDrinkScreen extends JFrame implements ActionListener{
    
    JPanel middlePanel = new JPanel();
    JLabel topLabel = new JLabel("<html><br><br><br></html>");
    JLabel secondScreenTopLabel = new JLabel("<html><br><br><br><br><br></html>");
    JLabel secondScreenBottomLabel = new JLabel("<html><br><br><br><br><br><br><br>"
            + "<br><br><br><br><br></html>");
    JPanel topPanel = new JPanel();
    private ImageIcon foodIcon = 
            new ImageIcon(this.getClass().getResource("Food.png"));
    private ImageIcon drinkIcon = 
            new ImageIcon(this.getClass().getResource("Drink.png"));
    private JTextField textField;
    private JTextArea textArea;
    private ImageIcon thirdInfoScreen = 
            new ImageIcon(this.getClass().getResource("ThirdInfoScreen.png"));
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
    private ImageIcon searchButton = 
            new ImageIcon(this.getClass().getResource("SearchButton.png"));
    private ImageIcon drinkTitle = 
            new ImageIcon(this.getClass().getResource("DrinkTitle.png"));
    private ImageIcon profilePage = 
            new ImageIcon(this.getClass().getResource("ProfilePage.png"));
    private ImageIcon updatedProfile = 
            new ImageIcon(this.getClass().getResource("UpdatedProfile.png"));
    private ImageIcon cocaInfo = 
            new ImageIcon(this.getClass().getResource("CocaInfo.png"));
    private JButton[] menuButtons;
    private String userInput = " ";
    private JButton drinkButton, foodButton;
    public static TransportationScreen transportScreen;
    
    public FoodOrDrinkScreen(double n){
        setSize(350, 600);
        setTitle("EcoShift");
        
        middlePanel.setLayout(new GridLayout(1, 1, 15, 15));
        middlePanel.setBackground(Color.WHITE);  
        
        foodButton = new JButton();
        foodButton.setBorderPainted(false);
        foodButton.setBackground(Color.WHITE);
        foodButton.setIcon(foodIcon);
        
        drinkButton = new JButton();
        drinkButton.setPreferredSize(new Dimension(100, 100));
        drinkButton.setBorderPainted(false);
        drinkButton.setBackground(Color.WHITE);
        drinkButton.setIcon(drinkIcon);
        drinkButton.addActionListener(this);
        
        middlePanel.add(foodButton);
        middlePanel.add(drinkButton);
        
        JPanel secondScreenTopPanel = new JPanel();
        secondScreenTopPanel.setBackground(Color.WHITE);
        secondScreenTopPanel.add(secondScreenTopLabel);
        
        JPanel secondScreenBottomPanel = new JPanel();
        secondScreenBottomPanel.setBackground(Color.WHITE);
        secondScreenBottomPanel.add(secondScreenBottomLabel);
         
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(217, 217, 217));
        menuPanel.add(secondScreenBottomPanel);

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

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(secondScreenTopPanel, BorderLayout.NORTH);
        this.add(secondScreenBottomPanel, BorderLayout.SOUTH);
        this.add(menuPanel, BorderLayout.SOUTH);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
        
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
    public FoodOrDrinkScreen(){
        setSize(350, 600);
        setTitle("EcoShift");
        
        JLabel foodLabel = new JLabel();
        
        topLabel.setBackground(Color.WHITE);
        topLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br><br><br><br><br>"
                + "<br><br><br><br><br><br><br><br><br></html>");
//        topPanel.add(topLabel);
        foodLabel.setIcon(drinkTitle);
        topPanel.setBackground(Color.WHITE);
        topPanel.add(foodLabel);
        
        JPanel midPanel = new JPanel();
        midPanel.setBackground(Color.WHITE);
        
        // Text field for the user's name
        textField = new JTextField(20);
        textField.addActionListener(this);
        textField.setToolTipText("Search for your activity.");
        
        // Hide the text area for the user's name
        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane playerXScrollPane = new JScrollPane(textArea);
        playerXScrollPane.setVisible(false);
        
        JButton search = new JButton();
        search.setPreferredSize(new Dimension(20, 20));
        search.setBorderPainted(false);
        search.setIcon(searchButton);
        search.addActionListener(this);
        textField.setHorizontalAlignment(JTextField.CENTER);
        
        midPanel.add(topLabel);
        midPanel.add(textField);
        midPanel.add(search);
        
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
        this.add(midPanel, BorderLayout.CENTER);
        this.add(topPanel, BorderLayout.NORTH);
        
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        
    public FoodOrDrinkScreen(int n){
        setSize(350, 600);
        setTitle("EcoShift");
        
        JLabel profile = new JLabel();
        profile.setIcon(profilePage);
        
        this.add(profile);
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public FoodOrDrinkScreen(char n){
        setSize(350, 600);
        setTitle("EcoShift");
        
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
        
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public FoodOrDrinkScreen(String s){
        setSize(350, 600);
        setTitle("EcoShift");
        
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(217, 217, 217));
        
           
        JPanel topPanel = new JPanel();
        JLabel topLabel = new JLabel();
        topPanel.setBackground(Color.WHITE);
        topLabel.setIcon(cocaInfo);
        topPanel.add(topLabel);

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
        
        // Finish settin up the frame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == drinkButton){
                FoodOrDrinkScreen game = new FoodOrDrinkScreen();
            }
            else if (e.getSource() == menuButtons[2]){
                FoodOrDrinkScreen game = new FoodOrDrinkScreen(1);
                this.dispose();
            }
            else if (e.getSource() == menuButtons[1]){
                TransportationScreen game = new TransportationScreen();
                this.dispose();
            }
            
            if (e.getSource() == searchButton && userInput.equals("Coca-Cola")) {
            userInput = textField.getText();
            FoodOrDrinkScreen game = new FoodOrDrinkScreen("hi");
             this.dispose();
                }

    } 
}

