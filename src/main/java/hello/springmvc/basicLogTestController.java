package hello.springmvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class basicLogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        log.trace("TRACE log={}", name);
        log.debug("DEBUG log={}", name);
        log.info("INFO log={}", name);
        log.warn("WARN log={}", name);
        log.error("ERROR log={}", name);

        // 로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식으로 사용하면 X
        // log.debug("String concat log=" + name);
        return "ok";
    }

}
