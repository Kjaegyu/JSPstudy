package sec01.ex01;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private static final String driver = "oracle.jdbc.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "hr";
	private static final String pwd = "12345";
	private Connection con;
	private Statement pstmt;
	public List<MemberVO> listMembers() {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		try
		{
			connDB();
			String query = "select * from t_member ";
			System.out.println("prepareStatement:" +query);
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			while (rs.next())
			{
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
		
		private void connDB()
		{
			try
			{
				Class.forName(driver);
				System.out.println("Oracle 드라이버 로딩성공");
				con = DriverManager.getConnection(url,user,pwd);
				System.out.println("Connection 생성 성공");
				pstmt = con.createStatement();
				System.out.println("Statement 생성 성공");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	

