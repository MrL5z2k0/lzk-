# 常用注解学习
1. @Bean：容器中注册组件
2. @Primary：同类组件如果有多个，标注主组件
3. @DependsOn：组件之间声明依赖关系
4. @Lazy：组件懒加载（最后使用的时候才创建）
5. @Scope：声明组件的作用范围(SCOPE_PROTOTYPE,SCOPE_SINGLETON)
6. @Configuration：声明这是一个配置类，替换以前配置文件
7. @Component：@Controller、@Service、@Repository
8. @Indexed：加速注解，所有标注了 @Indexed 的组件，直接会启动快速加载
9. @Order：数字越小优先级越高，越先工作
10. @ComponentScan：包扫描
11. @Conditional：条件注入
12. @Import：导入第三方jar包中的组件，或定制批量导入组件逻辑
13. @ImportResource：导入以前的xml配置文件，让其生效
14. @Profile：基于多环境激活
15. @PropertySource：外部properties配置文件和JavaBean进行绑定.结合ConfigurationProperties
16. @PropertySources：@PropertySource组合注解
17. @Autowired：自动装配
18. @Qualifier：精确指定
19. @Value：取值、计算机环境变量、JVM系统。xxxx。@Value(“${xx}”)
20. @Lookup：单例组件依赖非单例组件，非单例组件获取需要使用方法

注：@Indexed 需要引入依赖
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-context-indexer</artifactId>
	<optional>true</optional>
</dependency>

## spring 读取注解的两种方式
### 1、通过beans.xml

