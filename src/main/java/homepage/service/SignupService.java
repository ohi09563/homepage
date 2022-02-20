package homepage.service;

import homepage.dto.MembersDTO;
import homepage.entity.Members;

public interface SignupService {
    void registerMembers(MembersDTO dto) throws Exception;

    default Members dtoToEntity(MembersDTO dto){
        Members entity = Members.builder()
                .gno(dto.getGno())
                .id(dto.getUserid())
                .pw(dto.getPwd())
                .name(dto.getName())
                .phoneNumber(dto.getPhonenumber())
                .dateOfBirth(dto.getBirthday())
                .sex(dto.getGender())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
        return entity;
    }
}
