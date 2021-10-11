package bean;

import org.apache.ibatis.type.Alias;

import java.util.Random;

/**
 * @author: hygge
 * @email: zeng164@outlook.com
 * @version: 1.0
 * @date: 2021/10/5 9:25
 * @description TODO    spring研究院
 */
@Alias("user")
public class User {

    private Long id;
    private String name;
    private String qq;
    private String sex;

    public User() {

        this.id = Long.valueOf(new Random().nextInt(100)+""+System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
