package com.example.msfeignpractice.service;

import com.example.msfeignpractice.dto.UserDTO;
import com.example.msfeignpractice.feign.UserFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserFeignClient userFeignClient;

    public List<UserDTO> getUsers(){
        return userFeignClient.getUsers();
    }

    public void saveUser(UserDTO user){
        userFeignClient.saveUser(user);
    }

    public void updateUser(Integer id, UserDTO user){
        userFeignClient.updateUser(id, user);
    }

    public void deleteUser(Integer id){
        userFeignClient.deleteUser(id);
    }
}
