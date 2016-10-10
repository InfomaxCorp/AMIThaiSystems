package com.amithai.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HotelDAO {

	private final DataSource ds = DataSource.INSTANCE;

	

	public List<HotelItem> findAll() {
		List<HotelItem> allEvents = new ArrayList<HotelItem>();
		try {
			// get connection
			Statement stmt = ds.getStatement();
			ResultSet rs = stmt.executeQuery("select * from "
					+ DataSource.TBL_HOTEL);

			// fetch all events from database
			HotelItem item;

			while (rs.next()) {
				item = new HotelItem();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setWebsite(rs.getString(3));
				item.setAddress(rs.getString(4));
				item.setAddress_doc(rs.getString(5));

				allEvents.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}

		return allEvents;

	}

	public boolean delete(HotelItem item) {

		return execute("delete from " + DataSource.TBL_HOTEL + " where id = '"
				+ item.getId() + "'");

	}

	public boolean insert(HotelItem item) {

		String sql = "insert into  "
				+ DataSource.TBL_HOTEL
				+ " (name,website,address,address_doc,remark,flag_sheet,tel,fax,email,contact_person,created_date,created_by,updted_date,updated_by,flag_status) "
				+ "values ('"
				+ item.getName()
				+ "','"
				+ item.getWebsite()
				+ "','"
				+ item.getAddress()
				+ "','"
				+ item.getAddress_doc()
				+ "','"
				+ item.getRemark()
				+ "','"
				+ item.getFlag_sheet()
				+ "','"
				+ item.getTel()
				+ "','"
				+ item.getFax()
				+ "','"
				+ item.getEmail()
				+ "','"
				+ item.getContact_person()
				+ "','"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(item
						.getCreated_date())
				+ "','"
				+ item.getCreated_by()
				+ "','"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(item
						.getUpdated_date()) + "','" + item.getUpdated_by()
				+ "','" + item.getFlag_status() + "')";
		return execute(sql);
	}

	public boolean update(HotelItem item) {
		String sql = "update "
				+ DataSource.TBL_HOTEL
				+ "  set name='"
				+ item.getName()
				+ "'  ,website='"
				+ item.getWebsite()
				+ "' ,address='"
				+ item.getAddress()
				+ "' ,address_doc='"
				+ item.getAddress_doc()
				+ "',remark='"
				+ item.getRemark()
				+ "',flag_sheet='"
				+ item.getFlag_sheet()
				+ "',tel='"
				+ item.getTel()
				+ "',fax='"
				+ item.getFax()
				+ "',email='"
				+ item.getEmail()
				+ "',contact_person='"
				+ item.getContact_person()
				+ "',updted_date='"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(item
						.getUpdated_date()) + "',updated_by='"
				+ item.getUpdated_by() + "',flag_status='"
				+ item.getFlag_status() + "' WHERE id=" + item.getId();
		return execute(sql);
	}

	private boolean execute(String sql) {

		try {
			Statement stmt = ds.getStatement();
			stmt.execute(sql);
			if (stmt != null) {
				stmt.close();
			}

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			ds.close();
		}
	}

}
