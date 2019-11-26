package com.bw.pojo;


import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "orderdetails")
@Entity
public class orderDetails {

    @Id
    private String id; /*物流编号*/
    private String consignee; /*收获人*/
    private Integer tel; /*收货人手机号*/
    private BigDecimal endtime; /*收货时间*/
    private BigDecimal starttime;/*发货时间*/

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getConsignee() {
        return consignee;
    }
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
    public Integer getTel() {
        return tel;
    }
    public void setTel(Integer tel) {
        this.tel = tel;
    }
    public BigDecimal getEndtime() {
        return endtime;
    }
    public void setEndtime(BigDecimal endtime) {
        this.endtime = endtime;
    }
    public BigDecimal getStarttime() {
        return starttime;
    }
    public void setStarttime(BigDecimal starttime) {
        this.starttime = starttime;
    }
}
