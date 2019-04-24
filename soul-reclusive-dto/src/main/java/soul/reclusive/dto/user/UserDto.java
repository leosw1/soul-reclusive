package soul.reclusive.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import soul.reclusive.user.User;

/**
 * @author SW
 * @date create 2018-12-30 18:36
 */
@Getter
@Setter
public class UserDto {

    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "密码")
    private String passWord;

    public static User genUser(UserDto userDto){
        return new User(userDto.getUserName(), userDto.getPassWord());
    }
}
