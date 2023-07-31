package Day18.InterfaceEx;
// 인터페이스는 구현되지 않은 메소드가 있기에 꼭 상속받아야한다.
// 인터페이스는 인스턴스 생성이 불가한다.
public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// 추상메소드: 구현되지 않은 메소드({}가 없다)
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	// void setMute(boolean mute);
	
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리함");
		else
			System.out.println("무음처리해제함");
	}
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
