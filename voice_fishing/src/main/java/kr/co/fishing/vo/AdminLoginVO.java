package kr.co.fishing.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 관리자가 로그인 시 사용하는 VO class<br>
 * 입력한 아이디와 비번을 저장한다.
 * fileName : AdminLoginVO
 * author   : marklim
 * date     : 3-16-2024
 */
@Getter
@Setter
@ToString
public class AdminLoginVO {

    private String id, pass;
}
