package jp.setlist.app.dao;

import java.util.List;
import java.util.Map;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.dao.entity.UserEntity;

/**
 * 
 * ユーザ情報DAOインターフェース
 * @author kohei
 *
 */
public interface UserInfoDao {

	UserEntity selectUser(String userId);
	void insertUser(UserBean userBean);
	List<Map<String,Object>> selectAllUsers();
	
//	void createUserTable();
	
}
