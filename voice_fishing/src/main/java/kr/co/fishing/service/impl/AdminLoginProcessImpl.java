package kr.co.fishing.service.impl;

import kr.co.fishing.dao.AdminLoginDAO;
import kr.co.fishing.domain.AdminLoginDomain;
import kr.co.fishing.service.AdminLoginProcess;
import kr.co.fishing.vo.AdminLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 로그인 정보 일치 여부 확인하는 class
 * fileName : AdminLoginProcessImpl
 * author   : marklim
 * date     : 03-16-2024
 */
@Service
public class AdminLoginProcessImpl implements AdminLoginProcess {

    @Autowired
    private AdminLoginDAO loginDAO;
    @Override
    public AdminLoginDomain chkLoginUser(AdminLoginVO loginVO) {
        return loginDAO.selectLoginUser(loginVO);
    }
}
