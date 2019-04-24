package soul.reclusive;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SW
 * @date create 2018-12-30 18:13
 */
@Data
@ApiModel
public class BaseResponse {

    @ApiModelProperty(
            value = "响应码",
            name = "响应码"
    )
    protected ResponseStatus code;
    @ApiModelProperty(
            value = "错误码",
            name = "错误码"
    )
    protected ErrorCode errorCode;
    @ApiModelProperty(
            value = "错误码描述",
            name = "错误码描述"
    )
    protected String errorMessage;
    protected Map<String, Object> respObjMap;

    public BaseResponse() {
        this.code = ResponseStatus.SUCCESS;
        this.errorCode = ErrorCode.SUCCESS;
        this.errorMessage = "success";
        this.respObjMap = new HashMap();
    }

    public BaseResponse(ResponseStatus status, ErrorCode errorCode, String errorMessage) {
        this.code = ResponseStatus.SUCCESS;
        this.errorCode = ErrorCode.SUCCESS;
        this.errorMessage = "success";
        this.respObjMap = new HashMap();
        this.code = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseResponse(ErrorCode errorCode) {
        this.code = ResponseStatus.SUCCESS;
        this.errorCode = ErrorCode.SUCCESS;
        this.errorMessage = "success";
        this.respObjMap = new HashMap();
        this.code = ResponseStatus.FAILURE;
        this.errorCode = errorCode;
        this.errorMessage = errorCode.name();
    }

    public static BaseResponse makeFailure(ErrorCode errorCode, String errorMessage) {
        return new BaseResponse(ResponseStatus.FAILURE, errorCode, errorMessage);
    }

    public static BaseResponse makeSuccess(String errorMessage) {
        return new BaseResponse(ResponseStatus.SUCCESS, ErrorCode.SUCCESS, errorMessage);
    }

    public static BaseResponse makeSuccess(ErrorCode errorCode, String errorMessage) {
        return new BaseResponse(ResponseStatus.SUCCESS, errorCode, errorMessage);
    }

    public void defaultFailure() {
        this.code = ResponseStatus.FAILURE;
        this.errorCode = ErrorCode.FAIL;
        this.errorMessage = ErrorCode.FAIL.name();
    }

    public void returnNullFailure() {
        this.code = ResponseStatus.FAILURE;
        this.errorCode = ErrorCode.FAIL;
        this.errorMessage = ErrorCode.FAIL.name();
    }

    public void queryDataFailure() {
        this.code = ResponseStatus.FAILURE;
        this.errorCode = ErrorCode.FAIL;
        this.errorMessage = ErrorCode.FAIL.name();
    }

    public void networkFailure() {
        this.code = ResponseStatus.FAILURE;
        this.errorCode = ErrorCode.FAIL;
        this.errorMessage = ErrorCode.FAIL.name();
    }
}
