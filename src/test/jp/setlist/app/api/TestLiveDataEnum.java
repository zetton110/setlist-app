package jp.setlist.app.api;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum TestLiveDataEnum {
	
	LIVE1("L0001","2008/02/16","A0001","ライブ１",Arrays.asList("song1-1", "song1-2", "song1-3"));
	
	/* ID */
	private final String id;
	
	/* 日付 */
	private final Date date;

	/* アーティストID */
	private final String artist_id;
	
	/* ライブタイトル */
	private final String title;
	
	/* セットリスト */
	private final List<String> setlist;
	
	TestLiveDataEnum(
			final String id,
			final String date,
			final String artist_id,
			final String title,
			final List<String> setlist){
		this.id = id;
		this.artist_id = artist_id;
		this.date = this.covertStringToDate(date);
		this.title = title;
		this.setlist = setlist;
	}
	
	private Date covertStringToDate(String dateString){
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date date = df.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
