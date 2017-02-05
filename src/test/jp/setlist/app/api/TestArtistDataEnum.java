package jp.setlist.app.api;

public enum TestArtistDataEnum {

	ARTIST1("A0001","藍井エイル","歌がうまいメンヘラ。元AV女優。"),
	ARTIST2("A0002","新田恵海","歌がうまいビッチ。"),
	ARTIST3("A0003","南條愛乃","いわゆる神。");
	
	/* アーティストID */
	private final String id;
	
	/* アーティスト名 */
	private final String name;
	
	/* 概要 */
	private final String description;	
	
	private TestArtistDataEnum(
			final String id,
			final String name,
			final String description){
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
