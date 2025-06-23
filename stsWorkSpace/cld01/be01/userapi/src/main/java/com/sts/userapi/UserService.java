package com.sts.userapi;

import org.springframework.stereotype.Service;

import com.sts.userapi.model.UserRepo;
import com.sts.userapi.model.UserVo;
import com.sts.userapi.model.entity.User;

import lombok.RequiredArgsConstructor;
import java.security.MessageDigest; //암호 encoding 용
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    // @Value
    String alg ="SHA-256"; 
    String key = "mykey";
    public UserVo add(UserVo bean){
        //해시 알고리즘을 통한 비밀번호 유추를 막기 위해 
        //unique한 값인 다른 컬럼과 합쳐서 암호화를 한다 
        String pw = bean.getName()+key+bean.getPw();
        try {
            MessageDigest md = MessageDigest.getInstance(alg);
            md.update(pw.getBytes());
            pw=Base64.getUrlEncoder().encodeToString(md.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        User user = User.builder()
                    .num(bean.getNum())
                    .name(bean.getName())
                    .pw(pw)
                    .email(bean.getEmail())
                    .build();
        return userRepo.save(user).Vobuild();
    }

    public Optional<UserVo> sign(UserVo bean){
        String pw=bean.getName()+key+bean.getPw();
        try {
            MessageDigest md=MessageDigest.getInstance(alg);
            md.update(pw.getBytes());
            pw=Base64.getUrlEncoder().encodeToString(md.digest());
            Optional<User> opt=userRepo.findByNameAndPw(bean.getName(),pw);
            return Optional.of(opt.get().Vobuild());
        } catch (NoSuchAlgorithmException e) {
            return Optional.empty();
        }
    }

    public void deleteOne(String name){
        userRepo.delete(userRepo.findByName(name));
    }
}
