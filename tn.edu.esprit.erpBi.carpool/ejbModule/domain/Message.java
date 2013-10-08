package domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity

public class Message implements Serializable {

	
	private int idMessage;
	private int idSender;
	private int idReciver;
	private String subject;
	private String content;
	private boolean isRead;
	private static final long serialVersionUID = 1L;

	public Message() {
		super();
	}   
	@Id
	public int getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}   
	public int getIdSender() {
		return this.idSender;
	}

	public void setIdSender(int idSender) {
		this.idSender = idSender;
	}   
	public int getIdReciver() {
		return this.idReciver;
	}

	public void setIdReciver(int idReciver) {
		this.idReciver = idReciver;
	}   
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}
   
}
