package store.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import store.dtos.RegisterUserRequest;
import store.dtos.UpdateUserRequest;
import store.dtos.UserDto;
import store.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
   UserDto toDto(User user);
   User toEntity(RegisterUserRequest request);
   void update(UpdateUserRequest request, @MappingTarget User user);
}
