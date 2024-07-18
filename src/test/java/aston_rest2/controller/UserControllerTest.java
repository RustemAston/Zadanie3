//package aston_rest2.controller;
//
//import aston_rest2.dto.UserDTO;
//import aston_rest2.model.User;
//import junit.framework.TestCase;
//
//import aston_rest2.repository.UserDAO;
//import aston_rest2.service.UserService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoSettings;
//import org.mockito.quality.Strictness;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
////@SpringBootApplication
////@WebMvcTest(UserController.class)
////@AutoConfigureMockMvc(addFilters = false)
////@SpringBootConfiguration
////@SpringBootTest(classes = {UserController.class, UserService.class, UserDAO.class})
//@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
//class UserControllerTest {
//
////    @LocalServerPort
////    private int port;
////
////    @Mock
////    private RestTemplate restTemplate;
////
////    @Mock
////    private UserController userController;
////
////    @InjectMocks
////    private UserService userService;
////
////    @InjectMocks
////    private UserDAO userDAO;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private UserService userService;
//
//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void getAllUsers() throws Exception {
//        UserDTO mockUser = new UserDTO("Roma", 20);
//        Mockito.when(userService.getOneUser(1)).thenReturn(mockUser);
//
//        mockMvc.perform(get("/users/1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.nickname").value("Roma"))
//                .andExpect(jsonPath("$.age").value(20));

//        List<UserDTO> list = userController.getAllUsers();
//
//        when(userController.getAllUsers()).thenReturn(list);
//        assertEquals(list, listService);

//        String url = "http://localhost:" + 8080 + "/";
//        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue();
//        assertThat(response.getBody()).isEqualTo("Hello World!");

//    }

//    @Test
//    void getOneUser() throws Exception {
//        mockMvc.perform(get("/user/6"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }

//    @Test
//    void create() {
//    }
//
//    @Test
//    void updateUser() {
//    }
//
//    @Test
//    void deleteUser() {
//    }
//}