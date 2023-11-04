package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		KatoTaro_Chapter17     taro = new KatoTaro_Chapter17();
		taro.setGivenName( taro.givenName);
		taro.execIntroduce();
		
		System.out.println();
		
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		ichiro.setGivenName( ichiro.givenName );
		ichiro.execIntroduce();
		
		System.out.println();
				
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		hanako.setGivenName(hanako.givenName);
		hanako.execIntroduce();
	}
}
