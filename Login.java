	import javax.swing.*;

	import java.awt.*;
	import java.awt.event.*;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

public class Login extends JFrame implements ActionListener{

	    private Container c;
	    private JLabel title;
	    private JLabel name;
	    private JTextField tname;
	    private JLabel mno;
	    private JTextField tmno;
	    private JLabel gender;
	    private JRadioButton male;
	    private JRadioButton female;
	    private ButtonGroup gengp;
	    private JLabel dob;
	    private JComboBox date;
	    private JComboBox month;
	    private JComboBox year;
	    private JLabel ksuid;
	    private JTextField tksuid;
	    private JButton sub;
	    private JButton reset;
	    private JTextArea tout;
	    private JLabel res;
	    private JTextArea resadd;
	 

	
	        public Login(){	
	       	        	
	    	setTitle("Login");
	        setBounds(200, 90, 900, 600);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	 
	        c = getContentPane();
	        c.setLayout(null);
	 
	        title = new JLabel("Login for Attendance");
	        title.setFont(new Font("Arial", Font.PLAIN, 30));
	        title.setSize(300, 30);
	        title.setLocation(300, 30);
	        c.add(title);
	 
	        ksuid = new JLabel("KSU ID");
	        ksuid.setFont(new Font("Arial", Font.PLAIN, 20));
	        ksuid.setSize(100, 20);
	        ksuid.setLocation(100, 300);
	        c.add(ksuid);
	 
	        tksuid = new JTextField();
	        tksuid.setFont(new Font("Arial", Font.PLAIN, 15));
	        tksuid.setSize(190, 20);
	        tksuid.setLocation(200, 300);
	        c.add(tksuid);
	        
	        sub = new JButton("Submit");
	        sub.setFont(new Font("Arial", Font.PLAIN, 15));
	        sub.setSize(100, 20);
	        sub.setLocation(150, 450);
	        sub.addActionListener(this);
	        c.add(sub);
	 
	        reset = new JButton("Reset");
	        reset.setFont(new Font("Arial", Font.PLAIN, 15));
	        reset.setSize(100, 20);
	        reset.setLocation(270, 450);
	        reset.addActionListener(this);
	        c.add(reset);
	  
	        tout = new JTextArea();
	        tout.setFont(new Font("Arial", Font.PLAIN, 15));
	        tout.setSize(300, 400);
	        tout.setLocation(500, 100);
	        tout.setLineWrap(true);
	        tout.setEditable(false);
	        c.add(tout);
	 
	        res = new JLabel("");
	        res.setFont(new Font("Arial", Font.PLAIN, 20));
	        res.setSize(500, 25);
	        res.setLocation(100, 500);
	        c.add(res);
	 
	        resadd = new JTextArea();
	        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
	        resadd.setSize(200, 75);
	        resadd.setLocation(580, 175);
	        resadd.setLineWrap(true);
	        c.add(resadd);
	 
	        setVisible(true);
	    }
	 
	    public void actionPerformed(ActionEvent e){
	    	
	        if (e.getSource() == sub) {


	        }
	 
	        else if (e.getSource() == reset) {
	            String def = "";
	            tksuid.setText(def);
	            res.setText(def);
	            resadd.setText(def);
	        }
	    }
	
	 
}
