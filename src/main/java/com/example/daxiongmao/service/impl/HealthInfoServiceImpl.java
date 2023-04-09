package com.example.daxiongmao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.daxiongmao.domain.HealthInfo;
import com.example.daxiongmao.service.HealthInfoService;
import com.example.daxiongmao.mapper.HealthInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 86186
* @description 针对表【health_info】的数据库操作Service实现
* @createDate 2023-04-09 23:04:54
*/
@Service
public class HealthInfoServiceImpl extends ServiceImpl<HealthInfoMapper, HealthInfo>
    implements HealthInfoService{

}




