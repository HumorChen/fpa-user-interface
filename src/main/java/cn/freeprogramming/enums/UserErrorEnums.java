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
    USER_IS_EXIST(3,"用户已经存在"),
    USER_IS_BAN(4,"用户已经被禁用"),
    UPDATE_PASSWORD_FAILED(5,"修改密码失败")
    ;
    private String errorCode;
    private String errorMessage;

    UserErrorEnums(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode +"";
        this.errorMessage = errorMessage;
    }
}
