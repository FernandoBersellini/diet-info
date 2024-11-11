package window;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
    JTextField num1;
    JTextField num2;

    public Window() {
        setTitle("DietInfo");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButton = new JButton();
        jButton.setText("Clique aqui!");
        jButton.setBounds(350,200,250,70);
        jButton.setFont(new Font("Arial",Font.BOLD,32));
        jButton.setForeground(new Color(10,40,31));
        jButton.setBackground(new Color(100,231,31));
        add(jButton);

        jButton.addActionListener(this::teste);

        num1 = new JTextField();
        num1.setBounds(100,200,100,100);
        num1.setFont(new Font("Arial",Font.BOLD,32));
        add(num1);

        num2 = new JTextField();
        num2.setBounds(100,300,100,100);
        num2.setFont(new Font("Arial",Font.BOLD,32));
        add(num2);


        setVisible(true);
    }

    public void teste(ActionEvent actionEvent) {
        int numero1 = Integer.parseInt(num1.getText());
        int numero2 = Integer.parseInt(num2.getText());

        int soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null,
                "A soma é: " + soma,"Título",JOptionPane.ERROR_MESSAGE);
    }


}
