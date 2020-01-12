package com.nt.client;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EHClient {

	public static void main(String[] args) {
		// create IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Messages
		Locale l=new Locale("fr","CA");
		String s1=ctx.getMessage("str1",null,"msg1",l);
		String s2=ctx.getMessage("str2",null,"msg2",l);
		String s3=ctx.getMessage("str3",null,"msg3",l);
		String s4=ctx.getMessage("str4",null,"msg4",l);
		
		JFrame jf = new JFrame();
		Container cp = jf.getContentPane();

        // create btns by getting labels from activated properties file..
		JButton b1 = new JButton(s1);
		JButton b2 = new JButton(s2);
		JButton b3 = new JButton(s3);
		JButton b4 = new JButton(s4);

		cp.setLayout(new FlowLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);

		jf.pack();
		jf.setVisible(true);
		
		ctx.close();

	}

}
