package com.bright.star.model.dto;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import com.baomidou.mybatisplus.annotation.TableName;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
* 
* </p>
*
* @since 2023-02-02
*/
@Data
@Accessors(chain = true)

@ApiModel(value = "UserAuthDTO对象", description = "")

public class UserAuthDTO implements Serializable {


    private Integer userId;

    private String userCode;

    private String userName;

    /**
    * 暗号化すべき、MD5関数で実施可能。
    */
    @ApiModelProperty(value = "暗号化すべき、MD5関数で実施可能。")
    private String password;

    /**
    * S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当
    */
    @ApiModelProperty(value = "S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当")
    private String userRole;

    /**
    * 有効・無効
    */
    @ApiModelProperty(value = "有効・無効")
    private Integer isYoukou;




}