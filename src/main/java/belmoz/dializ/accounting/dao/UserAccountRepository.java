package belmoz.dializ.accounting.dao;

import org.springframework.data.repository.CrudRepository;

import belmoz.dializ.accounting.model.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, String> {
	
}
