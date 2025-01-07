import java.awt.*;
import java.awt.event.*;

public class DivisionMain1 extends Frame implements ActionListener {
    TextField num1, num2;
    Button dResult;
    Label outResult;
    String out = "";
    double resultNum;
    int flag = 0;

    public DivisionMain1() {
        setLayout(new FlowLayout());
        
        dResult = new Button("RESULT");
        Label number1 = new Label("Number 1:", Label.RIGHT);
        Label number2 = new Label("Number 2:", Label.RIGHT);
        num1 = new TextField(5);
        num2 = new TextField(5);
        outResult = new Label("Result:", Label.RIGHT);
        
        add(number1);
        add(num1);
        add(number2);
        add(num2);
        add(dResult);
        add(outResult);
        
        num1.addActionListener(this);
        num2.addActionListener(this);
        dResult.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int n1, n2;
        try {
            if (ae.getSource() == dResult) {
                n1 = Integer.parseInt(num1.getText());
                n2 = Integer.parseInt(num2.getText());
                if (n2 == 0) {
                    throw new ArithmeticException();
                }
                out = n1 + " / " + n2 + " = ";
                resultNum = n1 / n2;
                out += String.valueOf(resultNum);
                repaint();
            }
        } catch (NumberFormatException e1) {
            flag = 1;
            out = "Number Format Exception! Please enter valid integers.";
            repaint();
        } catch (ArithmeticException e2) {
            flag = 1;
            out = "Divide by 0 Exception! Cannot divide by zero.";
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (flag == 0) {
            g.drawString(out, outResult.getX() + outResult.getWidth(), outResult.getY() + outResult.getHeight() - 8);
        } else {
            g.drawString(out, 100, 200);
        }
        flag = 0;
    }

    public static void main(String[] args) {
        DivisionMain1 dm = new DivisionMain1();
        dm.setSize(300, 200);
        dm.setVisible(true);
    }
}