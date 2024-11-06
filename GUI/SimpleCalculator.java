import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class SimpleCalculator extends JFrame implements ActionListener {
    private final JTextField display;
    private String expression = "";

    public SimpleCalculator() {
        // Display setup
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setPreferredSize(new Dimension(360, 50));

        // Add border to display
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Black border with thickness 2

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));

        // Calculator buttons
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "√", "^", "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setPreferredSize(new Dimension(80, 60)); // Set a fixed size for buttons
            button.addActionListener(this);
            panel.add(button);
        }

        // Frame setup
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "C" -> clearDisplay();
                case "=" -> evaluateExpression();
                case "+", "-", "*", "/", "^" -> appendOperator(command);
                case "√" -> calculateSquareRoot();
                case "." -> addDecimalPoint();
                default -> appendToExpression(command);
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private void clearDisplay() {
        expression = "";
        display.setText("");
    }

    private void evaluateExpression() {
        try {
            // Check if the expression is already a result, then append the current
            // operation
            if (expression.isEmpty()) {
                return;
            }

            if (expression.charAt(expression.length() - 1) == '=') {
                // If the last character is '=', remove it before appending new numbers or
                // operators
                expression = expression.substring(0, expression.length() - 1);
            }

            double result = evaluate(expression);
            display.setText(formatResult(result));

            // Allow result to be used for the next calculation
            expression = formatResult(result); // Set the expression to the result for continued operations
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    private void appendOperator(String command) {
        if (!expression.isEmpty() && !isOperator(expression.charAt(expression.length() - 1))) {
            expression += command;
            display.setText(expression);
        }
    }

    private void calculateSquareRoot() {
        if (!expression.isEmpty()) {
            double num = Double.parseDouble(expression);
            if (num >= 0) {
                double result = Math.sqrt(num);
                display.setText(formatResult(result));
                expression = formatResult(result); // Set expression to the result for continued operations
            } else {
                display.setText("Invalid input");
            }
        }
    }

    private void addDecimalPoint() {
        if (expression.isEmpty() || isOperator(expression.charAt(expression.length() - 1))) {
            expression += "0."; // Start with 0 if expression or last char is an operator
        } else if (!expression.contains(".")) {
            expression += ".";
        }
        display.setText(expression);
    }

    private void appendToExpression(String value) {
        expression += value;
        display.setText(expression);
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private double evaluate(String expr) throws Exception {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder num = new StringBuilder();
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    num.append(expr.charAt(i));
                    i++;
                }
                numbers.push(Double.parseDouble(num.toString()));
                i--;
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    applyOperation(numbers, operators.pop());
                }
                operators.push(ch);
            }
            i++;
        }

        while (!operators.isEmpty()) {
            applyOperation(numbers, operators.pop());
        }

        return numbers.pop();
    }

    private int precedence(char operator) {
        return switch (operator) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    private void applyOperation(Stack<Double> numbers, char operator) {
        double b = numbers.pop();
        double a = numbers.pop();

        switch (operator) {
            case '+' -> numbers.push(a + b);
            case '-' -> numbers.push(a - b);
            case '*' -> numbers.push(a * b);
            case '/' -> numbers.push(a / b);
            case '^' -> numbers.push(Math.pow(a, b));
        }
    }

    private String formatResult(double value) {
        if (value == (long) value) {
            return String.valueOf((long) value);
        } else {
            return String.format("%.6f", value).replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}
