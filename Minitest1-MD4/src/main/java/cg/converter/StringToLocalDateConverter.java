package cg.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;

public class StringToLocalDateConverter implements Converter<String, LocalDate> {
    private String datePatten;

    public StringToLocalDateConverter(String datePattern) {
//        this.datePattern = datePattern;
    }

    @Override
    public LocalDate convert(String source) {
        return null;
    }
}
