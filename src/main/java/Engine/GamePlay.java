package Engine;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GamePlay {
    private  List<Node> nodes;
    private Scanner scanner;

    public GamePlay(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            nodes = Arrays.asList(mapper.readValue(Paths.get("src/main/resources/data.json").toFile(), Node[].class));
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
     }

    public List<Node>getNodes(){
        return nodes;
    }

    public Node getNode(String nodeId){
        for(Node node: nodes){
            if(node.getId().equals(nodeId)){
                return node;
            }
        }
        return null;
    }
}
