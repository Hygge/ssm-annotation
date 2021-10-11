package bean;

/**
 * @author: hygge
 * @email: zeng164@outlook.com
 * @version: 1.0
 * @date: 2021/10/6 16:46
 * @description TODO
 */

public class UserInfo {

    private String qq;
    private String nikeName;
    private String remark;
    private String city;


    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "qq='" + qq + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", remark='" + remark + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
