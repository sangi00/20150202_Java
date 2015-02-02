package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, score;
		String name;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();		
		try {
			while(rs.next()){
				id = rs.getInt("id");
				name = rs.getString("name");
				score = rs.getInt("score");
				System.out.println("ID：" + id);
				System.out.println("名前：" + name);
				System.out.println("得点：" + score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
