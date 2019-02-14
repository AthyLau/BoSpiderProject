package lcxy.demo.bospider.mapper;

import lcxy.demo.bospider.dto.Word;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.*;
@Mapper
@Repository
public interface WordMapper {
    /**
     * 添加
     * @param word
     * @return
     */
    @Insert("Insert into words(w_name,w_num) values(#{wName},#{wNum})")
    boolean addWord(Word word);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Delete("delete from words where w_id = #{id}")
    boolean deleteWordById(Integer id);

    /**
     * 根据id更新
     * @param word
     * @return
     */
    @Update("Update words set w_num = #{wNum} where w_id = #{wId}")
    boolean updateWordById(Word word);

    /**
     * 查询所有的
     * @return
     */
    @Select("select w_id,w_name,w_num from words")
    List<Word> findAll();

    /**
     * 根据id查
     * @param wName
     * @return
     */
    @Select("select w_id,w_name,w_num from words where w_name = #{wName}")
    Word findById(String wName);
}
