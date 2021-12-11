package cn.freeprogramming.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 找回密码参数
 * @author humorchen chenxingxingx
 * @date 2021/12/5 20:56 2021/12/11 19:57
 */
@Data
public class RetrieveParam  implements Serializable {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 老密码
     */
    private String oldPassword;

    /**
     * 新密码
     */
    private String newPassword;

}
