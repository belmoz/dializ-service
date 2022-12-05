package belmoz.dializ.accounting.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import belmoz.dializ.accounting.dto.RolesResponseDto;
import belmoz.dializ.accounting.dto.UserAccountResponseDto;
import belmoz.dializ.accounting.dto.UserRegisterDto;
import belmoz.dializ.accounting.dto.UserUpdateDto;
import belmoz.dializ.accounting.service.UserAccountService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class UserAccountController {
	
	final UserAccountService accountService;
	
	@PostMapping("/register")
	public UserAccountResponseDto register(@RequestBody UserRegisterDto userRegisterDto) {
		return accountService.addUser(userRegisterDto);
	}
	
	@PostMapping("/login")
	public UserAccountResponseDto login(Principal principal) {
		return accountService.getUser(principal.getName());
	}
	
	@DeleteMapping("/user/{user}")
	public UserAccountResponseDto deleteUser(@PathVariable("user") String login) {
		return accountService.removeUser(login);
	}
	
	@PutMapping("/user/{user}")
	public UserAccountResponseDto updateUser(@PathVariable("user") String login, @RequestBody UserUpdateDto userUpdateDto) {
		return accountService.editUser(login, userUpdateDto);
	}
	
	@PutMapping("/user/{user}/role/{role}")
	public RolesResponseDto addRole(@PathVariable("user") String login, @PathVariable String role) {
		return accountService.changeRolesList(login, role, true);
	}
	
	@DeleteMapping("/user/{user}/role/{role}")
	public RolesResponseDto removeRole(@PathVariable("user") String login, @PathVariable String role) {
		return accountService.changeRolesList(login, role, false);
	}
	
	@PutMapping("/password")
	public void changePassword(Principal principal, @RequestHeader("X-Password") String newPassword) {
		accountService.changePassword(principal.getName(), newPassword);
	}
	
}
