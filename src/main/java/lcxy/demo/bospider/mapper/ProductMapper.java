package lcxy.demo.bospider.mapper;

import lcxy.demo.bospider.dto.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ProductMapper {
    /**
     * 增加
     * @param product
     * @return
     */
    @Insert("Insert into products(p_name,p_price,p_img_url,p_sell_num,p_type,w_name) values(#{pName},#{pPirce},#{pImgUrl},#{pSellNum},#{pType},#{wName})")
    boolean addPro(Product product);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Delete("delete from products where p_id = #{pId}")
    boolean delById(Integer id);

    /**
     * 更新id
     * @param product
     * @return
     */
    @Update("")
    boolean updateById(Product product);

    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Select("SELECT p_id,p_name,p_price,p_img_url,p_sell_num,p_type,w_name from products where w_name = #{wName} order by p_price ASC")
    List<Product> findByWNameOrderbyPriceup(String wName);
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Select("SELECT p_id,p_name,p_price,p_img_url,p_sell_num,p_type,w_name from products where w_name = #{wName} order by p_price desc")
    List<Product> findByWNameOrderbyPricedown(String wName);

    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Select("SELECT p_id,p_name,p_price,p_img_url,p_sell_num,p_type,w_name from products where w_name = #{wName} order by p_sell_num ASC")
    List<Product> findByWNameOrderbySumup(String wName);
    /**
     * 根据wname查询
     * @param wName
     * @return
     */
    @Select("SELECT p_id,p_name,p_price,p_img_url,p_sell_num,p_type,w_name from products where w_name = #{wName} order by p_sell_num desc")
    List<Product> findByWNameOrderbySumdown(String wName);

}
