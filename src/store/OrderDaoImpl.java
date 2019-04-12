package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbManager;
import user.TempCustomer;

public class OrderDaoImpl {
	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	
	public Menu menuBuilder(int storeId) {

		Menu menu = new Menu();
			try{
				conn = db.getConnection();
				ps =conn.prepareStatement("select * from item where store_id=?");
				ps.setInt(1, storeId);

				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					Item i = new Item();
					i.setItemId(rs.getInt(1));
					i.setStoreId(rs.getInt(2));
					i.setName(rs.getString(3));
					i.setDesc(rs.getString(4));
					i.setPrice(rs.getDouble(5));
					i.setExtrasFromString(rs.getString(6));
					menu.addItem(i);
				}
				conn.close();
			}catch(Exception e){
				System.out.println(e);
			}

		return menu;
	}
	
	public void storeOrder(Order order, Store s, TempCustomer c) {
		try {
			conn = db.getConnection();			
			ArrayList<Item> food = new ArrayList<Item>();
			int status = 0;
			
			for(Item i : food)
			{
				ps = conn.prepareStatement("insert into orders VALUES(NULL,?,?,?,?,NULL)");
				ps.setInt(1, i.getItemId());
				ps.setInt(2, s.getStoreId());
				ps.setInt(3, c.getUserId());
				ps.setInt(4, i.getQuantity());
				status = ps.executeUpdate();
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public Order retrieveSpecificOrder(int id)
	{
		Order o = new Order();
		try {
			Item i = new Item();
			
			ResultSet rs = ps.executeQuery();
			
			
			conn = db.getConnection();
			ps = conn.prepareStatement("select * from orders where orderId=" + id +")");
			while(rs.next()) {
				i = new Item();
				i.setItemId(rs.getInt(1));
				i.setStoreId(rs.getInt(2));
				i.setName(rs.getString(3));
				i.setDesc(rs.getString(4));
				i.setPrice(rs.getDouble(5));
				i.setExtrasFromString(rs.getString(6));
				o.addItem(i);
			}
		
		}catch(Exception e) {
			System.out.println(e);}
		return o;
	}
}
