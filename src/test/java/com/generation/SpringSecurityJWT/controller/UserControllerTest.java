package com.generation.SpringSecurityJWT.controller;

import com.generation.SpringSecurityJWT.model.Post;
import com.generation.SpringSecurityJWT.model.User;
import com.generation.SpringSecurityJWT.service.PostService;
import com.generation.SpringSecurityJWT.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

import static javax.print.attribute.TextSyntax.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserControllerTest {
    @Test
    @DisplayName("Pruebas UserController")
    void postSaveTest(){
        PostService postService = mock(PostService.class);
        PostController postController = new PostController(postService);

        User user = new User ();
        user.setId(1L);
        user.setName("Mr mockito");
        user.setName("Nombrecompleto");
        user.setPassword("111111");


        UserService userService;
        when(userService.getUser(1L)).thenReturn(user);
        UserController userController;
        User result = userController.getUser(1L);

        verify(userService.getUser(1L)).thenReturn(user);
        User result = userController.getUser(1L);
        assertEquals(user.getName(),result.getName());


    }

    private OngoingStubbing<User> verify(User user) {
    }


}