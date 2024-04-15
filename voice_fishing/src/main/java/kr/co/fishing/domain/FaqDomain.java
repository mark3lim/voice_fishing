package kr.co.fishing.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * fileName : FaqDomain
 * author   : marklim
 * date     : 04-01-2024
 */
@Setter
@Getter
public class FaqDomain {

    private String title, content;
    private int faqId;
}
