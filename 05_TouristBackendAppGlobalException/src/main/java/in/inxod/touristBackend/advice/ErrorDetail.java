package in.inxod.touristBackend.advice;

import java.time.LocalDateTime;

public class ErrorDetail {

	private String msg;
	private LocalDateTime dateTime;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public ErrorDetail(String msg, LocalDateTime dateTime) {
		super();
		this.msg = msg;
		this.dateTime = dateTime;
	}
	public ErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ErrorDeatil [msg=" + msg + ", dateTime=" + dateTime + "]";
	}
	
}
