package cn.techflower.editor.strategy.impl;

import cn.techflower.editor.strategy.Converter;
import com.google.common.base.CaseFormat;

public class SmallCamelCaseConverter implements Converter {
    @Override
    public String convert(CaseFormat currentCase, String originText) {
        return currentCase.to(CaseFormat.LOWER_CAMEL, originText);
    }
}
