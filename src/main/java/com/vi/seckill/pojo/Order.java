package com.vi.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@TableName("t_order")
@ApiModel(value = "Order对象", description = "")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("商品ID")
    @TableField("goods_id")
    private Long goodsId;

    @ApiModelProperty("收获地址ID")
    @TableField("delivery_addr_id")
    private Long deliveryAddrId;

    @ApiModelProperty("商品名字")
    @TableField("goods_name")
    private String goodsName;

    @ApiModelProperty("商品数量")
    @TableField("goods_count")
    private Integer goodsCount;

    @ApiModelProperty("商品价格")
    @TableField("goods_price")
    private BigDecimal goodsPrice;

    @ApiModelProperty("1 pc,2 android, 3 ios")
    @TableField("order_channel")
    private Integer orderChannel;

    @ApiModelProperty("订单状态，0新建未支付，1已支付，2已发货，3已收货，4已退货，5已完成")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("订单创建时间")
    @TableField("create_date")
    private Date createDate;

    @ApiModelProperty("支付时间")
    @TableField("pay_date")
    private Date payDate;


}
