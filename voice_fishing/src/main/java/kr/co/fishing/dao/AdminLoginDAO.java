package kr.co.fishing.dao;

import jakarta.annotation.Resource;
import kr.co.fishing.domain.AdminLoginDomain;
import kr.co.fishing.vo.AdminLoginVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 관리자 로그인 DB connection
 * fileName : AdminLoginDAO
 * author   : marklim
 * date     : 03-16-2024
 */
@Mapper
@Resource
public interface AdminLoginDAO {

    /**
     * 로그인 정보와 일치하는 레코드가 있는 확인
     */
    AdminLoginDomain selectLoginUser(AdminLoginVO loginVO);
}
