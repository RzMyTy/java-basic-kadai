package kadai_017;

abstract public class Kato_Chapter17 {
	
	//フィールド
	public String familyName;
	public String givenName;
	public String address;
	
	//メソッド
	public void commonIntroduce() {	
		String familyName = "加藤";
		String address = "東京都中野区〇×";
		
		System.out.println("名前は" + familyName + this.givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		 commonIntroduce();
	     eachIntroduce();
	}
}
