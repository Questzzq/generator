package com.vi.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        // 数据库配置(DataSourceConfig)
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/seckill?useUnicode=true" +
                                "&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                        "root", "Vivian")
                // 全局配置(GlobalConfig)
                // 如果是mysql 8，必须加上时区
                .globalConfig(builder -> {
                    builder.author("Eric Tseng") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .dateType(DateType.ONLY_DATE) // 日期格式，采用Date
                            .disableOpenDir() // 生成完成之后不用打开文件路径
                            .outputDir(path + "/src/main/java"); // 指定输出目录
                })
                // 包配置(PackageConfig)
                .packageConfig(builder -> {
                    builder.parent("com.vi.seckill") // 设置父包名
                            .mapper("mapper")
                            .entity("pojo")
                            .controller("controller")
                            .service("service")
                            .serviceImpl("service.impl")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,
                                    path + "/src/main/resources/mapper")); // 设置mapperXml生成路径;
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_goods", "t_order", "t_seckill_goods", "t_seckill_order") // 配置要生成的表名，可传入一个List
                            .addTablePrefix("t_") // 过滤表名前缀
                            .serviceBuilder()
                            .formatServiceFileName("%sService") // service类名，%s适配，根据表名替换
                            .formatServiceImplFileName("%sServiceImpl") // 同上
                            .entityBuilder()
                            .enableLombok() // 开启Lombok注解
                            .logicDeleteColumnName("deleted") // 说明删除逻辑是哪个字段，表没有的就不会在pojo体现
                            .enableTableFieldAnnotation() // 属性加上说明注解
                            .controllerBuilder()
                            .formatFileName("%sController")
                            .enableRestStyle() // 开启RestController
                            .mapperBuilder()
                            .enableBaseResultMap()  //生成通用的resultMap
                            .superClass(BaseMapper.class) // 继承哪个父类
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation() // 开启@Mapper注解
                            .formatXmlFileName("%sMapper"); // xml名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
