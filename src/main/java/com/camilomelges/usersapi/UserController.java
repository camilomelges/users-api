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
      return List.of("1","2","3","4");
  }

  @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") final String id) {
        return id;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Map<String, String> post(@RequestBody final Map<String, String> user) {
        user.put("id", RandomStringUtils.randomAlphabetic(1));
        return user;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String, String> put(@RequestBody final Map<String, String> user) {
        return user;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable final String id) {
        return "The id: " + id + " was deleted!";
    }
}
