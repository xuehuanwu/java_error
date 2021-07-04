Java Exception：
1、Error
2、Runtime Exception 运行时异常
3、Exception
4、throw 用户自定义异常

异常类分两大类型：Error类代表了编译和系统的错误，不允许捕获；Exception类代表了标准Java库方法所激发的异常。
Exception类还包含运行异常类Runtime_Exception和非运行异常类Non_RuntimeException这两个直接的子类。

Runtime_Exception
运行异常类对应于编译错误，它是指Java程序在运行时产生的由解释器引发的各种异常。
运行异常可能出现在任何地方，且出现频率很高，因此为了避免巨大的系统资源开销，编译器不对异常进行检查。
所以Java语言中的运行异常不一定被捕获。出现运行错误往往表示代码有错误，如：算数异常（如被0除）、下标异常（如数组越界）等。

Non_RuntimeException
非运行异常时Non_RuntimeException类及其子类的实例，又称为可检测异常。
Java编译器利用分析方法或构造方法中可能产生的结果来检测Java程序中是否含有检测异常的处理程序，对于每个可能的可检测异常，
方法或构造方法的throws子句必须列出该异常对应的类。在Java的标准包java.lang java.util 和 java.net 中定义的异常都是非运行异常。

常见的异常类型
算术异常类：ArithmeticExecption
空指针异常类：NullPointerException
类型强制转换异常：ClassCastException
数组负下标异常：NegativeArrayException
数组下标越界异常：ArrayIndexOutOfBoundsException
违背安全原则异常：SecturityException
文件已结束异常：EOFException
文件未找到异常：FileNotFoundException
字符串转换为数字异常：NumberFormatException
操作数据库异常：SQLException
输入输出异常：IOException
方法未找到异常：NoSuchMethodException

异常说明
java.lang.AbstractMethodError
抽象方法错误。当应用试图调用抽象方法时抛出。
java.lang.AssertionError
断言错。用来指示一个断言失败的情况。
java.lang.ClassCircularityError
类循环依赖错误。在初始化一个类时，若检测到类之间循环依赖则抛出该异常。
java.lang.ClassFormatError
类格式错误。当Java虚拟机试图从一个文件中读取Java类，而检测到该文件的内容不符合类的有效格式时抛出。
java.lang.Error
错误。是所有错误的基类，用于标识严重的程序运行问题。这些问题通常描述一些不应被应用程序捕获的反常情况。
java.lang.ExceptionInInitializerError
初始化程序错误。当执行一个类的静态初始化程序的过程中，发生了异常时抛出。静态初始化程序是指直接包含于类中的static语句段。
java.lang.IllegalAccessError
违法访问错误。当一个应用试图访问、修改某个类的域（Field）或者调用其方法，但是又违反域或方法的可见性声明，则抛出该异常。
java.lang.IncompatibleClassChangeError
不兼容的类变化错误。当正在执行的方法所依赖的类定义发生了不兼容的改变时，抛出该异常。一般在修改了应用中的某些类的声明定义而没有对整个应用重新编译而直接运行的情况下，容易引发该错误。
java.lang.InstantiationError
实例化错误。当一个应用试图通过Java的new操作符构造一个抽象类或者接口时抛出该异常.
java.lang.InternalError
内部错误。用于指示Java虚拟机发生了内部错误。
java.lang.LinkageError
链接错误。该错误及其所有子类指示某个类依赖于另外一些类，在该类编译之后，被依赖的类改变了其类定义而没有重新编译所有的类，进而引发错误的情况。
java.lang.NoClassDefFoundError
未找到类定义错误。当Java虚拟机或者类装载器试图实例化某个类，而找不到该类的定义时抛出该错误。
java.lang.NoSuchFieldError
域不存在错误。当应用试图访问或者修改某类的某个域，而该类的定义中没有该域的定义时抛出该错误。
java.lang.NoSuchMethodError
方法不存在错误。当应用试图调用某类的某个方法，而该类的定义中没有该方法的定义时抛出该错误。
java.lang.OutOfMemoryError
内存不足错误。当可用内存不足以让Java虚拟机分配给一个对象时抛出该错误。
java.lang.StackOverflowError
堆栈溢出错误。当一个应用递归调用的层次太深而导致堆栈溢出时抛出该错误。
java.lang.ThreadDeath
线程结束。当调用Thread类的stop方法时抛出该错误，用于指示线程结束。
java.lang.UnknownError
未知错误。用于指示Java虚拟机发生了未知严重错误的情况。
java.lang.UnsatisfiedLinkError
未满足的链接错误。当Java虚拟机未找到某个类的声明为native方法的本机语言定义时抛出。
java.lang.UnsupportedClassVersionError
不支持的类版本错误。当Java虚拟机试图从读取某个类文件，但是发现该文件的主、次版本号不被当前Java虚拟机支持的时候，抛出该错误。
java.lang.VerifyError
验证错误。当验证器检测到某个类文件中存在内部不兼容或者安全问题时抛出该错误。
java.lang.VirtualMachineError
虚拟机错误。用于指示虚拟机被破坏或者继续执行操作所需的资源不足的情况。
java.lang.ArithmeticException
算术条件异常。譬如：整数除零等。
java.lang.ArrayIndexOutOfBoundsException
数组索引越界异常。当对数组的索引值为负数或大于等于数组大小时抛出。
java.lang.ArrayStoreException
数组存储异常。当向数组中存放非数组声明类型对象时抛出。
java.lang.ClassCastException
类造型异常。假设有类A和B（A不是B的父类或子类），O是A的实例，那么当强制将O构造为类B的实例时抛出该异常。该异常经常被称为强制类型转换异常。
java.lang.ClassNotFoundException
找不到类异常。当应用试图根据字符串形式的类名构造类，而在遍历CLASSPAH之后找不到对应名称的class文件时，抛出该异常。
java.lang.CloneNotSupportedException
不支持克隆异常。当没有实现Cloneable接口或者不支持克隆方法时,调用其clone()方法则抛出该异常。
java.lang.EnumConstantNotPresentException
枚举常量不存在异常。当应用试图通过名称和枚举类型访问一个枚举对象，但该枚举对象并不包含常量时，抛出该异常。
java.lang.Exception
根异常。用以描述应用程序希望捕获的情况。
java.lang.IllegalAccessException
违法的访问异常。当应用试图通过反射方式创建某个类的实例、访问该类属性、调用该类方法，而当时又无法访问类的、属性的、方法的或构造方法的定义时抛出该异常。
java.lang.IllegalMonitorStateException
违法的监控状态异常。当某个线程试图等待一个自己并不拥有的对象（O）的监控器或者通知其他线程等待该对象（O）的监控器时，抛出该异常。
java.lang.IllegalStateException
违法的状态异常。当在Java环境和应用尚未处于某个方法的合法调用状态，而调用了该方法时，抛出该异常。
java.lang.IllegalThreadStateException
违法的线程状态异常。当县城尚未处于某个方法的合法调用状态，而调用了该方法时，抛出异常。
java.lang.IndexOutOfBoundsException
索引越界异常。当访问某个序列的索引值小于0或大于等于序列大小时，抛出该异常。
java.lang.InstantiationException
实例化异常。当试图通过newInstance()方法创建某个类的实例，而该类是一个抽象类或接口时，抛出该异常。
java.lang.InterruptedException
被中止异常。当某个线程处于长时间的等待、休眠或其他暂停状态，而此时其他的线程通过Thread的interrupt方法终止该线程时抛出该异常。
java.lang.NegativeArraySizeException
数组大小为负值异常。当使用负数大小值创建数组时抛出该异常。
java.lang.NoSuchFieldException
属性不存在异常。当访问某个类的不存在的属性时抛出该异常。
java.lang.NoSuchMethodException
方法不存在异常。当访问某个类的不存在的方法时抛出该异常。
java.lang.NullPointerException
空指针异常。当应用试图在要求使用对象的地方使用了null时，抛出该异常。譬如：调用null对象的实例方法、访问null对象的属性、计算null对象的长度、使用throw语句抛出null等等。
java.lang.NumberFormatException
数字格式异常。当试图将一个String转换为指定的数字类型，而该字符串确不满足数字类型要求的格式时，抛出该异常。
java.lang.RuntimeException
运行时异常。是所有Java虚拟机正常操作期间可以被抛出的异常的父类。
java.lang.SecurityException
安全异常。由安全管理器抛出，用于指示违反安全情况的异常。
java.lang.StringIndexOutOfBoundsException
字符串索引越界异常。当使用索引值访问某个字符串中的字符，而该索引值小于0或大于等于序列大小时，抛出该异常。
java.lang.TypeNotPresentException
类型不存在异常。当应用试图以某个类型名称的字符串表达方式访问该类型，但是根据给定的名称又找不到该类型是抛出该异常。该异常与ClassNotFoundException的区别在于该异常是unchecked（不被检查）异常，而ClassNotFoundException是checked（被检查）异常。
java.lang.UnsupportedOperationException
不支持的方法异常。指明请求的方法不被支持情况的异常。

异常
javax.servlet.jsp.JspException: Cannot retrieve mapping for action /Login （/Login是你的action名字）
可能原因
action没有再struts-config.xml 中定义，或没有找到匹配的action，例如在JSP文件中使用 <html:form action="Login.do".将表单提交给Login.do处理，如果出现上述异常，请查看struts-config.xml中的定义部分，有时可能是打错了字符或者是某些不符合规则，可以使用strutsconsole工具来检查。
-----------------------------------------------------------------------------------------------------------------
异常
org.apache.jasper.JasperException: Cannot retrieve definition for form bean null
可能原因
这个异常是因为Struts根据struts-config.xml中的mapping没有找到action期望的form bean。大部分的情况可能是因为在form-bean中设置的name属性和action中设置的name属性不匹配所致。换句话说，action和form都应该各自有一个name属性，并且要精确匹配，包括大小写。这个错误当没有name属性和action关联时也会发生，如果没有在action中指定name属性，那么就没有name属性和action相关联。当然当action制作某些控制时，譬如根据参数值跳转到相应的jsp页面，而不是处理表单数据，这是就不用name属性，这也是action的使用方法之一。
-----------------------------------------------------------------------------------------------------------------
异常
No action instance for path /xxxx could be created
可能原因
特别提示：因为有很多中情况会导致这个错误的发生，所以推荐大家调高你的web服务器的日志/调试级别，这样可以从更多的信息中看到潜在的、在试图创建action类时发生的错误，这个action类你已经在struts-config.xml中设置了关联（即添加了<action>标签）。
在struts-config.xml中通过action标签的class属性指定的action类不能被找到有很多种原因，例如：定位编译后的.class文件失败。Failure to place compiled .class file for the action in the classpath (在web开发中，class的的位置在r WEB-INF/classes，所以你的action class必须要在这个目录下。例如你的action类位于WEB-INF/classes/action/Login.class,那么在struts-config.xml中设置action的属性type时就是action.Login).
拼写错误，这个也时有发生，并且不易找到，特别注意第一个字母的大小写和包的名称。
-----------------------------------------------------------------------------------------------------------------
异常
javax.servlet.jsp.JspException: No getter method for property username of bean org.apache.struts.taglib.html.BEAN
可能原因
没有位form bean中的某个变量定义getter 方法
这个错误主要发生在表单提交的FormBean中，用struts标记<html:text property=”username”>时，在FormBean中必须有一个getUsername()方法。注意字母“U”。
-----------------------------------------------------------------------------------------------------------------
异常
java.lang.NoClassDefFoundError: org/apache/struts/action/ActionForm
可能原因
这个错误主要发生在在classpath中找不到相应的Java .class文件。如果这个错误发生在web应用程序的运行时，主要是因为指定的class文件不在web server的classpath中（/WEB-INF/classes 和 /WEB-INF/lib）。在上面的错误中，原因是找不到ActionForm类。
-----------------------------------------------------------------------------------------------------------------
异常
javax.servlet.jsp.JspException: Exception creating bean of class org.apache.struts.action.ActionForm: {1}
可能原因
Instantiating Struts-provided ActionForm class directly instead of instantiating a class derived off ActionForm. This mightoccur implicitly if you specify that a form-bean is this Struts ActionForm class rather than specifying a child of this classfor the form-bean.
Not associating an ActionForm-descended class with an action can also lead to this error.
-----------------------------------------------------------------------------------------------------------------
异常
javax.servlet.jsp.JspException: Cannot find ActionMappings or ActionFormBeans collection
可能原因
不是标识Struts actionServlet的<servlet>标记就是映射.do扩展名的<sevlet-mapping>标记或者两者都没有在web.xml中声明。
在struts-config.xml中的打字或者拼写错误也可导致这个异常的发生。例如缺少一个标记的关闭符号/>。最好使用struts console工具检查一下。
另外，load-on-startup必须在web.xml中声明，这要么是一个空标记，要么指定一个数值，这个数值用来表servlet运行的优先级，数值越大优先级越低。
还有一个和使用load-on-startup有关的是使用Struts预编译JSP文件时也可能导致这个异常。
-----------------------------------------------------------------------------------------------------------------
异常
java.lang.NullPointerException at org.apache.struts.util.RequestUtils.forwardURL(RequestUtils.java:1223)
可能原因
在struts-config.xml中的forward元素缺少path属性。例如应该是如下形式：
<forward name="userhome" path="/user/userhome.jsp"/>
-----------------------------------------------------------------------------------------------------------------
异常
javax.servlet.jsp.JspException: Cannot find bean org.apache.struts.taglib.html.BEAN in any scope
Probable Causes
试图在Struts的form标记外使用form的子元素。这常常发生在你在</html:form>后面使用Struts的html标记。另外要注意可能你不经意使用的无主体的标记，如<html:form … />，这样web 服务器解析时就当作一个无主体的标记，随后使用的所有<html>标记都被认为是在这个标记之外的，如又使用了<html:text property=”id”>还有就是在使用taglib引入HTML标记库时，你使用的prefix的值不是html。
-----------------------------------------------------------------------------------------------------------------
异常
javax.servlet.jsp.JspException: Missing message for key xx.xx.xx
Probable Causes
这个key的值对没有在资源文件ApplicationResources.properties中定义。如果你使用eclipse时经常碰到这样的情况，当项目重新编译时，eclipse会自动将classes目录下的资源文件删除。
资源文件ApplicationResources.properties 不在classpath中应将资源文件放到 WEB-INF/classes 目录下，当然要在struts-config.xml中定义)
-----------------------------------------------------------------------------------------------------------------
异常
Cannot find message resources under key org.apache.struts.action.MESSAGE
可能原因
很显然，这个错误是发生在使用资源文件时，而Struts没有找到资源文件。
Implicitly trying to use message resources that are not available (such as using empty html:options tag instead of specifyingthe options in its body -- this assumes options are specified in ApplicationResources.properties file)
XML parser issues -- too many, too few, incorrect/incompatible versions
-----------------------------------------------------------------------------------------------------------------
异常
Strange and seemingly random characters in HTML and on screen, but not in original JSP or servlet.
可能原因
混和使用Struts的html:form标记和标准的HTML标记不正确。
使用的编码样式在本页中不支持。
-----------------------------------------------------------------------------------------------------------------
异常
"Document contained no data" in Netscape
No data rendered (completely empty) page in Microsoft Internet Explorer
可能原因
使用一个Action的派生类而没有实现perform()方法或execute()方法。在Struts1.0中实现的是perform()方法，在Struts1.1中实现的是execute()方法，但Struts1.1向后兼容perform()方法。但你使用Struts1.1创建一个Action的派生类，并且实现了execute()方法，而你在Struts1.0中运行的话，就会得到"Document contained nodata" error message in Netscape or a completely empty (no HTML whatsoever) page rendered in Microsoft Internet Explorer.”的错误信息。
---------------------------------------------------------------------------------------------------------------------------
异常
ServletException: BeanUtils.populate
解决方案
在用Struts上传文件时,遇到了javax.servlet.ServletException: BeanUtils.populate异常。
我的ActionServlet并没有用到BeanUtils这些工具类。后来仔细检查代码发现是在jsp文件里的form忘了加enctype="multipart/form-data" 了。所以写程序遇到错误或异常应该从多方面考虑问题存在的可能性，想到系统提示信息以外的东西。
1. 定义Action后, 如果指定了name, 那么必须要定义一个与它同名的FormBean才能进行form映射.2. 如果定义Action后, 提交页面时出现 "No input attribute for mapping path..." 错误, 则需要在其input属性中定义转向的页面.3. 如果插入新的数据时出现 "Batch update row count wrong:..." 错误, 则说明XXX.hbm.xml中指定的key的类型为原始类型(int, long),因为这种类型会自动分配值, 而这个值往往会让系统认为已经存在该记录, 正确的方法是使用java.lang.Integer或java.lang.Long对象.4. 如果插入数据时出现 "argument type mismatch" 错误, 可能是你使用了Date等特殊对象, 因为struts不能自动从String型转换成Date型,所以, 你需要在Action中手动把String型转换成Date型.5. Hibernate中, Query的iterator()比list()方法快很多.6. 如果出现 "equal symbol expected" 错误, 说明你的strtus标签中包含另一个标签或者变量, 例如:
   <html:select property="test" onchange="<%=test%>"/>
   或者
   <html:hidden property="test" value="<bean:write name="t" property="p"/>"/>
   这样的情况...
---------------------------------------------------------------------------------------------------------------------------
错误：Exception in thread "main" org.hibernate.exception.SQLGrammarException: Could not execute JDBC batch update
原因与解决： 因为Hibernate Tools（或者Eclipse本身的Database Explorer）生成*.hbn.xml工具中包含有catalog="***"（*表示数据库名称）这样的属性,将该属性删除就可以了
---------------------------------------------------------------------------------------------------------------------------
错误：org.hibernate.ObjectDeletedException: deleted object would be re-saved by cascade (remove deleted object from associations)
原因与解决：
方法1 删除Set方的cascade
方法2 解决关联关系后，再删除
方法3 在many-to-one方增加cascade 但值不能是none
最后一招：
检查一下hashCode equals是否使用了id作为唯一标示的选项了；我用uuid.hex时是没有问题的；但是用了native，就不行了，怎么办？删除啊！
----------------------------------------------------------------------------------------------------------------------------
问题：今天用Tomcat 5.5.12，发现原来很好用的系统不能用了，反复测试发现页面中不能包含 taglib，否则会出现以下提示：HTTP Status 500 -type Exception reportMessage description The server encountered an internal error () that prevented it from fulfilling this request.exceptionorg.apache.jasper.JasperException: /index.jsp(1,1) Unable to read TLD "META-INF/tlds/struts-bean.tld" from JAR file"file:*****/WEB-INF/lib/struts.jar":原因：更新了工程用的lib文件夹下的jar，发布时也发布了servlet.jar和jsp-api.jar。解决：把jsp-api.jar删除就解决这个问题了。-----------------------------------------------------------------------------------------------------------------------------
错误： java.lang.NullPointerException
原因： 发现 dao 实例、 manage 实例等需要注入的东西没有被注入（俗称空指针异常）解决：这个时候，你应该查看日志文件；默认是应用服务器的 log 文件，比如 Tomcat 就是 [Tomcat 安装目录 ]/logs ；你会发现提示你：可能是：org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sf' defined in ServletContextresource [/WEB-INF/applicationContext.xml]: Initialization of bean failed; nested exception isorg.hibernate.HibernateException: could not configure from URL: file:src/hibernate.cfg.xmlorg.hibernate.HibernateException: could not configure from URL: file:src/hibernate.cfg.xml……………………….Caused by: java.io.FileNotFoundException: src\hibernate.cfg.xml可能是：org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sessionFactory' defined inServletContext resource [/WEB-INF/applicationContext.xml]: Initialization of bean failed; nested exception isorg.hibernate.MappingException: Resource: com/mcc/coupon/model/UserRole.hbm.xml not foundorg.hibernate.MappingException: Resource: com/mcc/coupon/model/UserRole.hbm.xml not found然后你就知道原因是因为配置文件的解析出了错误，这个通过 Web 页面是看不出来的。更多的是持久化影射文件出的错误；导致了没有被解析；当然你需要的功能就无法使用了。
----------------------------------------------------------------------------------------------------------------------------
错误：StandardWrapperValve[action]: Servlet.service() for servlet action threw exception
javax.servlet.jsp.JspException: Cannot retrieve mapping for action /settlementTypeManage
或者： type Status report message Servlet action is not available description The requested resource (Servlet action is not available) is not available.
原因： 同 上
----------------------------------------------------------------------------------------------------------------------------
错误StandardWrapperValve[jsp]: Servlet.service() for servlet jsp threw exceptionjava.lang.ClassNotFoundException: org.apache.struts.taglib.bean.CookieTei界面错误具体描述：
org.apache.jasper.JasperException: Failed to load or instantiate TagExtraInfo class: org.apache.struts.taglib.bean.CookieTei
原因与解决： <方案一>你的“html:”开头的标签没有放在一个<html:form>中 <方案二>重新启动你的应用服务器，自动就没有这个问题