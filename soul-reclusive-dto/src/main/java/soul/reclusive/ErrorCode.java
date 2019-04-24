package soul.reclusive;

import lombok.Getter;


/**
 * @author SW
 * @date create 2018-12-30 18:19
 */
@Getter
public enum ErrorCode {
    SUCCESS("success"),
    FAIL("fail"),

    E1001("查询数据库异常")

    ;



    private String name;

    ErrorCode(String name) {
        this.name = name;
    }

    public static ErrorCode getByName(String name) {
        for (ErrorCode c : ErrorCode.values()) {
            if (c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }

}
