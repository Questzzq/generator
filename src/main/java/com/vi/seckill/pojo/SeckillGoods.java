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
@TableName("t_seckill_goods")
@ApiModel(value = "SeckillGoods对象", description = "")
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("秒杀商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商品ID")
    @TableField("goods_id")
    private Long goodsId;

    @ApiModelProperty("秒杀家")
    @TableField("seckill_price")
    private BigDecimal seckillPrice;

    @ApiModelProperty("库存数量")
    @TableField("stock_count")
    private Integer stockCount;

    @ApiModelProperty("秒杀开始时间")
    @TableField("start_date")
    private Date startDate;

    @ApiModelProperty("秒杀结束时间")
    @TableField("end_date")
    private Date endDate;


}
