package graphic;

import java.awt.Graphics;

public class Form extends javax.swing.JFrame {

	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Form().setVisible(true);
			}
		});

	}

}
