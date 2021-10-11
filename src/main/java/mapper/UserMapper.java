package mapper;

import bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：07
 * @date ：Created in 17:11 2021/10/11
 * @Description：TODO
 * @Modified By：
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {

    List<User> select();
}
