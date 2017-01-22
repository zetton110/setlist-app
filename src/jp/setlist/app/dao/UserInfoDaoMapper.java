package jp.setlist.app.dao;

import java.util.List;
import java.util.Map;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.dao.entity.UserEntity;

/**
 * 
 * ユーザ情報DAO(編集、登録、1件取得、全件取得)マッパー
 * @author kohei
 *
 */
public interface UserInfoDaoMapper {

		UserEntity selectUser(String userId);
		void insertUser(UserBean userBean);
		List<Map<String,Object>> selectAllUsers();
		void updateUser(UserBean userBean);
		
//		void createUserTable();
		
	}