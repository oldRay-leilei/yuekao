package com.bw.pojo;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;


@Table(name = "ordermanagement")
@Entity
public class orderManagement {

    private String sid;/*商品编号*/
    private String uname;/*商品名称*/
    private String specifications;/*商品规格*/
    private Integer number;/*商品数量*/
    private String startaddress;/*发货商*/
    private String endaddress;/*到货地点*/
    private Integer estimated;/*预计天数*/
    private Integer actual;/*实际天数*/
    private String content;/*备注*/

    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSpecifications() {
        return specifications;
    }
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }


    public String getStartaddress() {
        return startaddress;
    }
    public void setStartaddress(String startaddress) {
        this.startaddress = startaddress;
    }

    public String getEndaddress() {
        return endaddress;
    }
    public void setEndaddress(String endaddress) {
        this.endaddress = endaddress;
    }

    public Integer getEstimated() {
        return estimated;
    }
    public void setEstimated(Integer estimated) {
        this.estimated = estimated;
    }


    public Integer getActual() {
        return actual;
    }
    public void setActual(Integer actual) {
        this.actual = actual;
    }


    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
