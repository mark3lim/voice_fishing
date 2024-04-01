package kr.co.fishing.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * fileName : FaqDetailDomain
 * author   : marklim
 * date     : 04-01-2024
 */
@Setter
@Getter
public class FaqDetailDomain {

    private String title, content;
    private int faqId;
}
