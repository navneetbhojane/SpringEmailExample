package com.nav.demo.springemailexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nav.demo.springemailexample.configuration.ApplicationMailer;

public class EmailTest 
{
    public static void main( String[] args )
    {
        System.out.println("Sending Email.......");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.nav.demo.springemailexample");
		context.refresh();
        
		ApplicationMailer mailer = context.getBean(ApplicationMailer.class);
        mailer.sendMail("abc@gmail.com", "Test Subject", "Testing body");
        mailer.sendPreConfiguredMail("Exception occurred everywhere.. where are you ????");
        
        System.out.println("Email Sent Successfully !!");
    }
}
