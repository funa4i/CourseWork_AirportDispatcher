package org.desktop.mainservice.service;

@Log4j2
@Service
@RequiredArgsConstructor
public class GateScheduleService {

    private final GateScheduleRepository gateScheduleRepository;

    public GateSchedule create(GateSchedule entity) {
        log.info("create GateSchedule");
        return null;
    }

    public GateSchedule getById(Integer id) {
        log.info("get GateSchedule by id");
        return null;
    }

    public List<GateSchedule> getAll() {
        log.info("get all GateSchedules");
        return null;
    }

    public GateSchedule update(Integer id, GateSchedule entity) {
        log.info("update GateSchedule");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete GateSchedule");
    }
}