package jp.setlist.app.dao.entity;

import javax.enterprise.context.RequestScoped;

/**
 * ユーザ情報エンティティ（レコード1件分のユーザ情報格納用）
 * @author kohei
 *
 */
@RequestScoped
public class UserEntity {
	
	/* ユーザ名 */
	private String name;
	
	/* ユーザID */
	private Integer id;
	
	/* ユーザパスワード */
	private String password;

	/* ユーザE-Mailアドレス */
	private String email;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailAddress) {
		this.email = emailAddress;
	}
}
