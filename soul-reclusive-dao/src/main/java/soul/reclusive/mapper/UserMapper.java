package soul.reclusive.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import soul.reclusive.user.User;

import java.util.List;

/**
 * @author SW
 * @date create 2018-12-30 15:34
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户结果集
     *
     * @param userName 用户名
     * @return 查询结果
     */
    @Select("SELECT * FROM t_user WHERE username = #{userName}")
    List<User> findByUsername(@Param("userName") String userName);


    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 成功 1 失败 0
     */
    int insert(User user);

    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
     * </p>
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param user 用户姓名
     * @return 分页对象
     */
    IPage<User> selectPage(@Param("pg")Page<User> page, @Param("user") User user);
}
