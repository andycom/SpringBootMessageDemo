package com.fancv.message;

import com.google.common.html.HtmlEscapers;
import org.springframework.stereotype.Component;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author hamish-wu
 */
@Component
public class MessageEscaper {
    public String escape(String string) {
        checkNotNull(string);
        return HtmlEscapers.htmlEscaper().escape(string);
    }
}
