package egovframework.sample.service.impl;

import egovframework.sample.service.impl.SampleService;

public class AdvancedSampleServiceImpl {
	public AdvancedSampleServiceImpl() throws Exception {
		System.out.println("AdvancedSampleService ===> Sample 생성");
	}
	
	public void insertSample() throws Exception {
		System.out.println("AdvancedSampleService ===> Sample 등록");
	}
	
	public void updateSample() throws Exception {
		System.out.println("AdvancedSampleService ===> Sample 수정");
	}
	
	public void deleteSample() throws Exception {
		System.out.println("AdvancedSampleService ===> Sample 삭제");
	}
	
	public void selectSample() throws Exception {
		System.out.println("AdvancedSampleService ===> Sample 상세 조회");
	}
	
	public void selectSampleList() throws Exception {
		System.out.println("AdvancedSampleService ===> Sample 목록조회");
	}
}
