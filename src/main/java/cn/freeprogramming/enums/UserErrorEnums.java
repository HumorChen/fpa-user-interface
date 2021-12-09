package cn.freeprogramming.enums;

import cn.freeprogramming.interfaces.IErrorEntity;
import lombok.Getter;

/**
 * @Author humorchen
 * @Date 2021/12/6
 */
@Getter
public enum UserErrorEnums implements IErrorEntity {
    USER_NOT_FOUND(1,"用户找不到"),
    LOGIN_FAILED(2,"用户名或密码错误"),
    ;
    private String errorCode;
    private String errorMessage;

    UserErrorEnums(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode +"";
        this.errorMessage = errorMessage;
    }
}
