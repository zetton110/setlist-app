package jp.setlist.app.dao.entity;

import java.util.Date;
import java.util.List;

public class LiveEntity {

	/* アーティスト名 */
	private String artist;
	
	/* 日付 */
	private Date date;
	
	/* ライブタイトル */
	private String title;
	
	/* ライブ説明 */
	private String description;
	
	/* セットリスト */
	private List<String> setlist;

	/*----------- 以下、アクセサメソッド -----------*/
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getSetlist() {
		return setlist;
	}

	public void setSetlist(List<String> setlist) {
		this.setlist = setlist;
	}
	
}
