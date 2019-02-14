package lcxy.demo.bospider.mapper;

import lcxy.demo.bospider.dto.Review;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:评论的mapper
 *
 * @author liubing
 * Date: 2018/10/9 下午8:11
 * @since JDK 1.8
 */
@Mapper
@Repository
public interface ReviewMapper {


    /**
     * 增加一条评论
     * @param review
     * @return
     */
    @Insert("INSERT INTO reviews(r_rank, r_evaluate, u_id,w_name) " +
            "VALUES (#{rRank},#{rEvaluate},#{uId},#{wName});")
    boolean addReview(Review review);

    /**
     * 根据Rid删除评论
     * @param rId
     * @return
     */
    @Delete("DELETE FROM reviews WHERE r_id=#{rId};")
    boolean deleteByRId(Integer rId);

    /**
     * 根据id更新评论
     * @param review
     * @return
     */
    @Update("UPDATE reviews SET r_rank = #{rRank},r_evaluate = #{rEvaluate} WHERE r_id = #{rId};")
    boolean updateByRId(Review review);

    /**
     * 查询所有的
     * @return
     */
    @Select("SELECT r_id,r_rank, r_evaluate, u_id, w_name FROM reviews")
    List<Review> findAll();

    /**
     * 根据wName查询评论
     * @param rId
     * @return
     */
    @Select("SELECT r_id,r_rank, r_evaluate, u_id, w_name FROM reviews where r_id = #{rId}")
    Review findByRId(Integer rId);

    /**
     * 根据wName查询
     * @param wName
     * @return
     */
    @Select("SELECT r_id,r_rank, r_evaluate, u_id, w_name FROM reviews where w_name = #{wName}")
    List<Review> findByWName(String wName);

}
