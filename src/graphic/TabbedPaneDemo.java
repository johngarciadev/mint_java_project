package graphic;

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

public class TabbedPaneDemo extends  JPanel{
	public TabbedPaneDemo() {
		super(new GridLayout(1, 1));
		
		JTabbedPane tabbedPane = new JTabbedPane();
		ImageIcon icon = createImageIcon(".src/img/gps.png");
		
		JComponent panel1 = makeTextPanel("Panel #1");
		tabbedPane.addTab("Tab 1", icon, panel1, "Does nothing");
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		JComponent panel2 = makeTextPanel("Panel #2");
		tabbedPane.addTab("Tab 2", icon, panel2, "Does twice as much nothing");
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		
		JComponent panel3 = makeTextPanel("Panel #3");
		tabbedPane.addTab("Tab 3", icon, panel3, "Still does nothing");
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
		
		JComponent panel4 = makeTextPanel("Panel #4");
		tabbedPane.addTab("Tab 4", icon, panel4, "Does nothing at all");
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
		
		JComponent panel5 = makeTextPanel("Panel #5");
		tabbedPane.addTab("Tab 5", icon, panel5, "Anyway");
		tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
		
		add(tabbedPane);
		
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);		
	}
	
	protected JComponent makeTextPanel(String text) {
		JPanel panel = new JPanel(false);
		JLabel filler = new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1, 1));
		panel.add(filler);
		return panel;
	}
	

	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = TabbedPaneDemo.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
		
	}
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("TabbedPanedemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new TabbedPaneDemo(), BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});

	}

}
