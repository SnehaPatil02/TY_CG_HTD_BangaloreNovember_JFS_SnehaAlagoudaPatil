package com.capgemini.module1.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.module1.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO{

	FileReader reader;
	Properties prop;
    ContactBean bean;
	
	public ContactDAOImpl() {
		try {
			
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
					
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
    
	
	@Override
	public List<ContactBean> getAllContacts() {
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
			Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("contactList"))){
				while(rs.next()) {
					bean = new ContactBean();
					bean.setName(rs.getString(1));
					bean.setNumber(rs.getInt(2));
					bean.setGroup(rs.getString(3));
					list.add(bean);
				}
				return list;
		

		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ContactBean searchContact(String name) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("searchContact"));
				){
			pstmt.setString(1, name);


			int count = pstmt.executeUpdate();
			if(count>0) {
				return bean;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	
	}

	@Override
	public boolean editContact(String name,int number) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("editContact"));
				){
			pstmt.setString(1, name);


			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}


	@Override
	public boolean insertContact(ContactBean bean) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
			PreparedStatement pstmt = con.prepareStatement(prop.getProperty("insertContact"));
				){
		pstmt.setString(1, bean.getName());
		pstmt.setInt(2, bean.getNumber());
		pstmt.setString(3, bean.getGroup());
		
		
		int count = pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		return false;
	}


	@Override
	public boolean deleteContact(String name) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
			PreparedStatement pstmt = con.prepareStatement(prop.getProperty("deleteContact"));
				){
		pstmt.setString(1, name);
		
		
		int count = pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		return false;
	}
}
	
	