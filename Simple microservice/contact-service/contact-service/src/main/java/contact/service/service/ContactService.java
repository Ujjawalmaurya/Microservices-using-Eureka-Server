package contact.service.service;

import contact.service.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContacts(Long userId);
}
