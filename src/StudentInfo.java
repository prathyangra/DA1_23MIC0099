public class StudentInfo {
    public static void main(String args[]) {
        System.out.println("Student Name: Prathyangra R");
        System.out.println("Register Number: 23MIC0099");
        System.out.println("Message: Jenkins-GitHub Integration Successful");
    }
}
kubectl get nodes
kubectl create deployment webapp --image=nginx
kubectl get pods
kubectl scale deployment webapp --replicas=3
kubectl get pods
kubectl expose deployment webapp --type=NodePort --port=80
kubectl get svc
nano limited.yaml

Paste:

apiVersion: v1

kind: Pod

metadata:

 name: limited-pod

spec:

 containers:

 - name: nginx

 image: nginx

 resources:

 limits:

 cpu: "500m"

 memory: "128Mi"
kubectl apply -f limited.yaml
kubectl get pods
kubectl describe pod limited-pod
kubectl get all

BUGZILLA-STS
package com.example.demo,

import org.springframework.web.bind.annotation.GetMapping.
import org.springframework.web.bind.annotation.RestController:

@RestController
public class HomeController [
@GetMapping("/")
public String home() [
return "Application Running Successfully":
    }
    }

MAVEN
<dependencies>
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.10.0</version>
<scope>test</scope>
</dependency>
</dependencies>

Add Surefire plugin:

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.1.2</version>
</plugin>
</plugins>
</build>

src/main/java → com.bank → BankService.java

package com.bank;
public class BankService {
public boolean transfer(double balance, double amount) {
return balance >= amount && amount > 0;
}
}

src/test/java → com.bank → BankServiceTest.java

package com.bank;

import static org.junit.jupiter.api.Assertions.*;
package sathya;
import static org.junit.Assert.*;
import org.junit.Test;

public class maven {

@Test
public void validTransferTest() {
maven service = new maven();
assertTrue(service.transfer(1000, 500));
}

@Test
public void invalidTransferTest() {
maven service = new maven();
assertFalse(service.transfer(200, 500));
}

public boolean transfer(int balance, int amount) {
if (balance >= amount) {
return true;
}
return false;
}
}
