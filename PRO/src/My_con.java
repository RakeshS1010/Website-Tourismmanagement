

	import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
	import java.sql.Connection;
	import java.sql.SQLException;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	/**
	 *
	 * @author 1BestCsharp
	 */
	public class My_con {

	    private static String servername = "localhost";
	    private static String username = "root";
	    private static String dbname  = "users_db";
	    private static Integer portnumber  = 3306;
	    private static String password = "";
	    
	    public static Connection getConnection()
	    {
	        Connection cnx = null;
	        
	        MysqlDataSource datasource = new MysqlDataSource();
	        
	        datasource.setServerName(servername);
	        datasource.setUser(username);
	        datasource.setPassword(password);
	        datasource.setDatabaseName(dbname);
	        datasource.setPortNumber(portnumber);
	        
	        try {
	            cnx = datasource.getConnection();
	        } catch (SQLException ex) {
	            Logger.getLogger(" Get Connection -> " + My_con.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return cnx;
	    }
	    
	}


	/****************** My_CNX Class End  ******************/
	    
	Now Let's Go To The Login Form and See What We Will Do.

	/****************** Register Form Start  ******************/

	// create a variable to set the image path in it
	    String image_path = null;
	    
	    public Register_Form() {
	        initComponents();
	        
	        // center the form
	        this.setLocationRelativeTo(null);
	        
	        // create a yellow border for the jpanel_title
	        // 0 border in the top
	        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
	        // set the border to the jPanel_title
	        jPanel_title.setBorder(jpanel_title_border);
	        
	        // create a black border for the close & minimize jlables
	        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
	        jLabel_minimize.setBorder(label_border);
	        jLabel_close.setBorder(label_border);
	        
	        // create a border for the create acconut jlabel
	        Border label_login_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
	        jLabel_login.setBorder(label_login_border);
	        
	        
	        // create border for the text and password fields
	        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
	        jTextField_Username.setBorder(field_border);
	        jTextField_Fullname.setBorder(field_border);
	        jTextField_Phone.setBorder(field_border);
	        jPasswordField_1.setBorder(field_border);
	        jPasswordField_2.setBorder(field_border);
	        
	        // create a button group for the radiobuttons
	        ButtonGroup bg = new ButtonGroup();
	        bg.add(jRadioButton_Male);
	        bg.add(jRadioButton_Female);
	    }


	// jlabel minimize -> mouse click event
	private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {                                             
	        this.setState(JFrame.ICONIFIED);

	    }                                            

	// jlabel  minimize -> mouse entered event
	    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {                                             
	       // change the jlabel border color to white
	        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
	        jLabel_minimize.setBorder(label_border);
	       // set the jlabel foreground to white
	        jLabel_minimize.setForeground(Color.white);
	    }                                            

	// jlabel minimize -> mouse exited event
	    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {                                            
	        // reset the jlabel border color to white
	        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
	        jLabel_minimize.setBorder(label_border);
	        // reset the jlabel foreground to white
	        jLabel_minimize.setForeground(Color.black);

	    }                                           

}
