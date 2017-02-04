package jp.setlist.app.dao.entity;

import jp.setlist.app.common.beans.LiveBean;

public class ArtistEntity {
	/* アーティスト名 */
	private String name;
	
	/* ライブ情報 */
	private LiveBean live;


	/*----------- 以下、アクセサメソッド -----------*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LiveBean getLive() {
		return live;
	}

	public void setLiveInfo(LiveBean live) {
		this.live = live;
	}
	
}
