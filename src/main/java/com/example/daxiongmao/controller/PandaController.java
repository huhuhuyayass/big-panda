package com.example.daxiongmao.controller;

import com.example.daxiongmao.domain.BasicInfo;
import com.example.daxiongmao.domain.R;
import com.example.daxiongmao.service.BasicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/info")
@Api(tags = "增删改查接口")
public class PandaController {

        @Autowired
        private BasicInfoService basicInfoService;

        /**
         * 查询熊猫信息列表
         */
        @ApiOperation("查询熊猫信息列表")
        @GetMapping("/list")
        public R<List> list()
        {

            List<BasicInfo> list = basicInfoService.list();
            return R.success(list);
        }

        /**
         * 获取熊猫信息详细信息
         */
        @ApiOperation("获取熊猫信息详细信息")
        @GetMapping(value = "/{number}")
        public R getInfo(@PathVariable("number") Long number)
        {
            return R.success(basicInfoService.getById(number));
        }

        /**
         * 新增熊猫信息
         */
        @ApiOperation("新增熊猫信息")
        @PostMapping
        public R add(@RequestBody BasicInfo basicInfo)
        {
            boolean save = basicInfoService.save(basicInfo);
            if(save==true) {
                return R.success("添加成功");
            }else {
                return R.error("添加失败");
            }
        }

        /**
         * 修改熊猫信息
         */
        @ApiOperation("修改熊猫信息")
        @PutMapping
        public R edit(@RequestBody BasicInfo basicInfo)
        {
            basicInfoService.updateById(basicInfo);
            return R.success("修改成功");
        }

        /**
         * 删除熊猫信息
         */
        @ApiOperation("删除熊猫信息")
        @DeleteMapping("/{numbers}")
        public R remove(@PathVariable Long[] numbers)

        {

            basicInfoService.removeById(numbers);
            return R.success("删除成功");
        }
}


