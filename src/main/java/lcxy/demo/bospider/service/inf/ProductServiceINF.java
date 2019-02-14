package lcxy.demo.bospider.service.inf;

import lcxy.demo.bospider.dto.Product;
import java.util.*;

public interface ProductServiceINF {
    /**
     * 增加
     * @param product
     * @return
     */
    boolean addPro(Product product);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean delById(Integer id);

    /**
     * 更新id
     * @param product
     * @return
     */
    boolean updateById(Product product);

    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    List<Product> findByWNameOrderbyPriceup(String wName);
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    List<Product> findByWNameOrderbyPricedown(String wName);

    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    List<Product> findByWNameOrderbySumup(String wName);
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    List<Product> findByWNameOrderbySumdown(String wName);

}
