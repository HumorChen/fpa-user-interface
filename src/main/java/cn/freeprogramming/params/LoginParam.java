package cn.freeprogramming.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 登录参数
 * @author humorchen
 * @date 2021/12/5 20:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginParam implements Serializable {
    private String username;
    private String password;
}
