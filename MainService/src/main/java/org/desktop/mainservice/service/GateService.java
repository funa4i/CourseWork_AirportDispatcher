package org.desktop.mainservice.service;

@Log4j2
@Service
@RequiredArgsConstructor
public class GateService {

    private final GateRepository gateRepository;

    public Gate create(Gate entity) {
        log.info("create Gate");
        return null;
    }

    public Gate getById(Integer id) {
        log.info("get Gate by id");
        return null;
    }

    public List<Gate> getAll() {
        log.info("get all Gates");
        return null;
    }

    public Gate update(Integer id, Gate entity) {
        log.info("update Gate");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Gate");
    }
}