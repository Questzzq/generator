package com.vi.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
 * @since 2022-02-19
 */
@Getter
@Setter
@TableName("t_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id，手机号码")
    @TableId("id")
    private Long id;

    @TableField("nickname")
    private String nickname;

    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    @TableField("password")
    private String password;

    @TableField("salt")
    private String salt;

    @ApiModelProperty("头像")
    @TableField("head")
    private String head;

    @TableField("register_date")
    private Date registerDate;

    @TableField("last_login_date")
    private Date lastLoginDate;

    @TableField("login_count")
    private Integer loginCount;


}
