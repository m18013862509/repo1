package cn.dm;

import org.springframework.beans.BeanUtils;

public class Test01 {
    public static void main(String[] args) {
        user user = new user();
        user.setId(1);
        user.setName("王府井");
        user.setSex("男");
        Uservo uservo = new Uservo();
        BeanUtils.copyProperties(user,uservo);
        System.out.println(uservo.getId());
    }
}
