package jp.setlist.app.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.dao.UserInfoDao;
import jp.setlist.app.dao.UserInfoDaoMapper;
import jp.setlist.app.dao.entity.UserEntity;
import jp.setlist.app.exception.AppException;
import jp.setlist.app.util.DaoUtil;

public class UserInfoDaoImpl implements UserInfoDao{
	
	private SqlSessionFactory sqlSessionFactory;
	
	public UserInfoDaoImpl(){
		this.sqlSessionFactory = DaoUtil.getSqlSessionFactory();
	}
	
	/**
	 * 
	 * ユーザ情報を1件取得
	 * 
	 * @param userId　ユーザID
	 * @return　userEntity　ユーザ情報エンティティ
	 * @throws AppException 
	 */
	@Override
	public UserEntity selectUser(String userId) throws AppException{
		SqlSession session = this.sqlSessionFactory.openSession();
		UserInfoDaoMapper userInfoDaoMapper = session.getMapper(UserInfoDaoMapper.class);
		UserEntity userEntity = userInfoDaoMapper.selectUser(userId);
		session.close();
		if(userEntity == null){
			throw new AppException(new Exception(),"ユーザ情報の1件取得に失敗しました。");
		}
		return userEntity;
	};
	
	/**
	 * 
	 * ユーザ情報の登録
	 * 
	 * @param userBean　持ち回りユーザBean
	 */
	@Override
	public void insertUser(UserBean userBean){
		SqlSession session = this.sqlSessionFactory.openSession();
		UserInfoDaoMapper userInfoDaoMapper = session.getMapper(UserInfoDaoMapper.class);
		userInfoDaoMapper.insertUser(userBean);
		session.commit();
		session.close();
	};
	
	/**
	 * 
	 * ユーザ情報の変更/更新
	 * 
	 * @param userBean　持ち回りユーザBean
	 */
	@Override
	public void updateUser(UserBean userBean){
		SqlSession session = this.sqlSessionFactory.openSession();
		UserInfoDaoMapper userInfoDaoMapper = session.getMapper(UserInfoDaoMapper.class);
		userInfoDaoMapper.updateUser(userBean);
		session.commit();
		session.close();
	};
	
	/**
	 * ユーザ情報を全件取得
	 * @return usersInfoList　ユーザ情報マップのリスト
	 * @throws AppException 
	 */
	@Override
	public List<Map<String,Object>> selectAllUsers() throws AppException{
		SqlSession session = this.sqlSessionFactory.openSession();
		UserInfoDaoMapper userInfoDaoMapper = session.getMapper(UserInfoDaoMapper.class);
		List<Map<String,Object>> allUsersInfo = userInfoDaoMapper.selectAllUsers();
		session.close();
		if(allUsersInfo.isEmpty()){
			throw new AppException(new Exception(),"ユーザ情報の全件取得に失敗しました。");
		}
		return allUsersInfo;
	};

}
