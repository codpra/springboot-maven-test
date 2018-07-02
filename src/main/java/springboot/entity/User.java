package springboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户
 *
 * @author LiuDecai
 * @date 2018/7/2.
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
}
