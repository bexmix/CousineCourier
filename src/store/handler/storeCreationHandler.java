package store.handler;

import java.sql.Connection;
import java.sql.PreparedStatement;

import store.Menu;
import store.Store;
import db.DbManager;

public class storeCreationHandler {

	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	public int registerStore(Store s) {
		
		int status = 0;
		try {
			conn = db.getConnection();
			ps =conn.prepareStatement("insert into stores values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setNull(1, java.sql.Types.INTEGER);
			ps.setString(2, s.getName());
			ps.setString(3, s.getType());
			ps.setString(4, s.getAddress().getStreet());
			ps.setString(5, s.getAddress().getCity());
			ps.setString(6, s.getAddress().getState());
			ps.setString(7, s.getAddress().getZip());
			ps.setString(8, s.getEmail());
			ps.setString(9, s.getPhone());
			ps.setString(10, s.getOwnerId());
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
	
	
	/**
	 * TODO figure out how tf you're gonna code this
	 * @param s
	 * @param m
	 */
	
	public int registerMenu(Store s, Menu m) {
		
		int status = 0;
		try {
			conn = db.getConnection();
			ps =conn.prepareStatement("insert into stores values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setNull(1, java.sql.Types.INTEGER);

		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
}
