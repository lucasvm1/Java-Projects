package com.lucasvm.UserRegistration_ViaCEP_DB.services;

import com.lucasvm.UserRegistration_ViaCEP_DB.dtos.CepResponse;
import com.lucasvm.UserRegistration_ViaCEP_DB.dtos.UserDto;
import com.lucasvm.UserRegistration_ViaCEP_DB.models.AddressModel;
import com.lucasvm.UserRegistration_ViaCEP_DB.models.UserModel;
import com.lucasvm.UserRegistration_ViaCEP_DB.repositories.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CepService cepService;

    public UserService(UserRepository userRepository, CepService cepService) {
        this.userRepository = userRepository;
        this.cepService = cepService;
    }

    public Mono<UserModel> registerUser(UserDto userDto) {
        return cepService.getCepInfo(userDto.cep())
                .map(cepResponse -> createUser(userDto, cepResponse));
    }

    private UserModel createUser(UserDto userDto, CepResponse cepResponse) {
        UserModel userModel = new UserModel();
        userModel.setFirstName(userDto.firstName());
        userModel.setLastName(userDto.lastName());
        userModel.setEmail(userDto.email());
        userModel.setPhoneNumber(userDto.phoneNumber());

        AddressModel addressModel = new AddressModel();
        addressModel.setCep(cepResponse.getCep());
        addressModel.setRegion(cepResponse.getRegion());
        addressModel.setState(cepResponse.getState());
        addressModel.setCity(cepResponse.getCity());
        addressModel.setDistrict(cepResponse.getDistrict());
        addressModel.setStreet(cepResponse.getStreet());
        addressModel.setUser(userModel);

        userModel.getAddresses().add(addressModel);

        return userRepository.save(userModel);

    }


}
