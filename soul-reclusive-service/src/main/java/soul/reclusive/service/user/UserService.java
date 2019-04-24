package soul.reclusive.service.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soul.reclusive.dto.user.UserDto;
import soul.reclusive.mapper.UserMapper;
import soul.reclusive.request.UserSaveRequest;
import soul.reclusive.response.UserSaveReponse;
import soul.reclusive.user.User;

/**
 * @author SW
 * @date create 2018-12-30 18:07
 */
@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserMapper userMapper;

    public UserSaveReponse save(UserSaveRequest request) {
        UserSaveReponse reponse = new UserSaveReponse();
        try {
            User user = UserDto.genUser(request.getUserDto());
            this.userMapper.insert(user);
            return reponse;
        } catch (Exception e) {
            log.error(" UserService save fail : ", e);
            reponse.defaultFailure();
            return reponse;
        }
    }

    public IPage<User> page(Page<User> page, String userName){
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为非 0 时(默认为 0),分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return userMapper.selectPage(page, new QueryWrapper<User>().eq("user_name", userName));
    }
}
