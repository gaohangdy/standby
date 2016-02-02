package com.hy.mgm.persistence;

import com.hy.mgm.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    @Select("SELECT * FROM m_user u WHERE u.userid = #{loginId}")
    public User getUser(String loginId);

    @Insert("insert into m_user (id, email, userName) values(#{id}, #{email}, #{userName})")
    public int addUser(User user);
}
