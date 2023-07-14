package Day08.Ex06_MultipleInterface;

public interface MicroPhone {
	
	int inputvolumeMax = 50;	// 음성 인식 최대 볼륨
	int inputvolumeMix = 5;		// 음성 인식 최소 볼륨
	
	//음성 인식
	String receiveVoice(String voice);
	
}
