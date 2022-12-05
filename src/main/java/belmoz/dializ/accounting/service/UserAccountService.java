package belmoz.dializ.accounting.service;

import belmoz.dializ.accounting.dto.RolesResponseDto;
import belmoz.dializ.accounting.dto.UserAccountResponseDto;
import belmoz.dializ.accounting.dto.UserRegisterDto;
import belmoz.dializ.accounting.dto.UserUpdateDto;

public interface UserAccountService {
	UserAccountResponseDto addUser(UserRegisterDto userRegisterDto);
	
	UserAccountResponseDto getUser(String login);
	
	UserAccountResponseDto removeUser(String login);
	
	UserAccountResponseDto editUser(String login, UserUpdateDto userUpdateDto);
	
	RolesResponseDto changeRolesList(String login, String role, boolean isAddRole);
	
	void changePassword(String login, String newPassword);
	
}
