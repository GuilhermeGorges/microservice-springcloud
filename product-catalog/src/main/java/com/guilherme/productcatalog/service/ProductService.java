package com.guilherme.productcatalog.service;

import com.guilherme.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {

        private ProductRepository productRepository;


        /*
        public MessageResponseDTO createPerson(PersonDTO personDTO){
            Person personToSave = personMapper.toModel(personDTO);

            Person savedPerson = personRepository.save(personToSave);
            return createMessageResponse(savedPerson.getId(), "Created person with ID " );
        }

        public List<PersonDTO> listAll() {
            List<Person> allPeople = personRepository.findAll();
            return allPeople.stream()
                    .map(personMapper::toDTO)
                    .collect(Collectors.toList());
        }

        public PersonDTO findById(Long id) throws PersonNotFoundExceptio {
            Person person = verityIfExists(id);

            return personMapper.toDTO(person);
        }

        public void delete(Long id) throws PersonNotFoundExceptio {
            verityIfExists(id);

            personRepository.deleteById(id);
        }

        public MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundExceptio {
            verityIfExists(id);

            Person personToSave = personMapper.toModel(personDTO);

            Person updatedPerson = personRepository.save(personToSave);
            return createMessageResponse(updatedPerson.getId(),"Updated person with ID " );

        }

        private Person verityIfExists(Long id) throws PersonNotFoundExceptio {
            return personRepository.findById(id)
                    .orElseThrow(() ->  new PersonNotFoundExceptio(id));
        }

        private MessageResponseDTO createMessageResponse(Long id, String message) {
            return MessageResponseDTO
                    .builder()
                    .message(message + id)
                    .build();
        }*/
}
