package com.what.eat.common.enums;

/**
 * @Author dubaolong
 * @Date 2019/2/9 9:54 AM
 * @PackageName com.what.eat.common.enums
 */
public enum SeasonEnum {
    SPRING("SPRING", "春天"),
    SUMMER("SUMMER", "夏天"),
    AUTUMN("AUTUMN", "秋天"),
    WINTER("WINTER", "冬天");

    private String code;

    private String message;

    private SeasonEnum(String code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
