package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class PurchaseOrderImp implements IPurchesaseOrder {

	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username}")
	private String fromMail;
	
	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception {
		//calculate bill amount
	 double	billAmount=0.0;
	 for(double p:prices) {
		 billAmount=billAmount+p;
	 }
	 String msg=Arrays.toString(items)+" with prices "+Arrays.toString(prices) +" having billAMount "+billAmount;
	 //send email
	 String status=sendMail(msg,toEmails);
		return msg+"--"+status;
	}

	private String sendMail(String msg, String[] toEmails) throws MessagingException {
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message, true);
		helper.setFrom(fromMail);
		helper.setCc(toEmails);
		helper.setSubject("open to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("myimage.jpg", new ClassPathResource("myimage.jpg"));
		sender.send(message);
		return "email sent";
	}

}
