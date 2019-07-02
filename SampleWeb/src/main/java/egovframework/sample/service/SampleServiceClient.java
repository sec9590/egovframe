package egovframework.sample.service;

import egovframework.sample.service.impl.SampleServiceImpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SampleServiceClient {
	public static void main(String[] args) throws Exception {
		
		// 1. Spring 컨테이너를 구동한다. - 지정한 위치에서 설정파일을 가져옴
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");

		// 2. Spring 컨테이너로부터 SampleServiceImpl 객체를 lookup한다.
		// 설정파일에서 bean을 가져와 getBean()을 이용해 객체를 생성 - > 주입 시켜줌
		SampleServiceImpl sampleService = (SampleServiceImpl) container.getBean("sampleService");
		
		// 호출
		sampleService.insertSample();
		sampleService.selectSample();

		// 3. Srping 컨테이너를 종료한다.
		container.close();
	}
}