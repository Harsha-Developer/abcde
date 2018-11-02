package com.agile.util;

import java.sql.DriverManager;

public class Connection 
{
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sonoo","root","root");  
		  
		}catch(Exception e){ System.out.println(e);}  
		}  
		}  

}
