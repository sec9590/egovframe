/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.hyb.ios.pki.service;

import java.util.List;

/**  
 * @Class Name : EgovPKIiOSAPIService.java
 * @Description : EgovPKIiOSAPIService Class
 * @Modification Information  
 * @
 * @  수정일                 수정자                 수정내용
 * @ 
 * @ 2012.07.16    이한철                  최초생성
 * 
 * @author 모바일 디바이스 API 팀
 * @since 2012. 07. 11
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */

public interface EgovPKIiOSAPIService {

    /**
     * 인증서로그인한 정보를 등록한다.
     * 
     * @param vo
     *            - 등록할 정보가 담긴 PKIiOSAPIVO
     * @return 등록 결과
     * @exception Exception
     */
    int insertPKIInfo(PKIiOSAPIVO vo) throws Exception;

    /**
     * pki 정보 목록을 조회한다.
     * 
     * @param VO
     *            - 조회할 정보가 담긴 PKIiOSAPIVO
     * @return pki 정보 목록
     * @exception Exception
     */
    List<?> selectPKIInfoList(PKIiOSAPIDefaultVO searchVO) throws Exception;

    /**
     * pki 정보 총 갯수를 조회한다.
     * 
     * @param VO
     *            - 조회할 정보가 담긴 PKIiOSAPIDefaultVO
     * @return pki 정보 총 갯수
     * @exception
     */
    int selectPKIInfoListTotCnt(PKIiOSAPIDefaultVO searchVO);

    /**
     * 인증서 인증을 한다.
     * 
     * @param vo
     *            - 인증 정보가 담긴 PKIiOSAPIVO
     * @return 인증 결과
     * @exception Exception
     */
    String verifyCert(PKIiOSAPIVO vo) throws Exception;
}
