package soul.reclusive.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soul.reclusive.request.UserSaveRequest;
import soul.reclusive.response.UserSaveReponse;
import soul.reclusive.service.user.UserService;
import soul.reclusive.user.User;

/**
 * @author SW
 * @date create 2018-12-30 13:18
 */
@RestController
@Api(value = "用户信息", description = "User的相关信息接口")
public class HelloController {

    @Autowired
    UserService userService;

    @ApiOperation("index页面")
    @GetMapping(value = "/index")
    public String index(){
        return "Hello World!";
    }

    @ApiOperation(value = "新增用户", notes = "新增单个用户，参数 UserDto ", httpMethod = "POST")
    @ResponseBody
    @PostMapping(value = "/save")
    public UserSaveReponse save(@RequestBody UserSaveRequest request){
        return this.userService.save(request);
    }

    @ApiOperation(value = "用户分页", notes = "查询所有用户信息", httpMethod = "GET")
    @ResponseBody
    @GetMapping(value = "/page")
    public IPage<User> page(){
        Page<User> page = new Page<>(2,1);
        return this.userService.page(page, "u1");
    }
}
