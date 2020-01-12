package com.nt.client;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class I18nClient {

	public static void main(String[] args) {
	
	Locale l = new Locale(args[0],args[1]);
	@SuppressWarnings("resource")
	ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	
	String s1 = ctx.getMessage("str1",null,"default Msg1",l);
	String s2 = ctx.getMessage("str2",null,"default Msg2",l);	
	String s3 = ctx.getMessage("str3",null,"default Msg3",l);
	String s4 = ctx.getMessage("str4",null,"default Msg4",l);
	
	JFrame jf = new JFrame("Demo");
	Container c =jf.getContentPane();
	
	JButton b1 =new JButton(s1);
	JButton b2 =new JButton(s2);
	JButton b3 =new JButton(s3);
	JButton b4 =new JButton(s4);
	
	c.setLayout(new FlowLayout());
	c.add(b1);
	c.add(b2);
	c.add(b3);
	c.add(b4);
	jf.pack();
	jf.setVisible(true);
	
	((AbstractApplicationContext) ctx).stop();
	
	}

}
