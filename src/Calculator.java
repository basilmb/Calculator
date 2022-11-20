import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean clicked=false;
	
	JLabel displaylabel;
	JButton clearbutton;
	JButton divisionbutton;
	JButton multiplicationbutton;
	JButton deletebutton;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton minusbutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton plusbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton equalbutton;
	JButton persbutton;
	JButton zerobutton;
	JButton dotbutton;
	JButton button;
	String action;
	double oldvalue;
	double newvalue;
	double result;
	double temp;
	
	public Calculator() {
		JFrame displaylayout=new JFrame("Basils Calculator");
		displaylayout.setLayout(null);
		displaylayout.setSize(386, 610);
		displaylayout.getContentPane().setBackground(Color.white);
		displaylayout.setLocation(935, 80);
		
		displaylabel=new JLabel("");
		displaylabel.setBounds(10, 10, 346, 100);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		displaylayout.add(displaylabel);
		
		clearbutton=new JButton("AC");
		clearbutton.setBounds(12, 122, 76, 76);
		clearbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 25));
		clearbutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		clearbutton.setBackground(Color.white);
		clearbutton.setOpaque(true);
		clearbutton.setForeground(new Color(51,204,255));
		clearbutton.setOpaque(true);
		clearbutton.addActionListener(this);
		displaylayout.add(clearbutton);
		
		divisionbutton=new JButton("÷");
		divisionbutton.setBounds(100, 120, 80, 80);
		divisionbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		divisionbutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		divisionbutton.setBackground(Color.white);
		divisionbutton.setOpaque(true);
		divisionbutton.setForeground(new Color(51,204,255));
		divisionbutton.setOpaque(true);
		divisionbutton.addActionListener(this);
		displaylayout.add(divisionbutton);
		
		multiplicationbutton=new JButton("×");
		multiplicationbutton.setBounds(190, 120, 80, 80);
		multiplicationbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		multiplicationbutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		multiplicationbutton.setBackground(Color.white);
		multiplicationbutton.setOpaque(true);
		multiplicationbutton.setForeground(new Color(51,204,255));
		multiplicationbutton.setOpaque(true);
		multiplicationbutton.addActionListener(this);
		displaylayout.add(multiplicationbutton);
		
		deletebutton=new JButton("CE");
		deletebutton.setBounds(280, 120, 80, 80);
		deletebutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 25));
		deletebutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		deletebutton.setBackground(Color.white);
		deletebutton.setOpaque(true);
		deletebutton.setForeground(new Color(51,204,255));
		deletebutton.setOpaque(true);
		deletebutton.addActionListener(this);
		displaylayout.add(deletebutton);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(10, 210, 80, 80);
		sevenbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		sevenbutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		sevenbutton.setBackground(Color.white);
		sevenbutton.setOpaque(true);
		sevenbutton.setForeground(Color.darkGray);
		sevenbutton.setOpaque(true);
		sevenbutton.addActionListener(this);
		displaylayout.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(100, 210, 80, 80);
		eightbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		eightbutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		eightbutton.setBackground(Color.white);
		eightbutton.setOpaque(true);
		eightbutton.setForeground(Color.darkGray);
		eightbutton.setOpaque(true);
		eightbutton.addActionListener(this);
		displaylayout.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(190, 210, 80, 80);
		ninebutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		ninebutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		ninebutton.setBackground(Color.white);
		ninebutton.setOpaque(true);
		ninebutton.setForeground(Color.darkGray);
		ninebutton.setOpaque(true);
		ninebutton.addActionListener(this);
		displaylayout.add(ninebutton);
		
		minusbutton=new JButton("−");
		minusbutton.setBounds(280, 210, 80, 80);
		minusbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		minusbutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		minusbutton.setBackground(Color.white);
		minusbutton.setOpaque(true);
		minusbutton.setForeground(new Color(51,204,255));
		minusbutton.setOpaque(true);
		minusbutton.addActionListener(this);
		displaylayout.add(minusbutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(10, 300, 80, 80);
		fourbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		fourbutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		fourbutton.setBackground(Color.white);
		fourbutton.setOpaque(true);
		fourbutton.setForeground(Color.darkGray);
		fourbutton.setOpaque(true);
		fourbutton.addActionListener(this);
		displaylayout.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(100, 300, 80, 80);
		fivebutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		fivebutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		fivebutton.setBackground(Color.white);
		fivebutton.setOpaque(true);
		fivebutton.setForeground(Color.darkGray);
		fivebutton.setOpaque(true);
		fivebutton.addActionListener(this);
		displaylayout.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(190, 300, 80, 80);
		sixbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		sixbutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		sixbutton.setBackground(Color.white);
		sixbutton.setOpaque(true);
		sixbutton.setForeground(Color.darkGray);
		sixbutton.setOpaque(true);
		sixbutton.addActionListener(this);
		displaylayout.add(sixbutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(280, 300, 80, 80);
		plusbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		plusbutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		plusbutton.setBackground(Color.white);
		plusbutton.setOpaque(true);
		plusbutton.setForeground(new Color(51,204,255));
		plusbutton.setOpaque(true);
		plusbutton.addActionListener(this);
		
		
		displaylayout.add(plusbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(10, 390, 80, 80);
		onebutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		onebutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		onebutton.setBackground(Color.white);
		onebutton.setOpaque(true);
		onebutton.setForeground(Color.darkGray);
		onebutton.setOpaque(true);
		onebutton.addActionListener(this);
		displaylayout.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(100, 390, 80, 80);
		twobutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		twobutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		twobutton.setBackground(Color.white);
		twobutton.setOpaque(true);
		twobutton.setForeground(Color.darkGray);
		twobutton.setOpaque(true);
		twobutton.addActionListener(this);
		displaylayout.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(190, 390, 80, 80);
		threebutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		threebutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		threebutton.setBackground(Color.white);
		threebutton.setOpaque(true);
		threebutton.setForeground(Color.darkGray);
		threebutton.setOpaque(true);
		threebutton.addActionListener(this);
		displaylayout.add(threebutton);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(280, 390, 80, 170);
		equalbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		equalbutton.setBorder(new RoundedLineBorder(new Color(51,204,255), 2, 20, true));
		equalbutton.setBackground(Color.white);
		equalbutton.setOpaque(true);
		equalbutton.setForeground(new Color(51,204,255));
		equalbutton.setOpaque(true);
		equalbutton.addActionListener(this);
		displaylayout.add(equalbutton);
		
		persbutton=new JButton("%");
		persbutton.setBounds(10, 480, 80, 80);
		persbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		persbutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		persbutton.setBackground(Color.white);
		persbutton.setOpaque(true);
		persbutton.setForeground(Color.darkGray);
		persbutton.setOpaque(true);
		persbutton.addActionListener(this);
		displaylayout.add(persbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(100, 480, 80, 80);
		zerobutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		zerobutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		zerobutton.setBackground(Color.white);
		zerobutton.setOpaque(true);
		zerobutton.setForeground(Color.darkGray);
		zerobutton.setOpaque(true);
		zerobutton.addActionListener(this);
		displaylayout.add(zerobutton);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(190, 480, 80, 80);
		dotbutton.setFont(new Font("Gilroy-ExtraBold", Font.PLAIN, 40));
		dotbutton.setBorder(new RoundedLineBorder(Color.lightGray, 2, 20, true));
		dotbutton.setBackground(Color.white);
		dotbutton.setOpaque(true);
		dotbutton.setForeground(Color.darkGray);
		dotbutton.setOpaque(true);
		dotbutton.addActionListener(this);
		displaylayout.add(dotbutton);
		
		
		
		displaylayout.setVisible(true);
		displaylayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==plusbutton) {
			clicked=true;
			oldvalue = Double.parseDouble(displaylabel.getText());
			action="+";
			displaylabel.setText(action); }
		
		else if(e.getSource()==minusbutton) {
			clicked=true;
			oldvalue = Double.parseDouble(displaylabel.getText());
			action = "-";
			displaylabel.setText(action); }
		
		else if(e.getSource()==multiplicationbutton) {
			clicked=true;
			oldvalue = Double.parseDouble(displaylabel.getText());
			action = "×";
			displaylabel.setText(action); }
		
		else if(e.getSource()==divisionbutton) {
			clicked=true;
			oldvalue = Double.parseDouble(displaylabel.getText());
			action = "÷";
			displaylabel.setText(action); }
		
		else if(e.getSource()==persbutton) {
			clicked=true;
			oldvalue = Double.parseDouble(displaylabel.getText());
			action = "%";
			displaylabel.setText(action); }
		
		else if(e.getSource()==sevenbutton) {
			if(clicked) {
				displaylabel.setText("7");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"7"); }
		}
		
		else if(e.getSource()==eightbutton) {
			if(clicked) {
				displaylabel.setText("8");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"8"); }
		}
		
		else if(e.getSource()==ninebutton) {
			if(clicked) {
				displaylabel.setText("9");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"9"); }
		}
		
		else if(e.getSource()==fourbutton) {
			if(clicked) {
				displaylabel.setText("4");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"4"); }
		}
		
		else if(e.getSource()==fivebutton) {
			if(clicked) {
				displaylabel.setText("5");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"5"); }
		}
		
		else if(e.getSource()==sixbutton) {
			if(clicked) {
				displaylabel.setText("6");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"6"); }
		}
		
		else if(e.getSource()==onebutton) {
			if(clicked) {
				displaylabel.setText("1");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"1"); }
		}
		
		else if(e.getSource()==twobutton) {
			if(clicked) {
				displaylabel.setText("2");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"2"); }
		}
		
		else if(e.getSource()==threebutton) {
			if(clicked) {
				displaylabel.setText("3");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"3"); }
		}
		
		else if(e.getSource()==zerobutton) {
			if(clicked) {
				displaylabel.setText("0");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"0"); }
		}
		
		else if(e.getSource()==dotbutton) {
			if(clicked) {
				displaylabel.setText(".");
				clicked=false;
			}else { displaylabel.setText(displaylabel.getText()+"."); }
		}
		
		else if(e.getSource()==clearbutton) {
			
				displaylabel.setText(""); 
				
		}
		
		else if(e.getSource()==deletebutton) {
			
			displaylabel.setText(displaylabel.getText().substring(0, displaylabel.getText().length() -1)); 
			
		}
		
		else if(e.getSource()==equalbutton) {
			
			    if (action == "+") {
			    newvalue = Double.parseDouble(displaylabel.getText());
			    result = oldvalue+newvalue;
			    displaylabel.setText(result+""); }
			    
			    if (action == "-") {
				    newvalue = Double.parseDouble(displaylabel.getText());
				    result = oldvalue-newvalue;
				    displaylabel.setText(result+""); }
			    
			    if (action == "×") {
				    newvalue = Double.parseDouble(displaylabel.getText());
				    result = oldvalue*newvalue;
				    displaylabel.setText(result+""); }
			    
			    if (action == "÷") {
				    newvalue = Double.parseDouble(displaylabel.getText());
				    result = oldvalue/newvalue;
				    displaylabel.setText(result+""); }
			    
			    if (action == "%") {
				    newvalue = Double.parseDouble(displaylabel.getText());
				    temp = oldvalue/100;
				    result = temp*newvalue;
				    displaylabel.setText(result+""); }
			
			}
				
		}
	
	}


