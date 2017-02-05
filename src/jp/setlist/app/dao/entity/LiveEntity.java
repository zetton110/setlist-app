package jp.setlist.app.dao.entity;

import java.util.Date;
import java.util.List;

public class LiveEntity {

	/* ID */
	private String id;
	
	/* 日付 */
	private Date date;

	/* アーティストID */
	private String artist_id;
	
	/* ライブタイトル */
	private String title;
	
	/* セットリスト */
	private List<String> setlist;

	/*----------- 以下、アクセサメソッド -----------*/	

	public String getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getSetlist() {
		return setlist;
	}

	public void setSetlist(List<String> setlist) {
		this.setlist = setlist;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
