package egovframework.sample.service.impl;

import egovframework.sample.service.impl.SampleService;
import egovframework.sample.service.impl.SampleDAO;

public class SampleServiceImpl implements SampleService {
	//private SampleDAOJDBC sampleDAO;
	private SampleDAO sampleDAO;
	
	public SampleServiceImpl() {
		System.out.println("===> SampleServiceImpl(1) 생성");
	//	sampleDAO = new SampleDAOJDBC();
	}
	
	/*public SampleServiceImpl(SampleDAOJDBC sampleDAO) {
		System.out.println("===> SampleServiceImpl(2) 생성");
		this.sampleDAO = sampleDAO;
	}*/
	
	public SampleServiceImpl(SampleDAO sampleDAO) {
		System.out.println("===> SampleServiceImpl(2) 생성");
		this.sampleDAO = sampleDAO;
	}
	
	public void insertSample() throws Exception {
		sampleDAO.insertSample();
	}
	
	public void updateSample() throws Exception {
		sampleDAO.updateSample();
	}
	
	public void deleteSample() throws Exception {
		sampleDAO.deleteSample();
	}
	
	public void selectSample() throws Exception {
		sampleDAO.selectSample();
	}
	
	public void selectSampleList() throws Exception {
		sampleDAO.selectSampleList();
	}

}
