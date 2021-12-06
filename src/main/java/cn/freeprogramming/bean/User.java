package cn.freeprogramming.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author humorchen
 * @since 2021-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 密码摘要
     */
    @TableField("password")
    private String password;

    /**
     * 注册时间
     */
    @TableField("register_time")
    private LocalDateTime registerTime;

    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;

    /**
     * 性别
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 身份证号码
     */
    @TableField("idcard")
    private String idcard;

    /**
     * 联系地址
     */
    @TableField("address")
    private String address;

    /**
     * 生日
     */
    @TableField("birthday")
    private LocalDate birthday;

    /**
     * 个性签名
     */
    @TableField("sign")
    private String sign;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * QQ号
     */
    @TableField("qq")
    private String qq;

    /**
     * 微信号
     */
    @TableField("wechat")
    private String wechat;

    /**
     * 学校名称
     */
    @TableField("school_name")
    private String schoolName;

    /**
     * 最后登录时间
     */
    @TableField("last_online_time")
    private LocalDateTime lastOnlineTime;

    /**
     * 最后登录IP地址
     */
    @TableField("last_online_ip")
    private String lastOnlineIp;

    /**
     * 账号状态
     */
    @TableField("state")
    private Integer state;

    /**
     * 账号类型
     */
    @TableField("role")
    private Integer role;


    public static final String ID = "id";

    public static final String PHONE = "phone";

    public static final String NICKNAME = "nickname";

    public static final String PASSWORD = "password";

    public static final String REGISTER_TIME = "register_time";

    public static final String REAL_NAME = "real_name";

    public static final String GENDER = "gender";

    public static final String IDCARD = "idcard";

    public static final String ADDRESS = "address";

    public static final String BIRTHDAY = "birthday";

    public static final String SIGN = "sign";

    public static final String EMAIL = "email";

    public static final String QQ = "qq";

    public static final String WECHAT = "wechat";

    public static final String SCHOOL_NAME = "school_name";

    public static final String LAST_ONLINE_TIME = "last_online_time";

    public static final String LAST_ONLINE_IP = "last_online_ip";

    public static final String STATE = "state";

    public static final String ROLE = "role";

}
