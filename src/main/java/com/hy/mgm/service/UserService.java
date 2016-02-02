package com.hy.mgm.service;

import com.hy.mgm.domain.User;

/**
 * @author lanyonm
 */
public interface UserService {

    /**
     * @param userToAdd
     * @return a list of all {@link User}s
     */
    public int addUser(User userToAdd);

    /**
     * @param loginId
     * @return success
     */
    public User getUser(String loginId);

}
