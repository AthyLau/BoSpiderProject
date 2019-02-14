package lcxy.demo.bospider.dto;

import lombok.Data;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/1 上午11:00
 * @since JDK 1.8
 */

@Data
public class Word {
    /**
     * 关键词的id
     */
    private Integer wId;
    /**
     * 关键词的名字
     */
    private String wName;
    /**
     * 关键词的热度
     */
    private Integer wNum;

    public Word() {
    }

    public Word(Integer wId, String wName, Integer wNum) {
        this.wId = wId;
        this.wName = wName;
        this.wNum = wNum;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public Integer getwNum() {
        return wNum;
    }

    public void setwNum(Integer wNum) {
        this.wNum = wNum;
    }
}
