package homepage.service;

import homepage.dto.MembersDTO;
import homepage.entity.Members;
import homepage.repository.MembersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor //자동 주입을 위한 Annotation
public class SignupServiceImpl implements SignupService {
    private final MembersRepository membersRepository;

    @Override
    public void registerMembers(MembersDTO dto) throws Exception{
        Members entity = dtoToEntity(dto);

        if(!checkIdAvailable(entity.getId())){
            throw new Exception("duplicate id");
        }

        membersRepository.save(entity);
    }

    public boolean checkIdAvailable(String id){
        List<Members> i = membersRepository.getMember(id);
        if(i.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
