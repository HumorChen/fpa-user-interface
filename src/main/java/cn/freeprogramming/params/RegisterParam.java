package cn.freeprogramming.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 注册账号参数
 * @author humorchen
 * @date 2021/12/5 20:55
 * @author chenxingxing
 * @date 2021/12/11 17:00
 */

@Data
public class RegisterParam  implements Serializable {

    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户名
     */
    private String nickname;
    /**
     * 密码
     */
    private String password;

}
