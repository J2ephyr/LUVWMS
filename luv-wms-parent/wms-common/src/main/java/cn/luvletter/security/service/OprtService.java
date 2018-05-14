package cn.luvletter.security.service;

import cn.luvletter.bean.AuthenticationBean;
import cn.luvletter.constant.SqlConstant;
import cn.luvletter.util.JdbcUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Zephyr Ji
 * @ Description: TODO
 * @ Date 2018/2/24
 */
@Component
public class OprtService {
    @Autowired
    private JdbcUtil jdbcUtil;
    /**
     * @Description: 根据人员账号查询人员
     * @Date: 21:28 2018/2/24
     */
    public AuthenticationBean loadOprt(String no) {
        List<AuthenticationBean> authenticationBeans = jdbcUtil.selectBean(SqlConstant.SELECT_OPRT_BY_NO,AuthenticationBean.class, no);
        if(authenticationBeans!=null && authenticationBeans.size()!=0){
            return authenticationBeans.get(0);
        }
        return null;
    }
}
