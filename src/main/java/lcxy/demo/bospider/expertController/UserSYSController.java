package lcxy.demo.bospider.expertController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lcxy.demo.bospider.commonbox.Result;
import lcxy.demo.bospider.commonbox.ResultGenerator;
import lcxy.demo.bospider.dto.LoginDTO;
import lcxy.demo.bospider.dto.User;
import lcxy.demo.bospider.dto.Word;
import lcxy.demo.bospider.service.inf.AdminServiceINF;
import lcxy.demo.bospider.service.inf.ProductServiceINF;
import lcxy.demo.bospider.service.inf.UserServiceINF;
import lcxy.demo.bospider.service.inf.WordServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Function:用户的综合接口controller
 *
 * @author liubing
 * Date: 2018/10/9 下午4:04
 * @since JDK 1.8
 */

@Api(value = "SYS/User", description = "SYS模块")//加一个swagger的注解
@RequestMapping(value="/sys/user")
@RestController
public class UserSYSController {
    @Autowired
    private AdminServiceINF adminServiceINF;
    @Autowired
    private UserServiceINF userServiceINF;
    @Autowired
    private WordServiceINF wordServiceINF;
    @Autowired
    private ProductServiceINF productServiceINF;
    /**
     * 用户登陆接口
     */
    @ApiOperation(value = "用户登陆接口", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/userLogin",method = RequestMethod.POST)
    public Result userLogin(@RequestBody LoginDTO login){
        String password = login.getUPassword();
        User user = userServiceINF.findUserByUName(login.getUName());
        if(user!=null&&user.getUPassword().equals(password)){
            return ResultGenerator.genSuccessResult(true);
        }
        return ResultGenerator.genFailResult("用户名或者密码错误");
    }
    /**
     * 界面2关键词查询商品信息接口
     */
    @ApiOperation(value = "界面2关键词查询商品信息接口", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/findProByWName",method = RequestMethod.GET)
    public void getProByWName(@RequestParam String wName){
        //查询关键词
        Word word = wordServiceINF.findById(wName);
        if(word==null){
            //插入关键字
            Word myWord = new Word();
            myWord.setwNum(1);
            myWord.setwName(wName);
            wordServiceINF.addWord(myWord);
        }else{
            //现有的关键字热度+1
            word.setwNum(word.getwNum()+1);
            wordServiceINF.updateWordById(word);
        }
        //执行python脚本
        String[] arguments = new String[] {"python", "/Users/lcxy_demo/PycharmProjects/BoSpider/ThreadSpider/ThreadSpider.py", wName};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }




}