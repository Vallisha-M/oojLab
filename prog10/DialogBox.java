

import java.awt.event.*;
import java.awt.*;

/*
 * VALLISHA M
 * 1BM19CS177
 * Lab Program - 10
*/

class DialogBox extends Dialog implements ActionListener {
	Main bld;
	
	DialogBox(Frame parent, String title) {
		super(parent, title, false); 
		bld=  (Main) parent;
		setLayout(new FlowLayout());
		setSize(600, 100);
		add(new Label(bld.msg));
		Button b;
		add(b = new Button("Close"));
		b.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			dispose();
			}});
	}
	
	public void actionPerformed(ActionEvent ae) {
		dispose();
	}
	
}

class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
			System.exit(0);
	}
}


