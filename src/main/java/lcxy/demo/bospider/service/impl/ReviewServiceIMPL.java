package lcxy.demo.bospider.service.impl;

import lcxy.demo.bospider.dto.Review;
import lcxy.demo.bospider.mapper.ReviewMapper;
import lcxy.demo.bospider.service.inf.ReviewServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:评论的的service实现类
 *
 * @author liubing
 * Date: 2018/10/9 下午8:11
 * @since JDK 1.8
 */

@Service("ReviewServiceIMPL")
public class ReviewServiceIMPL implements ReviewServiceINF{

    @Autowired
    private ReviewMapper reviewMapper;
    /**
     * 增加一条评论
     * @param review
     * @return
     */
    @Override
    public boolean addReview(Review review) {
        return reviewMapper.addReview(review);
    }
    /**
     * 根据Rid删除评论
     * @param rId
     * @return
     */
    @Override
    public boolean deleteByRId(Integer rId) {
        return reviewMapper.deleteByRId(rId);
    }
    /**
     *
     * @param review
     * @return
     */
    @Override
    public boolean updateByRId(Review review) {
        return reviewMapper.updateByRId(review);
    }
    /**
     * 查询所有的
     * @return
     */
    @Override
    public List<Review> findAll() {
        return reviewMapper.findAll();
    }
    /**
     * 根据rid查询评论
     * @param rId
     * @return
     */
    @Override
    public Review findByRId(Integer rId) {
        return reviewMapper.findByRId(rId);
    }

    /**
     * 根据wName查询
     * @param wName
     * @return
     */
    @Override
    public List<Review> findByWName(String wName) {
        List<Review> reviews = reviewMapper.findByWName(wName);
        if(reviews==null||reviews.size()==0){
            return null;
        }
        return reviews;
    }
}
