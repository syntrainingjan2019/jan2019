package com.mypkg;
import java.sql.*;
import java.util.*;
import com.mysqloperations.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Jdbcops jdbcops=new Jdbcops();
			jdbcops.selectquery("select * from student");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
