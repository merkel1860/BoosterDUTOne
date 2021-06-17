package core;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class TimerClock extends JFrame {
    private String clock;
    private JLabel currentLabel;
    public TimerClock() throws HeadlessException {
    }

    public TimerClock(String title) throws HeadlessException {
        super(title);
        setupJFrameParameters();
        clock = initiateWidgets();
        updateTimer();
        bindingWidgetToWindow();
    }

    private void setupJFrameParameters() {
        this.setMaximumSize(new Dimension(150, 140));
        this.setSize(new Dimension(200, 200));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
//        this.pack();
        this.setVisible(true);
    }
    private void bindingWidgetToWindow() {
        this.getContentPane().add(currentLabel);
    }

    private void updateTimer() {
        currentLabel.setText(clock);
    }

    private String initiateWidgets() {
        currentLabel = new JLabel();
        int h =  LocalDateTime.now().getHour();
        int m = LocalDateTime.now().getMinute();
        String hours = h+" : "+m;

        return hours;
    }
}
