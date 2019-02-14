package lcxy.demo.bospider.controller;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/1 下午4:25
 * @since JDK 1.8
 */
import java.util.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lcxy.demo.bospider.commonbox.Result;
import lcxy.demo.bospider.commonbox.ResultGenerator;
import lcxy.demo.bospider.dto.Word;
import lcxy.demo.bospider.service.inf.WordServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@Api(value = "Word", description = "关键词模块")//加一个swagger的注解
@RequestMapping(value="/word")
@RestController
public class WordController {
    @Autowired
    @Qualifier("WordServiceIMPL")
    private WordServiceINF wordServiceINF;
    /**
     * 添加
     * @param word
     * @return
     */
    @ApiOperation(value = "添加一个关键词", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public Result addWord(@RequestBody Word word) {
        if(wordServiceINF.addWord(word)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加关键词失败");
    }
    /**
     * 根据id删除
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id删除", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/delete/byid",method = RequestMethod.POST)
    public Result deleteWordById(@RequestParam Integer id) {
        if(wordServiceINF.deleteWordById(id)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除关键词失败");
    }
    /**
     * 根据id更新
     * @param word
     * @return
     */

    @ApiOperation(value = "根据id更新", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/update/byid",method = RequestMethod.POST)
    public Result updateWordById(@RequestBody Word word) {
        if(wordServiceINF.updateWordById(word)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新关键词失败");
    }
    /**
     * 查询所有的
     * @return
     */

    @ApiOperation(value = "查询所有的", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/all",method = RequestMethod.GET)
    public Result findAll() {
        List<Word> list = wordServiceINF.findAll();
        if(list!=null&&list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genFailResult("查询关键词失败");
    }
    /**
     * 根据名字查
     * @param wName
     * @return
     */

    @ApiOperation(value = "根据名字查", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/byname",method = RequestMethod.GET)
    public Result findById(@RequestParam String wName) {
        Word word = wordServiceINF.findById(wName);
        if(word!=null){
            return ResultGenerator.genSuccessResult(word);
        }
        return ResultGenerator.genFailResult("查询关键词失败");
    }

}
