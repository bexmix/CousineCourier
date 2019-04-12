package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbManager;
import user.Address;

public class StoreDaoImpl {
	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	public void storeRestraunt(Store s) {
		try {
			int status = 0;
			conn = db.getConnection();
			ps =conn.prepareStatement("insert into store values(null,?,?,?,?,?,?,?)");
			ps.setString(1, s.getName());
			ps.setString(2, s.getAddress().getStreet());
			ps.setString(3, s.getAddress().getCity());
			ps.setString(4, s.getAddress().getState());
			ps.setString(5, s.getAddress().getZip());
			ps.setString(6, s.getPhone());
			ps.setString(7, s.getEmail());
			ps.setInt(8, s.getOwnerId());
			
			status = ps.executeUpdate();
			
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Store retrieveStore(int id) {
		Store s = new Store();
		try {
			conn = db.getConnection();
			ps = conn.prepareStatement("select * from store where store_id=?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Address a = new Address();
				//s.setItemId(rs.getInt(1));
				s.setStoreId(rs.getInt(1));
				s.setName(rs.getString(2));
				a.setStreet(rs.getString(3));
				a.setCity(rs.getString(4));
				a.setState(rs.getString(5));
				a.setZip(rs.getString(6));
				s.setAddress(a);
				s.setPhone(rs.getString(7));
				s.setEmail(rs.getString(8));
				s.setOwnerId(rs.getInt(9));
			}
			
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return s;
	}
	
	public Store[] buildRestaurantPage(){
		
		ArrayList<Store> storeList = new ArrayList<Store>();
		try {
		
			conn = db.getConnection();
			ps = conn.prepareStatement("select count(*) from store");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			int numRows = rs.getInt(1);
			
			for(int i = 1; i <= numRows; i++) {
				storeList.add(retrieveStore(i));
			}	


		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Store[] list = (Store[]) storeList.toArray();
		
		Store[] list = new Store[storeList.size()];
		
		for(int i = 0; i < storeList.size(); i++) {
			list[i] = storeList.get(i);
		}
		
		return list;
	}
}
