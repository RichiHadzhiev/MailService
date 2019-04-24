package mail.service.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import mail.service.app.components.MessageForm;

@Service
public class MailService {
	
	@Autowired
	public JavaMailSender emailSender;
	
	public void sendEmail(MessageForm mf) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mf.getTo());
		message.setSubject(mf.getSubject());
		message.setText(mf.getText());
		emailSender.send(message);
	}
}
