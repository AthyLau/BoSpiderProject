package lcxy.demo.bospider.service.impl;

import lcxy.demo.bospider.dto.Product;
import lcxy.demo.bospider.mapper.ProductMapper;
import lcxy.demo.bospider.service.inf.ProductServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/3 下午12:09
 * @since JDK 1.8
 */

@Service("ProductServiceINF")
public class ProductServiceIMPL implements ProductServiceINF{
    @Autowired
    private ProductMapper productMapper;
    /**
     * 增加
     * @param product
     * @return
     */
    @Override
    public boolean addPro(Product product) {
        return productMapper.addPro(product);
    }
    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public boolean delById(Integer id) {
        return productMapper.delById(id);
    }
    /**
     * 更新id
     * @param product
     * @return
     */
    @Override
    public boolean updateById(Product product) {
        return productMapper.updateById(product);
    }
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Override
    public List<Product> findByWNameOrderbyPriceup(String wName) {
        return productMapper.findByWNameOrderbyPriceup(wName);
    }
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Override
    public List<Product> findByWNameOrderbyPricedown(String wName) {
        return productMapper.findByWNameOrderbyPricedown(wName);
    }
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Override
    public List<Product> findByWNameOrderbySumup(String wName) {
        return productMapper.findByWNameOrderbySumup(wName);
    }    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Override
    public List<Product> findByWNameOrderbySumdown(String wName) {
        return productMapper.findByWNameOrderbySumdown(wName);
    }
}
