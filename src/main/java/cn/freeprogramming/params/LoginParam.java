package cn.freeprogramming.params;

//import cn.freeprogramming.util.CommonPatterns;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
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
    //@Pattern(regexp = CommonPatterns.REGEX_USERNAME, message = CommonPatterns.DESC_USERNAME)
    private String phone;
   // @Pattern(regexp = CommonPatterns.REGEX_PASSWORD, message = CommonPatterns.DESC_PASSWORD)
    private String password;

}
