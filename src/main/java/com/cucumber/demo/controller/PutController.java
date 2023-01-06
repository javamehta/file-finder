package com.cucumber.demo.controller;

import com.cucumber.demo.model.Put;
import com.cucumber.demo.service.PutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/put/")
public class PutController {

    @Autowired
    private PutService putService;

    @GetMapping("{id}")
    public Put getPut(@PathVariable Integer id) throws Exception {
        return putService.findById(id).orElseThrow(() -> new Exception("Put not found!"));
    }

    @PostMapping("save")
    public Put savePut(@RequestBody @Validated Put put) {
        return putService.save(put);
    }

    @DeleteMapping("remove/{id}")
    public void removePut(@PathVariable Integer id) {
        putService.removeById(id);
    }
}
