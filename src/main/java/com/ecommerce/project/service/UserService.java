package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.project.dto.ResponseDto;
import com.ecommerce.project.dto.SignInDto;
import com.ecommerce.project.dto.SignInResponseDto;
import com.ecommerce.project.entity.AuthenticationToken;
import com.ecommerce.project.entity.User;
import com.ecommerce.project.exceptions.AuthenticationFailException;
import com.ecommerce.project.exceptions.CustomException;
import com.ecommerce.project.repository.UserRepository;

@Service
public class UserService  {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
//	UserRepo userRepo;

	@Autowired
	AuthenticationTokenService authenticationTokenService;

//	@Transactional
	public ResponseDto signUp(User user) {
//		UserRole role=userRepo.findById(null)
//		
//		User user=new User();
//		user.setRoles(role);

		// check if user is already present
		if (Objects.nonNull(userRepository.findByEmail(user.getEmail()))) {
			throw new CustomException("user already present");
		}

		// hash the password
		String encryptedpassword = user.getPassword();
		try {
			encryptedpassword = passwordEncoder.encode(user.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// save the user

//		User user = new User(signupDto.getFirstName(), signupDto.getLastName(), signupDto.getEmail(),
//				encryptedpassword,signupDto.getRoles());
		user.setPassword(encryptedpassword);
		userRepository.save(user);
		System.out.println("     niiii      " + user);
		// create the token

		final AuthenticationToken authenticationToken = new AuthenticationToken(user);
		authenticationTokenService.saveConfirmationToken(authenticationToken);
		ResponseDto responseDto = new ResponseDto("success", "user created successful");
		return responseDto;
	}

//	private String hashPassword(String password) throws NoSuchAlgorithmException {
//		MessageDigest md = MessageDigest.getInstance("MD5");
//		md.update(password.getBytes());
//		byte[] digest = md.digest();
//		String hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
//
//		return hash;
//	}

//==================================== LOGIN ===========================================
	public SignInResponseDto signIn(SignInDto signInDto) {
		// find user by email
		User user = userRepository.findByEmail(signInDto.getEmail());

		if (Objects.isNull(user)) {
			throw new AuthenticationFailException("user is not valid");

		} // else {
			// hash the password
			// if password match
		try {
			if (user.getPassword().equals(passwordEncoder.encode(signInDto.getPassword()))) {
				throw new AuthenticationFailException("Login is successful \n\tWELCOME");
			}
//			} 
		} // finally {

		catch (Exception e) {

			e.printStackTrace();
		}
		// }

		// compose the password in DB

		AuthenticationToken token = authenticationTokenService.getToken(user);

		// retrive the token

		if (Objects.isNull(token.getToken())) {

			throw new CustomException("token is not present");
		}

		return new SignInResponseDto("sucess", token.getToken());

	}



}
