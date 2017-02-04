package jp.setlist.app.api;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * 
 * アーティスト情報操作用
 * WebAPIインターフェース実装クラス
 * 
 * @author kohei
 *
 */
@Path("artist")
@RequestScoped
public class ArtistApiResource {

	@GET
	@Path("hello")
	public Response init(){
		
		String msg = "HELLO!";

		return Response.ok().entity(msg).build();
		
//		for(TestDBResourceEnum testUser:TestDBResourceEnum.values()){
//			userBean.setId(testUser.getId());
//			userBean.setName(testUser.getName());
//			userInfoDao.insertUser(userBean);
//		}
//		
//		String msg = "ダミーのUSER情報を登録しました。";
//
//		return Response.ok().entity(msg).build();
	}
	
}
