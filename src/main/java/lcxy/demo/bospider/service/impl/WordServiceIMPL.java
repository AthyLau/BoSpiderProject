package lcxy.demo.bospider.service.impl;

import java.util.*;
import lcxy.demo.bospider.dto.Word;
import lcxy.demo.bospider.mapper.WordMapper;
import lcxy.demo.bospider.service.inf.WordServiceINF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/1 下午4:25
 * @since JDK 1.8
 */

@Service("WordServiceIMPL")
public class WordServiceIMPL implements WordServiceINF{
    @Autowired
    private WordMapper wordMapper;

    /**
     * 添加
     * @param word
     * @return
     */
    @Override
    public boolean addWord(Word word) {
        return wordMapper.addWord(word);
    }
    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public boolean deleteWordById(Integer id) {
        return wordMapper.deleteWordById(id);
    }
    /**
     * 根据id更新
     * @param word
     * @return
     */
    @Override
    public boolean updateWordById(Word word) {
        return wordMapper.updateWordById(word);
    }
    /**
     * 查询所有的
     * @return
     */
    @Override
    public List<Word> findAll() {
        return wordMapper.findAll();
    }
    /**
     * 根据id查
     * @param wName
     * @return
     */
    @Override
    public Word findById(String wName) {
        return wordMapper.findById(wName);
    }
}
