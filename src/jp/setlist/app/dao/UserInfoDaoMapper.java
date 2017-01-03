package jp.setlist.app.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.common.consts.DaoConst;
import jp.setlist.app.dao.entity.UserEntity;
import jp.setlist.app.exception.AppException;

/**
 * 
 * ユーザ情報DAO(編集、登録、1件取得、全件取得)マッパー
 * @author kohei
 *
 */
public class UserInfoDaoMapper {
	
	private SqlSession session;
	
	/**
	 * 
	 * ユーザ情報の登録
	 * 
	 * @param userBean　持ち回りユーザBean
	 */
	public void insertUser(UserBean userBean){	
		
		try {
			this.setup();
			session.insert("jp.setlist.app.userInfo.insertUser",userBean);
			session.commit();
			
		} catch (Exception e) {
			new AppException(e,"DBへ接続中にエラーが発生しました。");
		}
		finally {
			session.close();
		}
	}
	
	/**
	 * 
	 * ユーザ情報の変更/更新
	 * 
	 * @param userBean　持ち回りユーザBean
	 */
	public void updateUser(UserBean userBean){	
		
		try {
			this.setup();
			session.update("jp.setlist.app.userInfo.updateUser",userBean);
			session.commit();
			
		} catch (Exception e) {
			new AppException(e,"DBへ接続中にエラーが発生しました。");
		}
		finally {
			session.close();
		}
	}

	/**
	 * 
	 * ユーザ情報を1件取得
	 * 
	 * @param userId　ユーザID
	 * @return　userEntity　ユーザ情報エンティティ
	 */
	public UserEntity selectUser(String userId){	
		try {
			this.setup();
			UserEntity userEntity = session.selectOne("jp.setlist.app.userInfo.selectUser", userId);
			return userEntity;
			
		} catch (Exception e) {
			new AppException(e,"DBへ接続中にエラーが発生しました。");
		}
		finally {
			session.close();
		}
		return null;
	}
	
	/**
	 * ユーザ情報を全件取得
	 * @return usersInfoList　ユーザ情報マップのリスト
	 */
	public List<Map<String,Object>> selectAllUsers(){	
		try {
			this.setup();
			List<Map<String,Object>> usersInfoList = session.selectList("jp.setlist.app.userInfo.selectAllUsers");
			return usersInfoList;
			
		} catch (Exception e) {
			new AppException(e,"DBへ接続中にエラーが発生しました。");
		}
		finally {
			session.close();
		}
		return null;
	}
	
	/**
	 * 
	 * DB接続 前処理
	 * 
	 * @throws AppException
	 * @throws IOException
	 */
	private void setup() throws AppException, IOException {
		
		InputStream inputStream = Resources.getResourceAsStream(DaoConst.FILE_NAME_MYBATIS_SETTING);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		session = sqlSessionFactory.openSession();
	}
	
//	public void createUserTable(){
//	
//	try {
//		this.setup();
//		int createTable = this.session.update("jp.setlist.app.userInfo.createTable");
//		
//	} catch (Exception e) {
//		new AppException(e,"DBへ接続中にエラーが発生しました。");
//	}
//	finally {
//		this.session.close();
//	}
//}
	
}
