package contact.service.service;

import contact.service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    private List<Contact> contacts=List.of(
            new Contact(1,"abc@gmail.com","7080713024",100L),
            new Contact(2,"ab1@gmail.com","70807130242",101L),
            new Contact(3,"abc2@gmail.com","7080713024",101L),
            new Contact(4,"abc4@gmail.com","7080713024",102L),
            new Contact(5,"abc5@gmail.com","73080713024",1003L),
            new Contact(6,"abc7@gmail.com33333","70380713024",104L)
    );

    /**
     * lambda expression for filter
     * @param userId
     * @return
     */
    @Override
    public List<Contact> getContacts(Long userId) {
        return contacts.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
