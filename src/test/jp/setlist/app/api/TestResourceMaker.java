package jp.setlist.app.api;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.dao.UserInfoDao;

/**
 * テストデータ作成クラス
 * 
 * @author kohei
 *
 */
@Path("test")
@RequestScoped
public class TestResourceMaker {

	/*** ユーザーDAO ***/
	@Inject
	UserInfoDao userInfoDao;

	/*** ユーザ情報ビーン ***/
	@Inject
	UserBean userBean;
	
	/**
	 * 
	 * 初期化
	 * 
	 * 下記URLへアクセス -> 50件のダミーユーザ情報をDBへ登録
	 * http://[ホストのIPアドレス]:[ホストのポート番号]/app/test/init
	 * @return 
	 * 
	 */
	@GET
	@Path("init")
	public Response init(){

		for(TestDBResourceEnum testUser:TestDBResourceEnum.values()){
			userBean.setId(testUser.getId());
			userBean.setName(testUser.getName());
			userBean.setPassword(testUser.getPassword());
			userBean.setEmail(testUser.getEmail());
			userInfoDao.insertUser(userBean);
		}
		
		String msg = "ダミーのUSER情報を登録しました。";

		return Response.ok().entity(msg).build();
	}
	
}
