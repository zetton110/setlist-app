package jp.setlist.app.util;

import java.io.IOException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jp.setlist.app.common.consts.DaoConst;

public class DaoUtil {
	
	private static DaoUtil instance = new DaoUtil();
	private SqlSessionFactory sessionFactory;

	private DaoUtil(){
		this.sessionFactory = this.createSqlSessionFactory();
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){

		return instance.sessionFactory;
	}
	
	private SqlSessionFactory createSqlSessionFactory(){
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(DaoConst.FILE_NAME_MYBATIS_SETTING));
		} catch (IOException e) {
			e.printStackTrace();
		};
		return ssf;
	}
}
