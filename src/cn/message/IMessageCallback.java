package cn.message;

public interface IMessageCallback {
	void onMessageHandle(long messageId, Object result);
}
