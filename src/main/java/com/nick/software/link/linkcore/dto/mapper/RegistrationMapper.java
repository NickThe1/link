package com.nick.software.link.linkcore.dto.mapper;

import com.nick.software.link.linkcore.dto.RegistrationDTO;
import com.nick.software.link.linkcore.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RegistrationMapper {
    RegistrationMapper INSTANCE = Mappers.getMapper(RegistrationMapper.class);

    Account registrationDTOToAccount(RegistrationDTO registrationDTO);

    RegistrationDTO accountToRegistrationDTO(Account account);
}
