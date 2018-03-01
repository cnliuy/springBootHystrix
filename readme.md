## 断路器 Demo

 git地址: https://github.com/cnliuy/springBootHystrix.git  
 
>  spring boot 调整改为  spring cloud 项目，简单实现 断路器设置  
>     改动处 标注了"c 1" 或  "code change 2" 等字样，仅供参考。  
  
HelloController的hello()方法的设置，' @HystrixCommand(fallbackMethod = "error" ' ,    
表明降级服务fallback是对应的函数是 "error() ",且 error()的参数需要与其对应的方法一样.   

即      public Object hello(HttpServletRequest request) { 。。。}  
对应  	public Object error(HttpServletRequest request) { 。。。}  //降级处理
。  