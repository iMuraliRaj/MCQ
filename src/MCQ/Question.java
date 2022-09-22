package MCQ;

import javax.swing.*;  

public class Question {
	
	public static void main(String[] args) {
		JFrame f=new JFrame("MCQ");//creating instance of JFrame  
        
		JButton b=new JButton("SUBMIT");//creating instance of JButton  
		b.setBounds(90,150,100, 35);//x axis, y axis, width, height  
		
		JButton c=new JButton("CANCEL");//creating instance of JButton  
		c.setBounds(200,150,100, 35);//x axis, y axis, width, height 
		
		JTextField t1=new JTextField();  
		t1.setBounds(30,10, 250,30);  
		
		f.add(t1);
		
		f.add(c);
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,250);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
	}

}
