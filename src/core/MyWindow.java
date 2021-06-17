package core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements ActionListener {
    private JButton yesButton;
    private JButton noButton;
    private JLabel nameLabel;
    private JTextField nameTextField;

    public MyWindow(String title) throws HeadlessException {
        super(title);
        instantiateWidget();
        setupJFrameParameters();
        setupActionListener();
        bindingWidgetToWindow();

    }

    private void bindingWidgetToWindow() {
        this.getContentPane().add(nameLabel);
        this.getContentPane().add(nameTextField);
        this.getContentPane().add(yesButton);
        this.getContentPane().add(noButton);
    }

    private void setupJFrameParameters() {
        this.setMaximumSize(new Dimension(150, 140));
        this.setSize(new Dimension(150, 140));
        this.setMinimumSize(new Dimension(150, 140));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
//        this.pack();
        this.setVisible(true);
    }

    private void instantiateWidget() {
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        nameLabel = new JLabel("Mon nom est DUT 1");
        nameTextField = new JTextField("Entrez votre nom");

    }

    private void setupActionListener() {
        yesButton.addActionListener(this);
        noButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button;
        if (e.getSource() instanceof JButton) {
            button = (JButton) e.getSource();
            if (button.getText().compareToIgnoreCase("Yes") == 0) {
                JOptionPane.showMessageDialog(null,
                        "Bonjour "+nameTextField.getText().toUpperCase());
            }
            if (button.getText().compareToIgnoreCase("No") == 0){
                JOptionPane.showMessageDialog(null,
                        "No");
            }
        }
    }
}
