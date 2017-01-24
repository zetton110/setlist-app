package jp.setlist.app.common.beans;

import javax.enterprise.context.RequestScoped;

/**
 * ユーザ情報ビーン（持ち回り用）
 * @author kohei
 *
 */
@RequestScoped
public class UserBean {
	
	/* ユーザ名 */
	private String name;
	
	/* ユーザID */
	private Integer id;
	
	/* パスワード */
	private String password;

	/* E-Mailアドレス */
	private String emailAddress;
	

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
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
