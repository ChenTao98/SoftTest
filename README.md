# SoftTest<br>


项目结构<br>
=
主体操作都是在main文件夹下完成<br>
main/java文件夹下有dao、entity、service、controller
=
dao是数据库操作接口类，对应的mapper在main/resource/mapper下<br>
entity是实体类，每张表格都有一个对应的实体类<br>
service是进行数据库操作的类，数据库操作都在下面的service完成<br>
controller是接收前端请求，调用service进行处理数据并返回的控制类<br>

main/resource文件夹<br>
=
mapper是对应dao的xml文件，数据库操作语句都在其中<br>
static用于存放入js、css等文件<br>
templates用于存放html文件<br>

初始测试<br>
=
项目已经有一个很简陋的初始小测试，testUser，其结构如上所示<br>
启动项目后，在浏览器输入<br>
http://localhost:8080/test/user?id=xxx<br>
测试<br>
