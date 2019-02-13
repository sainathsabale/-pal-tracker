package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

    public String port;
    public String memoryLimit;
    public String instanceIndex;
    public String instanceAddr;

    public EnvController(@Value("${port:NOT SET}") String port, @Value("${memory.limit: NOT SET}") String memoryLimit
    ,@Value("${cf.instance.index: NOT SET}") String instanceIndex, @Value("${cf.instance.addr: NOT SET}") String instanceAddr){

        this.port=port;
        this.memoryLimit=memoryLimit;
        this.instanceIndex=instanceIndex;
        this.instanceAddr=instanceAddr;
    }



    @GetMapping("/env")
    public Map<String, String> getEnv(){
        Map<String, String> map = new HashMap();
        map.put("PORT",port);
        map.put("MEMORY_LIMIT",memoryLimit);
        map.put("CF_INSTANCE_INDEX",instanceIndex);
        map.put("CF_INSTANCE_ADDR",instanceAddr);
                return map;

    }
}
