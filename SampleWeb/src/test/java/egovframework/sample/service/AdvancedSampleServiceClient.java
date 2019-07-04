package egovframework.sample.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.AdvancedSampleServiceImpl;

public class AdvancedSampleServiceClient {
	public static void main(String[] args) throws Exception {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");
		
		
		// 2. Spring 컨테이너로부터 SampleServiceImpl 객체를 lookup한다.
		AdvancedSampleServiceImpl advancedSampleService = (AdvancedSampleServiceImpl) container.getBean("advancedSampleService");
		advancedSampleService.insertSample();
		advancedSampleService.selectSample();
		
		// 3. Srping 컨테이너를 종료한다.
		container.close();
		}

}
