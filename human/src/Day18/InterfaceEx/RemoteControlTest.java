package Day18.InterfaceEx;

public class RemoteControlTest {
	public static void main(String[] args) {
//		RemoteControl rc = new Television();  //업캐스팅
//		System.out.println(rc);
//		rc.turnOn();
//		rc.setVolume(-100);
//		Television tv= (Television)rc; 		// 다운캐스팅
//		
//		tv.print();
//		rc = new Audio();
//		System.out.println(rc);
//		Audio au = (Audio)rc;
//		au.amp();
//		
//		rc = new SmartTelevision();
//		rc.setVolume(7);
//		ISearchable search = new SmartTelevision();
//		search.search("www.korea.co.kr");
//	Television tv = new Television(); 빔이나 오디오도 객체생성을 계속 해야하기때문에 부모 클래스 객체로 생성(?)
		RemoteControl rc = null;
		rc = new Television();
		rc.setMute(true);
		
		rc = new Audio();
		rc.setMute(true);
		
	}
	
}
