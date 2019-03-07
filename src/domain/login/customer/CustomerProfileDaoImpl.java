package domain.login.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DbManager;
import domain.login.Login;
import user.TempCustomer;

public class CustomerProfileDaoImpl implements CustomerProfileDao{

	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	

	public int register(TempCustomer c) {
		int status = 0;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("insert into c_profile values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setNull(1, java.sql.Types.INTEGER);
			ps.setString(2, c.getUsername());
			ps.setString(3, c.getPassword());
			ps.setString(4, c.getFirstName());
			ps.setString(5, c.getLastName());
			ps.setString(6, c.getTag());
			ps.setString(7, c.getAddress().getStreet());
			ps.setString(8, c.getAddress().getCity());
			ps.setString(9, c.getAddress().getState());
			ps.setString(10, c.getAddress().getZip());
			ps.setString(11, c.getPhone());
			ps.setString(12, c.getEmail());
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}


	public TempCustomer validateCustomer(Login login) {
		TempCustomer c = new TempCustomer();
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("select * from customer where userId=? and password=?");
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				c.setUsername(rs.getString(2));
				c.setPassword(rs.getString(3));
				c.setFirstName(rs.getString(4));
				c.setLastName(rs.getString(5));
				c.setTag(rs.getString(6));
				c.getAddress().setStreet(rs.getString(7));
				c.getAddress().setCity(rs.getString(8));
				c.getAddress().setState(rs.getString(9));
				c.getAddress().setZip(rs.getString(10));
				c.setPhone(rs.getString(11));
				c.setEmail(rs.getString(12));
			}
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return c;
	}

}