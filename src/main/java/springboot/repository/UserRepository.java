package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.entity.User;

/**
 * 用户仓储
 *
 * @author LiuDecai
 * @date 2018/7/2.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
