com.taotao是要生成类存放的包
com.generator
	GeneratorSqlmap.java运行main方法生成代码
	MyCommentGenerator.java是自定义comment生成器，用来生成pojo类属性注释
generatorConfig.xml生成代码配置
db文件中存放所有的pdm文件和sql文件
generator 逆向工程配置使用办法
	修改数据库连接的信息：驱动类、连接地址、用户名、密码
	修改生成PO类、mapper映射文件、mapper接口的位置
	修改指定数据库要生成的表名
	运行GeneratorSqlmap.java的main方法