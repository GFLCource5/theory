package org.example.proxy;

import java.util.List;

public class proxyMain {

  public static void main(String[] args) {
    FileIntegrationServiceProxy fileIntegrationServiceProxy = new FileIntegrationServiceProxy();
    FileIntegrationService fileIntegrationService =
        fileIntegrationServiceProxy.getFileIntegrationService(FileIntegrationService.class);
    fileIntegrationService.saveLines(List.of("firstLine", "secondLine", "thirdLine"));
  }
}
