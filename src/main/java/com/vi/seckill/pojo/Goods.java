package com.vi.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Eric Tseng
 * @since 2022-02-20
 */
@Getter
@Setter
@TableName("t_goods")
@ApiModel(value = "Goods对象", description = "")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商品名称")
    @TableField("goods_name")
    private String goodsName;

    @ApiModelProperty("商品标题")
    @TableField("goods_title")
    private String goodsTitle;

    @ApiModelProperty("商品图片")
    @TableField("goods_img")
    private String goodsImg;

    @ApiModelProperty("商品描述")
    @TableField("goods_detail")
    private String goodsDetail;

    @ApiModelProperty("商品价格")
    @TableField("goods_price")
    private BigDecimal goodsPrice;

    @ApiModelProperty("商品库存,-1表示没有限制")
    @TableField("goods_stock")
    private Integer goodsStock;


}
