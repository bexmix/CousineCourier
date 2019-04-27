package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbManager;
import store.Menu;
import store.Item;

public class MenuDaoImpl {
	
	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	public Menu getMenu(int storeId) {
		try {
			
			conn = db.getConnection();
			Menu m = new Menu();
			Item i = new Item();
			int status = 0;

			
			ps=conn.prepareStatement("select * from item where store_id=" + storeId);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				i.setItemId(rs.getInt(1));
				i.setStoreId(rs.getInt(2));
				i.setName(rs.getString(3));
				i.setDesc(rs.getString(4));
				i.setPrice(rs.getDouble(5));
				i.setExtrasFromString(rs.getString(6));
				m.addItem(i);
			}
			return m;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return m;
	}
	
	public void storeMenu(Menu M) {
		try {
			conn = db.getConnection();			
			ArrayList<Item> food = M.getMenu();
			int status = 0;
			
			for(Item i : food)
			{
				ps = conn.prepareStatement("insert into item VALUES(NULL,?,?,?,?,?)");
				ps.setInt(1, i.getStoreId());
				ps.setString(2, i.getName());
				ps.setString(3, i.getDesc());
				ps.setDouble(4, i.getPrice());
				ps.setString(5, i.getExtrasInString());
				status = ps.executeUpdate();
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
