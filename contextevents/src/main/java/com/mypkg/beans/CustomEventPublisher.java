package com.mypkg.beans;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{
private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
	public void publish(){
		CustomEvent ce=new CustomEvent(this);
		publisher.publishEvent(ce);
	}
}
