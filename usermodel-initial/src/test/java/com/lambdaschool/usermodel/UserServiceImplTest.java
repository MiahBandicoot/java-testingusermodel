package com.lambdaschool.usermodel;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplication.class)
@FixMethodOrder(MethodSorters.Name_Ascending)
public class UserServiceImplTest {
    @Autowired
    UserService userService
    @org.junit.Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void findUserById() {
        assertEquals(UserService,findUserById());
    }

    @org.junit.Test
    public void findByNameContaining() {
    }

    @org.junit.Test
    public void findAll() {
    }

    @org.junit.Test
    public void delete() {
    }

    @org.junit.Test
    public void findByName() {
    }

    @org.junit.Test
    public void save() {
    }

    @org.junit.Test
    public void update() {
    }

    @org.junit.Test
    public void deleteAll() {
    }
}