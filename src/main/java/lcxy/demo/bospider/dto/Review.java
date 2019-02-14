package lcxy.demo.bospider.dto;

import lombok.Data;

/**
 * Function:评论的实体类
 *
 * @author liubing
 * Date: 2018/10/9 下午8:06
 * @since JDK 1.8
 */
@Data
public class Review {
    /**
     * 评论编号
     */
    private Integer rId;
    /**
     * 评论等级
     */
    private Integer rRank;
    /**
     * 评论内容
     */
    private String rEvaluate;
    /**
     * 用户id
     */
    private Integer uId;
    /**
     * 关键词name
     */
    private String wName;

}
