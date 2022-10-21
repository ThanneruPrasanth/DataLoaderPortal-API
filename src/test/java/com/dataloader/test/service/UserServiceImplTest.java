//package com.dataloader.test.service;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import java.util.Date;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.dataloader.model.UserModel;
//import com.dataloader.repository.UserRepository;
//import com.dataloader.service.UserService;
//import com.dataloader.service.impl.UserServiceImpl;
//
//@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
//public class UserServiceImplTest {
//
//	@Mock
//	UserRepository userRepository;
//	
//
//	@InjectMocks
//	private UserService userService=new UserServiceImpl();
//	
//	@Mock
//	private PasswordEncoder passwordEncoder;
//	
//	
//	UserModel userModel;
//	
//	@Before
//	public void setUp() {
//		//userService = new UserServiceImpl();
//		userModel =new UserModel(1,"prasanth@gmail.com","Prasanth@123","admin",new Date());
//			
//	}
//	@Test
//	public void saveUserTest() {
//		when(userRepository.save(any())).thenReturn(userModel);
//		String response=userService.saveUser(userModel);
//		assertEquals("User Saved Successfully with id:"+ 1, response);
//		
//	}
//	@Test
//	public void getUserWithUserNameTest() {
//		String username="Ravi";		
//		when(userRepository.findByUsername(username)).thenReturn(userModel);
//		UserModel response=userService.getUserWithUserName(username);
//		assertEquals(userModel, response);
//		
//	}
//	
//}
