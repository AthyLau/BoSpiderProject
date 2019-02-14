package lcxy.demo.bospider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lcxy.demo.bospider.commonbox.Result;
import lcxy.demo.bospider.commonbox.ResultGenerator;
import lcxy.demo.bospider.dto.Product;
import lcxy.demo.bospider.service.inf.ProductServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/3 下午12:08
 * @since JDK 1.8
 */

@Api(value = "Product", description = "商品模块")//加一个swagger的注解
@RequestMapping(value="/product")
@RestController
public class ProductController {

    @Autowired
    @Qualifier("ProductServiceINF")
    private ProductServiceINF productServiceINF;

    /**
     * 增加
     * @param product
     * @return
     */

    @ApiOperation(value = "增加", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public Result addPro(@RequestBody Product product) {
        if(productServiceINF.addPro(product)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("增加产品失败");
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */

    @ApiOperation(value = "根据id删除", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/delete/byid",method = RequestMethod.POST)
    public Result delById(@RequestParam Integer id) {
        if(productServiceINF.delById(id)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除产品失败");
    }
    /**
     * 根据id更新
     * @param product
     * @return
     */

    @ApiOperation(value = "根据id更新", httpMethod = "POST")//加一个swagger的注解
    @RequestMapping(value="/update/byud",method = RequestMethod.POST)
    public Result updateById(@RequestBody Product product) {
        if(productServiceINF.updateById(product)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("根据id更新失败");
    }

    /**
     * 根据关键词名字查询按照价格升序排序
     * @param wName
     * @return
     */
    @ApiOperation(value = "根据关键词名字查询按照价格升序", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/bywname/orderbyprice_up",method = RequestMethod.GET)
    public Result findByWNameOrderbyPriceUp(@RequestParam String wName) {
        List<Product> list = productServiceINF.findByWNameOrderbyPriceup(wName);
        if(list!=null||list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genFailResult("暂无数据！！");
    }
    /**
     * 根据关键词名字查询按照价格降序排序
     * @param wName
     * @return
     */
    @ApiOperation(value = "根据关键词名字查询按照价格降序", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/bywname/orderbyprice_down",method = RequestMethod.GET)
    public Result findByWNameOrderbyPricedown(@RequestParam String wName) {
        List<Product> list = productServiceINF.findByWNameOrderbyPricedown(wName);
        if(list!=null||list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genFailResult("暂无数据！！");
    }
    /**
     * 根据关键词名字查询
     * @param wName
     * @return
     */
    @ApiOperation(value = "根据关键词名字查询按照售出量升序", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/bywname/orderbysum_up",method = RequestMethod.GET)
    public Result findByWNameOrderbySumup(@RequestParam String wName) {
        List<Product> list = productServiceINF.findByWNameOrderbySumup(wName);
        if(list!=null||list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genFailResult("暂无数据！！");
    }
    /**
     * 根据关键词名字查询
     * @param wName
     * @return
     */
    @ApiOperation(value = "根据关键词名字查询按照售出量降序", httpMethod = "GET")//加一个swagger的注解
    @RequestMapping(value="/find/bywname/orderbysum_down",method = RequestMethod.GET)
    public Result findByWNameOrderbySumdown(@RequestParam String wName) {
        List<Product> list = productServiceINF.findByWNameOrderbySumdown(wName);
        if(list!=null||list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genFailResult("暂无数据！！");
    }
}
