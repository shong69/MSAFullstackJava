package com.bbs07.model;

import java.sql.SQLException;
import java.util.List;

import com.bbs07.util.MyDb;

public class Bbs07Dao {
	java.sql.Statement stmt=null;
	java.sql.ResultSet rs=null;

	public List<com.bbs07.model.JavaBean> selectAll() {
		java.util.List<com.bbs07.model.JavaBean> list=new java.util.ArrayList<>();
		String sql="select * from bbs07 order by ref DESC, ord asc";

		try{
			stmt=com.bbs07.util.MyDb.getConnection().createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				com.bbs07.model.JavaBean bean=new com.bbs07.model.JavaBean();
				bean.setNum(rs.getInt("num"));
				bean.setSub(rs.getString("sub"));
				bean.setId(rs.getString("id"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setLvl(rs.getInt("lvl"));
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
				try {
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(com.bbs07.util.MyDb.getConnection()!=null)
						com.bbs07.util.MyDb.getConnection().close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return list;
	}
	
	/**댓글 등록
	 * @param sub
	 * @param id
	 * @param content
	 */
	public void insertOne(String sub,String id,String content) {
		String sql="insert into bbs07(num, sub, CONTENT ,ID ,NALJA ,ref) "
				+"values (bbs07_seq.nextval,'"+sub+"','"+content+"','"+id+"',sysdate,bbs07_seq.currval)";
	
		try {
			stmt=MyDb.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(MyDb.getConnection()!=null)MyDb.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	/** 대댓글 등록
	 * @param sub
	 * @param id
	 * @param content
	 * @param num
	 * @param ref
	 * @param ord
	 * @param lvl
	 */
	public void insertOne(String sub, String id,String content,int num,int ref,int ord,int lvl) {
		String sql = "";
		try {
			if(num==ref) {
			//1) 주 글에 답글 달 때 - 
				sql="insert into bbs07(num, sub, CONTENT ,ID ,NALJA ,REF, ord, lvl) values" + 
						" (bbs07_seq.nextval,'"+sub+"','"+content+"','"+id+"',sysdate,"+ref+",(SELECT max(ord)+1 FROM BBS07 b WHERE REF ="+ref+"),"+(lvl+1)+");";
				try {
					stmt = MyDb.getConnection().createStatement();
					int result = stmt.executeUpdate(sql);
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}else {
			//2) 답글에 답글을 달 때
				sql = "UPDATE bbs07 SET ord = ord + 1 WHERE REF = "+ref+" AND ord>"+ord;
				try {
					stmt = MyDb.getConnection().createStatement();
					int result = stmt.executeUpdate(sql);
					stmt.close();
					
					sql = "insert into bbs07(num, sub, CONTENT ,ID ,NALJA ,REF, ord, lvl) values "
							+"(bbs07_seq.nextval,'"+sub+"','"+content+"','"+id+"',sysdate,"+ref+","+(ord+1)+","+(lvl+1)+")";
					stmt = MyDb.getConnection().createStatement();
					result = stmt.executeUpdate(sql);
					stmt.close();
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		}finally {
			try {
				if(MyDb.getConnection()!=null)MyDb.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	public JavaBean selectOne(int num) {
		String sql="select * from bbs07 where num="+num;
		JavaBean bean=new JavaBean();
		try {
			stmt=MyDb.getConnection().createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()) {
				bean.setNum(rs.getInt("num"));
				bean.setId(rs.getString("id"));
				bean.setSub(rs.getString("sub"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(MyDb.getConnection()!=null)
						MyDb.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
	public int updateOne(int num, String sub,String content) {
		String sql = "update bbs07 set sub = '"+sub+"', content='"
				+content+"', nalja = sysdate where num="+num;
		try {
			stmt= MyDb.getConnection().createStatement();
			return stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(MyDb.getConnection() != null)
					MyDb.getConnection().close();
			} catch (SQLException |ClassNotFoundException e) {
				e.printStackTrace();
			} 
		}
		return 0;
		
	}
	
	public int deleteOne(int num) {
		String sql = "delete from bbs07 where num="+ num;
		try {
			stmt = MyDb.getConnection().createStatement();
			
			return stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(MyDb.getConnection()!= null)
					MyDb.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}
}















