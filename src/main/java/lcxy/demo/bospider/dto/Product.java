package lcxy.demo.bospider.dto;

import lombok.Data;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/3 下午12:08
 * @since JDK 1.8
 */

@Data
public class Product {
    /**
     * 商品的id
     */
    private Integer pId;
    /**
     * 商品的名字
     */
    private String pName;
    /**
     * 商品的价格
     */
    private Double pPrice;
    /**
     * 商品的图片url
     */
    private String pImgUrl;
    /**
     * 商品的销售数量
     */
    private Integer pSellNum;
    /**
     * 关键词的名字
     */
    private String wName;
    /**
     * 关键词的来源
     */
    private String pType;

    public Product() {
    }

    public Product(Integer pId, String pName, Double pPrice, String pImgUrl, Integer pSellNum, String wName, String pType) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pImgUrl = pImgUrl;
        this.pSellNum = pSellNum;
        this.wName = wName;
        this.pType = pType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pImgUrl='" + pImgUrl + '\'' +
                ", pSellNum=" + pSellNum +
                ", wName='" + wName + '\'' +
                ", pOrigin='" + pType + '\'' +
                '}';
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public String getpImgUrl() {
        return pImgUrl;
    }

    public void setpImgUrl(String pImgUrl) {
        this.pImgUrl = pImgUrl;
    }

    public Integer getpSellNum() {
        return pSellNum;
    }

    public void setpSellNum(Integer pSellNum) {
        this.pSellNum = pSellNum;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pOrigin) {
        this.pType = pOrigin;
    }
}
