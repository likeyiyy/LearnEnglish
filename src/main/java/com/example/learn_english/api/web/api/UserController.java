package com.example.learn_english.api.web.api;

import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.application.query.service.UserQryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:14 PM
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户")

public class UserController {
    private final UserQryService userQryService;

    public UserController(UserQryService userQryService) {
        this.userQryService = userQryService;
    }

    @ApiOperation("获取所有用户")
    @GetMapping("/all")
    @ResponseBody
    public Iterable<UserDTO> getAllUsers() {
        return userQryService.getAll();
    }

    @GetMapping("/{id}")
    @ApiImplicitParam(name = "id", value = "用户的id", paramType = "path")
    @ApiOperation(value = "获取单个用户", notes = "根据用户ID查询用户的信息")
    @ResponseBody
    public UserDTO getById(@PathVariable("id") Long id) {
        return userQryService.getById(id);
    }


}
