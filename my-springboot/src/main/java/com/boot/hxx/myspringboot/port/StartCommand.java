package com.boot.hxx.myspringboot.port;

import com.boot.hxx.myspringboot.error.GlobalExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.ManagementServerPortUtils;
import org.springframework.util.StringUtils;

import java.net.NetPermission;
import java.util.Random;

/**
 * Created by boss on 2019/9/21 18:30
 */
public class StartCommand {
    final Logger logger = LoggerFactory.getLogger(StartCommand.class);


    public StartCommand(String[] args) {
        Boolean isServerPort = false;
        String serverPort = "";
        if (args != null) {
            for (String arg :
                    args) {
                if (StringUtils.hasText(arg) && arg.startsWith("--server.port")) {
                    isServerPort = true;
                    serverPort = arg;
                    break;
                }
            }

        }

        if (!isServerPort) {
            int max = 65535;
            int min = 2000;
            final Random random = new Random();

            int port=random.nextInt(max)%(max-min+1)+min;




        }


    }

}
