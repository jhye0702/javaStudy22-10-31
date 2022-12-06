package Ch18_collection;

import java.util.LinkedList;
import java.util.Queue;

class Message { // Queue를 이용한 메세지 큐
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class Ch18_09_Queue {
	/* Queue를 이용한 메세지 큐 */
	public static void main(String[] args) {
		// Stack은 class 이지만 Queue는 interface
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 저장
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "박성훈"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while (!messageQueue.isEmpty()) { // 메세지 큐가 비었는지 확인
			Message message = messageQueue.poll();	// 메세지 큐에서 1개의 메시지 꺼냄
			// poll 맨앞에 있는 것을 순차적으로 가져오고는 제거!
			switch (message.command) {
			case "sendMail" :
				System.out.println(message.to + " 님에게 메일을 보냈습니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + " 님에게 SMS을 보냈습니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + " 님에게 카카오톡을 보냈습니다.");
				break;
			}
		}
//		홍길동 님에게 메일을 보냈습니다.
//		박성훈 님에게 SMS을 보냈습니다.
//		홍두깨 님에게 카카오톡을 보냈습니다.
	}
}
