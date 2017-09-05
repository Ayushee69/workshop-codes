package com.codingblocks.chatbot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by anuj on 3/9/17.
 */
public class Hook {

    ObjectMapper objectMapper = new ObjectMapper();

    public Item[] entry;

    public static class Item {

        public Content[] messaging;
    }

    @Override
    public String toString() {

        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return super.toString();
        }

    }
}
