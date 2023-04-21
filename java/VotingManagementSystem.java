import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class VotingManagementSystem extends JFrame {
    // This array stores the number of votes for each candidate
    private static  int[] candidateVotes;
    
    // This array stores the names of the candidates
   private static String[] candidateNames;
    
    // This variable stores the total number of votes
    private int totalVotes;

    // VotingManagementSystem ()
    // {
    //     candidateNames[10]="amit gupta";
    //     candidateVotes[10] = '0';
    //     totalVotes=0;
    // }
    // ;
    
    // These are the GUI components
    private static JLabel titleLabel;
    private static JPanel candidatePanel;
    private static JLabel[] candidateLabels;
    private static JButton[] voteButtons;
    private static JLabel totalVotesLabel;
    private static JButton resultsButton;
    
    // This constructor initializes the arrays and variables
  

        VotingManagementSystem() {
            String[] names=  {"Dr. Ranjith Kumar ", "Prabhat Jha", "Vishal Singh ", "Anirudh Harsh", "Sonu Kumar"}; 
        candidateNames = names;
        candidateVotes = new int[names.length];
        totalVotes = 0;
        // JFrame Frame = new JFrame();
        // Frame.getContentPane().setBackground(new Color(255,123,0));
        // Set up the GUI
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE); 
        setTitle("Revolutionizing Democracy: The Power of Online Voting");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        setBackground(Color.CYAN);
        setBounds(600, 500, 500, 500);
        setPreferredSize(new Dimension(800, 600));
        Border border = BorderFactory.createLineBorder(Color.gray,4);
        Border border1 = BorderFactory.createLineBorder(Color.MAGENTA,3);

        titleLabel = new JLabel("Please select a candidate to vote for:");
        titleLabel.setBackground(Color.PINK);
        titleLabel.setBorder(border);
        add(titleLabel, BorderLayout.NORTH);
        
        //JFrame Frame = new JFrame();
        candidatePanel = new JPanel(new GridLayout(names.length, 15));
        candidatePanel.setSize(100,100);
        candidateLabels = new JLabel[names.length];
        voteButtons = new JButton[names.length];
        //voteButtons.setBackground(new Color(244,211,011));
        ImageIcon j=new ImageIcon("b.png");
         Image image = j.getImage(); // transform it 
         Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         j = new ImageIcon(newimg);

         ImageIcon z=new ImageIcon("c.png");
         Image image1 = z.getImage(); // transform it 
         Image newimg1 = image1.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         z = new ImageIcon(newimg1);

         ImageIcon z1=new ImageIcon("a.png");
         Image image2 = z1.getImage(); // transform it 
         Image newimg2 = image2.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         z1 = new ImageIcon(newimg2);

         ImageIcon z2=new ImageIcon("j.png");
         Image image3 = z2.getImage(); // transform it 
         Image newimg3 = image3.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         z2 = new ImageIcon(newimg3);

         ImageIcon z3=new ImageIcon("t.png");
         Image image4 = z3.getImage(); // transform it 
         Image newimg4 = image4.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         z3 = new ImageIcon(newimg4);

         ImageIcon z4=new ImageIcon("r.png");
         Image image5 = z4.getImage(); // transform it 
         Image newimg5 = image5.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         z4 = new ImageIcon(newimg5);

         

        candidatePanel.setBackground(new Color(204, 234, 217));

        //Frame.setVisible(true);
        
        for ( int i=0; i < names.length; i++) {
            candidateLabels[i] = new JLabel(names[i]);
            candidatePanel.add(candidateLabels[i]);
            voteButtons[i] = new JButton("Vote");
            voteButtons[i].setBackground(new Color(100,011,101));
            voteButtons[i].setBorder(border1);
            
            
            
            
            int candidateIndex = i;
            voteButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    candidateVotes[candidateIndex]++;
                    totalVotes++;
                    
                    JOptionPane.showMessageDialog(null, "Thank you for voting for " + candidateNames[candidateIndex] );
                    
                    updateTotalVotesLabel();
                }
            });
            candidatePanel.add(voteButtons[i]);
            
        }
        for(int a=0;a< names.length;a++)
            {
                voteButtons[0].setIcon(j);
                voteButtons[1].setIcon(z);
                voteButtons[2].setIcon(z1);
                voteButtons[3].setIcon(z2);
                voteButtons[4].setIcon(z3);
            } 
        
        add(candidatePanel, BorderLayout.CENTER);
        
        totalVotesLabel = new JLabel("Total votes: " + totalVotes);
        add(totalVotesLabel, BorderLayout.SOUTH);
        
        resultsButton = new JButton("View Results");
        resultsButton.setIcon(z4);
        resultsButton.setBackground(Color.LIGHT_GRAY);
        resultsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String results = "Voting Results:\n";
                for (int i = 0; i < candidateNames.length; i++) {
                    results += candidateNames[i] + ": " + candidateVotes[i] + " votes\n";
                }
                results += "Total votes: " + totalVotes;
                
                
                JOptionPane.showMessageDialog(null, results);
                
                
            }
        });
        add(resultsButton, BorderLayout.EAST);
        
        pack();
        setLocation(300, 0);
        setVisible(true);
    }

    
    // This method updates the total votes label
    private void updateTotalVotesLabel() {

        totalVotesLabel.setText("Total votes: " + totalVotes);
        totalVotesLabel.setBackground(Color.BLACK);
    }

    
    // This is the main method that creates and runs the voting management system
    public static void main(String[] args) {
        // String[] candidateNames = {"Amit Gupta", "Prabhat baby", "Vishal Singh ", "Anirudh Harsh", "Sonuuuu"};
        VotingManagementSystem votingSystem = new VotingManagementSystem();
    }

}

