package com.cucumber.demo.controller;

import com.cucumber.demo.model.Put;
import com.cucumber.demo.model.Putwall;
import com.cucumber.demo.service.PutwallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/putwall/")
public class PutwallController {

    @Autowired
    private PutwallService putwallService;

    @PostMapping("add")
    public Putwall addPutwall(@RequestBody @Validated Putwall putwall) {
        return putwallService.save(Putwall.builder().putwallName("putwall-A").puts(List.of(Put.builder().putName("put-1").putSize(10).putCapacity(8).build(), Put.builder().putName("put-2").putSize(5).putCapacity(2).build())).build());
    }

    @GetMapping("getAllPutwall")
    public List<?> findAllPutwall() {
        return putwallService.findAll().stream().map(put -> put.getPuts().stream().map(m -> m.getPutName())).collect(Collectors.toList());
    }

    @DeleteMapping("remove/{id}")
    public void deletePutwall(@PathVariable Integer id) {
        putwallService.removeById(id);
    }
}
