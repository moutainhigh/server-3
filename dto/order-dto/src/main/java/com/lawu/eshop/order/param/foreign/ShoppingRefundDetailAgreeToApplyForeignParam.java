package com.lawu.eshop.order.param.foreign;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 商家填写物流信息
 * api传递给order-srv参数
 * 
 * @author Sunny
 * @date 2017/4/12
 */
@ApiModel
public class ShoppingRefundDetailAgreeToApplyForeignParam {

	/**
	 * 商家是否同意买家的退货申请
	 */
	@NotNull(message="是否同意不能为空")
	@ApiModelProperty(required = true, value = "商家是否同意买家的退货申请")
	private Boolean isAgree;
	
    /**
    * 拒绝退款理由
    */
	@ApiModelProperty(required = false, value = "拒绝退款理由")
    private String refusalReasons;
	
	public Boolean getIsAgree() {
		return isAgree;
	}

	public void setIsAgree(Boolean isAgree) {
		this.isAgree = isAgree;
	}

	public String getRefusalReasons() {
		return refusalReasons;
	}

	public void setRefusalReasons(String refusalReasons) {
		this.refusalReasons = refusalReasons;
	}
	
}
