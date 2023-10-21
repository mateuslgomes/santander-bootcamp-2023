package dio.me.service;

import dio.me.domain.model.User;

public interface UserService {

    User findById(Long id);

    User created(User userToCreated);

}
