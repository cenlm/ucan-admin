package test;

import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.JWTVerifier;

/**
 * @author liming.cen
 * @date 2022年12月23日 下午9:47:07
 */
public class Test {

    public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//	IUserService service = (IUserService) context.getBean(IUserService.class);
//	User user = new User();
//	user.setUserId(UUIDUtil.getUuid());
//	user.setUserName("Bob");
//	user.setPassword(EncryptionUtil.sha256Encode("123456"));
//	user.setEmail("bob@qq.com");
//	user.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//	service.insert(user);
//	service.deleteById("0511418305b742a39cf7108b4ffd8b47");
//	IRoleService service = (IRoleService) context.getBean(IRoleService.class);
//	Role role=new Role();
//	role.setRoleId(UUIDUtil.getUuid());
//	role.setParentId("14643694fd664e7094c5a40dcf3a6f12");
//	role.setLevel(1);
//	role.setRoleName("辅助");
//	role.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//	service.insert(role);
//	IPermissionService service = (IPermissionService) context.getBean(IPermissionService.class);
//	Permission permission = new Permission();
//	permission.setPermissionId(UUIDUtil.getUuid());
//	permission.setPermissionName("中单");
//	permission.setParentId("91197acaf58643cdabe8951eb5da2718");
//	permission.setLevel(1);
//	permission.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//	service.insert(permission);
//	IUserRoleService service = (IUserRoleService) context.getBean(IUserRoleService.class);
//	UserRole ur = new UserRole();
//	ur.setUserId("19064c0f17724a4c88859c05a3a25313");
//	ur.setRoleId("d900442a0d1745148b48598b1f851540");
//	service.insert(ur);
//	List<UserRole> roles = service.queryRolesByUserId("f826f40d46dd4547b06c7a607f83df90");
//	List<UserRole> rolesDetails = service.queryByPage("f826f40d46dd4547b06c7a607f83df90");
//	IRolePermissionService rps = context.getBean(IRolePermissionService.class);
//	RolePermission rr = new RolePermission();
//	rr.setRoleId("ec4b2c7adb934c0098e1c57cb55e9acf");
//	rr.setPermissionId("9c894c0ac6dc47179275ffa725cf1f10");
//	rps.insert(rr);

//	IOrganizationService service = (IOrganizationService) context.getBean(IOrganizationService.class);
//	Organization org=new Organization();
//	org.setOrgId(UUIDUtil.getUuid());
//	org.setOrgName("深圳分公司研发部");
//	org.setOrgType("3");
//	org.setOrgCode("DPT_DEV_SZ");
//	org.setParentId("ce02693b795b4cd68cef0f399f3d42bb");
//	org.setLevel(3);
//	service.addOrganization(org);

//	IPostService service = (IPostService) context.getBean(IPostService.class);
//	Post post=new Post();
//	post.setPostId(UUIDUtil.getUuid());
//	post.setPostName("销售");
//	post.setPostCode("DPT_DEV_GZ_SALES");
//	post.setParentId("-1");
//	post.setOrgId("599f275540ad40f78b8d1f16fc01669d");
//	service.addPost(post);
//	User user1 = new User();
//	User user2 = new User();
//	User user3 = new User();
//	user1.setUserName("张三");
//	user1.setUserId("1");
//	user1.setEmail("cenliming@qq.com");
//	user1.setPassword("123456");
//	user1.setIsEnable(1);
//	user2.setUserName("李四");
//	user2.setUserId("2");
//	user3.setUserName("王五");
//	user3.setUserId("3");
//	List<User> list = new ArrayList<>();
//	list.add(user1);
//	list.add(user2);
//	list.add(user3);
//	
//	String json = JSON.toJSONString(Response.success());
//	System.out.println(json);
//	String json1 = JSON.toJSONString(Response.fail());
//	System.out.println(json1);
//	String json2 = JSON.toJSONString(Response.respose(MsgEnum.SUCCESS, list));
//	System.out.println(json2);
//	String json3 = JSON.toJSONString(Response.respose(MsgEnum.SUCCESS, user1));
//	System.out.println(json3);
//	System.out.println("b09cddc4c2929b60e0dc3cb916b7eba953f66ee7d9ffd2c21b1e3d7aff7b2793".length());

//	List<String> list1 = new ArrayList<String>();
//	list1.add("1");
//	list1.add("2");
//	list1.add("3");
//	list1.add("5");
//	list1.add("6");
//
//	List<String> list2 = new ArrayList<String>();
//	list2.add("2");
//	list2.add("3");
//	list2.add("7");
//	list2.add("8");
//
//	// 交集
//	List<String> intersection = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
//	System.out.println("---交集 intersection---");
//	intersection.parallelStream().forEach(System.out::println);
//
//	// 差集 (list1 - list2)
//	List<String> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
//	System.out.println("---差集 reduce1 (list1 - list2)---");
//	reduce1.parallelStream().forEach(System.out::println);
//	System.out.println(msg() + "1111");
//    }
//
//    public static String msg() {
//	String msg = "";
//	try {
//	    System.out.println("结果：" + Test.calculate(0, 1));
//	} catch (CustomException e) {
//	    System.out.println("这是捕获到的异常信息：" + e.getMessage());
//	    msg = e.getMessage();
//	    e.printStackTrace();
//	}
//	return msg;
//    }
//
//    public static int calculate(int a, int b) throws CustomException {
//	int result = a - b;
//	if (result < 0) {
//	    throw new CustomException("计算出错！");
//	}
//	return result;
//    }  

	Test test = new Test();
//	System.out.println(test.getToken());
	test.verifyToken(
		"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1Y2FuLWFkbWluIiwiYXVkIjoidWNhbi1hZG1pbi1hcHAiLCJpc3MiOiJhdXRoMCJ9.f9C86NoKVejClvx9Ttmp6TNOv9MYAChUQsTTz-mOQgp");
	String str="1";
	System.out.println(str.length());
    }

    public String getToken() {
	Map<String, Object> header = new HashMap<>();
	header.put("alg", "HS256");
	header.put("typ", "JWT");
	Algorithm algorithm = Algorithm.HMAC256("root");
	String token = JWT.create().withHeader(header).withIssuer("auth0").withSubject("ucan-admin")
		.withAudience("ucan-admin-app").sign(algorithm);
	return token;
    }

    public void verifyToken(String token) {
	Algorithm algorithm = Algorithm.HMAC256("root");
	Map<String, Object> header = new HashMap<>();
	header.put("alg", "HS256");
	header.put("typ", "JWT");
	JWTVerifier verifier = JWT.require(algorithm).withIssuer("auth0").withSubject("ucan-admin")
		.withAudience("ucan-admin-app").build();
	verifier.verify(token);
    }

}
