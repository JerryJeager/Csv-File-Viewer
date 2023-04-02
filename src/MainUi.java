import javax.swing.*;
import java.awt.*;

public class MainUi {
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel header = new JLabel();
    private JPanel panel3;
    public MainUi(){
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        header = new JLabel("CSV File Viewer");
        frame.setTitle("CSV File Viewer");
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel1.setBackground(Color.darkGray);

        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 60, 25));
        panel2.setBackground(Color.GRAY);

        header.setForeground(Color.WHITE);
        header.setFont(new Font("Sans-serif", Font.BOLD, 32));

        Button button = new Button("Add a Csv File");

        button.setBackground(Color.darkGray);
        button.setForeground(Color.WHITE);
        button.setSize(40, 80);

        panel1.add(header);
        panel2.add(button, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.WEST);

        frame.setVisible(true);
    }


}
