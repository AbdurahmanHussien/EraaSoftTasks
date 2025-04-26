package com.spring.boot.mapper;


import com.spring.boot.dto.AccountDto;
import com.spring.boot.dto.RoleDto;
import com.spring.boot.model.Account;
import com.spring.boot.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AccountMapper {

    AccountMapper ACCOUNT_MAPPER = Mappers.getMapper(AccountMapper.class);

    Account toAccount(AccountDto accountDto);


    @Mapping(target = "roles", qualifiedByName = "mapRolesWithoutAccounts")
    AccountDto toAccountDto(Account account);

    List<Account> toAccountList(List<AccountDto> accountDto);
    List<AccountDto> toAccountDtoList(List<Account> account);


    @Named("mapRolesWithoutAccounts")
    default List<RoleDto> mapRolesWithoutAccounts(List<Role> roles) {
        if (roles == null) return null;
        return roles.stream().map(role -> {
            RoleDto dto = new RoleDto();
            dto.setId(role.getId());
            dto.setRole(role.getRole());
            dto.setAccounts(null);
            return dto;
        }).toList();
    }
}
