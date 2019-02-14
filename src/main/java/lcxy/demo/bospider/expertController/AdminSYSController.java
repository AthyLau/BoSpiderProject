package lcxy.demo.bospider.expertController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lcxy.demo.bospider.commonbox.Result;
import lcxy.demo.bospider.commonbox.ResultGenerator;
import lcxy.demo.bospider.dto.Admin;
import lcxy.demo.bospider.service.inf.AdminServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:管理员的综合接口controller
 *
 * @author liubing
 * Date: 2018/10/9 下午9:07
 * @since JDK 1.8
 */

@Api(value = "SYS/Admin", description = "SYS模块")//加一个swagger的注解
@RequestMapping(value="/sys/admin")
@RestController
public class AdminSYSController {
    @Autowired
    private AdminServiceINF adminServiceINF;

    /**
     * 管理员登陆接口
     */
    @ApiOperation(value = "管理员登陆接口", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/adminLogin",method = RequestMethod.POST)
    public Result adminLogin(@RequestBody Admin admin){
        String password = admin.getAPassword();
        admin = adminServiceINF.findAdminByAName(admin.getAName());
        if(admin!=null&&admin.getAPassword().equals(password)){
            return ResultGenerator.genSuccessResult(true);
        }
        return ResultGenerator.genFailResult("用户名或者密码错误");
    }

}
