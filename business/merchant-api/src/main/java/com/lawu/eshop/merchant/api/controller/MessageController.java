package com.lawu.eshop.merchant.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawu.authorization.annotation.Authorization;
import com.lawu.authorization.util.UserUtil;
import com.lawu.eshop.framework.web.impl.ResultCode;
import com.lawu.eshop.framework.web.impl.constants.UserConstant;
import com.lawu.eshop.framework.web.impl.constants.UserTypeEnum;
import com.lawu.eshop.mall.constants.MessageQueryTypeEnum;
import com.lawu.eshop.mall.dto.MessageDTO;
import com.lawu.eshop.mall.dto.MessageStatisticsDTO;
import com.lawu.eshop.mall.param.MessageParam;
import com.lawu.eshop.mall.param.MessageStatisticsParam;
import com.lawu.eshop.merchant.api.service.MessageService;
import com.lawu.framework.core.page.Page;
import com.lawu.framework.web.BaseController;
import com.lawu.framework.web.HttpCode;
import com.lawu.framework.web.Result;
import com.lawu.framework.web.doc.annotation.Audit;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

/**
 * 站内信息接口
 * Created by zhangyong on 2017/3/29.
 */
@Api(tags = "message")
@RestController
@RequestMapping(value = "message/")
public class MessageController extends BaseController {

    @Autowired
    private MessageService messageService;

    @Audit(date = "2017-04-12", reviewer = "孙林青")
    @ApiOperation(value = "站内信息统计", notes = "根据用户编号获取站内未读信息统计 [1000]（章勇）", httpMethod = "GET")
    @ApiResponse(code = HttpCode.SC_OK, message = "success")
    @Authorization
    @RequestMapping(value = "getMessageStatistics", method = RequestMethod.GET)
    public Result<MessageStatisticsDTO> getMessageStatistics(@RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token,@RequestParam(required = false)  MessageQueryTypeEnum typeEnum) {
        String userNum = UserUtil.getCurrentUserNum(getRequest());
        MessageStatisticsParam param = new MessageStatisticsParam();
        param.setUserNum(userNum);
        param.setTypeEnum(typeEnum);
        param.setUserType(UserTypeEnum.MERCHANT);
        return messageService.getMessageStatistics(param);
    }

    @Audit(date = "2017-04-15", reviewer = "孙林青")
    @ApiOperation(value = "站内信息列表", notes = "根据用户编号获取站内未删除的信息列表 [1000]（章勇）", httpMethod = "GET")
    @ApiResponse(code = HttpCode.SC_OK, message = "success")
    @Authorization
    @RequestMapping(value = "getMessageList", method = RequestMethod.GET)
    public Result<Page<MessageDTO>> getMessageList(@ModelAttribute @ApiParam MessageParam pageParam, @RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token) {
        String userNum = UserUtil.getCurrentUserNum(getRequest());
        Result<Page<MessageDTO>> messageDTOPage = messageService.getMessageList(userNum, UserTypeEnum.MERCHANT , pageParam);
        if(!isSuccess(messageDTOPage)){
        	successCreated(messageDTOPage.getRet());
        }
        return messageDTOPage;
    }

    @SuppressWarnings("rawtypes")
	@Audit(date = "2017-04-15", reviewer = "孙林青")
    @ApiOperation(value = "站内信息操作（已读）", notes = "站内信息操作（已读） [1000]（章勇）", httpMethod = "PUT")
    @ApiResponse(code = HttpCode.SC_CREATED, message = "success")
    @Authorization
    @RequestMapping(value = "read/{messageId}", method = RequestMethod.PUT)
    public Result read(@PathVariable("messageId") Long messageId, @RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token) {
        String userNum = UserUtil.getCurrentUserNum(getRequest());
        messageService.updateMessageStatus(messageId, userNum);
        return successCreated();
    }


    @SuppressWarnings("rawtypes")
	@Audit(date = "2017-04-15", reviewer = "孙林青")
    @ApiOperation(value = "站内信息操作（删除）", notes = "站内信息操作（删除） [1000]（章勇）", httpMethod = "DELETE")
    @ApiResponse(code = HttpCode.SC_NO_CONTENT, message = "success")
    @Authorization
    @RequestMapping(value = "del/{messageId}", method = RequestMethod.DELETE)
    public Result del(@PathVariable("messageId") Long messageId, @RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token) {
        String userNum = UserUtil.getCurrentUserNum(getRequest());
        Result result = messageService.delMessageStatus(messageId, userNum);
        if(!isSuccess(result)){
            successCreated(result.getRet());
        }
        return successDelete();
    }


    @SuppressWarnings("rawtypes")
	@Audit(date = "2017-05-12", reviewer = "孙林青")
    @ApiOperation(value = "站内信息操作（批量标记已读）", notes = "站内信息操作（批量标记已读） [1000]（张荣成）", httpMethod = "PUT")
    @ApiResponse(code = HttpCode.SC_NO_CONTENT, message = "success")
    @Authorization
    @RequestMapping(value = "batchRead", method = RequestMethod.PUT)
    public Result batchRead(@RequestParam("messageIds") String messageIds, @RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token) {
    	if(messageIds == null){
            return successCreated(ResultCode.REQUIRED_PARM_EMPTY);
        }
        String[] ids=messageIds.split(",");
    	String userNum = UserUtil.getCurrentUserNum(getRequest());
        for (String messageId : ids) {
        	 Result result = messageService.updateMessageStatus(Long.parseLong(messageId), userNum);
		}
        return successCreated();
    }

    @Audit(date = "2017-05-12", reviewer = "孙林青")
    @ApiOperation(value = "站内信息操作（消息详情）", notes = "站内信息操作（消息详情） []（张荣成）", httpMethod = "GET")
    @ApiResponse(code = HttpCode.SC_NO_CONTENT, message = "success")
    @Authorization
    @RequestMapping(value = "selectMessageDetail/{id}", method = RequestMethod.GET)
    public Result<MessageDTO> selectMessageDetail(@PathVariable("id") Long id, @RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token) {
        return messageService.selectMessageById(id);
    }

    @SuppressWarnings("rawtypes")
	@Audit(date = "2017-06-30", reviewer = "孙林青")
    @ApiOperation(value = "消息批量删除", notes = "消息批量删除 （章勇）", httpMethod = "DELETE")
    @ApiResponse(code = HttpCode.SC_NO_CONTENT, message = "success")
    @Authorization
    @RequestMapping(value = "delMessage/{ids}", method = RequestMethod.DELETE)
    public Result delMessage(@RequestHeader(UserConstant.REQ_HEADER_TOKEN) String token,
                             @PathVariable(value = "ids") String ids) {
        String userNum = UserUtil.getCurrentUserNum(getRequest());
        messageService.delMessageByIds(ids, userNum);
        return successDelete();
    }
}