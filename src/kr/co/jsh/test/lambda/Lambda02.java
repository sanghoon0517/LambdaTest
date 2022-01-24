package kr.co.jsh.test.lambda;

public class Lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message = (msg) -> {
			System.out.println("Message contents : "+msg);
		};
		
		NoParamMessage noParamMessage = () -> {
			System.out.println("No Parameter Message");
		};
		
		message.showMsg("Hello world!");
		noParamMessage.showMsg();

	}
	
	interface Message {
		void showMsg(String msg);
	}
	
	interface NoParamMessage {
		void showMsg();
	}

}
