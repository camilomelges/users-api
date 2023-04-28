package com.camilomelges.usersapi;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Data
@RestController(value = "users")
@RequestMapping("users")
public class UserController {

    @GetMapping
    public List<String> getAll() {
        return List.of("1", "2", "3", "4");
    }

    @GetMapping("{id}")
    public String getById(@PathVariable("id") final String id) {
        return id;
    }

    @PostMapping("post")
    public Map<String, String> post(@RequestBody final Map<String, String> user) {
        user.put("id", RandomStringUtils.randomAlphabetic(1));
        return user;
    }

    @PutMapping("/put")
    public Map<String, String> put(@RequestBody Map<String, String> user) {
        user.put("id", RandomStringUtils.randomAlphabetic(1));
        return user;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable final String id) {
        return "the id " + " was deleted!";
    }
}