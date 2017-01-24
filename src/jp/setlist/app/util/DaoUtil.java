package jp.setlist.app.util;

import java.io.IOException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jp.setlist.app.common.consts.DaoConst;

/**
 * DAOユーティリティクラス
 * 
 * DBへ接続しセッションを確立する。
 * @author kohei
 *
 */
public class DaoUtil {
	
	private static DaoUtil instance = new DaoUtil();
	private SqlSessionFactory sessionFactory;

	private DaoUtil(){
		this.sessionFactory = this.createSqlSessionFactory();
	}
	
	
	/**
	 * セッション情報返却メソッド
	 * 
	 * DBとのセッション情報を返却する。
	 * 
	 * @return　SqlSessionFactory　セッション
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		return instance.sessionFactory;
	}

	/**
	 * セッション生成メソッド
	 * 
	 * DBとのセッションを生成する。
	 * 
	 * @return　SqlSessionFactory　セッション
	 */
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
