package cn.techflower.editor.strategy.impl;

import cn.techflower.editor.strategy.Converter;

import java.util.List;

public class UnderScoreCaseConverter implements Converter {

    @Override
    public String convert(List<String> originTextList) {
        return String.join("_", originTextList);
    }
}
