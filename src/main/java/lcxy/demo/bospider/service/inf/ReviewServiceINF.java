package lcxy.demo.bospider.service.inf;

import lcxy.demo.bospider.dto.Review;

import java.util.List;

/**
 * Function:评论的的service接口
 *
 * @author liubing
 * Date: 2018/10/9 下午8:11
 * @since JDK 1.8
 */
public interface ReviewServiceINF {

    /**
     * 增加一条评论
     * @param review
     * @return
     */
    boolean addReview(Review review);

    /**
     * 根据Rid删除评论
     * @param rId
     * @return
     */
    boolean deleteByRId(Integer rId);

    /**
     *
     * @param review
     * @return
     */
    boolean updateByRId(Review review);

    /**
     * 查询所有的
     * @return
     */
    List<Review> findAll();

    /**
     * 根据rid查询评论
     * @param rId
     * @return
     */
    Review findByRId(Integer rId);

    /**
     * 根据wid查询
     * @param wName
     * @return
     */
    List<Review> findByWName(String wName);
}
