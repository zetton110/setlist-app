package jp.setlist.app.dao;

import java.util.List;
import java.util.Map;

import jp.setlist.app.common.beans.LiveBean;
import jp.setlist.app.dao.entity.LiveEntity;


/**
 * 
 * ライブ情報DAOインターフェース
 * @author kohei
 *
 */
public interface LiveInfoDao {
	
	LiveEntity selectLiveInfo(String title);
	void insertLiveInfo(LiveBean liveBean);
	List<Map<String,Object>> selectAllLiveInfo();
	void updateLiveInfo(LiveBean liveBean);
	void createLiveTable();

}
