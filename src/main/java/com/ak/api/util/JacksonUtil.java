package com.ak.api.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonUtil {

    public static void main(String[] args) throws IOException {
       JsonNode jsonNode = getJSONFieldAsText("employee.json");
        System.out.println(jsonNode.path("two_ids").get(1));

    }

    /**
     * returns a JsonNode from given json file
     * from json node all json field can be extracted
     * @throws IOException
     *access nested JSON OBJ: jsonNode.path("address").path("city").asText();
     *access JSON array: jsonNode.path("two_ids").get(1).asText();
     */
    public static JsonNode getJSONFieldAsText(String fileName)  {
        String filePath = FrameWorkConstant.getResourceFolderLocation(fileName);
        byte[] jsonFileToByteArray;
        JsonNode jsonNode = null;
        try {
            jsonFileToByteArray = Files.readAllBytes(Paths.get(filePath));
            jsonNode = new ObjectMapper().readTree(jsonFileToByteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonNode;
    }

    public static void writeIntoJSONFileFromByArray(byte [] arr){


    }
}
