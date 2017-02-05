package jp.setlist.app.api;

/**
 * 
 * テスト用ダミーユーザ情報
 * 
 * @author kohei
 *
 */
public enum TestDBResourceEnum {
	
	USER1(1,"小豆梓","a0001","0001@gmail.com"),
	USER2(2,"新垣あやせ","a0002","0002@gmail.com"),
	USER3(3,"五河琴里","a0003","0003@gmail.com"),
	USER4(4,"越谷小鞠","a0004","0004@gmail.com"),
	USER5(5,"トト子","a0005","0005@gmail.com"),
	USER6(6,"奈瀬明日美","a0006","0006@gmail.com"),
	USER7(7,"姫柊雪菜","a0007","0007@gmail.com"),
	USER8(8,"戦慄のタツマキ","a0008","0008@gmail.com"),
	USER9(9,"藤宮香織","a0009","0009@gmail.com"),
	USER10(10,"竜宮レナ","a0010","0010@gmail.com"),
	USER11(11,"ロゥリィ・マーキュリー","a0011","0011@gmail.com"),
	USER12(12,"西住まほ","a0012","0012@gmail.com"),
	USER13(13,"めぐみん","a0013","0013@gmail.com"),
	USER14(14,"青葉風音","a0014","0014@gmail.com"),
	USER15(15,"佐倉杏子","a0015","0015@gmail.com"),
	USER16(16,"遠藤サヤ","a0016","0016@gmail.com"),
	USER17(17,"星空凛","a0017","0017@gmail.com"),
	USER18(18,"華城綾女","a0018","0018@gmail.com"),
	USER19(19,"由比ヶ浜結衣","a0019","0019@gmail.com"),
	USER20(20,"友利奈緒","a0020","0020@gmail.com"),
	USER21(21,"柊シノア","a0021","0021@gmail.com"),
	USER22(22,"涼風青葉","a0022","0022@gmail.com"),
	USER23(23,"ホロ","a0023","0023@gmail.com"),
	USER24(24,"川神舞","a0024","0024@gmail.com"),
	USER25(25,"原村和","a0025","0025@gmail.com"),
	USER26(26,"風間レヴィ","a0026","0026@gmail.com"),
	USER27(27,"矢野エリカ","a0027","0027@gmail.com"),
	USER28(28,"ヨナ","a0028","0028@gmail.com"),
	USER29(29,"工藤美玲","a0029","0029@gmail.com"),
	USER30(30,"櫛川鳩子","a0030","0030@gmail.com"),
	USER31(31,"レム","a0031","0031@gmail.com"),
	USER32(32,"千反田える","a0032","0032@gmail.com"),
	USER33(33,"矢澤にこ","a0033","0033@gmail.com"),
	USER34(34,"清水潔子","a0034","0034@gmail.com"),
	USER35(35,"絢辻詞","a0035","0035@gmail.com"),
	USER36(36,"絢瀬絵里","a0036","0036@gmail.com"),
	USER37(37,"宮園かをり","a0037","0037@gmail.com"),
	USER38(38,"木之本桜","a0038","0038@gmail.com"),
	USER39(39,"種島ぽぷら","a0039","0039@gmail.com"),
	USER40(40,"戦場ヶ原ひたぎ","a0040","0040@gmail.com"),
	USER41(41,"青山七海","a00041","0041@gmail.com"),
	USER42(42,"島田美波","a0042","00042@gmail.com"),
	USER43(43,"黒沼爽子","a00043","0043@gmail.com"),
	USER44(44,"戸塚彩加","a0044","0044@gmail.com"),
	USER45(45,"園田海未","a0045","0045@gmail.com"),
	USER46(46,"赤座あかり","a0046","0046@gmail.com"),
	USER47(47,"御坂美琴","a0047","0047@gmail.com"),
	USER48(48,"羽川翼","a0048","00048@gmail.com"),
	USER49(49,"シノン","a0049","0049@gmail.com"),
	USER50(50,"河合律","a0050","0050@gmail.com");

	private final Integer id;
	private final String name;
	private final String password;
	private final String email;
	
	private TestDBResourceEnum(
			final Integer id,
			final String name,
			final String password,
			final String email){
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public Integer getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getPassword(){
		return this.password;
	}
	public String getEmail(){
		return this.email;
	}
}
