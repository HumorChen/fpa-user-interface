package cn.freeprogramming.facade;

import cn.freeprogramming.params.ModifySelfInfoParam;
import cn.freeprogramming.params.RetrieveParam;
import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.params.RegisterParam;
import cn.freeprogramming.vo.result.R;

/**
 * 用户Facade
 * @author humorchen
 * @date 2021/12/5 20:53
 */
public interface IUserFacade {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    R login(LoginParam loginParam, String lastOnlineIp);

    /**
     * 注册
     * @param registerParam
     * @return
     */
    R register(RegisterParam registerParam);

    /**
     * 找回密码
     * @param retrieveParam
     * @return
     */
    R retrieve(RetrieveParam retrieveParam);

    /**
     * 修改个人信息
     * @param modifySelfInfoParam
     * @return
     */
    R modifySelfInfo(ModifySelfInfoParam modifySelfInfoParam);
}
