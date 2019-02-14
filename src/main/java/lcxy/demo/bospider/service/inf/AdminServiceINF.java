package lcxy.demo.bospider.service.inf;


import lcxy.demo.bospider.dto.Admin;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/10/2 下午6:37
 * @since JDK 1.8
 */


public interface AdminServiceINF {

    /**
     * 根据管理员的名字查找管理员
     * @param aName
     * @return
     */
    Admin findAdminByAName(String aName);

}
