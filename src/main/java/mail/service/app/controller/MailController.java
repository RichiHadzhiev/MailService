package mail.service.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mail.service.app.components.MessageForm;
import mail.service.app.services.MailService;

@RestController
public class MailController {
	
	@Autowired
	private MailService ms;
	
	@RequestMapping(method = RequestMethod.POST, value = "/sendEmail")
	public String sendEmail(@RequestBody MessageForm mf) {
		ms.sendEmail(mf);
		return "Email sent successfully.";
	}
}
