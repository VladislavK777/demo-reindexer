package com.example.demo;

import com.example.demo.contact.ClientContactViewReindexer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rt.restream.reindexer.Namespace;
import ru.rt.restream.reindexer.Reindexer;

import javax.annotation.PostConstruct;

import static ru.rt.restream.reindexer.NamespaceOptions.defaultOptions;

@Service
public class ContactService {
    private final Reindexer reindexer;
    private final ObjectMapper objectMapper;

    @Autowired
    public ContactService(Reindexer reindexer, ObjectMapper objectMapper) {
        this.reindexer = reindexer;
        this.objectMapper = objectMapper;
    }

    private String contact = "{\n" +
            "  \"country\": \"\",\n" +
            "  \"address\": \"г. Москва\",\n" +
            "  \"specializations\": [\n" +
            "    {\n" +
            "      \"cmsSubtypes\": [\n" +
            "        \"Информировании о закрытии ТТ\"\n" +
            "      ],\n" +
            "      \"isTypeSelected\": false,\n" +
            "      \"id\": 174,\n" +
            "      \"type\": \"Техническая поддержка\",\n" +
            "      \"subtypes\": [\n" +
            "        \"Информирование о закрытии TT\"\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"gender\": \"Мужской\",\n" +
            "  \"contactId\": 1,\n" +
            "  \"city\": \"\",\n" +
            "  \"mobilePhones\": [\n" +
            "    {\n" +
            "      \"id\": 238,\n" +
            "      \"type\": \"MOBILE_PHONE\",\n" +
            "      \"value\": \"123\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"isOutdated\": false,\n" +
            "  \"loyalty\": \"Лоялен\",\n" +
            "  \"language\": \"Азербайджанский\",\n" +
            "  \"emails\": [\n" +
            "    {\n" +
            "      \"id\": 236,\n" +
            "      \"type\": \"EMAIL\",\n" +
            "      \"value\": \"contacrov@contact.con\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"nps\": \"Да\",\n" +
            "  \"contactFullName\": \"Контактов Контакт Контактович\",\n" +
            "  \"contactRoleName\": \"\",\n" +
            "  \"workPhones\": [\n" +
            "    {\n" +
            "      \"id\": 239,\n" +
            "      \"type\": \"WORK_PHONE\",\n" +
            "      \"value\": \"123\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"csi\": \"Нет\",\n" +
            "  \"statusName\": \"ЛВПР\",\n" +
            "  \"organizationUnid\": \"4F069539563005EB43257E3F003A3325\",\n" +
            "  \"contactTypeId\": 1\n" +
            "}";

    public void updateContact() throws JsonProcessingException {
        Namespace<ClientContactViewReindexer> namespace = reindexer.openNamespace("entity_contact", defaultOptions(), ClientContactViewReindexer.class);
        namespace.upsert(objectMapper.readValue(contact, ClientContactViewReindexer.class));
    }
}
