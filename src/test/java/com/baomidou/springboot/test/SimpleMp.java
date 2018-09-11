package com.baomidou.springboot.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.ITypeConvert;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * mybatis-plus 自动生成代码
 *
 * @author Terry
 * @version 1.0
 * @date 2018-05-16 09:35
 */
public class SimpleMp {
    String PROJECT_NAME = "zuber";
    String PACKAGENAME = "im.zuber.server";

    public void generateCode() {
        //指定包名
        //user -> UserService, 设置成true: user -> IUserService
        boolean serviceNameStartWithI = true;
        //指定生成的表名
        String[] tableNames = new String[]
                {
                        "appaction", "appdevice", "appevent",
                        "appinfo", "deviceinfo", "event",
                        "exceptioninfo", "page"
                };
        generateByTables(serviceNameStartWithI, PACKAGENAME, tableNames);
    }

    public static void main(String[] args) {
        new SimpleMp().generateCode();
    }

    /**
     * 根据表自动生成
     *
     * @param serviceNameStartWithI 默认为false
     * @param packageName           包名
     * @param tableNames            表名
     * @author Terry
     */
    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        //配置数据源
        DataSourceConfig dataSourceConfig = getDataSourceConfig();
        // 策略配置
        StrategyConfig strategyConfig = getStrategyConfig(tableNames);
        //全局变量配置
        GlobalConfig globalConfig = getGlobalConfig(serviceNameStartWithI);
        //包名配置
        PackageConfig packageConfig = getPackageConfig(packageName);
        //自动生成
        atuoGenerator(dataSourceConfig, strategyConfig, globalConfig, packageConfig);
    }

    /**
     * 集成
     *
     * @param dataSourceConfig 配置数据源
     * @param strategyConfig   策略配置
     * @param config           全局变量配置
     * @param packageConfig    包名配置
     * @author Terry
     */
    private void atuoGenerator(DataSourceConfig dataSourceConfig, StrategyConfig strategyConfig, GlobalConfig config, PackageConfig packageConfig) {
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .setTemplate(getTemplate())
                .execute();
    }

    private TemplateConfig getTemplate() {
        return new TemplateConfig()
                .setController("/mytemplates/controller.java.vm")
                .setService("/mytemplates/service.java.vm")
                .setServiceImpl("/mytemplates/serviceImpl.java.vm")
                .setEntity("/mytemplates/entity.java.vm")
                .setMapper("/mytemplates/mapper.java.vm")
                .setXml("/mytemplates/mapper.xml.vm");
    }

    /**
     * 设置包名
     *
     * @param packageName 父路径包名
     * @return PackageConfig 包名配置
     * @author Terry
     */
    private PackageConfig getPackageConfig(String packageName) {
        return new PackageConfig()
                .setParent(packageName)
                .setXml("mapper")
                .setMapper("dao")
                .setController("controller")
                .setEntity("entity");
    }

    /**
     * 全局配置
     *
     * @param serviceNameStartWithI false
     * @return GlobalConfig
     * @author Terry
     */
    private GlobalConfig getGlobalConfig(boolean serviceNameStartWithI) {
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig
                .setBaseColumnList(true)
                .setBaseResultMap(true)
                .setActiveRecord(false)
                .setAuthor("yandeqing")
                //设置输出路径
                .setOutputDir(getOutputDir(PROJECT_NAME))
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            //设置service名
            globalConfig.setServiceName("%sService");
        }
        return globalConfig;
    }

    /**
     * 返回项目路径
     *
     * @param projectName 项目名
     * @return 项目路径
     * @author Terry
     */
    private String getOutputDir(String projectName) {
        String path = this.getClass().getClassLoader().getResource("").getPath();
        int index = path.indexOf(projectName);
        return path.substring(1, index) + projectName + "/src/main/java/";
    }

    /**
     * 策略配置
     *
     * @param tableNames 表名
     * @return StrategyConfig
     * @author Terry
     */
    private StrategyConfig getStrategyConfig(String... tableNames) {
        return new StrategyConfig()
                // 全局大写命名 ORACLE 注意
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                // 表名、字段名、是否使用下划线命名（默认 false）
                .setDbColumnUnderline(true)
                .entityTableFieldAnnotationEnable(true)//是否生成实体时，生成字段注解
                //从数据库表到文件的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                //需要生成的的表名，多个表名传数组
                .setSuperControllerClass(PACKAGENAME + ".base.BaseController")
                .setSuperMapperClass(PACKAGENAME + ".base.SuperMapper")
                .setSuperEntityClass(PACKAGENAME + ".base.BaseBean")
                .setInclude(tableNames);
    }

    /**
     * 配置数据源
     *
     * @return 数据源配置 DataSourceConfig
     * @author Terry
     */
    private DataSourceConfig getDataSourceConfig() {
        return new DataSourceConfig().setDbType(DbType.MYSQL)
                .setUrl("jdbc:mysql://127.0.0.1:3306/zuber_log?characterEncoding=utf8")
                .setUsername("root")
                .setPassword("123456")
                .setTypeConvert(new ITypeConvert() {
                    @Override
                    public DbColumnType processTypeConvert(GlobalConfig globalConfig, String s) {
                        String t = s.toUpperCase();
                        if (t.contains("CHAR")) {
                            return DbColumnType.STRING;
                        } else if (t.contains("DATE") || t.contains("TIMESTAMP")) {
                            return DbColumnType.DATE;
                        } else if (t.contains("NUMBER")) {
                            if (t.matches("NUMBER\\(+\\d\\)")) {
                                return DbColumnType.INTEGER;
                            } else if (t.matches("NUMBER\\(+\\d{2}+\\)")) {
                                return DbColumnType.LONG;
                            }
                            return DbColumnType.INTEGER;
                        } else if (t.contains("FLOAT")) {
                            return DbColumnType.FLOAT;
                        } else if (t.contains("clob")) {
                            return DbColumnType.CLOB;
                        } else if (t.contains("BLOB")) {
                            return DbColumnType.OBJECT;
                        } else if (t.contains("binary")) {
                            return DbColumnType.BYTE_ARRAY;
                        } else if (t.contains("RAW")) {
                            return DbColumnType.BYTE_ARRAY;
                        }
                        return DbColumnType.STRING;
                    }
                })
                .setDriverName("com.mysql.jdbc.Driver");
    }

    /**
     * 根据表自动生成
     *
     * @param packageName 包名
     * @param tableNames  表名
     * @author Terry
     */
    @SuppressWarnings("unused")
    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}