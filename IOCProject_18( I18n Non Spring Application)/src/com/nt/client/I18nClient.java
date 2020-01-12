package com.nt.client;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18nClient {

	public static void main(String[] args) {
		
		Locale l = new Locale(args[0],args[1]);
		ResourceBundle r = ResourceBundle.getBundle("com/nt/commons/App",l);
		
		JFrame jf = new JFrame("Demo");
		Container c =jf.getContentPane();
		
		JButton b1 =new JButton(r.getString("str1"));
		JButton b2 =new JButton(r.getString("str2"));
		JButton b3 =new JButton(r.getString("str3"));
		JButton b4 =new JButton(r.getString("str4"));
		
		c.setLayout(new FlowLayout());
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		jf.pack();
		jf.setVisible(true);
	}
}
