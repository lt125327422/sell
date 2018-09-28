package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Created by 廖师兄
 * 2017-05-07 14:30
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     * @Data   get和set都包含
     * @Getter
     * @Setter
     * 不用写get和set方法
     * 要装插件和导入lombok成
     *
     * 在重新打包为class的时候生产
     */


    /**
     * @DynamicUpdate
     * 动态sql 自动更新时间,前提是这行记录有值发生了改变
     */


    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;




    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
