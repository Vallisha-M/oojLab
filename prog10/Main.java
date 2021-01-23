
/*
 * VALLISHA M
 * 1BM19CS177
 * Lab Program - 10
*/


import java.awt.event.*;
import java.awt.*;

public class Main extends Frame implements ActionListener {
	
    String msg = "";
    Button bList[] = new Button[1];
    TextField n1, n2, res;
    
    public Main() {
	    setLayout(new FlowLayout());
	    
	    Label num1 = new Label("NUM1: ", Label.RIGHT);
	    Label num2 = new Label("NUM2: ", Label.RIGHT);
	    Label r = new Label("Res  :  ", Label.RIGHT);
	    
	    n1 = new TextField(20);
	    n2 = new TextField(20);
	    res = new TextField(20);
	    
	    res.setEditable(false);
	    
	    add(num1);
	    add(n1);
	    add(num2);
	    add(n2);
	    add(r);
	    add(res);
	    
	    n1.addActionListener(this);
	    n2.addActionListener(this);
	
	    Button divide = new Button("Divide");
	
	    bList[0]=(Button) add(divide);
	    bList[0].addActionListener(this);
	    
	    addWindowListener(new MyWindowAdapter());
    
    }
    
    public void actionPerformed(ActionEvent ae) {
    
    	if(ae.getSource()==bList[0]);
	    String a = n1.getText();
	    String b = n2.getText();
	    int n1, n2;
	    double ans = 0.0D;
	    boolean flag = false;
	    boolean flag1= false;
	    try {
	    	n1 = Integer.parseInt(a);
	    	n2 = Integer.parseInt(b);
	    
	    	if(n2==0.0) {
	    		flag1 = true;
	    		throw new ArithmeticException("Division by zero not possible.");
	    	}
	    	ans = (double) n1/n2;
	    	
	    }
	    catch(Exception e) {
	    	flag = true;
	    	msg = flag1?e.getMessage():e.toString();
	    	DialogBox d = new DialogBox(this, "ERROR");
	        d.setVisible(true);
	    }
	    
	    if(!flag) 
	    	res.setText(String.valueOf(ans));
	    
    }
  
    public static void main(String ar[])
    {
        Main main=new Main();
        main.setSize(new Dimension(250, 180));
        main.setTitle("Divide");
        main.setVisible(true);
    } 
   }