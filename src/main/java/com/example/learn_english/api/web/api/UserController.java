package com.example.learn_english.api.web.api;

import com.example.learn_english.api.web.api.dto.ResponseDTO;
import com.example.learn_english.base.exception.StatusCodeEnum;
import com.example.learn_english.user.application.command.cmd.CreateUserCommand;
import com.example.learn_english.user.application.command.cmd.UpdateUserCommand;
import com.example.learn_english.user.application.command.service.UserCommandService;
import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.application.query.service.UserQryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:14 PM
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户")

public class UserController {
    private final UserQryService userQryService;
    private final UserCommandService userCommandService;

    public UserController(UserQryService userQryService, UserCommandService userCommandService) {
        this.userQryService = userQryService;
        this.userCommandService = userCommandService;
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

    @PostMapping("/add")
    @ApiOperation(value = "添加单个用户", notes = "根据用户ID信息添加")
    public ResponseEntity<ResponseDTO<String>> createUser(@Valid @RequestBody CreateUserCommand userCommand) {
        userCommandService.create(userCommand);
        return ResponseEntity.ok(new ResponseDTO<>(
                StatusCodeEnum.OK.getErrorCode(), StatusCodeEnum.OK.getErrorMessage(), "ok"
        ));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改用户", notes = "根据用户ID信息修改")
    public ResponseEntity<ResponseDTO<String>> updateUser(@Valid @RequestBody UpdateUserCommand userCommand) {
        userCommandService.update(userCommand);
        return ResponseEntity.ok(new ResponseDTO<>(
                StatusCodeEnum.OK.getErrorCode(), StatusCodeEnum.OK.getErrorMessage(), "ok"
        ));
    }


}
