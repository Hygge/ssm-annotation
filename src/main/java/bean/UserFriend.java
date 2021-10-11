package bean;

/**
 * @author: hygge
 * @email: zeng164@outlook.com
 * @version: 1.0
 * @date: 2021/10/6 17:48
 * @description TODO 对应qq好友
 */

public class UserFriend {
    private String qq;
    private String friendQq;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getFriendQq() {
        return friendQq;
    }

    public void setFriendQq(String friendQq) {
        this.friendQq = friendQq;
    }

    @Override
    public String toString() {
        return "UserFriend{" +
                "qq='" + qq + '\'' +
                ", friendQq='" + friendQq + '\'' +
                '}';
    }
}
