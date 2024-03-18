package kr.co.fishing.service;

import kr.co.fishing.domain.AdminLoginDomain;
import kr.co.fishing.vo.AdminLoginVO;

/**
 * 관리자 로그인 허용 여부를 확인하는 service class
 * fileName : AdminLoginProcess
 * author   : marklim
 * date     : 3-16-2024
 */
public interface AdminLoginProcess {

    /**
     * 로그인 정보를 확인하여 사용자가 일치하면 true를, 일치하지 않으면 false를 반환한다.
     * params: 아이디, 비번
     * return: boolean
     */
    public AdminLoginDomain chkLoginUser(AdminLoginVO loginVO);
}
