package com.markerhub.util;

import com.markerhub.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;


/**
 * @author XuBowen
 * @version 1.0
 * @date 2021/12/20 13:22
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
