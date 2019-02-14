package lcxy.demo.bospider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lcxy.demo.bospider.commonbox.Result;
import lcxy.demo.bospider.commonbox.ResultGenerator;
import lcxy.demo.bospider.dto.Review;
import lcxy.demo.bospider.service.inf.ReviewServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Function:评论的的controller
 *
 * @author liubing
 * Date: 2018/10/9 下午8:12
 * @since JDK 1.8
 */

@Api(value = "Review", description = "评论模块")//加一个swagger的注解
@RequestMapping(value="/review")
@RestController
public class ReviewController {
    @Autowired
    @Qualifier("ReviewServiceIMPL")
    private ReviewServiceINF reviewServiceINF;
    /**
     * 增加一条评论
     * @param review
     * @return
     */
    @ApiOperation(value = "增加一条评论", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public Result addReview(@RequestBody Review review) {
        if(!reviewServiceINF.addReview(review)){
            return ResultGenerator.genFailResult("增加一条评论失败");
        }
        return ResultGenerator.genSuccessResult(true);
    }
    /**
     * 根据Rid删除评论
     * @param rId
     * @return
     */
    @ApiOperation(value = "根据Rid删除评论", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/delete/byRId",method = RequestMethod.GET)
    public Result deleteByRId(@RequestParam Integer rId) {
        if(!reviewServiceINF.deleteByRId(rId)){
            return ResultGenerator.genFailResult("根据Rid删除评论失败");
        }
        return ResultGenerator.genSuccessResult(true);
    }
    /**
     * 根据rid更新评论
     * @param review
     * @return
     */
    @ApiOperation(value = "根据rid更新评论", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public Result updateByRId(@RequestBody Review review) {
        if(!reviewServiceINF.updateByRId(review)){
            return ResultGenerator.genFailResult("根据rid更新评论失败");
        }
        return ResultGenerator.genSuccessResult(true);
    }
    /**
     * 查询所有的
     * @return
     */
    @ApiOperation(value = "查询所有的", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/all",method = RequestMethod.GET)
    public Result findAll() {
        List<Review> reviewList = reviewServiceINF.findAll();
        if (reviewList==null) {
            return ResultGenerator.genFailResult("查询所有的失败");
        }
        return ResultGenerator.genSuccessResult(reviewList);
    }
    /**
     * 根据rid查询评论
     * @param rId
     * @return
     */
    @ApiOperation(value = "根据rid查询评论", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/byRId",method = RequestMethod.GET)
    public Result findByRId(@RequestParam Integer rId) {
        Review review = reviewServiceINF.findByRId(rId);
        if(review==null){
            return ResultGenerator.genFailResult("根据rid查询评论失败");
        }
        return ResultGenerator.genSuccessResult(review);
    }
    /**
     * 根据wName查询评论
     * @param wName
     * @return
     */
    @ApiOperation(value = "根据wName查询评论", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/byWName",method = RequestMethod.GET)
    public Result findByWName(@RequestParam String wName) {
        List<Review> reviews = reviewServiceINF.findByWName(wName);
        if(reviews==null||reviews.size()==0){
            return ResultGenerator.genFailResult("根据wName查询评论失败");
        }
        return ResultGenerator.genSuccessResult(reviews);
    }
}
