package jp.setlist.app.api;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.setlist.app.common.beans.UserBean;
import jp.setlist.app.dao.UserInfoDao;
import jp.setlist.app.dao.entity.UserEntity;
import jp.setlist.app.dao.impl.UserInfoDaoImpl;
import jp.setlist.app.exception.AppException;

/**
 * 
 * WebAPIインターフェース実装クラス
 * 
 * @author kohei
 *
 */
@Path("user")
public class WebApiResource {

	/**
	 * 
	 * ユーザ情報登録用API
	 * 
	 * @param id　ユーザID
	 * @param name ユーザ名
	 * @return　Response　HTTPレスポンス
	 */
	@GET
	@Path("register")
	public Response insertUser(@QueryParam("id") Integer id,@QueryParam("name") String name){
		
		//DAO受け渡し用のユーザ情報ビーン生成
		UserBean userBean = new UserBean();
		userBean.setId(id);
		userBean.setName(name);
		
		//DB接続 -> ユーザ情報の登録
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		userInfoDao.insertUser(userBean);
		String msg = "USER情報を登録しました。";
				
		return Response.ok().entity(msg).build();
	}

	/**
	 * 
	 * ユーザ情報変更/更新用API
	 * 
	 * @param id　ユーザID
	 * @param name ユーザ名
	 * @return　Response　HTTPレスポンス
	 */
	@GET
	@Path("update")
	public Response updateUser(@QueryParam("id") Integer id,@QueryParam("name") String name){
		
		//DAO受け渡し用のユーザ情報ビーン生成
		UserBean userBean = new UserBean();
		userBean.setId(id);
		userBean.setName(name);
		
		//DB接続 -> ユーザ情報の登録
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		userInfoDao.updateUser(userBean);
		String msg = "USER情報を更新しました。";
				
		return Response.ok().entity(msg).build();
	}

	/**
	 * 
	 * ユーザテーブル作成用API
	 * 
	 * @param id　ユーザID
	 * @param name ユーザ名
	 * @return　Response　HTTPレスポンス
	 */
	@GET
	@Path("create")
	public Response createUserTable(){
		
		//DB接続 -> ユーザテーブルの作成
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		userInfoDao.createUserTable();
		String msg = "USERテーブルを作成しました。";
				
		return Response.ok().entity(msg).build();
	}


	/**
	 * 
	 * ユーザ情報1件取得用API
	 * 
	 * @param id　ユーザID
	 * @return　Response　HTTPレスポンス
	 */
	@GET
	@Path("select")
	public Response getUserInfo(@QueryParam("id") String id){
		
		//DB接続 -> ユーザ情報取得
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		UserEntity user = null;
		
		try {
			user = userInfoDao.selectUser(id);
		} catch (AppException e) {
			return Response.ok().entity(e.getErrMsg()).build();
		}
		
		//JSON型へ変換
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
        try {
			json = mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			new AppException(e,"オブジェクトの型変換に失敗しました。");
		}
		
		return Response.ok().entity(json).build();
	}
	
	/**
	 * 
	 * ユーザ情報全件取得用API
	 * 
	 * @return　Response　HTTPレスポンス
	 */
	@GET
	@Path("selectAll")
	public Response getAllUsersInfo(){
		
		//DB接続 -> 全ユーザ情報取得
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		List<Map<String, Object>> usersInfoList = null;
		try {
			usersInfoList = userInfoDao.selectAllUsers();
		} catch (AppException e) {
			return Response.ok().entity(e.getErrMsg()).build();
		}
		
		//JSON型へ変換
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
        try {
			json = mapper.writeValueAsString(usersInfoList);
		} catch (JsonProcessingException e) {
			new AppException(e,"オブジェクトの型変換に失敗しました。");
		}
		
		return Response.ok().entity(json).build();
	}
}
