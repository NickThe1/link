package com.nick.software.link.linkcore.dto.mapper;

import com.nick.software.link.linkcore.dto.ResumeDTO;
import com.nick.software.link.linkcore.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ResumeMapper {
    ResumeMapper INSTANCE = Mappers.getMapper(ResumeMapper.class);

    Account resumeDTOToAccount(ResumeDTO resumeDTO);

    ResumeDTO accountToResumeDTO(Account account);
}
