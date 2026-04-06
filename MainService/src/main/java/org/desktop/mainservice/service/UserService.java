package org.desktop.mainservice.service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(User entity) {
        log.info("create User");
        return null;
    }

    public User getById(Integer id) {
        log.info("get User by id");
        return null;
    }

    public List<User> getAll() {
        log.info("get all Users");
        return null;
    }

    public User update(Integer id, User entity) {
        log.info("update User");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete User");
    }
}