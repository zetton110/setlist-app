package jp.setlist.app.dao;

import java.util.List;
import java.util.Map;

import jp.setlist.app.common.beans.ArtistBean;
import jp.setlist.app.dao.entity.ArtistEntity;

/**
 * 
 * アーティスト情報DAOインターフェース
 * @author kohei
 *
 */
public interface ArtistInfoDao {
	ArtistEntity selectArtist(String name);
	void insertUser(ArtistBean artistBean);
	List<Map<String,Object>> selectAllArtist();
	void updateArtist(ArtistBean userBean);
	void createArtistTable();
}
