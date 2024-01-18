package ru.cyn.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping("/test")
public class TestController {

    String appleName = "Apple";

    @GetMapping
    public Boolean getrootTest() {
        return false;
    }

    @GetMapping("/getApple/{count}")
    public List<String> getApple(@PathVariable("count") int count) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ret.add("Apple #" + i);
        }
        return ret;
    }

    @PostMapping("/setAppleName")
    public Boolean setAppleName(@RequestBody() Map<String, Object> body) {
        System.out.println(body);
        return true;
    }

}
