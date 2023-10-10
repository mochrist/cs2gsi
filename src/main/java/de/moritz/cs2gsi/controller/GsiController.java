package de.moritz.cs2gsi.controller;

import de.moritz.cs2gsi.entity.GameInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GsiController {
    private static Logger logger = LoggerFactory.getLogger(GsiController.class);

    @PostMapping
    public ResponseEntity<GameInfo> addInfo(@RequestBody GameInfo gameInfo) {
        logger.info("Received new info: " + gameInfo.getRoundPhase() + " " + gameInfo.getPlayerHP());
        return ResponseEntity.ok(gameInfo);
    };


}
