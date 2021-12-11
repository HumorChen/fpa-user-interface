package cn.freeprogramming.params;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 修改个人信息参数
 * @author humorchen chenxingxing
 * @date 2021/12/5 20:58 2021/12/11 20:20
 */
@Data
public class ModifySelfInfoParam implements Serializable {

    /**
     * 电话
     */
    private String phone;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 身份证号码
     */
    private String idcard;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 邮箱
     */
    private String email;

    /**
     * QQ号
     */
    private String qq;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 学校名称
     */
    private String schoolName;

}
