package quickPrograms;

public class TVRemoteMain {

	public static void main(String[] args) {
		//test cases
		TVRemote mymote = new TVRemote(false, 3, 5);
		System.out.println(mymote);
		mymote.TurnOnTV();
		mymote.raiseVolume();
		mymote.increaseChannel();
		
		System.out.println(mymote);
		mymote.pickChannel();
		mymote.raiseVolume();
		
		//try to pick a integer greater than 60
		System.out.println(mymote);
		mymote.pickChannel();
		mymote.raiseVolume();
		
		//try to pick an integer lower than 0
		System.out.println(mymote);
		mymote.pickChannel();
		mymote.raiseVolume();
		
		mymote.decreaseVolume();
		mymote.increaseChannel();
		mymote.TurnOffTV();
		System.out.println(mymote);
		
		//try to raise volume/channel while TV off
		mymote.increaseChannel();
		mymote.decreaseVolume();
		System.out.println(mymote);

	}

}
