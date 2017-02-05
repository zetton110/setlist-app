package jp.setlist.app.dao.entity;

public class ArtistEntity {
	
	/* アーティストID */
	private String id;
	
	/* アーティスト名 */
	private String name;
	
	/* 概要 */
	private String description;	

	/*----------- 以下、アクセサメソッド -----------*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
