package jp.setlist.app.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.dao.UserInfoDao;
import jp.setlist.app.dao.UserInfoDaoMapper;
import jp.setlist.app.dao.impl.UserInfoDaoImpl;

/**
 * テストデータ作成クラス
 * 
 * @author kohei
 *
 */
@Path("test")
public class TestResourceMaker {

	/**
	 * 
	 * 初期化
	 * 
	 * 下記URLへアクセス -> 50件のダミーユーザ情報をDBへ登録
	 * http://[ホストのIPアドレス]:[ホストのポート番号]/app/test/init
	 * 
	 */
	@GET
	@Path("init")
	public void init(){
		
		for(TestDBResourceEnum testUser:TestDBResourceEnum.values()){
			UserBean userBean = new UserBean();
			userBean.setId(testUser.getId());
			userBean.setName(testUser.getName());
			
			UserInfoDao userInfoDao = new UserInfoDaoImpl();
			userInfoDao.insertUser(userBean);
		}
		
	}
	
}
