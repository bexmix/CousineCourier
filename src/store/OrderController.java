package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DbManager;
import domain.login.Customer;
import user.TempCustomer;

public class OrderController {
	
	Order order;
	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	public OrderController() {
		
	}
	
	public Menu menuBuilder(int storeId) {

		Menu menu = new Menu();
			try{
				conn = db.getConnection();
				ps =conn.prepareStatement("select * from item where store_id=?");
				ps.setInt(1, storeId);

				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					Item i = new Item();
					i.setItem_id(rs.getInt(1));
					i.setStore_id(rs.getInt(2));
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
			ps = conn.prepareStatement("insert into orders VALUES(NULL,?,?,NULL)");
			ps.setInt(2, s.getStoreId());
			ps.setInt(3, c.getUserId());
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public Order retrieveSpecificOrder(int id)
	{
		Order o = new Order();
		
		try {
			conn = db.getConnection();
			ps = conn.prepareStatement("select * from orders where orderId=" + id +")");
		}catch(Exception e) {
			System.out.println(e);}
		return o;
	}
	
	
}
