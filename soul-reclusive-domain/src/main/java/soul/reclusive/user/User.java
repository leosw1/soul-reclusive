package soul.reclusive.user;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SW
 * @date create 2018-12-30 15:32
 */
@Data
@TableName("T_BASE_USER")
public class User implements Serializable {

    private Long id;
    private String status;// STATUS      varchar(10)  null,
    private Date lastLogin; //LAST_LOGIN  timestamp    null on update CURRENT_TIMESTAMP,
    private Date createTime; //CREATE_TIME timestamp    null on update CURRENT_TIMESTAMP,
    private Date updateTime; //UPDATE_TIME timestamp    null on update CURRENT_TIMESTAMP,
    private String email; //EMAIL       varchar(100) null,
    private String name;// NAME        varchar(40)  null,
    private String userDesc; //USERDESC    varchar(64)  null,
    private String phone;//PHONE       varchar(20)  null,
    private Integer sex; //SEX         tinyint(1)   null,
    private String passWord;//PASSWORD    varchar(40)  null,
    private String userName; //USERNAME    varchar(40)  null,

    public User() {

    }
    public User(Long id,String name,String passWord){
        this.id = id;
        this.name = name;
        this.passWord = passWord;
    }


    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

}
