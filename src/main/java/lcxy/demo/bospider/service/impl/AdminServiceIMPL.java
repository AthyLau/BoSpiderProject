package lcxy.demo.bospider.service.impl;

import lcxy.demo.bospider.dto.Admin;
import lcxy.demo.bospider.mapper.AdminMapper;
import lcxy.demo.bospider.service.inf.AdminServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:管理员的service实现类
 *
 * @author liubing
 * Date: 2018/10/2 下午6:37
 * @since JDK 1.8
 */

@Service("AdminServiceIMPL")
public class AdminServiceIMPL implements AdminServiceINF {


    @Autowired
    private AdminMapper adminMapper;


    /**
     * 根据管理员的名字查找管理员
     * @param aName
     * @return
     */
    @Override
    public Admin findAdminByAName(String aName) {
        Admin admin = adminMapper.findAdminByAName(aName);
        if(admin!=null){
            return admin;
        }
        return null;
    }
}
