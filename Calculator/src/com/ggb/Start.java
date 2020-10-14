/**
 * 
 */
package com.ggb;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author George Brodsky
 * 13/10/2020
 * Calculator
 */

public class Start {

	/**
	 * @param args
	 */
	
	// GUI Frame window for calculator
	private JFrame window;
	
	// Constructor for frame-window
	public Start() {
		window = new JFrame("Calculator");
		window.setSize(250, 337);
		window.add(new Panel());
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {

		//******
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Start();				
			}
		});
	}
}