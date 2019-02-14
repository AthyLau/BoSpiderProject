package lcxy.demo.bospider.service.inf;

import lcxy.demo.bospider.dto.Word;
import java.util.*;
/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/1 下午4:25
 * @since JDK 1.8
 */

public interface WordServiceINF {

    /**
     * 添加
     * @param word
     * @return
     */
    boolean addWord(Word word);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean deleteWordById(Integer id);

    /**
     * 根据id更新
     * @param word
     * @return
     */
    boolean updateWordById(Word word);

    /**
     * 查询所有的
     * @return
     */
    List<Word> findAll();

    /**
     * 根据名字查
     * @param wName
     * @return
     */
    Word findById(String wName);


}
