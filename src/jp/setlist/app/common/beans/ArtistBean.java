package jp.setlist.app.common.beans;

import javax.enterprise.context.RequestScoped;

/**
 * アーティスト情報ビーン（持ち回り用）
 * @author kohei
 *
 */
@RequestScoped
public class ArtistBean {

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
