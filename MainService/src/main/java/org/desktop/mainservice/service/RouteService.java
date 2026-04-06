package org.desktop.mainservice.service;

@Log4j2
@Service
@RequiredArgsConstructor
public class RouteService {

    private final RouteRepository routeRepository;

    public Route create(Route entity) {
        log.info("create Route");
        return null;
    }

    public Route getById(Integer id) {
        log.info("get Route by id");
        return null;
    }

    public List<Route> getAll() {
        log.info("get all Routes");
        return null;
    }

    public Route update(Integer id, Route entity) {
        log.info("update Route");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Route");
    }
}