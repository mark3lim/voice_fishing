package kr.co.fishing.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 로그인 시 DB에서 반환하는 관리자 기본 정보 저장 domain class
 * fileName : AdminLoginDomain
 * author   : marklim
 * date     : 03-16-2024
 */
@Setter
@Getter
public class AdminLoginDomain {

    private String id, grant;
}
