package jp.setlist.app.api;

/**
 * 
 * テスト用ダミーユーザ情報
 * 
 * @author kohei
 *
 */
public enum TestDBResourceEnum {
	
	USER1(1,"小豆梓"),
	USER2(2,"新垣あやせ"),
	USER3(3,"五河琴里"),
	USER4(4,"越谷小鞠"),
	USER5(5,"トト子"),
	USER6(6,"奈瀬明日美"),
	USER7(7,"姫柊雪菜"),
	USER8(8,"戦慄のタツマキ"),
	USER9(9,"藤宮香織"),
	USER10(10,"竜宮レナ"),
	USER11(11,"ロゥリィ・マーキュリー"),
	USER12(12,"西住まほ"),
	USER13(13,"めぐみん"),
	USER14(14,"青葉風音"),
	USER15(15,"佐倉杏子"),
	USER16(16,"遠藤サヤ"),
	USER17(17,"星空凛"),
	USER18(18,"華城綾女"),
	USER19(19,"由比ヶ浜結衣"),
	USER20(20,"友利奈緒"),
	USER21(21,"柊シノア"),
	USER22(22,"涼風青葉"),
	USER23(23,"ホロ"),
	USER24(24,"川神舞"),
	USER25(25,"原村和"),
	USER26(26,"風間レヴィ"),
	USER27(27,"矢野エリカ"),
	USER28(28,"ヨナ"),
	USER29(29,"工藤美玲"),
	USER30(30,"櫛川鳩子"),
	USER31(31,"レム"),
	USER32(32,"千反田える"),
	USER33(33,"矢澤にこ"),
	USER34(34,"清水潔子"),
	USER35(35,"絢辻詞"),
	USER36(36,"絢瀬絵里"),
	USER37(37,"宮園かをり"),
	USER38(38,"木之本桜"),
	USER39(39,"種島ぽぷら"),
	USER40(40,"戦場ヶ原ひたぎ"),
	USER41(41,"青山七海"),
	USER42(42,"島田美波"),
	USER43(43,"黒沼爽子"),
	USER44(44,"戸塚彩加"),
	USER45(45,"園田海未"),
	USER46(46,"赤座あかり"),
	USER47(47,"御坂美琴"),
	USER48(48,"羽川翼"),
	USER49(49,"シノン"),
	USER50(50,"河合律");

	private final Integer id;
	private final String name;
	
	private TestDBResourceEnum(final Integer id,final String name){
		this.id = id;
		this.name = name;
	}
	
	public Integer getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
}
