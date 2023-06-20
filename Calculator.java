import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

/**
 * 
 * @author John Waugh
 * @version 1.0
 * @date 6/19/2023
 * 
 */

public class Calculator extends JFrame {
	private JFrame frame;
	private JTextField infixExpression;
	private int h = 50;
	private int w = 30;

	public JFrame getFrame() {
		return frame;
	}

	public Calculator() {
		
		Color calculate = new Color(39, 66, 43);
		Color optColor = new Color(66, 143, 76);
		Color numColor = new Color(141, 217, 151);
		
		frame = new JFrame("Calculator");

		JPanel bp = new JPanel();
		bp.setLayout(new BoxLayout(bp, BoxLayout.PAGE_AXIS));
		
//---------------------------------------------------------------------------------------------------------------------------
	
		JButton b0 = new JGradientButton("0");
		b0.setPreferredSize(new Dimension(w, h));
		b0.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b0.setBorder(BorderFactory.createLineBorder(Color.black));
		b0.setBackground(numColor);
		
		JButton b1 = new JGradientButton("1");
		b1.setPreferredSize(new Dimension(w, h));
		b1.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b1.setBorder(BorderFactory.createLineBorder(Color.black));
		b1.setBackground(numColor);
		
		JButton b2 = new JGradientButton("2");
		b2.setPreferredSize(new Dimension(w, h));
		b2.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b2.setBorder(BorderFactory.createLineBorder(Color.black));
		b2.setBackground(numColor);
		
		JButton b3 = new JGradientButton("3");
		b3.setPreferredSize(new Dimension(w, h));
		b3.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b3.setBorder(BorderFactory.createLineBorder(Color.black));
		b3.setBackground(numColor);
		
		JButton b4 = new JGradientButton("4");
		b4.setPreferredSize(new Dimension(w, h));
		b4.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b4.setBorder(BorderFactory.createLineBorder(Color.black));
		b4.setBackground(numColor);
		
		JButton b5 = new JGradientButton("5");
		b5.setPreferredSize(new Dimension(w, h));
		b5.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b5.setBorder(BorderFactory.createLineBorder(Color.black));
		b5.setBackground(numColor);
		
		JButton b6 = new JGradientButton("6");
		b6.setPreferredSize(new Dimension(w, h));
		b6.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b6.setBorder(BorderFactory.createLineBorder(Color.black));
		b6.setBackground(numColor);
		
		JButton b7 = new JGradientButton("7");
		b7.setPreferredSize(new Dimension(w, h));
		b7.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b7.setBorder(BorderFactory.createLineBorder(Color.black));
		b7.setBackground(numColor);
		
		JButton b8 = new JGradientButton("8");
		b8.setPreferredSize(new Dimension(w, h));
		b8.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b8.setBorder(BorderFactory.createLineBorder(Color.black));
		b8.setBackground(numColor);
		
		JButton b9 = new JGradientButton("9");
		b9.setPreferredSize(new Dimension(w, h));
		b9.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		b9.setBorder(BorderFactory.createLineBorder(Color.black));
		b9.setBackground(numColor);

//---------------------------------------------------------------------------------------------------------------------------
		
		JButton add = new JGradientButton("\u002B");
        add.setPreferredSize(new Dimension(w, h));
        add.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		add.setBorder(BorderFactory.createLineBorder(Color.black));
		add.setBackground(optColor);
		
		JButton subtract = new JGradientButton("\u2212");
        subtract.setPreferredSize(new Dimension(w, h));
        subtract.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		subtract.setBorder(BorderFactory.createLineBorder(Color.black));
		subtract.setBackground(optColor);
		
		JButton multiply = new JGradientButton("x");
        multiply.setPreferredSize(new Dimension(w, h));
        multiply.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		multiply.setBorder(BorderFactory.createLineBorder(Color.black));
		multiply.setBackground(optColor);
		
		JButton divide = new JGradientButton("\00F7");
        divide.setPreferredSize(new Dimension(w, h));
        divide.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		divide.setBorder(BorderFactory.createLineBorder(Color.black));
		divide.setBackground(optColor);
		
        JButton decimal = new JGradientButton("\u2219");
        decimal.setPreferredSize(new Dimension(w, h));
        decimal.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
        decimal.setBorder(BorderFactory.createLineBorder(Color.black));
		decimal.setBackground(numColor);

		JButton sqrt = new JGradientButton("\u221A");
        sqrt.setPreferredSize(new Dimension(w, h));
        sqrt.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		sqrt.setBorder(BorderFactory.createLineBorder(Color.black));
		sqrt.setBackground(optColor);
		
		JButton sqr = new JGradientButton("x\u00B2");
        sqr.setPreferredSize(new Dimension(w, h));
        sqr.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		sqr.setBorder(BorderFactory.createLineBorder(Color.black));
		sqr.setBackground(optColor);

//---------------------------------------------------------------------------------------------------------------------------
		
        JButton c1 = new JGradientButton("");
        c1.setPreferredSize(new Dimension(w,h));
        c1.setBorder(BorderFactory.createLineBorder(Color.black));
		c1.setBackground(numColor);
        
		JButton calculateButton, clearButton;
		calculateButton = new JGradientButton("\u003D");
		calculateButton.setName("calculateButton");
		calculateButton.setBorder(BorderFactory.createLineBorder(Color.black));
		calculateButton.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		calculateButton.setBackground(calculate);
		calculateButton.setPreferredSize(new Dimension(w, h));
		
		clearButton = new JGradientButton("C");
		clearButton.setName("clearButton");
		clearButton.setBorder(BorderFactory.createLineBorder(Color.black));
		clearButton.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		clearButton.setBackground(optColor);
		clearButton.setPreferredSize(new Dimension(w, h));

//---------------------------------------------------------------------------------------------------------------------------
		
		JPanel row1 = new JPanel(new GridLayout(1, 4));
		row1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		row1.add(clearButton);
		row1.add(sqrt);
		row1.add(sqr);
		row1.add(divide);

		JPanel row2 = new JPanel(new GridLayout(1, 4));
		row2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		row2.add(b7);
		row2.add(b8);
		row2.add(b9);
		row2.add(multiply);

		JPanel row3 = new JPanel(new GridLayout(1, 4));
		row3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		row3.add(b4);
		row3.add(b5);
		row3.add(b6);
		row3.add(subtract);

		JPanel row4 = new JPanel(new GridLayout(1, 4));
		row4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		row4.add(b1);
		row4.add(b2);
		row4.add(b3);
		row4.add(add);

		JPanel row5 = new JPanel(new GridLayout(1, 4));
		row5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		row5.add(b0);
		row5.add(c1);
		row5.add(decimal);
		row5.add(calculateButton);

		bp.add(row1);
		bp.add(row2);
		bp.add(row3);
		bp.add(row4);
		bp.add(row5);
		
//---------------------------------------------------------------------------------------------------------------------------

		frame.add(bp, BorderLayout.PAGE_END);

		JPanel rp = new JPanel();
		rp.setPreferredSize(new Dimension(300,40));
		JLabel r = new JLabel("Result = ");
		r.setName("resultLabel");
		r.setFont(new FontUIResource("Arial", Font.PLAIN, 25));

		rp.add(r);
		frame.add(rp, BorderLayout.LINE_START);

		JPanel tp = new JPanel();
		infixExpression = new JTextField();
		infixExpression.setPreferredSize(new Dimension(250, 40));
		infixExpression.setFont(new FontUIResource("Arial", Font.PLAIN, 25));
		infixExpression.setName("infixExpression");

		tp.add(infixExpression);
		frame.add(tp, BorderLayout.PAGE_START);

		tp.setBackground(numColor);
		rp.setBackground(numColor);
		
		frame.pack();
		frame.setVisible(true);
	
//---------------------------------------------------------------------------------------------------------------------------

		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infixExpression.setText("");
				r.setText("Result = ");
			}

		});

		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpressionEvaluator expression = new ExpressionEvaluator();
				String postfix = expression.toPostfix(infixExpression.getText());
				try {
					r.setText("Result = " + expression.evaluate(postfix));
				} catch (EmptyStackException a) {
					r.setText("Result = error");
				}
			}

		});
		
		sqrt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    r.setText(String.format("Result = %.2f", Math.sqrt(
                        Double.parseDouble(infixExpression.getText()))));

                }
                catch (Exception a)
                {
                    r.setText("Result = Error");
                }
            }
        });

        sqr.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    r.setText(String.format("Result = %.2f", Math.pow(
                        Double.parseDouble(infixExpression.getText()), 2.0)));

                }
                catch (Exception a)
                {
                    r.setText("Result = Error");
                }
            }
        });
        
        add.setAction(new TextAction("\u002B")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        subtract.setAction(new TextAction("\u2212")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        multiply.setAction(new TextAction("x")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        divide.setAction(new TextAction("÷")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        decimal.setAction(new TextAction(".")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b0.setAction(new TextAction("0")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
            }
            
        });
        
        b1.setAction(new TextAction("1")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b2.setAction(new TextAction("2")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b3.setAction(new TextAction("3")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b4.setAction(new TextAction("4")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b5.setAction(new TextAction("5")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b6.setAction(new TextAction("6")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });

        
        b7.setAction(new TextAction("7")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b8.setAction(new TextAction("8")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
        
        b9.setAction(new TextAction("9")
        {
			
            public void actionPerformed(ActionEvent e)
            {
                JTextComponent textComponent = getFocusedComponent();
                
                if (textComponent != null)
                    textComponent.replaceSelection(e.getActionCommand());
                
            }
        });
  
//---------------------------------------------------------------------------------------------------------------------------

		frame.setSize(300, 375);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
	}
}
