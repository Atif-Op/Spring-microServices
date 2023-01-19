package com.model.template;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class Controller {

    @GetMapping(path = "/pings", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPing() {
        log.info("status ok");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
