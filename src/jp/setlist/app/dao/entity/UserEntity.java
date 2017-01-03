package jp.setlist.app.dao.entity;

/**
 * ユーザ情報エンティティ（レコード1件分のユーザ情報格納用）
 * @author kohei
 *
 */
public class UserEntity {
	
	/* ユーザ名 */
	private String name;
	
	/* ユーザID */
	private Integer id;
	
	/*----------- 以下、アクセサメソッド -----------*/
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
